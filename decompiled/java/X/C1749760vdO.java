package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749760vdO {
    public static final Map<String, Long> LIZ = new HashMap();

    public static long LIZ(String str) {
        Long l = (Long) ((HashMap) LIZ).remove(str);
        if (l == null) {
            l = 0L;
        }
        return SystemClock.elapsedRealtime() - l.longValue();
    }

    public static void LIZLLL(String str) {
        ((HashMap) LIZ).put(str, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LIZIZ(String str, String str2, String str3, long j, String str4, boolean z) {
        C04CK c04ck = new C04CK() { // from class: X.0vdM
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu(Scene.SCENE_SERVICE, new C1747940vaS[0]), new C1748840vbu("path", new C1747940vaS[0]), new C1748840vbu("type", new C1747940vaS[0]), new C1748840vbu("success", new C1747940vaS[0]), new C1748840vbu("cost_time", new C1747940vaS[0]), new C1748840vbu("reason", new C1747940vaS[0]));
            }
        };
        c04ck.LJIIIIZZ(new C1549230qPx(str3, str4, str, j, str2, z));
        c04ck.LIZJ(false);
    }
}
