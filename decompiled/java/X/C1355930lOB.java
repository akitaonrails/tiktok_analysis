package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lOB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355930lOB extends ViewOnAttachStateChangeListenerC20604515jv {
    public Function1<? super Boolean, Unit> LLILZ;
    public Float LLILZIL;
    public Float LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public ValueAnimator LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public final int LLJJI;
    public Function0<Unit> LLJJIII;
    public Function0<Unit> LLJJIJI;
    public boolean LLJJIJIIJIL;
    public float LLJJIJIL;
    public final double LLJJJ;
    public final double LLJJJIL;
    public int LLJJJJ;

    private final int getLowerThreshold() {
        if (this.LLJJJJ == Integer.MAX_VALUE) {
            this.LLJJJJ = this.LLJILJIL - ((int) this.LLJJJ);
        }
        return this.LLJJJJ;
    }

    public final int getPatientTopMargin() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        return marginLayoutParams.topMargin;
    }

    public final Function1<Boolean, Unit> getOnDragOutOfBounds() {
        return this.LLILZ;
    }

    public final double getUpperThreshold() {
        return this.LLJJJIL;
    }

    public final void LJJI(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int i = marginLayoutParams.topMargin + ((int) (f * this.LLJJI));
        if (i < 0) {
            return;
        }
        marginLayoutParams.topMargin = i;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1355930lOB.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setOnActionUpLambda(Function0<Unit> function0) {
        this.LLJJIJI = function0;
    }

    public final void setOnDragOutOfBounds(Function1<? super Boolean, Unit> function1) {
        this.LLILZ = function1;
    }

    public final void setOnHorizontalSlopExceeded(Function0<Unit> function0) {
        this.LLJJIII = function0;
    }

    public C1355930lOB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLIZLLLIL = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        this.LLJIJIL = true;
        this.LLJILJIL = Integer.MAX_VALUE;
        this.LLJILLL = -2.1474836E9f;
        this.LLJJ = -2.1474836E9f;
        this.LLJJI = 1;
        this.LLJJJJ = Integer.MAX_VALUE;
        double dLJIIJ = ((double) C12ES.LJIIJ(getContext())) * 0.3d;
        this.LLJJJ = dLJIIJ;
        this.LLJJJIL = dLJIIJ;
    }
}
