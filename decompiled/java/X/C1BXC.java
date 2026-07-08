package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.IBootFinishEngine;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1BXC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BXC {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    public final void LIZ() {
        String str;
        if (this.LIZ.compareAndSet(false, true)) {
            String str2 = null;
            IBootFinishEngine iBootFinishEngine = (IBootFinishEngine) PluggableExtentionKt.pluggableSpi$default(IBootFinishEngine.class, false, false, false, 14, null);
            AnonymousClass1468.LIZLLL = new AwS400S0200000_34(iBootFinishEngine, this, 47);
            try {
                C1BXD c1bxdLIZIZ = C1BXD.LIZIZ();
                String str3 = null;
                if (iBootFinishEngine != null) {
                    iBootFinishEngine.LIZ();
                    str = "BootFinishEngine";
                } else {
                    str = null;
                }
                C1BXZ c1bxzLIZ = c1bxdLIZIZ.LIZ(str);
                if (iBootFinishEngine != null) {
                    iBootFinishEngine.LIZJ();
                    str2 = "P0";
                }
                c1bxzLIZ.LIZ(str2);
                if (iBootFinishEngine != null) {
                    iBootFinishEngine.LJFF();
                    str3 = "P1";
                }
                c1bxzLIZ.LIZ(str3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZIZ(int i) {
        if (C08Q0.LJ(C1BWL.LIZ(), "bootfinish_migrate_phase_one", false)) {
            if (i == 1) {
                if (!C0X35.LJIIL("bootfinish_migrate_phase_one")) {
                    return;
                }
            } else if (i != 1) {
                if (i == 2) {
                    LIZ();
                    return;
                }
                return;
            }
            IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
            if (iDowngradeApi == null) {
                return;
            }
            iDowngradeApi.LIZIZ(new AwS578S0100000_34(this, i, 200));
        }
    }
}
