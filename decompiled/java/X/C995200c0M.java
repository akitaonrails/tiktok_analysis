package X;

/* JADX INFO: renamed from: X.0c0M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995200c0M {
    public static final C995200c0M LIZLLL = new C995200c0M(12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995200c0M)) {
            return false;
        }
        C995200c0M c995200c0M = (C995200c0M) obj;
        return this.LIZ == c995200c0M.LIZ && this.LIZIZ == c995200c0M.LIZIZ && this.LIZJ == c995200c0M.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageGridConfig(columnNum=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gutterInPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", marginInPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995200c0M(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
