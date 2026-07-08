package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS152S1100000_3;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.07jC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1942407jC {
    public static int LIZ;
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, String>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Map<String, String>> LIZJ = new ConcurrentHashMap<>();

    public static void LIZJ(int i) {
        LIZ = i;
    }

    public static String LIZIZ(Uri uri, String str) {
        int i = LIZ;
        if (i == 0) {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        }
        if (i == 1) {
            return (String) LIZ((ConcurrentHashMap) LIZ(LIZIZ, uri.toString(), new AwS152S1100000_3(uri, str, 12)), str, new AwS152S1100000_3(uri, str, 11));
        }
        return (String) ((Map) LIZ(LIZJ, uri.toString(), new AwS547S0100000_3(uri, 148))).get(str);
    }

    public static Object LIZ(ConcurrentHashMap concurrentHashMap, Object obj, Function0 function0) {
        Object obj2 = concurrentHashMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = function0.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(obj, objInvoke);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        return objInvoke;
    }
}
