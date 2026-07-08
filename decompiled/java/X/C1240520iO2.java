package X;

/* JADX INFO: renamed from: X.0iO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240520iO2 {
    public final int LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final long LJFF;

    public final int hashCode() {
        return (((((((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSearchAccountsSortData(highlightStartIdx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isMAF=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isGroupChat=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", conversationUpdatedTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1240520iO2(int i, int i2, int i3, long j, boolean z, boolean z2, int i4) {
        i3 = (i4 & 8) != 0 ? EnumC1240560iO6.UNKNOWN.getStatus() : i3;
        z2 = (i4 & 16) != 0 ? false : z2;
        j = (i4 & 32) != 0 ? 0L : j;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = z;
        this.LIZLLL = i3;
        this.LJ = z2;
        this.LJFF = j;
    }
}
