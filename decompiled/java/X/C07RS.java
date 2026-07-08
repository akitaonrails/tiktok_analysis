package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07RS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07RS extends C09AY implements Function0<String> {
    public C07RS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            C01GW c01gw = C07RT.LIZ;
            k kVar = (k) c0c64LJIILLIIL.LJJII(k.class, null, "ttvideoengine_bandwidth_config", true);
            if (kVar == null) {
                return "";
            }
            String string = kVar.toString();
            return string != null ? string : "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }
}
