package X;

/* JADX INFO: renamed from: X.0cVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014810cVz {
    public final int LIZ;
    public final EnumC1014780cVw LIZIZ;
    public final long LIZJ;
    public Long LIZLLL;
    public Boolean LJ;
    public String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RenderRecord(index=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1014810cVz(int i, EnumC1014780cVw enumC1014780cVw, long j, Long l, Boolean bool, String str) {
        this.LIZ = i;
        this.LIZIZ = enumC1014780cVw;
        this.LIZJ = j;
        this.LIZLLL = l;
        this.LJ = bool;
        this.LJFF = str;
    }
}
