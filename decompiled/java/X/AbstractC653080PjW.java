package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpotInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0PjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC653080PjW {
    public SearchSpotInfo LIZ;
    public SearchSpot LIZIZ;
    public C653660PkS LIZJ;

    public final void LIZ(String str, SearchSpot searchSpot) {
        String sentence;
        String docId;
        int size;
        String docId2;
        C653660PkS c653660PkS = this.LIZJ;
        if (c653660PkS == null) {
            return;
        }
        String str2 = "";
        if (TextUtils.equals(str, "search_result_show")) {
            C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ(c653660PkS);
            c654760PmELIZIZ.LJIIZILJ("token_type", searchSpot.getAlaSrc());
            SearchSpot searchSpot2 = this.LIZIZ;
            if (searchSpot2 != null && (docId2 = searchSpot2.getDocId()) != null) {
                str2 = docId2;
            }
            c654760PmELIZIZ.LJIJI("search_result_id", str2);
            List<Aweme> awemeCards = searchSpot.getAwemeCards();
            if (awemeCards != null) {
                size = awemeCards.size();
            } else {
                size = 0;
            }
            c654760PmELIZIZ.LJIIZILJ("item_num", String.valueOf(size));
            c654760PmELIZIZ.LJIILJJIL();
            return;
        }
        if (!TextUtils.equals(str, "search_result_click")) {
            return;
        }
        C654740PmC c654740PmCLIZ = C645940PVg.LIZ(c653660PkS);
        c654740PmCLIZ.LJIIZILJ("token_type", searchSpot.getAlaSrc());
        c654740PmCLIZ.LJIIZILJ("aladdin_button_type", "click_more_button");
        SearchSpotInfo searchSpotInfo = this.LIZ;
        if (searchSpotInfo == null || (sentence = searchSpotInfo.getSentence()) == null) {
            sentence = "";
        }
        c654740PmCLIZ.LJ("aladdin_words", sentence);
        SearchSpot searchSpot3 = this.LIZIZ;
        if (searchSpot3 != null && (docId = searchSpot3.getDocId()) != null) {
            str2 = docId;
        }
        c654740PmCLIZ.LJIJI("search_result_id", str2);
        c654740PmCLIZ.LJIILJJIL();
    }
}
