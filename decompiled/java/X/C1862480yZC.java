package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yZC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862480yZC {
    public static final String LIZ(String str) {
        List list;
        Message message;
        if (str == null) {
            return null;
        }
        C324800CoI.LIZ.getClass();
        if ((C324800CoI.LIZ() && C1861390yXR.LIZLLL()) || (list = (List) C1856050yOp.LIZIZ(str, C1861940yYK.LIZIZ)) == null || (message = (Message) C13LP.LJJLIIIJL(list)) == null) {
            return null;
        }
        return message.uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.util.Map<java.lang.String, ? extends java.lang.Object> r16) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1862480yZC.LIZIZ(java.util.Map):java.lang.String");
    }

    public static final C443120HZe LIZJ(SearchLandingPageResponse searchLandingPageResponse, TakoEnterParams takoEnterParams, C1862660yZU c1862660yZU, String str) {
        String str2;
        String str3;
        Map<String, Object> map;
        Map<String, Object> mapLJ;
        Integer num;
        NimbleParams nimbleParams;
        Map<String, Object> map2;
        String json;
        String json2 = null;
        if (takoEnterParams.getNimbleParams() == null) {
            return null;
        }
        NimbleParams nimbleParams2 = takoEnterParams.getNimbleParams();
        if (nimbleParams2 != null) {
            str2 = nimbleParams2.nimbleKey;
        } else {
            str2 = null;
        }
        NimbleParams nimbleParams3 = takoEnterParams.getNimbleParams();
        if (nimbleParams3 != null) {
            str3 = nimbleParams3.nimbleGeckoKey;
        } else {
            str3 = null;
        }
        TakoNimbleConfig takoNimbleConfig = new TakoNimbleConfig(str2, str3);
        if (searchLandingPageResponse != null) {
            map = searchLandingPageResponse.data;
        } else {
            map = null;
        }
        NimbleParams nimbleParams4 = takoEnterParams.getNimbleParams();
        if (nimbleParams4 == null || (mapLJ = nimbleParams4.nimbleData) == null) {
            mapLJ = map;
        }
        NimbleParams nimbleParams5 = takoEnterParams.getNimbleParams();
        if (nimbleParams5 != null && (map2 = nimbleParams5.nimbleData) != null && (json = GsonProtectorUtils.toJson(C597040NbK.LIZ(), map2)) != null) {
            json2 = json;
        } else if (map != null) {
            json2 = GsonProtectorUtils.toJson(C597040NbK.LIZ(), map);
        }
        NimbleParams nimbleParams6 = takoEnterParams.getNimbleParams();
        if (nimbleParams6 != null && (num = nimbleParams6.nimbleOffsetIndex) != null) {
            num.intValue();
            if (!c1862660yZU.LIZIZ && (nimbleParams = takoEnterParams.getNimbleParams()) != null) {
                String strLIZ = LIZ(takoEnterParams.getCarriedRepeatKey());
                if (strLIZ != null) {
                    str = strLIZ;
                }
                nimbleParams.setNimbleOffsetMessageUUID(str);
            }
        }
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (json2 == null) {
            json2 = "";
        }
        return new C443120HZe(takoNimbleConfig, mapLJ, json2);
    }
}
