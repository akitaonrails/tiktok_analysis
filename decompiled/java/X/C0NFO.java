package X;

/* JADX INFO: renamed from: X.0NFO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NFO {
    public static boolean LIZ(String str) {
        if (!C0NFP.LJFF(C0NFP.LIZJ(str))) {
            if (!((Boolean) C1EKD.LIZJ.getValue()).booleanValue()) {
                if (C279830Axx.LIZ()) {
                    C0NEA.LIZ.getClass();
                    if (str != null) {
                        String strLIZJ = C0NFP.LIZJ(str);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZJ);
                        sbLIZ.append(".mdl");
                        if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).exists()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZJ);
                            sbLIZ2.append(".mdlnodeconf");
                            if (!new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).exists()) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (str != null) {
                        String strLIZJ2 = C0NFP.LIZJ(str);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZJ2);
                        sbLIZ3.append(".mdl");
                        if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3)).exists()) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(strLIZJ2);
                            sbLIZ4.append(".mdlnodeconf");
                            if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4)).exists()) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
