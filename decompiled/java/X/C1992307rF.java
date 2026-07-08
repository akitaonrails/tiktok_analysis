package X;

/* JADX INFO: renamed from: X.07rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1992307rF {
    public static final long LIZ(long j, long j2, long j3, String str) {
        try {
            String property = System.getProperty(str);
            if (property != null) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(property);
                if (lLJIILIIL != null) {
                    j = lLJIILIIL.longValue();
                    if (j2 > j || j > j3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("System property '");
                        sbLIZ.append(str);
                        sbLIZ.append("' should be in range ");
                        sbLIZ.append(j2);
                        sbLIZ.append("..");
                        sbLIZ.append(j3);
                        sbLIZ.append(", but is '");
                        sbLIZ.append(j);
                        sbLIZ.append('\'');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalStateException(strLIZIZ);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("System property '");
                    sbLIZ2.append(str);
                    sbLIZ2.append("' has unrecognized value '");
                    sbLIZ2.append(property);
                    sbLIZ2.append('\'');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ2.toString();
                    throw new IllegalStateException(strLIZIZ2);
                }
            }
        } catch (SecurityException unused) {
        }
        return j;
    }

    public static int LIZIZ(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) LIZ(i, i2, i3, str);
    }
}
