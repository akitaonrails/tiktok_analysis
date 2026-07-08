package X;

/* JADX INFO: renamed from: X.0X5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843070X5l {
    public static void LIZ(String str) {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("err:");
        sbLIZ.append((String) null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        EnumC1490770otf enumC1490770otf = EnumC1490770otf.D;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[_Hybrid_TTP_]");
        sbLIZ2.append((String) null);
        c1490740otc.LIZ(strLIZIZ, enumC1490770otf, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZLLL(int i, String str, String str2) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("err:");
        sbLIZ.append((String) null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        EnumC1490770otf enumC1490770otf = EnumC1490770otf.W;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[_Hybrid_TTP_]");
        sbLIZ2.append(str2);
        c1490740otc.LIZ(strLIZIZ, enumC1490770otf, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZIZ(int i, String str, String str2, Throwable th) {
        String message = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("err:");
        if (th != null) {
            message = th.getMessage();
        }
        sbLIZ.append(message);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        EnumC1490770otf enumC1490770otf = EnumC1490770otf.E;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[_Hybrid_TTP_]");
        sbLIZ2.append(str2);
        c1490740otc.LIZ(strLIZIZ, enumC1490770otf, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LIZJ(int i, String str, String str2, Throwable th) {
        String message = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("err:");
        if (th != null) {
            message = th.getMessage();
        }
        sbLIZ.append(message);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        EnumC1490770otf enumC1490770otf = EnumC1490770otf.I;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[_Hybrid_TTP_]");
        sbLIZ2.append(str2);
        c1490740otc.LIZ(strLIZIZ, enumC1490770otf, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
