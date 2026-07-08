package X;

/* JADX INFO: renamed from: X.0dzv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071810dzv {
    public static final String LIZ(EnumC1070410dxf enumC1070410dxf) {
        int i = C1071820dzw.LIZ[enumC1070410dxf.ordinal()];
        if (i != 1) {
            if (i == 2) {
                boolean zLJ = C1076010e6h.LIZJ.LJIIJ().LJ();
                boolean zLIZ = C1072200e0Y.LIZ("android.permission.READ_CONTACTS");
                if (!zLJ) {
                    if (!zLIZ) {
                        return "unknown";
                    }
                    return "off";
                }
                return "on";
            }
            throw new C1954807lC();
        }
        if (C1076010e6h.LIZJ.LJII().LJ()) {
            return "on";
        }
        return "off";
    }
}
