package X;

/* JADX INFO: renamed from: X.0puz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530030puz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, C1537480q70 c1537480q70) {
        LIZJ(EnumC1490770otf.E, str, str2, c1537480q70);
    }

    public static void LIZIZ(String str, String str2, C1537480q70 c1537480q70) {
        LIZJ(EnumC1490770otf.I, str, str2, c1537480q70);
    }

    public static void LIZJ(EnumC1490770otf enumC1490770otf, String str, String str2, C1537480q70 c1537480q70) {
        String str3;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(" containerId:");
        if (c1537480q70 != null) {
            str3 = c1537480q70.containerId;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("HybridKit-");
        sbLIZ2.append(str);
        c1490740otc.LIZ(strLIZIZ, enumC1490770otf, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
