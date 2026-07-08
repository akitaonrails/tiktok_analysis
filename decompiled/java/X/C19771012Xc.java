package X;

import dtj.u7;

/* JADX INFO: renamed from: X.12Xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19771012Xc {
    public static final C19771012Xc LIZ = new C19771012Xc();

    public static String LIZ() {
        Object obj;
        if (C19712912At.LIZ.LIZJ()) {
            return "background";
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (obj = abstractC1387200mCcLJ.LIZ) == null) {
            return null;
        }
        return obj.toString();
    }

    public static void LIZIZ(int i, String str, String str2) {
        if (u7.LIZ() && !u7.LIZJ()) {
            return;
        }
        C19771412Xg c19771412Xg = C19771412Xg.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AVSecurityMobHelper onOpenMicFailed creationId: ");
        sbLIZ.append(str);
        sbLIZ.append(" errCode: ");
        sbLIZ.append(i);
        sbLIZ.append(" msg: ");
        sbLIZ.append(str2);
        sbLIZ.append(" currentPage ");
        sbLIZ.append(LIZ());
        C201955140j.LJIILJJIL(c19771412Xg, C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str);
        c0lab.LIZ(i, "error_code");
        c0lab.LJ("msg", str2);
        c0lab.LJ("page", LIZ());
        C20684815ws.LJIILLIIL("tool_mic_open_fail", c0lab.LIZ);
    }
}
