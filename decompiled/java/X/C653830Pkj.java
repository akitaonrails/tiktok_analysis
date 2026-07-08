package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Pkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653830Pkj {
    public static C652630Pin LIZIZ(View view) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        try {
            InterfaceC665370Q7z interfaceC665370Q7zLIZJ = C1558360qeg.LIZJ(view, "CompatibleAgentStore", 2);
            if (interfaceC665370Q7zLIZJ != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLIZJ, "source_default_key", C652630Pin.class, null)) != null) {
                return (C652630Pin) interfaceC1555100qZQLIZIZ.getSource();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static void LIZ(View view, C652630Pin c652630Pin) {
        if (view.isAttachedToWindow()) {
            C1554960qZC.LIZ(C1558360qeg.LJ(view, "CompatibleAgentStore"), c652630Pin, C652630Pin.class, "source_default_key");
        } else {
            view.addOnAttachStateChangeListener(new C0R47(view, view, c652630Pin, 3));
        }
    }
}
