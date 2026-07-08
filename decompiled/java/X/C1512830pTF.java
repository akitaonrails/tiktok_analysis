package X;

/* JADX INFO: renamed from: X.0pTF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512830pTF extends C1702170uOd {
    public long LIZIZ;
    public long LIZJ;

    @Override // X.C1702170uOd
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("storage: external:");
        long j = 1024;
        sbLIZ2.append((this.LIZJ / j) / j);
        sbLIZ2.append(", internal: ");
        sbLIZ2.append((this.LIZIZ / j) / j);
        sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
