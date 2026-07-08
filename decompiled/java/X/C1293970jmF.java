package X;

/* JADX INFO: renamed from: X.0jmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293970jmF {
    public final String LIZ;

    public final String LIZ() {
        C0VSJ c0vsj = new C0VSJ(this.LIZ, "audio");
        if (c0vsj.exists() || c0vsj.mkdirs()) {
            return c0vsj.getAbsolutePath();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mkdirs failed, workspace path: ");
        sbLIZ.append(this.LIZ);
        C2484209oO.LIZJ("VEResManager", C2188811AlT.LIZIZ(sbLIZ));
        return "";
    }

    public C1293970jmF(String str) {
        this.LIZ = str;
    }

    public static String LIZIZ(String str, String str2) {
        C0VSJ c0vsj = new C0VSJ(str, str2);
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mkdirs failed, workspace path: ");
            sbLIZ.append(str);
            C2484209oO.LIZJ("VEResManager", C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
        return c0vsj.getAbsolutePath();
    }
}
