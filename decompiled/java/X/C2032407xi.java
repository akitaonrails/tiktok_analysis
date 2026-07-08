package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2032407xi {
    public static volatile C2032407xi LIZIZ;
    public final Map<Integer, WeakReference<TTVideoEngine>> LIZ = new ConcurrentHashMap();

    public static C2032407xi LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C2032407xi.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C2032407xi();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZ(TTVideoEngine tTVideoEngine) {
        if (tTVideoEngine == null) {
            return;
        }
        if (!((ConcurrentHashMap) this.LIZ).containsKey(Integer.valueOf(tTVideoEngine.hashCode()))) {
            ((ConcurrentHashMap) this.LIZ).put(Integer.valueOf(tTVideoEngine.hashCode()), new WeakReference(tTVideoEngine));
        }
    }
}
