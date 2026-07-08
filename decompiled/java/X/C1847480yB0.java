package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.router.RouteManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847480yB0 {
    public final ConcurrentHashMap<String, String> LIZ;
    public volatile boolean LIZIZ;

    public C1847480yB0() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZ = concurrentHashMap;
        concurrentHashMap.put("com.ss.android.ugc.aweme.main.MainActivity", "//main");
    }

    public final String LIZ(Object obj) {
        RouteManager routeManager;
        Map<String, String> routeMap;
        if (obj == null || !((Boolean) C307210C2l.LIZ.getValue()).booleanValue()) {
            return null;
        }
        if (!(obj instanceof Activity) && !(obj instanceof Fragment) && !(obj instanceof android.app.Fragment)) {
            return null;
        }
        String strLIZ = C1504880pGQ.LIZ(obj, false);
        if (strLIZ.length() == 0) {
            return null;
        }
        String str = this.LIZ.get(strLIZ);
        if (str != null && str.length() != 0) {
            return str;
        }
        if (!this.LIZIZ || (routeManager = RouteManager.getInstance()) == null || (routeMap = routeManager.getRouteMap()) == null || routeMap.isEmpty()) {
            return null;
        }
        for (Map.Entry<String, String> entry : routeMap.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue(), strLIZ)) {
                this.LIZ.put(strLIZ, entry.getKey());
                return entry.getKey();
            }
        }
        return null;
    }
}
