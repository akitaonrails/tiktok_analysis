package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;

/* JADX INFO: renamed from: X.0IeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C471400IeA {
    public AbstractC471430IeD LIZ;
    public RecyclerView LIZIZ;
    public TabFeedViewModel LIZJ;
    public RecyclerView.LayoutManager LIZLLL;
    public int LJ = 2;
    public C0DXR LJFF;
    public LifecycleOwner LJI;
    public InterfaceC471650IeZ LJII;
    public String LJIIIIZZ;

    public final C471410IeB LIZ() {
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView == null) {
            throw new IllegalStateException("recyclerView must not be null");
        }
        recyclerView.setItemAnimator(null);
        AbstractC471430IeD abstractC471430IeD = this.LIZ;
        if (abstractC471430IeD == null) {
            throw new IllegalStateException("adapter must not be null");
        }
        TabFeedViewModel tabFeedViewModel = this.LIZJ;
        if (tabFeedViewModel == null) {
            throw new IllegalStateException("viewModel must not be null");
        }
        LifecycleOwner lifecycleOwner = this.LJI;
        if (lifecycleOwner == null) {
            throw new IllegalStateException("lifecycleOwner must not be null");
        }
        C471410IeB c471410IeB = new C471410IeB(lifecycleOwner, abstractC471430IeD, this.LIZIZ, tabFeedViewModel);
        RecyclerView.LayoutManager layoutManager = this.LIZLLL;
        c471410IeB.LIZLLL = layoutManager;
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) layoutManager).LJJJ(this.LJ);
        }
        c471410IeB.LJI = this.LJII;
        c471410IeB.LJ = this.LJFF;
        c471410IeB.LJII = this.LJIIIIZZ;
        return c471410IeB;
    }

    public C471400IeA() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        staggeredGridLayoutManager.LJJIL(0);
        this.LIZLLL = staggeredGridLayoutManager;
    }
}
