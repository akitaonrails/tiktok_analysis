package X;

/* JADX INFO: renamed from: X.04y4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1270204y4 {
    public static C1270104y3 LIZIZ(long j, boolean z) {
        return new C1270104y3(Long.valueOf(j), z, null, false, 57);
    }

    public static C1270104y3 LIZ(long j, long j2, boolean z, boolean z2) {
        if (j <= j2) {
            return new C1270104y3(Long.valueOf(j), z, Long.valueOf(j2), z2, 33);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("between requires min (");
        sbLIZ.append(j);
        sbLIZ.append(") <= max (");
        sbLIZ.append(j2);
        sbLIZ.append(')');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
