package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0NNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C592890NNf {
    public static volatile C592890NNf LIZJ;
    public final Map<String, Object> LIZ = new ConcurrentHashMap();
    public volatile boolean LIZIZ = false;

    public static C592890NNf LIZIZ() {
        if (LIZJ == null) {
            synchronized (C592890NNf.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C592890NNf();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        synchronized (this.LIZ) {
            try {
                if (this.LIZIZ) {
                    return;
                }
                for (Object obj : ((ConcurrentHashMap) this.LIZ).values()) {
                    try {
                        synchronized (obj) {
                            try {
                                obj.notifyAll();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                ((ConcurrentHashMap) this.LIZ).clear();
                this.LIZIZ = true;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public C592890NNf() {
        C0CMU.LIZ.LIZIZ(new C0CMV() { // from class: X.0NNg
            @Override // X.C0CMV
            public final void LIZJ() {
            }

            @Override // X.C0CMV
            public final void onExit() {
                this.LIZ.LIZJ();
            }
        });
        C0CN5.LIZIZ(Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), new Runnable() { // from class: X.0NIj
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CoreSceneDowngradeSleep@2517.<init>$2");
                try {
                    this.LL.LIZJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CoreSceneDowngradeSleep@2517.<init>$2");
            }
        });
    }

    public final void LIZ(long j) {
        Object obj;
        if (j >= 0) {
            if (this.LIZIZ) {
                return;
            }
            synchronized (this.LIZ) {
                try {
                    obj = ((ConcurrentHashMap) this.LIZ).get("NetworkInit");
                    if (obj == null) {
                        obj = new Object();
                        ((ConcurrentHashMap) this.LIZ).put("NetworkInit", obj);
                    }
                } finally {
                }
            }
            try {
                synchronized (obj) {
                    try {
                        if (!this.LIZIZ) {
                            obj.wait(j);
                        }
                    } finally {
                    }
                }
                return;
            } catch (InterruptedException th) {
                return;
            } catch (Throwable th2) {
                return;
            }
        }
        throw new IllegalArgumentException("timeout must be non-negative");
    }
}
