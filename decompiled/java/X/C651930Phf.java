package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0Phf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651930Phf extends AbstractC1585810rMx implements InterfaceC688940R0q {
    public final SearchList LL;

    @Override // X.InterfaceC688940R0q
    public final void destroy() {
    }

    public C651930Phf(SearchList searchList) {
        this.LL = searchList;
        ((RecyclerView) searchList.mView).addOnScrollListener(this);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        String str;
        if (i == 0 && i2 == 0) {
            C0PTE c0pte = C0PTE.LIZ;
            MatchResult matchResultFind$default = Regex.find$default(new Regex(".*/([^/]+)/template\\.js$"), this.LL.mContext.LLJJIII, 0, 2, null);
            if (matchResultFind$default != null) {
                str = (String) ListProtector.get(matchResultFind$default.LIZ(), 1);
            } else {
                str = "";
            }
            c0pte.getClass();
            if (C0PTE.LIZIZ) {
                C0PTE.LIZIZ = false;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis - C0PTE.LIZJ, "total_cost");
                c2344009Gk.LIZLLL(jCurrentTimeMillis - C0PTE.LIZLLL, "horizontal_fmp");
                c2344009Gk.LJIIIIZZ("type", "new-search-list");
                c2344009Gk.LJIIIIZZ("token_type", str);
                C20684815ws.LJIILLIIL("search_lynx_horizontal_monitor", c2344009Gk.LIZ);
            }
            ((RecyclerView) this.LL.mView).removeOnScrollListener(this);
        }
    }
}
