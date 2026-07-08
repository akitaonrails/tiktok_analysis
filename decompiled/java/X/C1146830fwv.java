package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146830fwv extends HorizontalScrollView {
    public Function1<? super Boolean, Unit> LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return (!this.LLILZ || getScrollX() <= 0) ? 0.0f : 1.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        return this.LLILZ ? 1.0f : 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.LLILLL) {
            return;
        }
        super.requestLayout();
    }

    public final Function1<Boolean, Unit> getOnCompactChange() {
        return this.LL;
    }

    public final void setOnCompactChange(Function1<? super Boolean, Unit> function1) {
        this.LL = function1;
    }

    public C1146830fwv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOverScrollMode(2);
        setHorizontalScrollBarEnabled(false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = true;
        this.LLILLL = true;
        try {
            if (this.LLILLJJLI) {
                this.LLILLJJLI = false;
                Function1<? super Boolean, Unit> function1 = this.LL;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
            }
            super.onMeasure(i, i2);
            View childAt = getChildAt(0);
            if (childAt == null) {
                if (this.LLILZ) {
                    this.LLILZ = false;
                }
                if (isHorizontalFadingEdgeEnabled()) {
                    setHorizontalFadingEdgeEnabled(false);
                }
                this.LLILLL = false;
                return;
            }
            int iMax = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            if (iMax == 0) {
                if (this.LLILZ) {
                    this.LLILZ = false;
                }
                if (isHorizontalFadingEdgeEnabled()) {
                    setHorizontalFadingEdgeEnabled(false);
                }
                this.LLILLL = false;
                return;
            }
            if (childAt.getMeasuredWidth() > iMax) {
                this.LLILLJJLI = true;
                Function1<? super Boolean, Unit> function12 = this.LL;
                if (function12 != null) {
                    function12.invoke(Boolean.TRUE);
                }
                super.onMeasure(i, i2);
            }
            if (childAt.getMeasuredWidth() <= iMax) {
                z = false;
            }
            if (this.LLILZ != z) {
                this.LLILZ = z;
            }
            if (isHorizontalFadingEdgeEnabled() != z) {
                setHorizontalFadingEdgeEnabled(z);
            }
            this.LLILLL = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL = false;
            throw th;
        }
    }
}
