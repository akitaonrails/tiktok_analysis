package X;

import com.bytedance.memrelief.utils.EnsureLoad;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08PC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PC {
    public static boolean LIZ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        try {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            ShadowHook.init(c2112108Pf.LIZ());
            EnsureLoad.init();
            LIZ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
