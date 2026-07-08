package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.018A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018A {
    public static final C018A LIZ = new C018A();

    public static Map LIZ(String str) {
        Object obj;
        Uri uri;
        Set<String> queryParameterNames;
        try {
            uri = UriProtector.parse(str);
            queryParameterNames = UriProtector.getQueryParameterNames(uri);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (queryParameterNames.isEmpty()) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(queryParameterNames.size());
        for (String str2 : queryParameterNames) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                linkedHashMap.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        C189200o6.m2constructorimpl(linkedHashMap);
        obj = linkedHashMap;
        Map mapLJ = C2097608Jq.LJ();
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        Object obj2 = obj;
        if (zM7isFailureimpl) {
            obj2 = mapLJ;
        }
        return (Map) obj2;
    }
}
