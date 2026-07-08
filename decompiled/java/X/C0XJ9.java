package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJ9 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        C19259110Wf c19259110Wf = C746350TPl.LIZ;
        Integer numLIZ = c19259110Wf.LIZJ().LIZ();
        if (numLIZ == null) {
            return false;
        }
        if (numLIZ.intValue() == 0) {
            try {
                numLIZ = C0CLW.LIZIZ.LIZ.getDataSaverSetting();
                c19259110Wf.LIZJ().LJ(numLIZ);
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                numLIZ = 2;
            }
            if (numLIZ == null) {
                return false;
            }
        }
        return numLIZ.intValue() == 1;
    }

    public static int LIZ() {
        if (LIZIZ()) {
            C844470XAv.LIZ.getClass();
            if (!C0XJA.LIZ(C844470XAv.LIZ())) {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "data_saver_mode", true);
            }
        }
        return 0;
    }
}
