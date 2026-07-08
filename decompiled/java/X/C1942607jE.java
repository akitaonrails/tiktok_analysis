package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS88S1000000_3;

/* JADX INFO: renamed from: X.07jE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1942607jE {
    public static final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();

    public static String LIZ(String str) {
        try {
            ConcurrentHashMap<String, String> concurrentHashMap = LIZ;
            String str2 = concurrentHashMap.get(str);
            if (str2 != null) {
                return str2;
            }
            String path = UriProtector.parse(str).getPath();
            if (path != null) {
                concurrentHashMap.put(str, path);
                return path;
            }
            return "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1325860kbg.LIZIZ(th, new AwS88S1000000_3(str, 18), C2097608Jq.LJ());
            return "";
        }
    }
}
