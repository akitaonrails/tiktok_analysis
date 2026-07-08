package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0qAS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539620qAS {
    public static final C1539620qAS LIZ = new C1539620qAS();

    public static C1539910qAv LIZ(C1537480q70 c1537480q70, HybridSchemaParam hybridSchemaParam) {
        int iIntValue;
        String ssrCacheKey;
        String ssrUrl;
        Integer ssrMode;
        if (hybridSchemaParam != null && (ssrMode = hybridSchemaParam.getSsrMode()) != null) {
            iIntValue = ssrMode.intValue();
        } else {
            iIntValue = 1;
        }
        if (hybridSchemaParam != null) {
            ssrCacheKey = hybridSchemaParam.getSsrCacheKey();
            ssrUrl = hybridSchemaParam.getSsrUrl();
        } else {
            ssrCacheKey = null;
            ssrUrl = null;
        }
        if (ssrUrl == null || ssrUrl.length() == 0) {
            InterfaceC1539510qAH.LIZ.getClass();
            InterfaceC1539510qAH interfaceC1539510qAH = C1535760q4E.LIZIZ;
            if (interfaceC1539510qAH != null && !interfaceC1539510qAH.LIZ()) {
                return null;
            }
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        String strLIZLLL = C1533710q0v.LIZLLL(null, new RequestParams(null, 1, null), c1537480q70.LJIJI());
        if (iIntValue == 2) {
            return null;
        }
        if (iIntValue == 0) {
            return new C1539910qAv(EnumC1539700qAa.SSR_MODE_NOT_SUPPORT, null);
        }
        if (iIntValue >= 8) {
            return new C1539910qAv(EnumC1539700qAa.UNKNOWN_SSR_MODE, null);
        }
        if ((iIntValue & 1) == 1 && LIZJ(c1537480q70, strLIZLLL)) {
            return new C1539910qAv(EnumC1539700qAa.SSR_MODE_GECKO_EXIST, null);
        }
        if ((iIntValue & 4) != 4 || LIZIZ(ssrUrl, ssrCacheKey)) {
            return null;
        }
        return new C1539910qAv(EnumC1539700qAa.SSR_MODE_CACHE_NOT_EXIST, null);
    }

    public static boolean LIZIZ(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null) {
            return false;
        }
        SSRCacheManager.LIZ.getClass();
        String strLIZ = SSRCacheManager.LIZ(str, str2);
        if (SSRCacheManager.LIZLLL.containsKey(strLIZ) || SSRCacheManager.LIZJ.containsKey(strLIZ)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C1537480q70 c1537480q70, String str) {
        C1533910q1F c1533910q1FCreateSyncRequest;
        C1533790q13 c1533790q13LIZIZ;
        if (str == null || str.length() == 0) {
            return false;
        }
        C1533720q0w.LIZ.getClass();
        C1533510q0b c1533510q0bLIZLLL = C1533720q0w.LIZLLL(str, c1537480q70, true);
        if (c1533510q0bLIZLLL == null) {
            return false;
        }
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.onlyLocal = true;
        requestParams.channel = c1533510q0bLIZLLL.LIZIZ;
        requestParams.bundle = c1533510q0bLIZLLL.LIZJ;
        requestParams.accessKey = c1533510q0bLIZLLL.LIZ;
        requestParams.loadToMemory = false;
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1537480q70, false);
        if (iResourceServiceXLIZIZ == null || (c1533910q1FCreateSyncRequest = iResourceServiceXLIZIZ.createSyncRequest("", requestParams)) == null || (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) == null) {
            return false;
        }
        return c1533790q13LIZIZ.LIZIZ;
    }
}
