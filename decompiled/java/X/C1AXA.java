package X;

/* JADX INFO: renamed from: X.1AXA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXA {
    public final int LIZ;
    public final C1850090yFD LIZIZ;
    public final C1850090yFD LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnapShot(hash=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", surfaceRect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", containerRect=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public C1AXA(int i, C1850090yFD c1850090yFD, C1850090yFD c1850090yFD2) {
        this.LIZ = i;
        this.LIZIZ = c1850090yFD;
        this.LIZJ = c1850090yFD2;
    }
}
