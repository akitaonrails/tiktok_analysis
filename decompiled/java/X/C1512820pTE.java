package X;

/* JADX INFO: renamed from: X.0pTE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512820pTE extends C1702170uOd {
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;

    @Override // X.C1702170uOd
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("memory: ");
        long j = 1024;
        sbLIZ2.append((this.LIZIZ / j) / j);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
