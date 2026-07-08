package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0PFX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PFX {
    public static final C0PFX LIZ = new C0PFX();

    public static final void LIZ(RecyclerView.ViewHolder viewHolder, SearchMixFeed searchMixFeed, C0PL1 c0pl1) {
        ISearchContextAbility iSearchContextAbilityLJI;
        Object providerDocIdStr;
        int rank;
        Integer num;
        View view;
        C646370PWx c646370PWx = null;
        if (viewHolder != null && (view = viewHolder.itemView) != null && (iSearchContextAbilityLJI = C0Q3E.LIZ(view)) != null) {
            C0PCY<C646370PWx> c0pcyWO2 = iSearchContextAbilityLJI.wO2();
            if (c0pcyWO2 != null) {
                c646370PWx = (C646370PWx) c0pcyWO2.LIZJ();
            }
        } else {
            iSearchContextAbilityLJI = C0Q3E.LJI();
        }
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_id", c0prc.LLILLL);
        c2344009Gk.LJIIIIZZ("search_keyword", c0prc.LLIZLLLIL);
        if ((c646370PWx == null || (providerDocIdStr = c646370PWx.LLJ) == null) && (providerDocIdStr = searchMixFeed.getProviderDocIdStr()) == null) {
            providerDocIdStr = Long.valueOf(searchMixFeed.getDocId());
        }
        c2344009Gk.LJ(providerDocIdStr, "search_result_id");
        if (c646370PWx != null) {
            rank = c646370PWx.LLILZLL;
        } else {
            rank = searchMixFeed.getRank();
        }
        c2344009Gk.LIZJ(rank, "rank");
        if (c646370PWx == null || (num = c646370PWx.LLJILJIL) == null) {
            num = searchMixFeed.universalRank;
        }
        c2344009Gk.LJ(num, "universal_rank");
        c2344009Gk.LJIIIIZZ("delete_card_type", c0pl1.getValue());
        C20684815ws.LJIILLIIL("search_result_delete", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(SearchMixFeed searchMixFeed, int i, C0PL2 c0pl2) {
        if (c0pl2 != C0PL2.OUT_SOURCE_REPLACE) {
            C643200PKs.LJFF(searchMixFeed, Integer.valueOf(i));
        }
        searchMixFeed.insertType = c0pl2;
    }

    public static boolean LIZJ(int i, int i2, SearchMixFeed searchMixFeed) {
        boolean z;
        if (!((Boolean) C272450Am3.LIZ.getValue()).booleanValue() && !C642140PGq.LIZ(searchMixFeed.getEntityCard())) {
            if (searchMixFeed.getFeedType() == 200) {
                return true;
            }
            return false;
        }
        if (searchMixFeed.getFeedType() == 200) {
            if (searchMixFeed.getFeedType() == 200 && C642140PGq.LIZIZ(searchMixFeed.getEntityCard()) && (i2 > 0 || i > 0 || C642140PGq.LIZ(searchMixFeed.getEntityCard()))) {
                z = true;
            } else {
                z = false;
            }
            searchMixFeed.setIsWeakEntity(z);
            if (!z) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r11, int r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PFX.LIZLLL(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList, int, boolean):int");
    }
}
