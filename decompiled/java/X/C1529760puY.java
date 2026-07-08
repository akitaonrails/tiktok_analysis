package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityLynxService;
import com.tiktok.forestx.RequestParamsX;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0puY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529760puY {
    public static Map LIZ() {
        return C1537710q7N.LLJJL.getValue();
    }

    public static String LIZJ(String str) {
        String str2;
        SparkSecurityLynxService sparkSecurityLynxService = (SparkSecurityLynxService) SparkSecurityServiceCenter.INSTANCE.protocol();
        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointLynx, C1E6B.SparkSecuritySolutionChannelHybridLoad);
        c828420Wee.LJFF.put("URL", str);
        C821850WLv c821850WLvHandleWillLoadLynxTemplateWithEvent = sparkSecurityLynxService.handleWillLoadLynxTemplateWithEvent(c828420Wee);
        if (c821850WLvHandleWillLoadLynxTemplateWithEvent == null) {
            return str;
        }
        Map<?, ?> map = c821850WLvHandleWillLoadLynxTemplateWithEvent.LIZIZ;
        Object obj = null;
        if (map != null) {
            obj = map.get("URL");
        }
        if (!(obj instanceof String) || (str2 = (String) obj) == null) {
            return "";
        }
        return str2;
    }

    public static void LIZIZ(RequestParams requestParams, RequestParamsX requestParamsX) {
        List<String> list;
        Boolean boolValueOf;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        C1529750puX c1529750puX = C1535630q41.LIZIZ;
        Boolean boolValueOf2 = null;
        if (c1529750puX != null) {
            list = c1529750puX.LIZJ;
            boolValueOf = Boolean.valueOf(c1529750puX.LIZIZ);
        } else {
            list = null;
            boolValueOf = null;
        }
        C1529750puX c1529750puX2 = C1535630q41.LIZIZ;
        if (c1529750puX2 != null) {
            boolValueOf2 = Boolean.valueOf(c1529750puX2.LIZ);
        }
        if (requestParams != null && LIZLLL(requestParams.bundle, list)) {
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.LJFF(boolValueOf, bool)) {
                Pair[] pairArr = new Pair[3];
                String str = requestParams.channel;
                if (str == null) {
                    str = "";
                }
                pairArr[0] = new Pair("channel", str);
                String str2 = requestParams.bundle;
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[1] = new Pair("bundle", str2);
                if (list == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63)) == null) {
                    strLJJLIIIJ2 = "";
                }
                pairArr[2] = new Pair("illegalBundleWords", strLJJLIIIJ2);
                C1520080pew.LIZLLL("spark_lynx_illegal_bundle", C2097608Jq.LJIIJ(pairArr));
            }
            if (Intrinsics.LJFF(boolValueOf2, bool)) {
                requestParams.bundle = "";
            }
        }
        if (requestParamsX != null && LIZLLL(requestParamsX.bundle, list)) {
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(boolValueOf, bool2)) {
                Pair[] pairArr2 = new Pair[3];
                String str3 = requestParamsX.channel;
                if (str3 == null) {
                    str3 = "";
                }
                pairArr2[0] = new Pair("channel", str3);
                String str4 = requestParamsX.bundle;
                if (str4 == null) {
                    str4 = "";
                }
                pairArr2[1] = new Pair("bundle", str4);
                if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63)) == null) {
                    strLJJLIIIJ = "";
                }
                pairArr2[2] = new Pair("illegalBundleWords", strLJJLIIIJ);
                C1520080pew.LIZLLL("spark_lynx_illegal_bundle", C2097608Jq.LJIIJ(pairArr2));
            }
            if (Intrinsics.LJFF(boolValueOf2, bool2)) {
                requestParamsX.bundle = "";
            }
        }
    }

    public static boolean LIZLLL(String str, List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (str != null && a0.LJJIIZI(str, str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
