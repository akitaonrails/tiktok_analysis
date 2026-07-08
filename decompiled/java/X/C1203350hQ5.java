package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hQ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203350hQ5 extends AbstractC1203440hQE {
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
    public final C1195600hDa LLJIJIL;
    public final boolean LLJILJIL;
    public boolean LLJILJILJ;
    public EnumC1203380hQ8 LLJILLL;
    public Function2<? super C1203350hQ5, ? super Integer, Unit> LLJJ;
    public Function2<? super C1203350hQ5, ? super Integer, Unit> LLJJI;
    public final int LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public Boolean LLJJIJIL;

    private final int getStarSize() {
        return getRatingSize();
    }

    private final int getStarSpacing() {
        return getRatingSpacing();
    }

    public final int getRatingInput() {
        return (int) getRatingValue();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJIJIL.LIZ();
    }

    public final Function2<C1203350hQ5, Integer, Unit> getOnValueChangeListener() {
        return this.LLJJ;
    }

    public final Function2<C1203350hQ5, Integer, Unit> getOnValueSelectedListener() {
        return this.LLJJI;
    }

    public final EnumC1203380hQ8 getStarSizeStyle() {
        return this.LLJILLL;
    }

    private final void setStarSize(int i) {
        setRatingSize(i);
    }

    private final void setStarSpacing(int i) {
        setRatingSpacing(i);
    }

    @Override // X.AbstractC1203440hQE
    public final void LIZ(float f) {
        Function2<? super C1203350hQ5, ? super Integer, Unit> function2 = this.LLJJ;
        if (function2 != null) {
            function2.invoke(this, Integer.valueOf((int) f));
        }
    }

    @Override // X.AbstractC1203440hQE
    public final void LIZIZ(float f) {
        Function2<? super C1203350hQ5, ? super Integer, Unit> function2 = this.LLJJI;
        if (function2 != null) {
            function2.invoke(this, Integer.valueOf((int) f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L7
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        L7:
            int r3 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r3 == 0) goto L68
            r4 = 0
            if (r3 == r2) goto L5e
            r0 = 2
            if (r3 == r0) goto L23
            r0 = 3
            if (r3 == r0) goto L5e
        L18:
            java.lang.Boolean r1 = r6.LLJJIJIL
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7e
            return r2
        L23:
            java.lang.Boolean r0 = r6.LLJJIJIL
            if (r0 != 0) goto L18
            float r1 = r7.getX()
            float r0 = r6.LLJJIJI
            float r1 = r1 - r0
            float r5 = java.lang.Math.abs(r1)
            float r1 = r7.getY()
            float r0 = r6.LLJJIJIIJIL
            float r1 = r1 - r0
            float r3 = java.lang.Math.abs(r1)
            int r1 = r6.LLJJIII
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L49
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L18
        L49:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L52
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.LLJJIJIL = r0
            goto L18
        L52:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.LLJJIJIL = r0
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L18
        L5e:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            r6.LLJJIJIL = r1
            goto L18
        L68:
            float r0 = r7.getX()
            r6.LLJJIJI = r0
            float r0 = r7.getY()
            r6.LLJJIJIIJIL = r0
            r6.LLJJIJIL = r1
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L18
        L7e:
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1203350hQ5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnValueChangeListener(Function2<? super C1203350hQ5, ? super Integer, Unit> function2) {
        this.LLJJ = function2;
    }

    public final void setOnValueSelectedListener(Function2<? super C1203350hQ5, ? super Integer, Unit> function2) {
        this.LLJJI = function2;
    }

    public final void setRatingInput(int i) {
        setRatingValue(i);
    }

    public final void setStarSizeStyle(EnumC1203380hQ8 enumC1203380hQ8) {
        int i;
        this.LLJILLL = enumC1203380hQ8;
        int i2 = C1203400hQA.LIZ[enumC1203380hQ8.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = LLJJL;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i = LLJJLIIIJLLLLLLLZ;
            }
        } else {
            i = LLJJJJLIIL;
        }
        setStarSize(i);
        this.LLJILJILJ = false;
        requestLayout();
    }

    public final void setTrackParams(C1174900ggC c1174900ggC) {
        C1195600hDa c1195600hDa = this.LLJIJIL;
        c1195600hDa.LIZLLL = c1174900ggC;
        c1195600hDa.LIZ();
    }

    public C1203350hQ5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.yk);
        this.LLJIJIL = new C1195600hDa(this, EnumC1195620hDc.RATING_INPUT, null);
        this.LLJILJIL = true;
        EnumC1203380hQ8 enumC1203380hQ8 = EnumC1203380hQ8.MEDIUM;
        this.LLJILLL = enumC1203380hQ8;
        setRatingEnableTouch(true);
        setHasOffset(false);
        setStarSpacing(LLJJJ);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LsRatingInput, R.attr.yk, 0);
        setRatingInput(typedArrayObtainStyledAttributes.getInt(R$styleable.LsRatingInput_lsRatingInputValue, 0));
        this.LLJILJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LsRatingInput_lsRatingInputAutoSize, true);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.LsRatingInput_lsRatingInputStarSizeStyle, 1);
        if (i != 0) {
            if (i == 2) {
                enumC1203380hQ8 = EnumC1203380hQ8.LARGE;
            }
        } else {
            enumC1203380hQ8 = EnumC1203380hQ8.SMALL;
        }
        setStarSizeStyle(enumC1203380hQ8);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJIII = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static int LIZLLL(C1203350hQ5 c1203350hQ5, int i) {
        int ratingSpacing = c1203350hQ5.getRatingSpacing();
        return (((i + ratingSpacing) * 5) - ratingSpacing) + c1203350hQ5.getPaddingLeft() + c1203350hQ5.getPaddingRight();
    }

    @Override // X.AbstractC1203440hQE, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LLJILJIL) {
            setMeasuredDimension(LIZLLL(this, getRatingSize()), getRatingSize() + getPaddingTop() + getPaddingBottom());
            return;
        }
        int iLIZLLL = LIZLLL(this, getStarSize());
        int iResolveSize = View.resolveSize(LIZLLL(this, getStarSize()), i);
        if (iLIZLLL < iResolveSize) {
            setMeasuredDimension(iLIZLLL, View.resolveSize(getStarSize() + getPaddingTop() + getPaddingBottom(), i2));
        } else {
            setMeasuredDimension(iResolveSize, View.resolveSize(getStarSize() + getPaddingTop() + getPaddingBottom(), i2));
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.LLJILJIL && !this.LLJILJILJ) {
            int starSize = getStarSize();
            int iLIZLLL = LIZLLL(this, starSize);
            while (starSize > LLJJJJ && iLIZLLL > getMeasuredWidth()) {
                starSize -= LLJJJIL;
                iLIZLLL = LIZLLL(this, starSize);
            }
            int starSpacing = getStarSpacing();
            while (starSize > LLJJJJJIL && iLIZLLL > getMeasuredWidth()) {
                starSpacing -= LLJJJIL;
                iLIZLLL = (((starSize + starSpacing) * 5) - starSpacing) + getPaddingLeft() + getPaddingRight();
            }
            int paddingTop = getPaddingTop() + starSize + getPaddingBottom();
            this.LLJILJILJ = true;
            if (getStarSize() != starSize || getStarSpacing() != starSpacing) {
                int i5 = i2 + (((i4 - i2) - paddingTop) / 2);
                setTop(i5);
                setRight(i + iLIZLLL);
                setBottom(i5 + paddingTop);
                setStarSize(starSize);
                setStarSpacing(starSpacing);
                invalidate();
            }
        }
    }
}
