package X;

import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PX9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PX9 {
    public static void LIZ(String str, String str2, String str3, boolean z) {
        String str4;
        C0PRC c0prc = (C0PRC) C0Q3E.LJI().Ph1().LIZJ();
        C642120PGo c642120PGo = new C642120PGo();
        c642120PGo.LJIIZILJ("search_id", c0prc.LLILLL);
        c642120PGo.LJIJJ(str);
        c642120PGo.LJIJI("search_result_id", str2);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c642120PGo.LJIIZILJ("is_inner", str4);
        c642120PGo.LJIIZILJ("inner_search_id", str3);
        c642120PGo.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
        c642120PGo.LJIIZILJ("token_type", "related_search_card");
        c642120PGo.LJJIII(0);
        c642120PGo.LJIILJJIL();
    }

    public static void LIZIZ(RelatedWord relatedWord, String str, Integer num, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        String str8;
        String wordSource;
        String str9;
        Integer numValueOf;
        String id;
        int iIntValue;
        String qrecJsonInfo;
        ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
        C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
        String str10 = "1";
        if (C123100dR.LIZ(str6)) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        String string = C308620C7w.LIZ().toString();
        C0PVM c0pvm = new C0PVM();
        if (str == null) {
            str = "";
        }
        c0pvm.LJIIZILJ("impr_id", str);
        c0pvm.LJIIZILJ("search_id", c0prc.LLILLL);
        Word word = relatedWord.wordRecord;
        if (word == null || (wordSource = word.getWordSource()) == null) {
            wordSource = "related_search";
        }
        c0pvm.LJIIZILJ("words_source", wordSource);
        c0pvm.LJIIZILJ("words_content", relatedWord.text);
        c0pvm.LJIIZILJ("search_position", "general_search");
        c0pvm.LJIIZILJ("raw_query", c0prc.LLIZLLLIL);
        String strLJIJ = null;
        if (Intrinsics.LJFF(relatedWord.wordType, "2")) {
            str9 = "hot";
        } else {
            str9 = null;
        }
        c0pvm.LJIIZILJ("words_type", str9);
        Word word2 = relatedWord.wordRecord;
        if (word2 != null) {
            numValueOf = Integer.valueOf(word2.getWordPosition());
        } else {
            numValueOf = null;
        }
        c0pvm.LJJJJL(numValueOf);
        Word word3 = relatedWord.wordRecord;
        if (word3 != null) {
            id = word3.getId();
        } else {
            id = null;
        }
        c0pvm.LJIIZILJ("group_id", id);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c0pvm.LJJIL(Integer.valueOf(iIntValue));
        c0pvm.LJIIZILJ("click_rank", str2);
        c0pvm.LJIIZILJ("inner_enter_doc_rank", str3);
        c0pvm.LJIIZILJ("inner_rs_doc_rank", str4);
        c0pvm.LJIIZILJ("inner_response_rank", str5);
        c0pvm.LJIIZILJ("image_url", str6);
        if (!z) {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        c0pvm.LJIIZILJ("is_inner", str10);
        c0pvm.LJIIZILJ("is_image", str8);
        c0pvm.LJIIZILJ("is_play_music", string);
        c0pvm.LJIIZILJ("click_type", str7);
        Word word4 = relatedWord.wordRecord;
        if (word4 != null) {
            qrecJsonInfo = word4.getQrecJsonInfo();
        } else {
            qrecJsonInfo = null;
        }
        c0pvm.LJIJI("qrec_json_info", qrecJsonInfo);
        if (Intrinsics.LJFF(C1841007Iy.LIZ.getValue(), 1)) {
            c0pvm.LJFF("last_feed_group_id", ((C0PM7) iSearchContextAbilityLJI.uF().LIZJ()).LLILZ, InterfaceC1210900hcG.LIZ);
            ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) PluggableExtentionKt.pluggableSpi$default(ICommonFeedApiService.class, false, false, false, 14, null);
            if (iCommonFeedApiService != null) {
                strLJIJ = iCommonFeedApiService.LJIJ();
            }
            c0pvm.LJ("last_from_group_id", strLJIJ);
        }
        c0pvm.LJIILJJIL();
    }
}
