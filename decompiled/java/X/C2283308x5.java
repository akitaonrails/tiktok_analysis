package X;

/* JADX INFO: renamed from: X.08x5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2283308x5 {
    public static void LIZ(int i, String str, Throwable th) {
        String message;
        if ((i & 2) != 0) {
            th = null;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("err:");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        EnumC1490770otf enumC1490770otf = EnumC1490770otf.E;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[_Hybrid_Info_]");
        sbLIZ2.append((String) null);
        c1490740otc.LIZ(strLIZIZ, enumC1490770otf, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
