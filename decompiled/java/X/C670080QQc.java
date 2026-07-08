package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670080QQc {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C670090QQd c670090QQd, Map map) {
        Object objObtainLogData;
        String str;
        Object objObtainLogData2;
        int value;
        String str2;
        Object objObtainEcLogData;
        String enterSearchFrom;
        C0QER enterParam = c670090QQd.getEnterParam();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (enterParam != null) {
            String srcMaterialId = enterParam.getSrcMaterialId();
            if (srcMaterialId != null) {
                c2344009Gk.LJFF("enter_product_id", srcMaterialId);
            }
            String groupId = enterParam.getGroupId();
            if (groupId != null) {
                c2344009Gk.LJFF("enter_group_id", groupId);
            }
            c2344009Gk.LJFF("root_enter_from_type", String.valueOf(enterParam.getEcSearchEntranceValue()));
        }
        String enterSearchFrom2 = null;
        if (enterParam != null && (((objObtainEcLogData = enterParam.obtainEcLogData("search_entrance")) != null && (enterSearchFrom = objObtainEcLogData.toString()) != null) || (enterSearchFrom = enterParam.getEnterSearchFrom()) != null)) {
            c2344009Gk.LJFF("search_entrance", enterSearchFrom);
        }
        String wordState = c670090QQd.getWordState();
        if (wordState != null && C123100dR.LIZ(wordState)) {
            c2344009Gk.LJFF("word_state", wordState);
        }
        String iconType = c670090QQd.getIconType();
        if (iconType != null && C123100dR.LIZ(iconType)) {
            c2344009Gk.LJFF("icon_type", iconType);
        }
        String iconContent = c670090QQd.getIconContent();
        if (iconContent != null && C123100dR.LIZ(iconContent)) {
            c2344009Gk.LJFF("icon_content", iconContent);
        }
        if (map != null) {
            c2344009Gk.LJII(map);
        }
        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk.LIZJ(1, "is_ecom_search");
        c2344009Gk.LJIIIIZZ("words_source", "search_bar_outer");
        c2344009Gk.LIZJ(0, "words_position");
        String hintWord = c670090QQd.getHintWord();
        String str3 = "";
        if (hintWord == null) {
            hintWord = "";
        }
        c2344009Gk.LJIIIIZZ("words_content", hintWord);
        if (enterParam != null) {
            objObtainLogData = enterParam.obtainLogData("hint_group_id");
        } else {
            objObtainLogData = null;
        }
        if (!(objObtainLogData instanceof String) || (str = (String) objObtainLogData) == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        if (enterParam != null) {
            objObtainLogData2 = enterParam.obtainLogData("hint_imp_id");
        } else {
            objObtainLogData2 = null;
        }
        if ((objObtainLogData2 instanceof String) && (str2 = (String) objObtainLogData2) != null) {
            str3 = str2;
        }
        c2344009Gk.LJIIIIZZ("impr_id", str3);
        if (c670090QQd.isReentrantSearch()) {
            if (enterParam != null) {
                value = enterParam.getEcSearchEntranceValue();
                enterSearchFrom2 = enterParam.getEnterSearchFrom();
            } else {
                value = C0QXR.DEFAULT.getValue();
            }
            enterSearchFrom2 = C0QR7.LJFF(value, enterSearchFrom2);
        } else if (enterParam != null) {
            enterSearchFrom2 = enterParam.getEnterSearchFrom();
        }
        c2344009Gk.LJIIIIZZ("search_position", enterSearchFrom2);
        C1018703yb.LIZIZ("trending_words_icon_show", c2344009Gk.LIZ);
    }

    @InterfaceC1294060jmO
    public static void LIZIZ(C0QER c0qer, Word word, boolean z) {
        Object c098200Yq;
        String word2;
        String groupId;
        String implId;
        int value;
        Object objObtainEcLogData;
        String enterSearchFrom;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c0qer != null) {
            String srcMaterialId = c0qer.getSrcMaterialId();
            if (srcMaterialId != null) {
                c2344009Gk.LJFF("enter_product_id", srcMaterialId);
            }
            String groupId2 = c0qer.getGroupId();
            if (groupId2 != null) {
                c2344009Gk.LJFF("enter_group_id", groupId2);
            }
            c2344009Gk.LJFF("root_enter_from_type", String.valueOf(c0qer.getEcSearchEntranceValue()));
        }
        String enterSearchFrom2 = null;
        if (c0qer != null && (((objObtainEcLogData = c0qer.obtainEcLogData("search_entrance")) != null && (enterSearchFrom = objObtainEcLogData.toString()) != null) || (enterSearchFrom = c0qer.getEnterSearchFrom()) != null)) {
            c2344009Gk.LJFF("search_entrance", enterSearchFrom);
        }
        String strLIZIZ = C848530XQl.LIZIZ(C848530XQl.LIZ, null, "{}");
        if (strLIZIZ != null) {
            try {
                c098200Yq = new JSONObject(strLIZIZ).optString("traffic_diversion_info");
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str = (String) c098200Yq;
            if (str != null) {
                c2344009Gk.LJFF("traffic_diversion_info", str);
            }
        }
        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk.LIZJ(1, "is_ecom_search");
        c2344009Gk.LJIIIIZZ("words_source", "search_bar_outer");
        c2344009Gk.LIZJ(0, "words_position");
        if (word != null) {
            word2 = word.getWord();
        } else {
            word2 = null;
        }
        c2344009Gk.LJIIIIZZ("words_content", word2);
        if (c0qer != null) {
            groupId = c0qer.getGroupId();
        } else {
            groupId = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        if (word != null) {
            implId = word.getImplId();
        } else {
            implId = null;
        }
        c2344009Gk.LJIIIIZZ("impr_id", implId);
        if (z) {
            if (c0qer != null) {
                value = c0qer.getEcSearchEntranceValue();
                enterSearchFrom2 = c0qer.getEnterSearchFrom();
            } else {
                value = C0QXR.DEFAULT.getValue();
            }
            enterSearchFrom2 = C0QR7.LJFF(value, enterSearchFrom2);
        } else if (c0qer != null) {
            enterSearchFrom2 = c0qer.getEnterSearchFrom();
        }
        c2344009Gk.LJIIIIZZ("search_position", enterSearchFrom2);
        C1018703yb.LIZIZ("trending_words_show", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(boolean r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, X.C0QWU r15, com.ss.android.ugc.aweme.search.model.SearchResultParam r16, X.C0QER r17, java.util.Map r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C670080QQc.LIZJ(boolean, java.lang.String, java.lang.String, java.lang.String, X.0QWU, com.ss.android.ugc.aweme.search.model.SearchResultParam, X.0QER, java.util.Map, java.lang.String, java.lang.String):void");
    }
}
