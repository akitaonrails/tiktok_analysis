package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.14hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20337714hz extends C20337614hy {
    public static final C20337714hz LIZJ = new C20337714hz();
    public static final ConcurrentHashMap<String, Object> LIZLLL = new ConcurrentHashMap<>();

    @Override // X.C20337614hy
    public final <T> T LIZIZ(C20337814i0<T> c20337814i0) {
        try {
            ConcurrentHashMap<String, Object> concurrentHashMap = LIZLLL;
            boolean zContainsKey = concurrentHashMap.containsKey(c20337814i0.LIZIZ);
            if (zContainsKey) {
                T t = (T) concurrentHashMap.get(c20337814i0.LIZIZ);
                if (t == null) {
                    t = null;
                }
                if (t != null) {
                    return t;
                }
            }
            T t2 = (T) super.LIZIZ(c20337814i0);
            if (t2 != null) {
                concurrentHashMap.put(c20337814i0.LIZIZ, t2);
            } else if (zContainsKey) {
                concurrentHashMap.remove(c20337814i0.LIZIZ);
            }
            if (t2 == null) {
                return c20337814i0.LIZLLL;
            }
            return t2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                C1CC3 c1cc3MN2 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2();
                if (c1cc3MN2 != null) {
                    c1cc3MN2.LJIILLIIL("PluginPropertyKeva", th);
                }
                return c20337814i0.LIZLLL;
            }
            throw th;
        }
    }

    @Override // X.C20337614hy
    public final <T> void LIZJ(C20337814i0<T> c20337814i0, T t) {
        if (t == null) {
            ConcurrentHashMap<String, Object> concurrentHashMap = LIZLLL;
            if (concurrentHashMap.containsKey(c20337814i0.LIZIZ)) {
                concurrentHashMap.remove(c20337814i0.LIZIZ);
            }
            LIZ(c20337814i0.LIZJ).erase(c20337814i0.LIZIZ);
            return;
        }
        LIZLLL.put(c20337814i0.LIZIZ, t);
        super.LIZJ(c20337814i0, t);
    }
}
