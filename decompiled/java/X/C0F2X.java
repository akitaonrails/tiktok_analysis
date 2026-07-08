package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F2X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F2X extends FrameLayout {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public C0F2Z LLILLL;
    public Rect LLILZ;
    public final TuxTextView LLILZIL;
    public final int LLILZLL;
    public View LLIZ;
    public RectF LLIZLLLIL;
    public InterfaceC383550F2b LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    private final Drawable getBgDrawable() {
        return (Drawable) this.LLJILJIL.getValue();
    }

    private final C1295960jpS getLottieView() {
        return (C1295960jpS) this.LLJILJILJ.getValue();
    }

    public final C0F2Z getCurStep() {
        return this.LLILLL;
    }

    public final InterfaceC383550F2b getStepCallBack() {
        return this.LLJ;
    }

    public C0F2X(Context context) {
        int iIntValue;
        super(context, null, 0);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        this.LLILZIL = new TuxTextView(context, null, 6, 0);
        this.LLILZLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
        String string = context.getString(2131834007);
        String string2 = context.getString(2131834006);
        this.LLJI = context.getString(2131834005, string);
        this.LLJIJIL = context.getString(2131834005, string2);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 909));
        setWillNotDraw(false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        paint2.setColor(iIntValue);
        TuxTextView tuxTextView = this.LLILZIL;
        C786410Ut5.LLLLZLL(tuxTextView, 4);
        C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setTuxFont(42);
        addView(tuxTextView);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 910));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        super.onDraw(canvas);
        if (this.LLILLL == null) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(null, null, 31);
        Drawable bgDrawable = getBgDrawable();
        if (bgDrawable != null) {
            bgDrawable.setBounds(new Rect(0, 0, getWidth(), getHeight()));
        }
        Drawable bgDrawable2 = getBgDrawable();
        if (bgDrawable2 != null) {
            bgDrawable2.draw(canvas);
        }
        C0F2Z c0f2z = this.LLILLL;
        if (c0f2z == C0F2Z.GUIDE_CUT || c0f2z == C0F2Z.GUIDE_ANIMATION) {
            if (this.LLILZ != null && (rectF = this.LLIZLLLIL) != null) {
                canvas.drawRoundRect(rectF, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), this.LL);
            }
            canvas.restoreToCount(iSaveLayer);
            if (this.LLILZ != null) {
                canvas.drawLine(r1.centerX(), r1.top, r1.centerX(), r1.top - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), this.LLILLJJLI);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0F2Z c0f2z;
        if (motionEvent == null) {
            return false;
        }
        Rect rect = this.LLILZ;
        if (rect != null && rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (c0f2z = this.LLILLL) != null && (c0f2z == C0F2Z.GUIDE_ANIMATION || c0f2z == C0F2Z.GUIDE_CUT)) {
            InterfaceC383550F2b interfaceC383550F2b = this.LLJ;
            if (interfaceC383550F2b != null) {
                interfaceC383550F2b.LIZ(c0f2z);
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAnimationView(View view) {
        int iCenterX;
        int iCenterX2 = 0;
        C786410Ut5.LLLLZLL(this.LLILZIL, 0);
        this.LLILLL = C0F2Z.GUIDE_ANIMATION;
        this.LLIZ = view;
        int[] iArr = new int[2];
        LIZ(view, iArr);
        this.LLIZLLLIL = new RectF(iArr[0], iArr[1], r1 + view.getWidth(), iArr[1] + view.getHeight());
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        invalidate();
        float fMeasureText = this.LLILZIL.getPaint().measureText(this.LLJIJIL);
        if (fMeasureText > this.LLILZLL) {
            this.LLILZIL.setMinTextSize(13.0f);
        }
        float fMin = Math.min(fMeasureText, this.LLILZLL);
        Rect rect = this.LLILZ;
        if (rect != null) {
            iCenterX = rect.centerX();
        } else {
            iCenterX = 0;
        }
        float f = iCenterX - (fMin / 2);
        Rect rect2 = this.LLILZ;
        if (rect2 != null) {
            iCenterX2 = rect2.centerX();
        }
        float f2 = iCenterX2 - fMin;
        if (C426750GoL.LIZLLL(getContext())) {
            f = f2;
        }
        TuxTextView tuxTextView = this.LLILZIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        C426750GoL.LJIIJ(layoutParams, getContext(), Integer.valueOf((int) f), null, null, Integer.valueOf((getHeight() - iArr[1]) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 44);
        C786410Ut5.R6(tuxTextView, layoutParams);
        this.LLILZIL.requestLayout();
        this.LLILZIL.setText(this.LLJIJIL);
    }

    public final void setCurStep(C0F2Z c0f2z) {
        this.LLILLL = c0f2z;
    }

    public final void setEditorView(View view) {
        int iCenterX;
        int iCenterX2;
        this.LLILLL = C0F2Z.GUIDE_CUT;
        this.LLIZ = view;
        int[] iArr = new int[2];
        LIZ(view, iArr);
        this.LLIZLLLIL = new RectF(iArr[0], iArr[1], r1 + view.getWidth(), iArr[1] + view.getHeight());
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        invalidate();
        float fMeasureText = this.LLILZIL.getPaint().measureText(this.LLJI);
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
        if (iCenterX2 <= (fMeasureText / 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) {
            C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C786410Ut5.LLLLZLL(this.LLILZIL, 0);
        this.LLILZIL.setMaxWidth(this.LLILZLL);
        this.LLILZIL.setMaxLines(2);
        if (fMeasureText > this.LLILZLL) {
            this.LLILZIL.setMinTextSize(13.0f);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        C426750GoL.LJIIJ(layoutParams, getContext(), Integer.valueOf(iLIZIZ), null, null, Integer.valueOf((getHeight() - iArr[1]) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 44);
        C786410Ut5.R6(tuxTextView, layoutParams);
        this.LLILZIL.requestLayout();
        this.LLILZIL.setText(this.LLJI);
        C786410Ut5.LLD(4, getLottieView());
    }

    public final void setStepCallBack(InterfaceC383550F2b interfaceC383550F2b) {
        this.LLJ = interfaceC383550F2b;
    }

    public final void LIZ(View view, int[] iArr) {
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        this.LLILZ = new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }
}
