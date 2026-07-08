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
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Range;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS0S0010001_3;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19I8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19I8 extends View {
    public static final float LLL;
    public static final float LLLF;
    public final Rect LL;
    public final Paint LLILLJJLI;
    public final Size LLILLL;
    public final float LLILZ;
    public final Rect LLILZIL;
    public final Paint LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final Paint LLJ;
    public final Size LLJI;
    public final ArrayList<Pair<Rect, Rect>> LLJIJIL;
    public final Size LLJILJIL;
    public final float LLJILJILJ;
    public final C01GW LLJILLL;
    public final Rect LLJJ;
    public final Paint LLJJI;
    public final Paint LLJJIII;
    public final float LLJJIJI;
    public final float LLJJIJIIJIL;
    public final ArrayList<Range<Float>> LLJJIJIL;
    public boolean LLJJJ;
    public Drawable LLJJJIL;
    public final C01GW LLJJJJ;
    public final float LLJJJJJIL;
    public final int LLJJJJLIIL;
    public Animator LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public Integer LLJL;
    public final PointF LLJLIL;
    public long LLJLILLLLZIIL;
    public boolean LLJLL;
    public float LLJLLIL;
    public boolean LLJLLL;
    public float LLJZ;
    public C19I9 LLJZIJLIL;

    static {
        float serverValue = (EnumC1159500gHM.SEE_MUCH_MORE.getServerValue() + EnumC1159500gHM.SEE_MUCH_LESS.getServerValue()) / 2.0f;
        LLL = serverValue;
        LLLF = serverValue + 0.68f;
    }

    private final float getKnobBorderWidth() {
        return ((Number) this.LLJILLL.getValue()).floatValue();
    }

    private final int getStepCount() {
        return (this.LLIZLLLIL + 1) * 2;
    }

    private final float getStepValue() {
        return (this.LLJJIJIIJIL - this.LLJJIJI) / getStepCount();
    }

    public final void LJII() {
        int iLIZLLL = LIZLLL(this.LLJZ);
        int width = this.LLJILJIL.getWidth() / 2;
        int height = this.LLJILJIL.getHeight() / 2;
        Rect rect = this.LLJJ;
        rect.left = iLIZLLL - width;
        Rect rect2 = this.LL;
        rect.top = (rect2.top + (rect2.height() / 2)) - height;
        rect.right = iLIZLLL + width;
        Rect rect3 = this.LL;
        rect.bottom = rect3.top + (rect3.height() / 2) + height;
    }

    public final float getCenterProgress() {
        return (this.LLJJIJIIJIL + this.LLJJIJI) / 2.0f;
    }

    public final int getDistanceByProcess() {
        return LIZLLL(this.LLJZ) - LIZLLL(getCenterProgress());
    }

    public final int getResId() {
        return ((Number) this.LLJJJJ.getValue()).intValue();
    }

    public final C0ZDN getVibrator() {
        return (C0ZDN) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C19I9 getSeekBarChangeListener() {
        return this.LLJZIJLIL;
    }

    private final void setBeingDragged(boolean z) {
        this.LLJLL = z;
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    public final void LIZ(Canvas canvas) {
        Drawable drawable;
        if (!this.LLJJJ || (drawable = this.LLJJJIL) == null) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        Rect rect = this.LLJJ;
        int i = rect.right + iLIZIZ;
        float f = iLIZIZ2 / 2.0f;
        int iExactCenterY = (int) (rect.exactCenterY() - f);
        Rect rect2 = this.LLJJ;
        drawable.setBounds(i, iExactCenterY, rect2.right + iLIZIZ + iLIZIZ3, (int) (rect2.exactCenterY() + f));
        drawable.draw(canvas);
        canvas.rotate(180.0f, this.LLJJ.exactCenterX(), this.LLJJ.exactCenterY());
        drawable.draw(canvas);
    }

    public final int LIZIZ(boolean z) {
        int color = ColorProtector.parseColor("#2b000000");
        int color2 = ColorProtector.parseColor("#52ffffff");
        boolean zLIZIZ = C960203pA.LIZIZ(getContext());
        if (z) {
            if (!zLIZIZ) {
                return color2;
            }
            return color;
        }
        return this.LLIZ;
    }

    public final float LIZJ(int i) {
        Rect rect = this.LL;
        float fWidth = (this.LLJJIJIIJIL - this.LLJJIJI) * ((i - rect.left) / rect.width());
        if (getLayoutDirection() == 1) {
            return this.LLJJIJIIJIL - fWidth;
        }
        return this.LLJJIJI + fWidth;
    }

    public final int LIZLLL(float f) {
        float fWidth;
        float f2 = this.LLJJIJIIJIL;
        float f3 = this.LLJJIJI;
        float f4 = (f - f3) / (f2 - f3);
        if (getLayoutDirection() == 1) {
            Rect rect = this.LL;
            fWidth = rect.right - (rect.width() * f4);
        } else {
            Rect rect2 = this.LL;
            fWidth = rect2.left + (rect2.width() * f4);
        }
        return (int) fWidth;
    }

    public final int LJ(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        Rect rect = this.LL;
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

    public final float LJI(float f) {
        float fFloatValue = f;
        for (Range<Float> range : this.LLJJIJIL) {
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
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        super.onDraw(canvas);
        Rect rect = this.LLILZIL;
        float f2 = rect.left;
        float f3 = rect.top;
        float f4 = rect.right;
        float f5 = rect.bottom;
        float f6 = this.LLILZ;
        canvas.drawRoundRect(f2, f3, f4, f5, f6, f6, this.LLILLJJLI);
        Rect rect2 = this.LL;
        float fWidth = rect2.left + (rect2.width() / 2.0f);
        Rect rect3 = this.LLJJ;
        float fWidth2 = rect3.left + (rect3.width() / 2.0f);
        if (fWidth2 < fWidth) {
            z = true;
            f = fWidth2;
        } else {
            z = false;
            f = fWidth;
        }
        float f7 = this.LLILZIL.top;
        if (!z) {
            fWidth = fWidth2;
        }
        canvas.drawRect(f, f7, fWidth, r1.bottom, this.LLILZLL);
        for (Pair<Rect, Rect> pair : this.LLJIJIL) {
            Rect first = pair.getFirst();
            if (fWidth2 < first.left + (first.width() / 2.0f)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJ.setColor(LIZIZ(z2));
            canvas.drawRect(first, this.LLJ);
            Rect second = pair.getSecond();
            if (second.left + (second.width() / 2.0f) < fWidth2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.LLJ.setColor(LIZIZ(z3));
            canvas.drawRect(second, this.LLJ);
        }
        Rect rect4 = this.LLJJ;
        float f8 = rect4.left;
        float f9 = rect4.top;
        float f10 = rect4.right;
        float f11 = rect4.bottom;
        float f12 = this.LLJILJILJ;
        canvas.drawRoundRect(f8, f9, f10, f11, f12, f12, this.LLJJIII);
        float knobBorderWidth = this.LLJJ.left - getKnobBorderWidth();
        float knobBorderWidth2 = this.LLJJ.top - getKnobBorderWidth();
        float knobBorderWidth3 = this.LLJJ.right - getKnobBorderWidth();
        float knobBorderWidth4 = this.LLJJ.bottom - getKnobBorderWidth();
        float f13 = this.LLJILJILJ;
        canvas.drawRoundRect(knobBorderWidth, knobBorderWidth2, knobBorderWidth3, knobBorderWidth4, f13, f13, this.LLJJI);
        LIZ(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19I8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDrawTriangle(boolean z) {
        this.LLJJJ = z;
        if (z) {
            Drawable drawableMutate = null;
            try {
                Drawable drawableLIZIZ = C800330VaR.LIZIZ(getContext(), getResId());
                if (drawableLIZIZ != null) {
                    drawableMutate = drawableLIZIZ.mutate();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLJJJIL = drawableMutate;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[PHI: r1
      0x002b: PHI (r1v2 float) = (r1v1 float), (r1v3 float) binds: [B:10:0x0023, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setProgress(float r5) {
        /*
            r4 = this;
            float r3 = r4.LLJZ
            float r2 = r4.LJI(r5)
            X.00CF r0 = new X.00CF
            r0.<init>(r3, r2)
            float r3 = r3 - r2
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L1f
            float r0 = r5 - r2
            float r3 = r3 * r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L1f
            X.19I9 r0 = r4.LLJZIJLIL
            if (r0 == 0) goto L1f
            r0.LIZIZ(r2)
        L1f:
            float r1 = r4.LLJJIJI
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L2b
            float r1 = r4.LLJJIJIIJIL
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2c
        L2b:
            r5 = r1
        L2c:
            r4.LLJZ = r5
            r4.LJII()
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19I8.setProgress(float):void");
    }

    public final void setSeekBarChangeListener(C19I9 c19i9) {
        this.LLJZIJLIL = c19i9;
    }

    public C19I8(Context context, AttributeSet attributeSet) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        super(context, attributeSet, 0);
        this.LL = new Rect();
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        Integer numLIZ = C1308910kAL.LIZ(R.attr.a03, context);
        if (numLIZ != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = -7829368;
        }
        this.LLILLL = new Size(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LLILZIL = new Rect();
        Integer numLIZ2 = C1308910kAL.LIZ(R.attr.a09, context);
        if (numLIZ2 != null) {
            iIntValue2 = numLIZ2.intValue();
        } else {
            iIntValue2 = -16776961;
        }
        Paint paint2 = new Paint();
        this.LLILZLL = paint2;
        Integer numLIZ3 = C1308910kAL.LIZ(R.attr.a01, context);
        if (numLIZ3 != null) {
            iIntValue3 = numLIZ3.intValue();
        } else {
            iIntValue3 = -12303292;
        }
        this.LLIZ = iIntValue3;
        this.LLIZLLLIL = 1;
        Paint paint3 = new Paint();
        this.LLJ = paint3;
        this.LLJI = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        ArrayList<Pair<Rect, Rect>> arrayList = new ArrayList<>(1);
        this.LLJIJIL = arrayList;
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
        this.LLJILJIL = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        this.LLJILJILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LLJILLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(12));
        this.LLJJ = new Rect();
        Paint paint4 = new Paint();
        this.LLJJI = paint4;
        Paint paint5 = new Paint();
        this.LLJJIII = paint5;
        this.LLJJIJI = EnumC1159500gHM.SEE_MUCH_LESS.getServerValue();
        this.LLJJIJIIJIL = EnumC1159500gHM.SEE_MUCH_MORE.getServerValue();
        this.LLJJIJIL = new ArrayList<>(getStepCount());
        this.LLJJJJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(214));
        this.LLJJJJJIL = 1.0f;
        this.LLJJJJLIIL = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS576S0100000_32(context, 6));
        this.LLJLIL = new PointF();
        this.LLJLILLLLZIIL = -1L;
        this.LLJLLIL = getCenterProgress();
        this.LLJZ = getCenterProgress();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iIntValue);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setColor(iIntValue2);
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
        arrayList.add(new Pair<>(new Rect(), new Rect()));
        int stepCount = getStepCount();
        int i = 0;
        while (i < stepCount) {
            ArrayList<Range<Float>> arrayList2 = this.LLJJIJIL;
            Float fValueOf = Float.valueOf(this.LLJJIJI + (getStepValue() * i));
            i++;
            arrayList2.add(new Range<>(fValueOf, Float.valueOf(this.LLJJIJI + (getStepValue() * i))));
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Rect rect = this.LL;
        rect.left = getPaddingStart();
        rect.top = getPaddingTop();
        rect.right = getMeasuredWidth() - getPaddingEnd();
        rect.bottom = getMeasuredHeight() - getPaddingBottom();
        Rect rect2 = this.LL;
        int iHeight = rect2.top + (rect2.height() / 2);
        int height = this.LLILLL.getHeight() / 2;
        Rect rect3 = this.LLILZIL;
        Rect rect4 = this.LL;
        rect3.left = rect4.left;
        rect3.top = iHeight - height;
        rect3.right = rect4.right;
        rect3.bottom = height + iHeight;
        int width = this.LLJI.getWidth() / 2;
        int height2 = this.LLJI.getHeight() / 2;
        int iWidth = this.LL.width() / getStepCount();
        int i3 = 0;
        for (Pair<Rect, Rect> pair : this.LLJIJIL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                Pair<Rect, Rect> pair2 = pair;
                int i5 = iWidth * i4;
                int i6 = this.LL.left + i5;
                Rect first = pair2.getFirst();
                first.left = i6 - width;
                int i7 = iHeight - height2;
                first.top = i7;
                first.right = i6 + width;
                int i8 = iHeight + height2;
                first.bottom = i8;
                int i9 = this.LL.right - i5;
                Rect second = pair2.getSecond();
                second.left = i9 - width;
                second.top = i7;
                second.right = i9 + width;
                second.bottom = i8;
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LJII();
    }

    public final void LJFF(float f, Function0 function0, boolean z) {
        new AwS0S0010001_3(f, z, 0);
        if (z) {
            float f2 = this.LLJZ;
            if (f == f2) {
                function0.invoke();
                return;
            }
            Animator animator = this.LLJJL;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(this, 0));
            valueAnimatorOfFloat.addListener(new AAListenerS341S0100000_31(function0, 1));
            this.LLJJL = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
            return;
        }
        setProgress(f);
    }
}
