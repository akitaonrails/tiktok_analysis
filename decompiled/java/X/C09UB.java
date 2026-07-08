package X;

import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.09UB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UB {
    public static boolean LIZ(Request request, EnumC1846380y9E enumC1846380y9E, String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C09UD.LIZLLL;
        if (!concurrentHashMap.containsKey(request.getPath())) {
            concurrentHashMap.put(request.getPath(), new C09UC(enumC1846380y9E.key, str));
            return true;
        }
        return false;
    }
}
