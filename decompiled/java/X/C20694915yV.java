package X;

/* JADX INFO: renamed from: X.15yV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20694915yV {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final boolean LIZ() {
        return this.LIZIZ && this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(": [inner: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sys: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20694915yV(String str) {
        this.LIZ = str;
        this.LIZIZ = C19328310jZ.LIZIZ.LIZLLL(str) == 1;
        this.LIZJ = C824420WVs.LIZ(str);
    }
}
