package X;

/* JADX INFO: renamed from: X.00rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C211400rg {
    public final int LIZ;
    public final String LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(": ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C211400rg(int i) {
        this.LIZ = i;
        this.LIZIZ = "Attributes incorrectly present on end tag";
    }

    public C211400rg(int i, String str, Object... objArr) {
        this.LIZIZ = C786410Ut5.j4(str, objArr);
        this.LIZ = i;
    }
}
