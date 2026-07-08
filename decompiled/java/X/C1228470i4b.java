package X;

/* JADX INFO: renamed from: X.0i4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228470i4b {
    public final C1228650i4t LIZ;
    public final C1228810i59 LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupIntegratedParam(groupCreationParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", groupListParam=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1228470i4b(C1228650i4t c1228650i4t, C1228810i59 c1228810i59) {
        this.LIZ = c1228650i4t;
        this.LIZIZ = c1228810i59;
    }

    public static C1228470i4b LIZ(C1228470i4b c1228470i4b, C1228650i4t c1228650i4t, C1228810i59 c1228810i59, int i) {
        if ((i & 1) != 0) {
            c1228650i4t = c1228470i4b.LIZ;
        }
        if ((i & 2) != 0) {
            c1228810i59 = c1228470i4b.LIZIZ;
        }
        c1228470i4b.getClass();
        return new C1228470i4b(c1228650i4t, c1228810i59);
    }
}
