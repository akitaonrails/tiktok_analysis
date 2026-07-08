package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PXD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PXD implements InterfaceC651090PgJ {
    public final RelatedWord LIZ;
    public final String LIZIZ;
    public final ISearchContextAbility LIZJ = C0Q3E.LJI();

    @Override // X.InterfaceC651090PgJ
    public final void LIZIZ(C0Q2Q<?> c0q2q) {
    }

    @Override // X.InterfaceC651090PgJ
    public final void LIZ(C0PXF c0pxf) {
        c0pxf.LIZ = "related_search_keyword";
        c0pxf.LIZIZ = "general_search";
        c0pxf.LIZJ = "related_search_keyword";
    }

    @Override // X.InterfaceC651090PgJ
    public final void LIZJ(Bundle bundle) {
        Word word;
        String id;
        JSONObject jSONObject = new JSONObject();
        Word word2 = this.LIZ.wordRecord;
        String id2 = null;
        if (word2 != null) {
            id2 = word2.getId();
        }
        String strJ3 = C786410Ut5.J3(jSONObject.put("trending_words_group_id", id2));
        String str = ((C663990Q2r) this.LIZJ.Ww1().LIZJ()).LLILLJJLI;
        C786410Ut5.LJJJI("keyword", this.LIZ.text, bundle);
        ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class);
        String str2 = "";
        if ((iCommonFeedApiService == null || (id = iCommonFeedApiService.LJIJ()) == null) && ((word = this.LIZ.wordRecord) == null || (id = word.getId()) == null)) {
            id = "";
        }
        C786410Ut5.LJJJI("group_id", id, bundle);
        C786410Ut5.LJJJI("search_type", ((C0PRC) this.LIZJ.Ph1().LIZJ()).LLILLJJLI, bundle);
        C786410Ut5.LJJJI("previous_page", ((C663990Q2r) this.LIZJ.Ww1().LIZJ()).LL, bundle);
        C786410Ut5.LJJIZ(bundle, "search_session_id", Long.valueOf(((C0PM7) this.LIZJ.ak0().LIZJ()).LL));
        C786410Ut5.LJJJI("extraLogParams", strJ3, bundle);
        C786410Ut5.LJJJI("back_flag", "1", bundle);
        C786410Ut5.LJJJI("is_from_video", "1", bundle);
        if (C123100dR.LIZ(str)) {
            C786410Ut5.LJJJI("enter_from_sub", str, bundle);
        }
        if (C123100dR.LIZ(this.LIZIZ)) {
            C786410Ut5.LJJJI("related_search_card_model", this.LIZIZ, bundle);
        }
        String str3 = this.LIZ.penetrateInfo;
        if (str3 != null) {
            str2 = str3;
        }
        C786410Ut5.LJJJI("penetrate_info", str2, bundle);
    }

    public C0PXD(RelatedWord relatedWord, String str) {
        this.LIZ = relatedWord;
        this.LIZIZ = str;
    }
}
