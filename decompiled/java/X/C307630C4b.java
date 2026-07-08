package X;

import com.bytedance.ies.abmock.datacenter.plugin.BaseConfigPlugin;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0C4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307630C4b {
    public static C307630C4b LIZIZ;
    public final Map<BaseConfigPlugin, Boolean> LIZ = new ConcurrentHashMap();

    public static C307630C4b LIZ() {
        if (LIZIZ == null) {
            synchronized (C307630C4b.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C307630C4b();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
