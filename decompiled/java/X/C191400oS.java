package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C191400oS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_privilege_tab");
        String strLIZIZ = "show";
        if (!Intrinsics.LJFF(str2, "show")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        c474500IjALIZ.LJJII(strLIZIZ, "action_type");
        c474500IjALIZ.LJJII(str3, "show_entrance");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_red_dot");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
