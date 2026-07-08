package X;

import Y.AObserverS211S0100000_7;
import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import Y.AsS34S0100000_7;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;

/* JADX INFO: renamed from: X.0IeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471410IeB {
    public final AbstractC471430IeD LIZ;
    public final RecyclerView LIZIZ;
    public final TabFeedViewModel LIZJ;
    public RecyclerView.LayoutManager LIZLLL;
    public C0DXR LJ;
    public final LifecycleOwner LJFF;
    public InterfaceC471650IeZ LJI;
    public String LJII;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ() {
        AbstractC471430IeD abstractC471430IeD = this.LIZ;
        this.LIZJ.getClass();
        abstractC471430IeD.getClass();
        abstractC471430IeD.LLJJLIIIJLLLLLLLZ = new Object[]{"live", abstractC471430IeD.LLJJIJI, abstractC471430IeD.LLJJIJIIJIL, abstractC471430IeD.LLJJIJIL, abstractC471430IeD.LLJJJ, abstractC471430IeD.LLJJJIL, abstractC471430IeD.LLJJJJ};
        this.LIZIZ.setAdapter(this.LIZ);
        this.LIZIZ.setLayoutManager(this.LIZLLL);
        this.LIZIZ.addOnScrollListener(new AsS34S0100000_7(this, 6));
        C0DXR c0dxr = this.LJ;
        if (c0dxr != null) {
            this.LIZIZ.addItemDecoration(c0dxr);
        }
        AbstractC471430IeD abstractC471430IeD2 = this.LIZ;
        TabFeedViewModel tabFeedViewModel = this.LIZJ;
        PagingViewModel<T> pagingViewModel = abstractC471430IeD2.LLILLJJLI;
        if (pagingViewModel != 0) {
            pagingViewModel.LLILZLL.removeObserver(abstractC471430IeD2.LLILLL);
            abstractC471430IeD2.LLILLJJLI.LL.removeObserver(abstractC471430IeD2.LLILZ);
            abstractC471430IeD2.LLILLJJLI.LLILLJJLI.removeObserver(abstractC471430IeD2.LLILZIL);
            abstractC471430IeD2.LLILLJJLI.LLILZ.removeObserver(abstractC471430IeD2.LLILZLL);
            abstractC471430IeD2.LLILLJJLI.LLILLL.removeObserver(abstractC471430IeD2.LLIZ);
            abstractC471430IeD2.LLILLJJLI.LLILZIL.removeObserver(abstractC471430IeD2.LLIZLLLIL);
        }
        abstractC471430IeD2.LLILLJJLI = tabFeedViewModel;
        if (tabFeedViewModel != null) {
            tabFeedViewModel.LLILZLL.observeForever(abstractC471430IeD2.LLILLL);
            tabFeedViewModel.LL.observeForever(abstractC471430IeD2.LLILZ);
            tabFeedViewModel.LLILLJJLI.observeForever(abstractC471430IeD2.LLILZIL);
            tabFeedViewModel.LLILZ.observeForever(abstractC471430IeD2.LLILZLL);
            tabFeedViewModel.LLILLL.observeForever(abstractC471430IeD2.LLIZ);
            tabFeedViewModel.LLILZIL.observeForever(abstractC471430IeD2.LLIZLLLIL);
        }
        this.LIZ.LLJJIJI.LJJLL(new AfS176S0100000_7(this, 207), new AfS132S0000000_7(28));
        this.LIZ.LLJJIJIIJIL.LJJLL(new AfS176S0100000_7(this, 208), new AfS132S0000000_7(29));
        TabFeedViewModel tabFeedViewModel2 = this.LIZJ;
        if (tabFeedViewModel2.LLJJL) {
            tabFeedViewModel2.BQ2();
        }
        this.LIZJ.LLJILLL.Fw1(this.LJFF);
        this.LIZJ.LLJJ.observeForever(new AObserverS211S0100000_7(this, 44));
        this.LIZJ.LLJJIII.observe(this.LJFF, new AObserverS211S0100000_7(this, 45));
    }

    public C471410IeB(LifecycleOwner lifecycleOwner, AbstractC471430IeD abstractC471430IeD, RecyclerView recyclerView, TabFeedViewModel tabFeedViewModel) {
        this.LJFF = lifecycleOwner;
        this.LIZ = abstractC471430IeD;
        this.LIZIZ = recyclerView;
        this.LIZJ = tabFeedViewModel;
    }
}
