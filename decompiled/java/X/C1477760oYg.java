package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: renamed from: X.0oYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477760oYg {
    public static Boolean LIZ;
    public static Boolean LIZIZ;

    public static boolean LIZIZ() {
        C1478040oZ8 c1478040oZ8 = C607330Nrv.LIZ;
        boolean z = c1478040oZ8.LIZ().getPlayerType() == 1;
        boolean zEnableForceUseH264CheckPolicy = c1478040oZ8.LIZ().enableForceUseH264CheckPolicy();
        c1478040oZ8.LIZ().enableByteVc1FailCheckCountPolicy();
        if (c1478040oZ8.LIZ().enableForceUseH264Global()) {
            return true;
        }
        if (z && zEnableForceUseH264CheckPolicy) {
            if (LIZ == null) {
                if (C1284690jXH.LIZ == null) {
                    C1284690jXH.LIZ = Boolean.valueOf(C1284680jXG.LIZ(new C1284710jXJ(), new C1284670jXF("video/hevc")) != null);
                }
                Boolean boolValueOf = Boolean.valueOf(C1284690jXH.LIZ.booleanValue());
                LIZ = boolValueOf;
                if (!boolValueOf.booleanValue()) {
                    C1475000oUE.LJIIIIZZ().ensureNotReachHere(new Exception(), "hevc not supported.");
                }
            }
            if (!LIZ.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static SimVideoUrlModel LIZ(SimVideo simVideo, EnumC1479760obu enumC1479760obu) {
        return C607330Nrv.LIZ.LIZ().getVideoPlayAddr(simVideo, enumC1479760obu);
    }
}
