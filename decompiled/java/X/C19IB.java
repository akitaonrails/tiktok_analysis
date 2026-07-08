package X;

import Y.AAListenerS341S0100000_31;
import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Range;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S0010001_3;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19IB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19IB extends View {
    public int LL;
    public final Rect LLILLJJLI;
    public final Paint LLILLL;
    public final Size LLILZ;
    public final float LLILZIL;
    public final Rect LLILZLL;
    public int LLIZ;
    public final Paint LLIZLLLIL;
    public final Paint LLJ;
    public final Size LLJI;
    public final ArrayList<Rect> LLJIJIL;
    public final Size LLJILJIL;
    public final float LLJILJILJ;
    public final C01GW LLJILLL;
    public final Rect LLJJ;
    public final Paint LLJJI;
    public final Paint LLJJIII;
    public final ArrayList<Range<Float>> LLJJIJI;
    public final float LLJJIJIIJIL;
    public final int LLJJIJIL;
    public Animator LLJJJ;
    public Integer LLJJJIL;
    public final PointF LLJJJJ;
    public long LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public float LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public boolean LLJLIL;
    public float LLJLILLLLZIIL;
    public C19IC LLJLL;

    private final float getKnobBorderWidth() {
        return ((Number) this.LLJILLL.getValue()).floatValue();
    }

    private final float getMaxProgress() {
        return this.LL - 1;
    }

    public final void LJI() {
        int iLIZIZ = LIZIZ(this.LLJLILLLLZIIL);
        int width = this.LLJILJIL.getWidth() / 2;
        int height = this.LLJILJIL.getHeight() / 2;
        Rect rect = this.LLJJ;
        rect.left = iLIZIZ - width;
        Rect rect2 = this.LLILLJJLI;
        rect.top = (rect2.top + (rect2.height() / 2)) - height;
        rect.right = iLIZIZ + width;
        Rect rect3 = this.LLILLJJLI;
        rect.bottom = rect3.top + (rect3.height() / 2) + height;
    }

    public final C0ZDN getVibrator() {
        return (C0ZDN) this.LLJL.getValue();
    }

    private final int getDotColor() {
        Integer numLIZ = C1308910kAL.LIZ(R.attr.a03, getContext());
        if (numLIZ != null) {
            return numLIZ.intValue();
        }
        return -7829368;
    }

    public final void LJFF() {
        if (0.0f <= getMaxProgress()) {
            setProgress(0.0f);
            invalidate();
        }
    }

    private final void setBeingDragged(boolean z) {
        this.LLJJJJLIIL = z;
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    public final float LIZ(int i) {
        Rect rect = this.LLILLJJLI;
        float maxProgress = (getMaxProgress() - 0.0f) * ((i - rect.left) / rect.width());
        if (getLayoutDirection() == 1) {
            return getMaxProgress() - maxProgress;
        }
        return 0.0f + maxProgress;
    }

    public final int LIZIZ(float f) {
        float fWidth;
        float maxProgress = f / (getMaxProgress() - 0.0f);
        if (getLayoutDirection() == 1) {
            Rect rect = this.LLILLJJLI;
            fWidth = rect.right - (rect.width() * maxProgress);
        } else {
            Rect rect2 = this.LLILLJJLI;
            fWidth = rect2.left + (rect2.width() * maxProgress);
        }
        return (int) fWidth;
    }

    public final int LIZJ(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        Rect rect = this.LLILLJJLI;
        int i = rect.left;
        if (x < i) {
            return i;
        }
        int i2 = rect.right;
        if (x > i2) {
            return i2;
        }
        return x;
    }

    public final float LJ(float f) {
        float fFloatValue = f;
        for (Range<Float> range : this.LLJJIJI) {
            if (range.contains(Float.valueOf(f))) {
                if (f <= (((Number) range.getUpper()).floatValue() + ((Number) range.getLower()).floatValue()) / 2) {
                    fFloatValue = ((Number) range.getLower()).floatValue();
                } else {
                    fFloatValue = ((Number) range.getUpper()).floatValue();
                }
            }
        }
        return fFloatValue;
    }

    @Override // android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.LLILZLL;
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        float f5 = this.LLILZIL;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.LLILLL);
        float width = (this.LLJJ.right + (this.LLILZ.getWidth() / 2)) - (this.LLJJ.width() / 2.0f);
        if (this.LLJLIL) {
            this.LLIZLLLIL.setColor(this.LLIZ);
            Rect rect2 = this.LLILZLL;
            float f6 = rect2.left;
            float f7 = rect2.top;
            float f8 = rect2.bottom;
            float f9 = this.LLILZIL;
            canvas.drawRoundRect(f6, f7, width, f8, f9, f9, this.LLIZLLLIL);
        }
        this.LLJ.setColor(getDotColor());
        Iterator<Rect> it2 = this.LLJIJIL.iterator();
        while (it2.hasNext()) {
            int i = it2.next().right;
            if (i > width) {
                canvas.drawRoundRect(r3.left, r3.top, i, r3.bottom, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this.LLJ);
            }
        }
        Rect rect3 = this.LLJJ;
        float f10 = rect3.left;
        float f11 = rect3.top;
        float f12 = rect3.right;
        float f13 = rect3.bottom;
        float f14 = this.LLJILJILJ;
        canvas.drawRoundRect(f10, f11, f12, f13, f14, f14, this.LLJJIII);
        float knobBorderWidth = this.LLJJ.left - getKnobBorderWidth();
        float knobBorderWidth2 = this.LLJJ.top - getKnobBorderWidth();
        float knobBorderWidth3 = this.LLJJ.right - getKnobBorderWidth();
        float knobBorderWidth4 = this.LLJJ.bottom - getKnobBorderWidth();
        float f15 = this.LLJILJILJ;
        canvas.drawRoundRect(knobBorderWidth, knobBorderWidth2, knobBorderWidth3, knobBorderWidth4, f15, f15, this.LLJJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19IB.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLength(int i) {
        if (this.LL == i) {
            return;
        }
        this.LL = i;
    }

    public final void setOnChangeListener(C19IC c19ic) {
        this.LLJLL = c19ic;
    }

    public final void setProgress(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > getMaxProgress()) {
            f = getMaxProgress();
        }
        this.LLJLILLLLZIIL = f;
        LJI();
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.LLIZ = i;
        invalidate();
    }

    public final void setProgressEnable(boolean z) {
        if (this.LLJLIL == z) {
            return;
        }
        this.LLJLIL = z;
        invalidate();
    }

    public C19IB(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        super(context, attributeSet, 0);
        this.LL = 5;
        this.LLILLJJLI = new Rect();
        Paint paint = new Paint();
        this.LLILLL = paint;
        Integer numLIZ = C1308910kAL.LIZ(R.attr.a03, context);
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -7829368;
        }
        this.LLILZ = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        this.LLILZLL = new Rect();
        Integer numLIZ2 = C1308910kAL.LIZ(R.attr.a09, context);
        if (numLIZ2 != null) {
            iIntValue2 = numLIZ2.intValue();
        } else {
            iIntValue2 = -16776961;
        }
        this.LLIZ = iIntValue2;
        Paint paint2 = new Paint();
        this.LLIZLLLIL = paint2;
        Integer numLIZ3 = C1308910kAL.LIZ(R.attr.a01, context);
        if (numLIZ3 != null) {
            iIntValue3 = numLIZ3.intValue();
        } else {
            iIntValue3 = -12303292;
        }
        Paint paint3 = new Paint();
        this.LLJ = paint3;
        this.LLJI = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        this.LLJIJIL = new ArrayList<>();
        Integer numLIZ4 = C1308910kAL.LIZ(R.attr.a0p, context);
        if (numLIZ4 != null) {
            iIntValue4 = numLIZ4.intValue();
        } else {
            iIntValue4 = -12303292;
        }
        Integer numLIZ5 = C1308910kAL.LIZ(R.attr.a03, context);
        if (numLIZ5 != null) {
            iIntValue5 = numLIZ5.intValue();
        } else {
            iIntValue5 = -12303292;
        }
        Integer numLIZ6 = C1308910kAL.LIZ(R.attr.a1a, context);
        int iIntValue6 = numLIZ6 != null ? numLIZ6.intValue() : -12303292;
        this.LLJILJIL = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJILLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(323));
        this.LLJJ = new Rect();
        Paint paint4 = new Paint();
        this.LLJJI = paint4;
        Paint paint5 = new Paint();
        this.LLJJIII = paint5;
        this.LLJJIJI = new ArrayList<>();
        this.LLJJIJIIJIL = 1.0f;
        this.LLJJIJIL = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.LLJJJJ = new PointF();
        this.LLJJJJJIL = -1L;
        this.LLJJL = 0.0f;
        this.LLJL = C452501pT.LIZIZ(new AwS576S0100000_32(context, 517));
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = 0.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iIntValue);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setColor(this.LLIZ);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(iIntValue3);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setAntiAlias(true);
        paint4.setColor(iIntValue4);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setAntiAlias(true);
        paint5.setColor(iIntValue5);
        paint5.setShadowLayer(fLIZIZ, 0.0f, 0.0f, iIntValue6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJJIJI.clear();
        int i3 = this.LL;
        int i4 = 0;
        while (i4 < i3) {
            ArrayList<Range<Float>> arrayList = this.LLJJIJI;
            Float fValueOf = Float.valueOf(i4);
            i4++;
            arrayList.add(new Range<>(fValueOf, Float.valueOf(i4)));
        }
        Rect rect = this.LLILLJJLI;
        rect.left = getPaddingStart();
        rect.top = getPaddingTop();
        rect.right = getMeasuredWidth() - getPaddingEnd();
        rect.bottom = getMeasuredHeight() - getPaddingBottom();
        Rect rect2 = this.LLILLJJLI;
        int iHeight = rect2.top + (rect2.height() / 2);
        int width = this.LLILZ.getWidth() / 2;
        int height = this.LLILZ.getHeight() / 2;
        Rect rect3 = this.LLILZLL;
        Rect rect4 = this.LLILLJJLI;
        rect3.left = rect4.left - width;
        rect3.top = iHeight - height;
        rect3.right = rect4.right + width;
        rect3.bottom = height + iHeight;
        int width2 = this.LLJI.getWidth() / 2;
        int height2 = this.LLJI.getHeight() / 2;
        int i5 = this.LL;
        for (int i6 = 0; i6 < i5; i6++) {
            int iLIZIZ = LIZIZ(i6);
            this.LLJIJIL.add(new Rect(iLIZIZ - width2, iHeight - height2, iLIZIZ + width2, iHeight + height2));
        }
        LJI();
    }

    public final void LIZLLL(float f, Function0 function0, boolean z) {
        new AwS0S0010001_3(f, z, 1);
        if (z) {
            float f2 = this.LLJLILLLLZIIL;
            if (f == f2) {
                function0.invoke();
                return;
            }
            Animator animator = this.LLJJJ;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(this, 18));
            valueAnimatorOfFloat.addListener(new AAListenerS341S0100000_31(function0, 6));
            this.LLJJJ = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
            return;
        }
        setProgress(f);
    }
}
