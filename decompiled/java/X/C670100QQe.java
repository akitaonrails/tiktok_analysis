package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670100QQe {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(SearchSugEntity searchSugEntity) {
        SugExtraInfo sugExtraInfo;
        if (searchSugEntity != null && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null) {
            if (C142300gX.LIZ()) {
                if (sugExtraInfo.isBrandShop()) {
                    if (sugExtraInfo.isCreatorLive()) {
                        return "brand_living";
                    }
                    return "brand_regular";
                }
                if (!C0QNG.LJ(searchSugEntity)) {
                    return "regular";
                }
                String sugShopId = sugExtraInfo.getSugShopId();
                if (sugShopId != null && C123100dR.LIZ(sugShopId)) {
                    if (sugExtraInfo.isCreatorLive()) {
                        return "shop_living";
                    }
                    return "shop_regular";
                }
                if (sugExtraInfo.isCreatorLive()) {
                    return "author_living";
                }
                return "author_regular";
            }
            if (!C0QNG.LJ(searchSugEntity)) {
                return "regular";
            }
            if (sugExtraInfo.isBrandShop()) {
                if (sugExtraInfo.isCreatorLive()) {
                    return "brand_living";
                }
                return "brand_regular";
            }
            String sugShopId2 = sugExtraInfo.getSugShopId();
            if (sugShopId2 != null && C123100dR.LIZ(sugShopId2)) {
                if (sugExtraInfo.isCreatorLive()) {
                    return "shop_living";
                }
                return "shop_regular";
            }
            if (sugExtraInfo.isCreatorLive()) {
                return "author_living";
            }
            return "author_regular";
        }
        return "";
    }

    public static final void LIZJ(int i, SearchSugEntity searchSugEntity, String str, int i2) {
        String id;
        if (searchSugEntity == null) {
            return;
        }
        C670150QQj<C670140QQi> c670150QQj = new C670150QQj<C670140QQi>() { // from class: X.0QQi
        };
        if (!C123100dR.LIZ(str)) {
            str = "";
        }
        c670150QQj.LJIILLIIL("enter_from", str);
        c670150QQj.LJIILLIIL("tab_name", C669740QOu.LIZLLL(i2));
        Word word = searchSugEntity.mWord;
        String word2 = null;
        if (word != null) {
            id = word.getId();
        } else {
            id = null;
        }
        c670150QQj.LJIILLIIL("group_id", id);
        Word word3 = searchSugEntity.mWord;
        if (word3 != null) {
            word2 = word3.getWord();
        }
        c670150QQj.LJIILLIIL("words_content", word2);
        c670150QQj.LJIILLIIL("words_source", "sug");
        c670150QQj.LJIJ(Integer.valueOf(i));
        c670150QQj.LJIILLIIL("words_content", searchSugEntity.content);
        c670150QQj.LJIILLIIL("sug_type", "enrich_sug");
        c670150QQj.LIZIZ(searchSugEntity.LJ);
        c670150QQj.LJIILJJIL();
    }

    public static void LIZIZ(String str, SearchSugEntity searchSugEntity, String str2, Integer num, String str3, String str4) {
        String str5;
        String str6;
        if (Intrinsics.LJFF(str4, "click")) {
            String strLIZIZ = C584850Mwl.LIZ.LIZIZ(str2);
            if (C0QNG.LJ(searchSugEntity)) {
                str5 = "enrich_sug";
            } else {
                str5 = "normal_sug";
            }
            C665950QAf<C670110QQf> c665950QAf = new C665950QAf<C670110QQf>() { // from class: X.0QQf
            };
            c665950QAf.LJIILLIIL("action_type", "click");
            c665950QAf.LJIILLIIL("order", String.valueOf(num));
            c665950QAf.LJIILLIIL("sug_keyword", str);
            c665950QAf.LJIILLIIL("log_pb", strLIZIZ);
            c665950QAf.LJIILLIIL("search_type", str3);
            if (searchSugEntity != null) {
                str6 = searchSugEntity.content;
            } else {
                str6 = null;
            }
            c665950QAf.LJIILLIIL("search_keyword", str6);
            c665950QAf.LJIILLIIL("sug_type", str5);
            c665950QAf.LJIILJJIL();
            return;
        }
        if (!Intrinsics.LJFF(str4, "show")) {
            return;
        }
        String strLIZIZ2 = C584850Mwl.LIZ.LIZIZ(str2);
        C665950QAf<C670110QQf> c665950QAf2 = new C665950QAf<C670110QQf>() { // from class: X.0QQf
        };
        c665950QAf2.LJIILLIIL("action_type", "show");
        c665950QAf2.LJIILLIIL("sug_keyword", str);
        c665950QAf2.LJIILLIIL("log_pb", strLIZIZ2);
        c665950QAf2.LJIILLIIL("search_type", str3);
        c665950QAf2.LJIILJJIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0335  */
    /* JADX WARN: Type inference failed for: r0v116, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(androidx.fragment.app.Fragment r10, java.lang.String r11, int r12, com.ss.android.ugc.aweme.search.model.SearchSugEntity r13, java.lang.String r14, java.lang.String r15, int r16, X.C0QER r17, java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C670100QQe.LIZLLL(androidx.fragment.app.Fragment, java.lang.String, int, com.ss.android.ugc.aweme.search.model.SearchSugEntity, java.lang.String, java.lang.String, int, X.0QER, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031c  */
    /* JADX WARN: Type inference failed for: r0v115, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(androidx.fragment.app.Fragment r7, java.lang.String r8, int r9, com.ss.android.ugc.aweme.search.model.SearchSugEntity r10, java.lang.String r11, java.lang.String r12, int r13, X.C0QER r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C670100QQe.LJ(androidx.fragment.app.Fragment, java.lang.String, int, com.ss.android.ugc.aweme.search.model.SearchSugEntity, java.lang.String, java.lang.String, int, X.0QER, java.lang.String):void");
    }
}
