package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MPS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MPS {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(7));
    public static final C1227904rF LIZIZ = C1227904rF.LIZ;
    public static final Map<String, Effect> LIZJ = new LinkedHashMap();

    public static boolean LIZ(InterfaceC1635410sex interfaceC1635410sex, Effect effect) {
        if (((Number) C263560AUo.LIZ.getValue()).intValue() == 1) {
            return interfaceC1635410sex.LJIIIIZZ(effect);
        }
        if (a0.LJJJIL(effect.getUnzipPath())) {
            return false;
        }
        return true;
    }
}
