package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.07io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1940007io {
    public static final n LIZ = new n();

    public static final int LIZ() {
        k kVarLJJIIZ;
        String string;
        Integer numLJIIJJI;
        int iIntValue = 20;
        try {
            n nVar = (n) SettingsManager.LIZLLL().LJIIIIZZ("ec_search_mall_target_config", n.class, LIZ);
            if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("count")) != null && (string = kVarLJJIIZ.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
                iIntValue = numLJIIJJI.intValue();
                return iIntValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ(th.getMessage());
        }
        return iIntValue;
    }

    public static final int LIZIZ() {
        k kVarLJJIIZ;
        String string;
        Integer numLJIIJJI;
        int iIntValue = 600;
        try {
            n nVar = (n) SettingsManager.LIZLLL().LJIIIIZZ("ec_search_mall_target_config", n.class, LIZ);
            if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("duration")) != null && (string = kVarLJJIIZ.toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
                iIntValue = numLJIIJJI.intValue();
                return iIntValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ(th.getMessage());
        }
        return iIntValue;
    }
}
