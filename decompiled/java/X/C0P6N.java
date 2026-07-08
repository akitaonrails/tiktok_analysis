package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0P6N, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P6N {
    public final C0P6P LIZ;
    public final RecyclerView LIZIZ;
    public final SearchTopFragmentAbility LIZJ;
    public GridLayoutManager LIZLLL;
    public long LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIILL;
    public boolean LJIILLIIL;
    public int LJ = 4;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(320));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(321));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(323));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(322));
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(542));
    public final float LJIILIIL = 1569.6001f;
    public final int LJIILJJIL = 1;

    public final void LIZ() {
        C0P6P c0p6p;
        GridLayoutManager gridLayoutManager = this.LIZLLL;
        if (gridLayoutManager != null) {
            int iNi1 = this.LIZJ.ni1();
            int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            if (iNi1 <= 0 || iFindLastVisibleItemPosition < iNi1 - this.LJ || (c0p6p = this.LIZ) == null) {
                return;
            }
            c0p6p.LJJIFFI();
        }
    }

    public C0P6N(SearchJediMixFeedFragment searchJediMixFeedFragment, RecyclerView recyclerView, SearchJediMixFeedFragment searchJediMixFeedFragment2) {
        this.LIZ = searchJediMixFeedFragment;
        this.LIZIZ = recyclerView;
        this.LIZJ = searchJediMixFeedFragment2;
    }
}
