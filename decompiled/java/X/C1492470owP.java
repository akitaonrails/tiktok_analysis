package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0owP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492470owP {
    public static final /* synthetic */ int LIZJ = 0;
    public final AtomicLong LIZ = new AtomicLong(-1);
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final boolean LIZ(boolean z) {
        boolean zLIZIZ;
        boolean zLIZ = C1492500owS.LIZ();
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        boolean z2 = false;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        boolean z3 = zLIZ & zLIZIZ;
        if (!z || System.currentTimeMillis() - this.LIZ.get() >= 60000) {
            z2 = true;
        }
        return z3 & z2;
    }

    public final boolean LIZIZ(EnumC1492290ow7 enumC1492290ow7, HashMap<String, HashMap<String, Object>> map) {
        if (!LIZ(true)) {
            return false;
        }
        if ((!C1588630rRV.LIZ() && !C1588630rRV.LIZIZ()) || this.LIZIZ.get()) {
            return false;
        }
        this.LIZ.set(System.currentTimeMillis());
        C1492440owM.LIZ(EnumC1492450owN.SHOW_TOAST, enumC1492290ow7, map);
        return true;
    }
}
