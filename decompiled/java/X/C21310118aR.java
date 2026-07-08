package X;

import com.benchmark.IBTCHConfiguration;
import com.benchmark.inject.InjectABMockConfig;
import com.bytedance.ies.abmock.debugtool.mock.MockComponentRegister;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl;

/* JADX INFO: renamed from: X.18aR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21310118aR {
    public static volatile boolean LIZ;
    public static C21309818aO LIZIZ;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.18aV] */
    public static boolean LIZ() {
        if (!LIZ) {
            synchronized (C21310118aR.class) {
                try {
                    IBTCHConfiguration iBTCHConfigurationCreateIBTCHConfigurationbyMonsterPlugin = BTCHConfigurationImpl.createIBTCHConfigurationbyMonsterPlugin(false);
                    C21309818aO byteBenchConfig = iBTCHConfigurationCreateIBTCHConfigurationbyMonsterPlugin != null ? iBTCHConfigurationCreateIBTCHConfigurationbyMonsterPlugin.getByteBenchConfig() : null;
                    if (!LIZ && byteBenchConfig != null) {
                        LIZIZ = byteBenchConfig;
                        if (byteBenchConfig.LJIILIIL) {
                            InjectABMockConfig injectABMockConfig = new InjectABMockConfig();
                            C21310218aS.LIZIZ = injectABMockConfig;
                            C21310218aS.LIZ = new Object() { // from class: X.18aV
                            };
                            MockComponentRegister.registerComponent(injectABMockConfig);
                        }
                        LIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
