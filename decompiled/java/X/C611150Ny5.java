package X;

/* JADX INFO: renamed from: X.0Ny5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C611150Ny5 {
    public final boolean LIZ;
    public int LIZIZ = 0;
    public int LIZJ = 0;
    public int LIZLLL = 0;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchWriteStats(hashEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cacheHit=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cacheMiss=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", skippedByFingerprint=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C611150Ny5(boolean z) {
        this.LIZ = z;
    }
}
