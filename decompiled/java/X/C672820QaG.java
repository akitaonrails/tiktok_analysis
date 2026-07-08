package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.EcSearchHistoryWordsResponse;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.ECSearchSuggestAssem;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ui.EcSearchSuggestAssemNew;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672820QaG {
    public static final C672820QaG LIZ = new C672820QaG();
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(Integer.valueOf(C0QXR.LIVE_PRODUCT_LIST_MAGNIFIER.getValue()), Integer.valueOf(C0QXR.LIVE_PRODUCT_LIST_GUESS_WORDS.getValue()));
    public static String LIZJ = "";

    public static C19719912Dl LIZ() {
        return C13LE.LIZ(((Number) C00ZZ.LIZ.getValue()).intValue() == 1 ? EcSearchSuggestAssemNew.class : ECSearchSuggestAssem.class);
    }

    public static boolean LIZJ(ECSearchEntranceData eCSearchEntranceData) {
        if (eCSearchEntranceData != null) {
            return LIZIZ.contains(Integer.valueOf(C650500PfM.LIZ(eCSearchEntranceData)));
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LIZLLL(String str) {
        switch (str.hashCode()) {
            case -1816950631:
                if (!str.equals("recom_search")) {
                    return false;
                }
                return true;
            case 122189028:
                if (!str.equals("recom_search_pic")) {
                    return false;
                }
                return true;
            case 1081985277:
                if (!str.equals("search_history")) {
                    return false;
                }
                return true;
            case 1661687189:
                if (!str.equals("trending_topic")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static Map LJ(SparkContext sparkContext) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = sparkContext.templateResData;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("res_from");
            if (C123100dR.LIZ(strOptString) && strOptString != null) {
                linkedHashMap.put("resource_type", strOptString);
            }
            String strOptString2 = jSONObject.optString("res_version");
            if (C123100dR.LIZ(strOptString2) && strOptString2 != null) {
                linkedHashMap.put("gecko_version", strOptString2);
            }
        }
        return linkedHashMap;
    }

    public static int LJFF(SuggestWordResponse suggestWordResponse) {
        List<TypeWords> list;
        TypeWords typeWords;
        List<Word> list2;
        if (suggestWordResponse != null && (list = suggestWordResponse.data) != null && (typeWords = (TypeWords) C13LP.LJJJLL(list)) != null && (list2 = typeWords.words) != null) {
            return list2.size();
        }
        return 0;
    }

    public static EcSearchHistoryWordsResponse LJI(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (EcSearchHistoryWordsResponse) C1227904rF.LIZIZ(str, EcSearchHistoryWordsResponse.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (EcSearchHistoryWordsResponse) obj;
    }

    public static SuggestWordResponse LJII(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (SuggestWordResponse) C1227904rF.LIZIZ(str, SuggestWordResponse.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (SuggestWordResponse) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(X.C0QWA r4, X.C0QWJ r5, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r6) {
        /*
            int[] r0 = X.C0QYF.LIZ
            r2 = 0
            if (r5 == 0) goto L22
            X.0QER r0 = r5.LIZ
        L7:
            boolean r0 = X.C0QYF.LIZIZ(r0)
            if (r0 == 0) goto L24
            if (r6 == 0) goto L20
            int r0 = r6.q4()
            java.lang.String r0 = r6.bN0(r0)
        L17:
            if (r5 == 0) goto L1b
            X.0QER r2 = r5.LIZ
        L1b:
            java.lang.String r0 = X.C0QR7.LIZLLL(r2, r0)
            return r0
        L20:
            r0 = r2
            goto L17
        L22:
            r0 = r2
            goto L7
        L24:
            if (r5 == 0) goto L3f
            X.0QER r3 = r5.LIZ
            if (r3 == 0) goto L40
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r1 = r3.getEcSearchEntranceData()
            if (r1 == 0) goto L42
            java.lang.String r0 = "middle_search_position"
            java.lang.String r1 = r1.getStringOrNullStrategy(r0)
            if (r1 == 0) goto L42
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L42
            return r1
        L3f:
            r3 = r2
        L40:
            r1 = r2
            goto L46
        L42:
            java.lang.String r1 = r3.getLastSearchPosition()
        L46:
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L4f
            if (r1 == 0) goto L4f
            return r1
        L4f:
            int r1 = X.C650500PfM.LIZIZ(r3)
            X.0QXR r0 = X.C0QXR.PDP
            int r0 = r0.getValue()
            if (r1 != r0) goto L5e
            java.lang.String r0 = "product_detail"
            return r0
        L5e:
            if (r6 == 0) goto L7d
            java.lang.String r1 = r6.Nb2()
        L64:
            X.0QWA r0 = X.C0QWA.RETURN
            if (r4 != r0) goto L70
            int r0 = X.C650500PfM.LIZIZ(r3)
            java.lang.String r1 = X.C0QR7.LJFF(r0, r1)
        L70:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7f
            if (r3 == 0) goto L7c
            java.lang.String r2 = r3.getEnterSearchFrom()
        L7c:
            return r2
        L7d:
            r1 = r2
            goto L64
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672820QaG.LIZIZ(X.0QWA, X.0QWJ, com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew):java.lang.String");
    }
}
