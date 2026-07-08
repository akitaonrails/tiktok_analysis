package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.ui.list.UIList;

/* JADX INFO: renamed from: X.0kQk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1319080kQk extends StaggeredGridLayoutManager implements InterfaceC1319200kQw {
    public final UIList LLJJJJLIIL;
    public int LLJJL;

    @Override // X.InterfaceC1319200kQw
    public final float LIZIZ() {
        return 0.0f;
    }

    @Override // X.InterfaceC1319200kQw
    public final float LJ() {
        return 0.0f;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        if (this.LLJJJJLIIL.LLJJ) {
            return super.canScrollHorizontally();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.LLJJJJLIIL.LLJJ) {
            return super.canScrollVertically();
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        this.LLJJJJLIIL.LJJJJJ();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        try {
            super.onScrollStateChanged(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("ListStaggeredGridLayoutManager", e.getMessage());
        }
    }

    public C1319080kQk(int i, int i2, UIList uIList) {
        super(i, 1);
        this.LLJJL = i2;
        this.LLJJJJLIIL = uIList;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            int iScrollBy = scrollBy(i, c21673319rv, c21673919s1);
            this.LLJJJJLIIL.LLJ.LJJJ(i, iScrollBy);
            return iScrollBy;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            int iScrollBy = scrollBy(i, c21673319rv, c21673919s1);
            this.LLJJJJLIIL.LLJ.LJJJ(i, iScrollBy);
            return iScrollBy;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        C21681819tI c21681819tI = (C21681819tI) view.getLayoutParams();
        if (1 == this.LLILZIL) {
            if (!c21681819tI.LLILLJJLI) {
                UIList uIList = this.LLJJJJLIIL;
                if (!uIList.LLLIIIIL) {
                    i = ListLayoutManager.LIZ(uIList, this.LL, this.LLJJL, i, i3);
                    i3 = view.getMeasuredWidth() + i;
                }
                super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
                return;
            }
            ListLayoutManager.LIZIZ(this, view, i2, i4, this.LLJJJJLIIL.LLLIIIIL);
            return;
        }
        super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
    }
}
