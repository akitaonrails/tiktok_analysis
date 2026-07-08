package X;

/* JADX INFO: renamed from: X.01AS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AS {
    public final C01AG LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public C01AS() {
        this(null, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01AS)) {
            return false;
        }
        C01AS c01as = (C01AS) obj;
        return this.LIZ == c01as.LIZ && this.LIZIZ == c01as.LIZIZ && this.LIZJ == c01as.LIZJ && this.LIZLLL == c01as.LIZLLL;
    }

    public final int hashCode() {
        C01AG c01ag = this.LIZ;
        return ((((((c01ag == null ? 0 : c01ag.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExpandableSectionPanelData(sectionType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entranceGiftId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isInExpandableSection=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", positionInSectionContainer=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C01AS(C01AG c01ag, boolean z, int i) {
        this((i & 1) != 0 ? null : c01ag, 0L, (i & 4) != 0 ? false : z, 0);
    }

    public C01AS(C01AG c01ag, long j, boolean z, int i) {
        this.LIZ = c01ag;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = i;
    }
}
