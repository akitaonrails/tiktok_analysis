package X;

import com.bytedance.pia.core.setting.Settings;
import com.bytedance.pia.core.spi.ConfigTask;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.worker.JsWorker;
import com.ss.android.ugc.aweme.hybridkit.task.PiaConfigTask;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1BO0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BO0 {
    public static final C1BO0 LIZJ = new C1BO0();
    public final long LIZ = System.currentTimeMillis();
    public final long LIZIZ;

    public C1BO0() {
        Runnable configTask;
        C2201341BDo c2201341BDo;
        try {
            configTask = PiaConfigTask.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1BPP.LJ("[SPI] try get config task failed, fallback to default.");
            configTask = new ConfigTask();
        }
        configTask.run();
        C2204051BNz.LJIIZILJ = C786410Ut5.N3(C1542560qFC.LIZ);
        if (!C1BOE.LIZIZ && C1BOE.LIZ.compareAndSet(false, true)) {
            if (JsWorker.initialize()) {
                C1BOE.LIZIZ = true;
            } else {
                C1865220ydc c1865220ydc = C1865230ydd.LIZ;
                c1865220ydc.getClass();
                Object obj = ((ConcurrentHashMap) c1865220ydc.LIZ).get(C1BOR.class.getName());
                C1BOR c1bor = (C1BOR) (obj != null ? (C1BOY) obj : null);
                String strLIZ = c1bor == null ? "" : c1bor.LIZ();
                JsWorker.preLoadPlugin(strLIZ);
                if (JsWorker.initializeWithPlugin2(strLIZ)) {
                    C1BOE.LIZIZ = true;
                }
            }
        }
        if (C1542560qFC.LJ == null) {
            InterfaceC1537230q6b<InterfaceC1535500q3o> interfaceC1537230q6b = new InterfaceC1537230q6b() { // from class: X.0q3w
                @Override // X.InterfaceC1537230q6b
                public final Object create() {
                    return new DefaultResourceLoader();
                }

                @Override // X.InterfaceC1537230q6b
                public final Object LIZ(Object obj2) {
                    return create();
                }
            };
            if (C1542560qFC.LJ == null) {
                C1542560qFC.LJ = interfaceC1537230q6b;
            }
        }
        if (C1542560qFC.LJFF == null) {
            InterfaceC1537230q6b<InterfaceC1503700pEW> interfaceC1537230q6b2 = new InterfaceC1537230q6b() { // from class: X.1BOT
                @Override // X.InterfaceC1537230q6b
                public final Object create() {
                    return new InterfaceC1503700pEW() { // from class: X.1BOU
                        @Override // X.InterfaceC1503700pEW
                        public final Object LIZ(Class cls, String str) {
                            return C1515120pWw.LJIIIZ(cls, str);
                        }
                    };
                }

                @Override // X.InterfaceC1537230q6b
                public final Object LIZ(Object obj2) {
                    return create();
                }
            };
            if (C1542560qFC.LJFF == null) {
                C1542560qFC.LJFF = interfaceC1537230q6b2;
            }
        }
        C1287700jc8.LIZJ(new Runnable() { // from class: X.1BNY
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("EnvService$Initializer@66c.<init>$1L");
                if (C1BNX.LIZ == null) {
                    C1BPP.LIZ("Initialize worker polyfill failed!");
                } else {
                    C1BPP.LJ("Initialize worker polyfill success.");
                }
                C1C7U.LIZIZ("EnvService$Initializer@66c.<init>$1L");
            }
        });
        Runnable runnable = C1542560qFC.LIZIZ;
        if (runnable != null) {
            runnable.run();
        }
        C2201341BDo c2201341BDo2 = new C2201341BDo() { // from class: X.1BNb
            /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
            @Override // X.C2201341BDo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C2204041BNy r6) {
                /*
                    r5 = this;
                    super.LIZ(r6)
                    boolean r0 = r6.LJIIIZ()
                    if (r0 == 0) goto L63
                    java.lang.Class<com.bytedance.pia.core.plugins.BridgePlugin> r0 = com.bytedance.pia.core.plugins.BridgePlugin.class
                    r2 = 0
                    r6.LJIIIIZZ(r0, r2)
                    java.lang.Class<com.bytedance.pia.core.plugins.PiaPropsPlugin> r0 = com.bytedance.pia.core.plugins.PiaPropsPlugin.class
                    r6.LJIIIIZZ(r0, r2)
                    android.net.Uri r4 = android.net.Uri.EMPTY
                    com.bytedance.pia.core.setting.Config r0 = r6.LIZLLL
                    java.lang.String r0 = r0.streaming
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L28
                    com.bytedance.pia.core.setting.Config r0 = r6.LIZLLL
                    java.lang.String r0 = r0.streaming
                    android.net.Uri r4 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
                L28:
                    com.bytedance.pia.core.setting.Settings r0 = X.C2203961BNq.LIZ()
                    boolean r0 = r0.isMustFinishWarmup
                    r3 = 1
                    if (r0 == 0) goto L51
                    java.lang.Class<X.1BP7> r1 = X.C1BP7.class
                    monitor-enter(r1)
                    X.1BP7 r0 = X.C1BP7.LJIIJ     // Catch: java.lang.Throwable -> L49
                    if (r0 == 0) goto L85
                    X.1BP7 r0 = X.C1BP7.LJIIJ     // Catch: java.lang.Throwable -> L49
                    android.net.Uri r0 = r0.LIZ     // Catch: java.lang.Throwable -> L49
                    boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L49
                    if (r0 == 0) goto L85
                    X.1BP7 r0 = X.C1BP7.LJIIJ     // Catch: java.lang.Throwable -> L49
                    boolean r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L49
                    goto L4c
                L49:
                    r0 = move-exception
                    monitor-exit(r1)
                    throw r0
                L4c:
                    if (r0 == 0) goto L85
                L4e:
                    monitor-exit(r1)
                    if (r3 == 0) goto L64
                L51:
                    com.bytedance.pia.core.setting.Config r0 = r6.LIZLLL
                    boolean r0 = r0.LIZJ()
                    if (r0 == 0) goto L64
                    java.lang.Class<com.bytedance.pia.core.plugins.StreamingPlugin> r0 = com.bytedance.pia.core.plugins.StreamingPlugin.class
                    r6.LJIIIIZZ(r0, r2)
                L5e:
                    java.lang.Class<com.bytedance.pia.core.plugins.ManifestPlugin> r0 = com.bytedance.pia.core.plugins.ManifestPlugin.class
                    r6.LJIIIIZZ(r0, r2)
                L63:
                    return
                L64:
                    X.C1BP7.LIZIZ(r4)
                    java.lang.Class<com.bytedance.pia.core.plugins.HtmlPlugin> r0 = com.bytedance.pia.core.plugins.HtmlPlugin.class
                    r6.LJIIIIZZ(r0, r2)
                    java.lang.Class<com.bytedance.pia.core.plugins.BootPlugin> r0 = com.bytedance.pia.core.plugins.BootPlugin.class
                    r6.LJIIIIZZ(r0, r2)
                    com.bytedance.pia.core.setting.Settings r0 = X.C2203961BNq.LIZ()
                    java.util.Set<java.lang.String> r1 = r0.enabledFeatures
                    java.lang.String r0 = "preload"
                    boolean r0 = r1.contains(r0)
                    if (r0 == 0) goto L5e
                    java.lang.Class<com.bytedance.pia.core.plugins.PreloadPlugin> r0 = com.bytedance.pia.core.plugins.PreloadPlugin.class
                    r6.LJIIIIZZ(r0, r2)
                    goto L5e
                L85:
                    r3 = 0
                    goto L4e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2203811BNb.LIZ(X.1BNy):void");
            }
        };
        C2201341BDo c2201341BDo3 = C2201341BDo.LIZIZ;
        C2201341BDo c2201341BDo4 = c2201341BDo3.LIZ;
        if (c2201341BDo4 == null) {
            c2201341BDo3.LIZ = c2201341BDo2;
        } else {
            C2201341BDo c2201341BDo5 = c2201341BDo4.LIZ;
            while (true) {
                c2201341BDo = c2201341BDo4;
                c2201341BDo4 = c2201341BDo5;
                if (c2201341BDo4 == null) {
                    break;
                } else {
                    c2201341BDo5 = c2201341BDo4.LIZ;
                }
            }
            c2201341BDo.LIZ = c2201341BDo2;
        }
        Settings settingsLIZ = C2203961BNq.LIZ();
        if (settingsLIZ.isPrefetchV1Enabled || settingsLIZ.isNsrV1Enabled || settingsLIZ.isSnapshotV1Enabled) {
            try {
                Class.forName("com.bytedance.pia.core.CompatEntry").getMethod("initialize", new Class[0]).invoke(null, new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZIZ = System.currentTimeMillis();
    }
}
