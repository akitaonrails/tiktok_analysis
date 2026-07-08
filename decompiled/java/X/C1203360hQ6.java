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

/* JADX INFO: renamed from: X.0hQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203360hQ6 extends AbstractC1203440hQE {
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final int LLJJJJLIIL = 5;
    public final int LLJIJIL;
    public final boolean LLJILJIL;
    public boolean LLJILJILJ;
    public Function2<? super C1203360hQ6, ? super Integer, Unit> LLJILLL;
    public Function2<? super C1203360hQ6, ? super Integer, Unit> LLJJ;
    public final int LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public Boolean LLJJIJIIJIL;

    public final int getRatingInput() {
        return (int) getRatingValue();
    }

    public final int getStarSize() {
        return getRatingSize();
    }

    public final int getStarSpacing() {
        return getRatingSpacing();
    }

    public final Function2<C1203360hQ6, Integer, Unit> getOnValueChangeListener() {
        return this.LLJILLL;
    }

    public final Function2<C1203360hQ6, Integer, Unit> getOnValueSelectedListener() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1203440hQE
    public final void LIZ(float f) {
        Function2<? super C1203360hQ6, ? super Integer, Unit> function2 = this.LLJILLL;
        if (function2 != null) {
            function2.invoke(this, Integer.valueOf((int) f));
        }
    }

    @Override // X.AbstractC1203440hQE
    public final void LIZIZ(float f) {
        Function2<? super C1203360hQ6, ? super Integer, Unit> function2 = this.LLJJ;
        if (function2 != null) {
            function2.invoke(this, Integer.valueOf((int) f));
        }
    }

    public final int LIZLLL(int i) {
        return i + getPaddingTop() + getPaddingBottom();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = X.C0A1R.LIZ()
            if (r0 == 0) goto L83
            if (r7 != 0) goto Ld
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        Ld:
            int r2 = r7.getAction()
            r1 = 0
            r3 = 1
            if (r2 == 0) goto L6d
            r5 = 0
            if (r2 == r3) goto L63
            r0 = 2
            if (r2 == r0) goto L29
            r0 = 3
            if (r2 == r0) goto L63
        L1e:
            java.lang.Boolean r1 = r6.LLJJIJIIJIL
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L83
            return r3
        L29:
            java.lang.Boolean r0 = r6.LLJJIJIIJIL
            if (r0 != 0) goto L1e
            float r1 = r7.getX()
            float r0 = r6.LLJJIII
            float r1 = r1 - r0
            float r4 = java.lang.Math.abs(r1)
            float r1 = r7.getY()
            float r0 = r6.LLJJIJI
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            int r0 = r6.LLJJI
            float r1 = (float) r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L4e
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1e
        L4e:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L57
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.LLJJIJIIJIL = r0
            goto L1e
        L57:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.LLJJIJIIJIL = r0
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            goto L1e
        L63:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            r6.LLJJIJIIJIL = r1
            goto L1e
        L6d:
            float r0 = r7.getX()
            r6.LLJJIII = r0
            float r0 = r7.getY()
            r6.LLJJIJI = r0
            r6.LLJJIJIIJIL = r1
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L1e
        L83:
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1203360hQ6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnValueChangeListener(Function2<? super C1203360hQ6, ? super Integer, Unit> function2) {
        this.LLJILLL = function2;
    }

    public final void setOnValueSelectedListener(Function2<? super C1203360hQ6, ? super Integer, Unit> function2) {
        this.LLJJ = function2;
    }

    public final void setRatingInput(int i) {
        setRatingValue(i);
    }

    public final void setStarSize(int i) {
        setRatingSize(i);
    }

    public final void setStarSpacing(int i) {
        setRatingSpacing(i);
    }

    public C1203360hQ6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (Object) null);
        this.LLJILJIL = true;
        int i = LLJJJIL;
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
        setRatingEnableTouch(true);
        setHasOffset(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AutoSizeRatingInput, R.attr.yk, 0);
        setRatingInput(typedArrayObtainStyledAttributes.getInt(R$styleable.AutoSizeRatingInput_ratingInputValue, 0));
        setStarSize(typedArrayObtainStyledAttributes.getInt(R$styleable.AutoSizeRatingInput_ratingStarStarSize, LLJJIJIL));
        setStarSpacing(typedArrayObtainStyledAttributes.getInt(R$styleable.AutoSizeRatingInput_ratingStarStarSpacing, LLJJJ));
        this.LLJILJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoSizeRatingInput_ratingAutoSize, true);
        typedArrayObtainStyledAttributes.getInt(R$styleable.AutoSizeRatingInput_ratingStarAutoSizeStep, i);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJIJIL = LJ(this, getRatingSize());
        LIZLLL(getRatingSize());
        this.LLJJI = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static int LJ(C1203360hQ6 c1203360hQ6, int i) {
        int ratingSpacing = c1203360hQ6.getRatingSpacing();
        return (((i + ratingSpacing) * LLJJJJLIIL) - ratingSpacing) + c1203360hQ6.getPaddingLeft() + c1203360hQ6.getPaddingRight();
    }

    @Override // X.AbstractC1203440hQE, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LLJILJIL) {
            setMeasuredDimension(LJ(this, getRatingSize()), LIZLLL(getRatingSize()));
            return;
        }
        int iLJ = LJ(this, getStarSize());
        int iResolveSize = View.resolveSize(LJ(this, getStarSize()), i);
        if (iLJ < iResolveSize) {
            setMeasuredDimension(iLJ, View.resolveSize(LIZLLL(getStarSize()), i2));
        } else {
            setMeasuredDimension(iResolveSize, View.resolveSize(LIZLLL(getStarSize()), i2));
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.LLJILJIL && !this.LLJILJILJ) {
            int starSize = getStarSize();
            int paddingLeft = this.LLJIJIL;
            while (starSize > LLJJJJ && paddingLeft > getMeasuredWidth()) {
                starSize -= LLJJJIL;
                paddingLeft = LJ(this, starSize);
            }
            int starSpacing = getStarSpacing();
            while (starSize > LLJJJJJIL && paddingLeft > getMeasuredWidth()) {
                starSpacing -= LLJJJIL;
                paddingLeft = (((starSize + starSpacing) * LLJJJJLIIL) - starSpacing) + getPaddingLeft() + getPaddingRight();
            }
            int iLIZLLL = LIZLLL(starSize);
            this.LLJILJILJ = true;
            if (getStarSize() != starSize || getStarSpacing() != starSpacing) {
                int i5 = i2 + (((i4 - i2) - iLIZLLL) / 2);
                setTop(i5);
                setRight(i + paddingLeft);
                setBottom(i5 + iLIZLLL);
                setStarSize(starSize);
                setStarSpacing(starSpacing);
                invalidate();
            }
        }
    }
}
