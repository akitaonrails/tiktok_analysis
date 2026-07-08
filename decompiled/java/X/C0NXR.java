package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NXR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NXR {
    public static void LIZ(C0NXS c0nxs, C0NXT c0nxt, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AS]");
        sbLIZ.append(c0nxs.getTag());
        C2188811AlT.LIZIZ(sbLIZ);
        c0nxt.d();
    }

    public static void LIZLLL(C0NXS c0nxs, C0NXT c0nxt, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AS]");
        sbLIZ.append(c0nxs.getTag());
        C2188811AlT.LIZIZ(sbLIZ);
        c0nxt.i();
    }

    public static void LIZIZ(C0NXS c0nxs, C0NXT c0nxt, boolean z, Function0<String> function0) {
        if (z) {
            c0nxs.LIZJ(c0nxt, function0.invoke());
        }
    }

    public static void LIZJ(C0NXS c0nxs, C0NXT c0nxt, String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AS]");
        sbLIZ.append(c0nxs.getTag());
        C2188811AlT.LIZIZ(sbLIZ);
        c0nxt.e();
    }
}
