package X;

/* JADX INFO: renamed from: X.0pTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512850pTH extends C1702170uOd {
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    @Override // X.C1702170uOd
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("traffic: tx: ");
        long j = 1024;
        long j2 = 60;
        sbLIZ2.append((this.LIZJ / j) / j2);
        sbLIZ2.append(", rx: ");
        sbLIZ2.append((this.LIZIZ / j) / j2);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
