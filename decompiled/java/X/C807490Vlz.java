package X;

/* JADX INFO: renamed from: X.0Vlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807490Vlz {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public C807490Vlz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C807490Vlz)) {
            return false;
        }
        C807490Vlz c807490Vlz = (C807490Vlz) obj;
        return this.LIZ == c807490Vlz.LIZ && this.LIZIZ == c807490Vlz.LIZIZ && this.LIZJ == c807490Vlz.LIZJ && this.LIZLLL == c807490Vlz.LIZLLL && this.LJ == c807490Vlz.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TcpCounts(total=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", established=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", closeWait=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeWait=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", listen=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C807490Vlz(int i) {
        this.LIZ = 0;
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
    }
}
