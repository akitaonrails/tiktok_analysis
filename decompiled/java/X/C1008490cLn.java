package X;

import android.hardware.SensorManager;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0cLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008490cLn {
    public static final C1008500cLo LIZ(Map<String, ? extends Object> map) {
        Double d;
        boolean zBooleanValue;
        Boolean bool;
        Object obj = map.get("speed");
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        double dDoubleValue = d.doubleValue();
        Object obj2 = map.get("should_vibrate");
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return new C1008500cLo(zBooleanValue, dDoubleValue);
    }

    public static final void LIZIZ(C1007900cKq c1007900cKq, C1008510cLp c1008510cLp) {
        c1007900cKq.LJIIIZ = c1008510cLp;
        try {
            C1300690jx5.LIZJ((SensorManager) c1007900cKq.LJIIIIZZ.getValue(), c1007900cKq.LJIIIZ, C2204961BRm.LJJL((SensorManager) c1007900cKq.LJIIIIZZ.getValue(), 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepbZ7J2SCGwoUHsNaB0mt28z2uywRbU33lvtDdkx+ET/RoPqFm7AanTw==", null)), 2, CertProviderManagerKt.findCert("bpea-commerce_shake_egg_register_sensor", 1476415492));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
