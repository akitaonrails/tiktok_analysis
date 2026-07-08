package X;

import Y.AsS53S0100000_27;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yXB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861230yXB {
    public RecyclerView LIZ;
    public Function1<? super Integer, Boolean> LIZJ;
    public Function1<? super Integer, C14J2> LIZLLL;
    public boolean LJFF;
    public int LIZIZ = 1;
    public int LJ = -1;
    public final ViewOnLayoutChangeListenerC1864650ych LJI = new ViewOnLayoutChangeListenerC1864650ych(this, 9);
    public final AsS53S0100000_27 LJII = new AsS53S0100000_27(this, 8);

    public final void LIZ() {
        AbstractC21673619ry adapter;
        int itemCount;
        Function1<? super Integer, C14J2> function1;
        C14J2 c14j2Invoke;
        C14J2 c14j2Invoke2;
        EnumC1861280yXG enumC1861280yXG;
        C14J2 c14j2Invoke3;
        LinearLayoutManager linearLayoutManager;
        AbstractC21673619ry adapter2;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null || (itemCount = adapter.getItemCount()) <= this.LIZIZ) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == null) {
            return;
        }
        int i = (itemCount - 1) - this.LIZIZ;
        Function1<? super Integer, Boolean> function12 = this.LIZJ;
        if (!(function12 != null ? function12.invoke(Integer.valueOf(i)).booleanValue() : false) || i == -1) {
            int i2 = this.LJ;
            if (i2 != -1) {
                this.LJ = -1;
                if (!this.LJFF && (function1 = this.LIZLLL) != null && (c14j2Invoke = function1.invoke(Integer.valueOf(i2))) != null && c14j2Invoke.LLJIJIL) {
                    c14j2Invoke.setEnableGradientEffect(false);
                }
                this.LJFF = false;
                return;
            }
            return;
        }
        boolean z = this.LJ != i;
        this.LJ = i;
        if (z) {
            this.LJFF = false;
        }
        RecyclerView recyclerView2 = this.LIZ;
        if (recyclerView2 != null) {
            RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
            if (!(layoutManager2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager2) == null || (adapter2 = recyclerView2.getAdapter()) == null || adapter2.getItemCount() <= 1) {
                enumC1861280yXG = EnumC1861280yXG.ABOVE_BOTTOM;
            } else {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                if (viewFindViewByPosition == null) {
                    enumC1861280yXG = i < linearLayoutManager.findFirstVisibleItemPosition() ? EnumC1861280yXG.ABOVE_TOP : i > linearLayoutManager.findLastVisibleItemPosition() ? EnumC1861280yXG.BELOW_BOTTOM : EnumC1861280yXG.BELOW_BOTTOM;
                } else {
                    int paddingTop = recyclerView2.getPaddingTop();
                    int height = recyclerView2.getHeight() - recyclerView2.getPaddingBottom();
                    Rect rect = new Rect();
                    linearLayoutManager.getDecoratedBoundsWithMargins(viewFindViewByPosition, rect);
                    int i3 = rect.bottom;
                    if (i3 <= paddingTop) {
                        enumC1861280yXG = EnumC1861280yXG.ABOVE_TOP;
                    } else {
                        int i4 = rect.top;
                        enumC1861280yXG = i4 >= height ? EnumC1861280yXG.BELOW_BOTTOM : (i4 < paddingTop || i3 > height) ? (i4 < paddingTop || i3 <= height) ? (i4 >= paddingTop || i3 > height) ? (i4 >= paddingTop || i3 > height) ? EnumC1861280yXG.PARTIAL_BOTTOM : EnumC1861280yXG.PARTIAL_BOTTOM : EnumC1861280yXG.ABOVE_BOTTOM : EnumC1861280yXG.PARTIAL_BOTTOM : EnumC1861280yXG.FULLY_VISIBLE;
                    }
                }
            }
            if (enumC1861280yXG == EnumC1861280yXG.PARTIAL_BOTTOM) {
                if (this.LJFF) {
                    return;
                }
                this.LJFF = true;
                int i5 = this.LJ;
                Function1<? super Integer, C14J2> function13 = this.LIZLLL;
                if (function13 == null || (c14j2Invoke3 = function13.invoke(Integer.valueOf(i5))) == null || !c14j2Invoke3.LLJIJIL) {
                    return;
                }
                c14j2Invoke3.setEnableGradientEffect(false);
                return;
            }
        }
        if (this.LJFF) {
            return;
        }
        int i6 = this.LJ;
        Function1<? super Integer, C14J2> function14 = this.LIZLLL;
        if (function14 == null || (c14j2Invoke2 = function14.invoke(Integer.valueOf(i6))) == null || c14j2Invoke2.LLJIJIL) {
            return;
        }
        c14j2Invoke2.setEnableGradientEffect(true);
    }
}
