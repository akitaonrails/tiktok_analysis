package X;

/* JADX INFO: renamed from: X.15rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20651115rR extends AbstractC20652915rj {
    public final String LIZ;
    public final int LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecondDimension: key:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", size:");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC20652915rj
    public final int LIZ() {
        return this.LIZIZ;
    }

    public C20651115rR(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
