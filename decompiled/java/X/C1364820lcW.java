package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364820lcW {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(450));

    public static boolean LIZ() {
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tooltip_shown_");
        sbLIZ.append(C461720I8s.LIZIZ());
        return keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static void LIZIZ() {
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tooltip_shown_");
        sbLIZ.append(C461720I8s.LIZIZ());
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }
}
