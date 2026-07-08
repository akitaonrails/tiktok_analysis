package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;

/* JADX INFO: renamed from: X.0QTJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QTJ {
    public static final C0QTJ LIZ = new C0QTJ();

    public static void LIZ(SearchSugEntity searchSugEntity, int i, String str, String str2, String str3, String str4, String str5) {
        Word word = searchSugEntity.mWord;
        if (word == null) {
            return;
        }
        C670150QQj<C0QTI> c670150QQj = new C670150QQj<C0QTI>() { // from class: X.0QTI
        };
        c670150QQj.LJIILLIIL("raw_query", str4);
        c670150QQj.LJIILLIIL("words_content", word.getWord());
        c670150QQj.LJIJ(Integer.valueOf(i));
        c670150QQj.LJIILLIIL("impr_id", str5);
        c670150QQj.LJIILLIIL("group_id", word.getId());
        c670150QQj.LJIILLIIL("button_type", str);
        c670150QQj.LJIILLIIL("words_source", "sug");
        c670150QQj.LJIILLIIL("sug_type", str2);
        c670150QQj.LJFF("feedback_id", str3, InterfaceC1210900hcG.LIZ);
        c670150QQj.LJIILJJIL();
    }
}
