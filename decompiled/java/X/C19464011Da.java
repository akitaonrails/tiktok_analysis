package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: X.11Da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19464011Da {
    public int LIZ = -241;
    public final C11D6 LIZIZ = new C11D6(0);
    public C19464511Df LIZJ;

    public final void LIZ() {
        RecyclerView recyclerView = this.LIZIZ.LLILLL;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            this.LIZ = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            this.LIZ = staggeredGridLayoutManager.LJIJ(new int[staggeredGridLayoutManager.LJJIII()])[0];
        }
    }

    public final void LIZIZ(int i) {
        int i2;
        RecyclerView recyclerView = this.LIZIZ.LLILLL;
        if (recyclerView == null || (i2 = this.LIZ) == -241 || i2 < i) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            layoutManager.scrollToPosition(this.LIZ);
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            layoutManager.scrollToPosition(this.LIZ);
        }
    }
}
