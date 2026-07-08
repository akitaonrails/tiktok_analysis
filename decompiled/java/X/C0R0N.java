package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0R0N, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0N implements InterfaceC688940R0q {
    public final SearchList LL;
    public final C0R0K LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(234));

    @Override // X.InterfaceC688940R0q
    public final void destroy() {
    }

    public C0R0N(SearchList searchList, C0R0K c0r0k) {
        this.LL = searchList;
        this.LLILLJJLI = c0r0k;
        c0r0k.LJFF = this;
        c0r0k.LJIJI = this;
        c0r0k.LJIIJJI = this;
        c0r0k.LJIILIIL = this;
        RecyclerView recyclerView = (RecyclerView) searchList.mView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setEdgeEffectFactory(new C688820R0e());
    }
}
