package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Kff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523290Kff {
    public static final C523290Kff LIZ = new C523290Kff();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(383));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZIZ(boolean z) {
        C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setHasLivePhotoScanned ");
        sbLIZ.append(z);
        C201955140j.LIZLLL(c1450470nqf, "LivePhotoKeva", C2188811AlT.LIZIZ(sbLIZ));
        LIZ().storeBoolean("has_live_photo_scanned", z);
    }
}
