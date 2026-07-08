package X;

import android.net.Uri;
import com.bytedance.pia.core.worker.binding.WarmupModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.worker.JsWorker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1BP7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BP7 {
    public static volatile C1BP7 LJIIJ;
    public final Uri LIZ;
    public final JsWorker LIZIZ;
    public final JSModuleManager LIZJ;
    public volatile boolean LIZLLL;
    public volatile Runnable LJ;
    public volatile Throwable LJFF;
    public final long LJI = System.currentTimeMillis();
    public long LJII;
    public final long LJIIIIZZ;
    public long LJIIIZ;

    public final boolean LIZ() {
        boolean z;
        synchronized (this) {
            try {
                z = this.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static synchronized void LIZIZ(Uri uri) {
        if (LJIIJ != null && LJIIJ.LIZ.equals(uri)) {
            LJIIJ.LIZIZ.terminate();
            LJIIJ = null;
        }
    }

    public C1BP7(InterfaceC1535500q3o interfaceC1535500q3o, Uri uri) {
        this.LIZ = uri;
        JsWorker.EngineType engineType = JsWorker.EngineType.QUICKJS;
        AtomicBoolean atomicBoolean = C1BOE.LIZ;
        JSModuleManager jSModuleManager = new JSModuleManager(C1542560qFC.LIZ);
        this.LIZJ = jSModuleManager;
        jSModuleManager.LIZIZ("WarmupModule", WarmupModule.class, this);
        this.LIZIZ = new JsWorker(jSModuleManager, engineType, null, false, "PIA");
        this.LJIIIIZZ = System.currentTimeMillis();
        interfaceC1535500q3o.LIZIZ(EnumC1535440q3i.Auto, new C1BQN(uri), new InterfaceC1530550pvp() { // from class: X.1BPG
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                C1BP7 c1bp7 = this.LIZ;
                InterfaceC1532650pzD interfaceC1532650pzD = (InterfaceC1532650pzD) obj;
                c1bp7.getClass();
                c1bp7.LJIIIZ = System.currentTimeMillis();
                try {
                    c1bp7.LIZIZ.evaluateJavaScript(C21346518gJ.LIZ(interfaceC1532650pzD), c1bp7.LIZ.toString());
                    c1bp7.LIZIZ.evaluateJavaScript("NativeModules.get(\"WarmupModule\").finishWarmup();");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1bp7.LJIIIZ = System.currentTimeMillis();
                    c1bp7.LJFF = th;
                    c1bp7.LIZIZ.terminate();
                    synchronized (c1bp7) {
                        try {
                            c1bp7.LJII = System.currentTimeMillis();
                            c1bp7.LIZLLL = true;
                            if (c1bp7.LJ != null) {
                                c1bp7.LJ.run();
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                }
            }
        }, new InterfaceC1530550pvp() { // from class: X.1BPV
            @Override // X.InterfaceC1530550pvp
            public final void accept(Object obj) {
                C1BP7 c1bp7 = this.LIZ;
                c1bp7.getClass();
                c1bp7.LJIIIZ = System.currentTimeMillis();
                c1bp7.LJFF = (Throwable) obj;
                c1bp7.LIZIZ.terminate();
                synchronized (c1bp7) {
                    try {
                        c1bp7.LJII = System.currentTimeMillis();
                        c1bp7.LIZLLL = true;
                        if (c1bp7.LJ != null) {
                            c1bp7.LJ.run();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        });
    }
}
