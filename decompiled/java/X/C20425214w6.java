package X;

/* JADX INFO: renamed from: X.14w6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20425214w6 {
    public final long LIZ;
    public final String LIZIZ;
    public final C20425014w4 LIZJ;
    public final C20424914w3 LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyeState(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stateType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskStateData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", parallelStateData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1CQM LIZ() {
        Long lValueOf = Long.valueOf(this.LIZ);
        String str = this.LIZIZ;
        C20425014w4 c20425014w4 = this.LIZJ;
        C1CQV c1cqv = c20425014w4 != null ? new C1CQV(Long.valueOf(c20425014w4.LIZ), Boolean.valueOf(c20425014w4.LIZIZ), c20425014w4.LIZJ, c20425014w4.LIZLLL, c20425014w4.LJ, Long.valueOf(c20425014w4.LJFF), Long.valueOf(c20425014w4.LJI), c20425014w4.LJII, c20425014w4.LJIIIIZZ) : null;
        C20424914w3 c20424914w3 = this.LIZLLL;
        return new C1CQM(lValueOf, str, c1cqv, c20424914w3 != null ? new C1CQZ(Long.valueOf(c20424914w3.LIZ), Boolean.valueOf(c20424914w3.LIZIZ), c20424914w3.LIZJ, c20424914w3.LIZLLL, c20424914w3.LJ, c20424914w3.LJFF, c20424914w3.LJI, c20424914w3.LJII) : null);
    }

    public C20425214w6(long j, String str, C20425014w4 c20425014w4, C20424914w3 c20424914w3) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = c20425014w4;
        this.LIZLLL = c20424914w3;
    }
}
