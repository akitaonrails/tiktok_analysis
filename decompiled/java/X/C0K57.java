package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K57, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K57 {
    public static final C0K57 LIZ = new C0K57();

    public static void LIZ(String str, String str2, String str3, boolean z) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_privilege_tab");
        String strLIZIZ = "show";
        if (!Intrinsics.LJFF(str2, "show")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        c511970K5z.LIZIZ(strLIZIZ, "action_type");
        c511970K5z.LIZIZ(str3, "show_entrance");
        c511970K5z.LIZIZ(Integer.valueOf(C0K51.LJIILIIL(Boolean.valueOf(z))), "is_red_dot");
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZLLL();
    }
}
