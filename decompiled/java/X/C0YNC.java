package X;

/* JADX INFO: renamed from: X.0YNC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YNC {
    public static final C0YNC LJ = new C0YNC(-1, -1, -1, -1);
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YNC)) {
            return false;
        }
        C0YNC c0ync = (C0YNC) obj;
        return this.LIZ == c0ync.LIZ && this.LIZIZ == c0ync.LIZIZ && this.LIZJ == c0ync.LIZJ && this.LIZLLL == c0ync.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageInConvRange(minIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minRegion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maxRegion=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YNC(long j, long j2, long j3, long j4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = j4;
    }
}
