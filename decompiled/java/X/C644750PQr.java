package X;

import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;

/* JADX INFO: renamed from: X.0PQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644750PQr {
    public static final C644750PQr LIZ = new C644750PQr();

    public static void LIZ(Challenge challenge, C653660PkS c653660PkS, String str) {
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_id", ((C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ()).LLILLL);
        c2344009Gk.LJIIIIZZ("enter_from", "search_result");
        String cid = challenge.getCid();
        if (cid == null) {
            cid = "";
        }
        c2344009Gk.LJIIIIZZ("search_result_id", cid);
        c2344009Gk.LJIIIIZZ("search_keyword", ((C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ()).LLIZLLLIL);
        c2344009Gk.LJIIIIZZ("token_type", "tag");
        c2344009Gk.LIZJ(c653660PkS.LJIILL, "rank");
        c2344009Gk.LJIIIIZZ("button_type", str);
        Long lValueOf = Long.valueOf(challenge.getUseCount());
        if (lValueOf.longValue() >= 0) {
            c2344009Gk.LIZLLL(lValueOf.longValue(), "global_post");
        }
        C20684815ws.LJIILLIIL("search_result_click", c2344009Gk.LIZ);
    }
}
