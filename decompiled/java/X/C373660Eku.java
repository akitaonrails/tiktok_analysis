package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Eku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373660Eku extends FrameLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public EnumC373670Ekv LLILLL;
    public Rect LLILZ;
    public Rect LLILZIL;
    public View LLILZLL;
    public final C01GW LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final TuxTextView LLJIJIL;
    public final C01GW LLJILJIL;

    private final Drawable getBgDrawable() {
        return (Drawable) this.LLIZ.getValue();
    }

    private final C1295960jpS getLottieView() {
        return (C1295960jpS) this.LLJILJIL.getValue();
    }

    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        getLottieView().cancelAnimation();
        animate().cancel();
        this.LLILLL = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLottieView().cancelAnimation();
    }

    public EnumC373670Ekv getCurStepState() {
        return this.LLILLL;
    }

    public C373660Eku(Context context) {
        int iIntValue;
        super(context, null, 0);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        this.LLIZ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 916));
        this.LLIZLLLIL = "Add Keyframe";
        this.LLJ = "Scroll the video";
        this.LLJI = "Try pinch or move";
        this.LLJIJIL = new TuxTextView(context, null, 6, 0);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 917));
        setWillNotDraw(false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint2.setColor(iIntValue);
        TuxTextView tuxTextView = this.LLJIJIL;
        C786410Ut5.LLLLZLL(tuxTextView, 4);
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setTuxFont(42);
        addView(tuxTextView);
    }

    public final void LIZ(Canvas canvas) {
        Drawable bgDrawable = getBgDrawable();
        if (bgDrawable != null) {
            bgDrawable.setBounds(new Rect(0, 0, getWidth(), getHeight()));
        }
        Drawable bgDrawable2 = getBgDrawable();
        if (bgDrawable2 != null) {
            bgDrawable2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        EnumC373670Ekv enumC373670Ekv = this.LLILLL;
        if (enumC373670Ekv == null) {
            return;
        }
        if (enumC373670Ekv == EnumC373670Ekv.KEYFRAME_MASK) {
            int iSaveLayer = canvas.saveLayer(null, null, 31);
            LIZ(canvas);
            if (this.LLILZ != null) {
                canvas.drawCircle(r1.centerX(), r1.centerY(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), this.LL);
            }
            canvas.restoreToCount(iSaveLayer);
            if (this.LLILZ != null) {
                canvas.drawLine(r1.centerX(), r1.top, r1.centerX(), r1.top - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), this.LLILLJJLI);
                return;
            }
            return;
        }
        if (enumC373670Ekv == EnumC373670Ekv.TRACK_MASK) {
            int iSaveLayer2 = canvas.saveLayer(null, null, 31);
            LIZ(canvas);
            Rect rect = this.LLILZ;
            if (rect != null) {
                canvas.drawRect(rect, this.LL);
            }
            canvas.restoreToCount(iSaveLayer2);
            return;
        }
        if (enumC373670Ekv != EnumC373670Ekv.GESTURE_MASK) {
            return;
        }
        LIZ(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Rect rect;
        Rect rect2;
        if (motionEvent == null) {
            return false;
        }
        EnumC373670Ekv enumC373670Ekv = this.LLILLL;
        if ((enumC373670Ekv == EnumC373670Ekv.KEYFRAME_MASK || enumC373670Ekv == EnumC373670Ekv.GESTURE_MASK) && (rect = this.LLILZ) != null && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (this.LLILLL == EnumC373670Ekv.TRACK_MASK && (rect2 = this.LLILZIL) != null && rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setKeyframeMask(int[] iArr) {
        int iCenterX;
        int iCenterX2;
        int iLIZIZ;
        this.LLILLL = EnumC373670Ekv.KEYFRAME_MASK;
        int i = iArr[0];
        this.LLILZ = new Rect(i, iArr[1], C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34)) + i, iArr[1] + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)));
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        invalidate();
        float fMeasureText = this.LLJIJIL.getPaint().measureText(this.LLIZLLLIL);
        if (C426750GoL.LIZLLL(getContext())) {
            Rect rect = this.LLILZ;
            if (rect != null) {
                iCenterX2 = rect.centerX();
            } else {
                iCenterX2 = 0;
            }
        } else {
            int width = getWidth();
            Rect rect2 = this.LLILZ;
            if (rect2 != null) {
                iCenterX = rect2.centerX();
            } else {
                iCenterX = 0;
            }
            iCenterX2 = width - iCenterX;
        }
        float f = iCenterX2;
        float f2 = fMeasureText / 2;
        if (f > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + f2) {
            iLIZIZ = (int) (f - f2);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        C786410Ut5.LLLLZLL(this.LLJIJIL, 0);
        TuxTextView tuxTextView = this.LLJIJIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        C426750GoL.LJIIJ(layoutParams, getContext(), null, null, Integer.valueOf(iLIZIZ), Integer.valueOf((getHeight() - iArr[1]) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 38);
        C786410Ut5.R6(tuxTextView, layoutParams);
        this.LLJIJIL.requestLayout();
        this.LLJIJIL.setText(this.LLIZLLLIL);
        C786410Ut5.LLD(4, getLottieView());
    }

    public void setPinchGestureMask(View view) {
        FrameLayout.LayoutParams layoutParams;
        this.LLILLL = EnumC373670Ekv.GESTURE_MASK;
        invalidate();
        int[] iArr = new int[2];
        LIZLLL(view, iArr);
        ViewGroup.LayoutParams layoutParams2 = getLottieView().getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.gravity = 49;
            layoutParams.topMargin = iArr[1] + ((view.getHeight() - layoutParams.height) / 2);
        }
        C786410Ut5.LLD(0, getLottieView());
        getLottieView().requestLayout();
        getLottieView().setRepeatCount(-1);
        getLottieView().playAnimation();
        if (getLottieView().getParent() == null) {
            addView(getLottieView());
        }
        this.LLJIJIL.setText(this.LLJI);
        TuxTextView tuxTextView = this.LLJIJIL;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 49;
        C426750GoL.LJIIJ(layoutParams3, getContext(), null, Integer.valueOf(iArr[1] + ((view.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))) / 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))), null, null, 58);
        C786410Ut5.R6(tuxTextView, layoutParams3);
        this.LLJIJIL.requestLayout();
    }

    public final void LIZJ(C368220Ec8 c368220Ec8, C368680Ecs c368680Ecs) {
        this.LLILLL = EnumC373670Ekv.TRACK_MASK;
        int[] iArr = new int[2];
        LIZLLL(c368220Ec8, iArr);
        invalidate();
        this.LLJIJIL.setText(this.LLJ);
        TuxTextView tuxTextView = this.LLJIJIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        C426750GoL.LJIIJ(layoutParams, getContext(), Integer.valueOf((C0FU0.LIZJ(getContext()) / 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), Integer.valueOf(iArr[1] + c368220Ec8.getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), null, 0, 40);
        C786410Ut5.R6(tuxTextView, layoutParams);
        this.LLJIJIL.requestLayout();
        C786410Ut5.LLD(4, getLottieView());
        this.LLILZLL = c368220Ec8;
        int[] iArr2 = new int[2];
        c368680Ecs.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        this.LLILZIL = new Rect(i, iArr2[1], c368680Ecs.getWidth() + i, iArr2[1] + c368680Ecs.getHeight());
    }

    public final void LIZLLL(View view, int[] iArr) {
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        this.LLILZ = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }
}
