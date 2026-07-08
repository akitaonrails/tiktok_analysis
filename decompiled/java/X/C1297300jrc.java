package X;

/* JADX INFO: renamed from: X.0jrc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297300jrc {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static String LIZIZ(long j) {
        boolean z;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CornerRadius.circular(");
            sbLIZ.append(C1297290jrb.LIZ(Float.intBitsToFloat(i)));
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CornerRadius.elliptical(");
        sbLIZ2.append(C1297290jrb.LIZ(Float.intBitsToFloat(i)));
        sbLIZ2.append(", ");
        sbLIZ2.append(C1297290jrb.LIZ(Float.intBitsToFloat(i2)));
        sbLIZ2.append(')');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
