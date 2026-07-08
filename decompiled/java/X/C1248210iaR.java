package X;

/* JADX INFO: renamed from: X.0iaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248210iaR {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2) {
        EnumC1253850ijX enumC1253850ijX = EnumC1253850ijX.OTHERS;
        if (C283620B9s.LIZ()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Profile-");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZ(enumC1253850ijX, "", str2);
        }
    }

    public static String LIZ(EnumC1253850ijX enumC1253850ijX, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1253850ijX.getCode());
        sbLIZ.append('|');
        sbLIZ.append(str);
        sbLIZ.append('|');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZJ(String str, String str2, EnumC1253850ijX enumC1253850ijX, String str3) {
        if (!C283620B9s.LIZ()) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Profile-");
        sbLIZ.append(str);
        C1720106oR.LIZ(C2188811AlT.LIZIZ(sbLIZ), LIZ(enumC1253850ijX, str3, str2));
    }

    public static final void LJ(String str, String str2, EnumC1253850ijX enumC1253850ijX, String str3) {
        if (!C283620B9s.LIZ()) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Profile-");
        sbLIZ.append(str);
        C1720106oR.LJI(C2188811AlT.LIZIZ(sbLIZ), LIZ(enumC1253850ijX, str3, str2));
    }
}
