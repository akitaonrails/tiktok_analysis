package X;

import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21309618aM {
    public static volatile C21309618aM LIZJ;
    public Retrofit LIZ;
    public volatile Map<String, String> LIZIZ;

    public static synchronized C21309618aM LIZIZ() {
        if (LIZJ == null) {
            LIZJ = new C21309618aM();
        }
        return LIZJ;
    }

    public final Map<String, String> LIZ() {
        if (this.LIZIZ == null) {
            synchronized (C21309618aM.class) {
                try {
                    if (this.LIZIZ == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("sdk_version", "2.0.10-1");
                        linkedHashMap.put("device_type", C21309718aN.LJIIZILJ.LIZIZ);
                        linkedHashMap.put("device_platform", "android");
                        C21309718aN.LJIIZILJ.getClass();
                        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(0));
                        linkedHashMap.put("aid", String.valueOf(C21309718aN.LJIIZILJ.LIZJ));
                        linkedHashMap.put("app_name", C21309718aN.LJIIZILJ.LIZLLL);
                        linkedHashMap.put("app_version", C21309718aN.LJIIZILJ.LJ);
                        linkedHashMap.put("update_version_code", String.valueOf(C21309718aN.LJIIZILJ.LJFF));
                        linkedHashMap.put("device_id", C21309718aN.LJIIZILJ.LJI);
                        linkedHashMap.put("user_id", C21309718aN.LJIIZILJ.LJII);
                        linkedHashMap.put("net_status", C806910Vl3.LIZ());
                        this.LIZIZ = new LinkedHashMap(linkedHashMap);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }
}
