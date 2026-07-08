package X;

/* JADX INFO: renamed from: X.0b7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961040b7G {
    public final int LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final int hashCode() {
        return (((((((((((this.LIZ * 31) + 900730600) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoHostPreloadConfig(preloadAction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", biz=");
        sbLIZ.append("biz_invite_list");
        sbLIZ.append(", section=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ttlMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shouldUpdateCache=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isClickPreload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isOneTimeUsable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961040b7G(int i, String str, long j, boolean z, boolean z2, boolean z3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
