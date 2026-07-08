package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527550KmX {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(159));

    public static Keva LIZLLL() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZIZ() {
        for (String str : LIZLLL().getAllKey()) {
            if (!Intrinsics.LJFF(str, "last_used_uid")) {
                LIZLLL().erase(str);
            }
        }
    }

    public static void LIZ(String str) {
        LIZLLL().erase(str);
        LIZLLL().erase(LIZJ(str));
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selection_time__");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
