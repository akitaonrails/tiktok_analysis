package X;

import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PitayaCoreFactory;

/* JADX INFO: renamed from: X.05EC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05EC {
    public static boolean LIZ;
    public static IPitayaCore LIZIZ;

    public static boolean LIZ() {
        if (LIZ) {
            return true;
        }
        IPitayaCore core = LIZIZ;
        if (core == null) {
            C844470XAv.LIZ.getClass();
            core = PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ));
        }
        boolean zIsReady = core.isReady();
        if (zIsReady) {
            LIZ = true;
            IPitayaCore core2 = LIZIZ;
            if (core2 == null) {
                C844470XAv.LIZ.getClass();
                core2 = PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ));
            }
            LIZIZ = core2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pitayaReady res: ");
        sbLIZ.append(zIsReady);
        sbLIZ.append(", cacheCore:");
        sbLIZ.append(LIZIZ);
        C19290510dT.LIZLLL("innerpush_universal_trigger", C2188811AlT.LIZIZ(sbLIZ));
        return zIsReady;
    }
}
