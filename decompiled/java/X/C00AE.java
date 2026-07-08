package X;

/* JADX INFO: renamed from: X.00AE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AE {
    public final EnumC562480M4g LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00AE)) {
            return false;
        }
        C00AE c00ae = (C00AE) obj;
        return this.LIZ == c00ae.LIZ && this.LIZIZ == c00ae.LIZIZ && this.LIZJ == c00ae.LIZJ && this.LIZLLL == c00ae.LIZLLL && this.LJ == c00ae.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Photo2StickerPerfResourceInfo(resourceType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00AE(EnumC562480M4g enumC562480M4g, int i, int i2, long j, long j2) {
        this.LIZ = enumC562480M4g;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = j2;
    }

    public /* synthetic */ C00AE(EnumC562480M4g enumC562480M4g, int i, int i2, long j, long j2, int i3) {
        this(enumC562480M4g, i, i2, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? 0L : j2);
    }
}
