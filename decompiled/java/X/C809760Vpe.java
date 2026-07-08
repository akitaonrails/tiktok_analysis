package X;

import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809760Vpe {
    public static volatile InterfaceC809800Vpi LIZ;

    public static void LIZ(String str, JSONObject jSONObject, String str2, int i) {
        if (((PushOnlineSettings) C0WFE.LIZ(C809360Vp0.LIZ, PushOnlineSettings.class)).LJIJ() <= 0) {
            if (LIZ == null) {
                synchronized (C809760Vpe.class) {
                    try {
                        if (LIZ == null) {
                            C809770Vpf c809770Vpf = new C809770Vpf();
                            c809770Vpf.LIZ = C809360Vp0.LIZ;
                            C809030VoT.LJIIJ.LIZ.getClass();
                            c809770Vpf.LIZLLL = C809190Voj.LIZ();
                            c809770Vpf.LIZIZ = "push";
                            c809770Vpf.LIZJ = "3.2.4-alpha.56.4-bugfix";
                            c809770Vpf.LJ = 1;
                            LIZ = C809780Vpg.LIZ(c809770Vpf.LIZ());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            LIZ.LIZ(str, jSONObject, str2, i);
        }
    }
}
