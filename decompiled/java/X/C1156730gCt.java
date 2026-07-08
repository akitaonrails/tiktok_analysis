package X;

/* JADX INFO: renamed from: X.0gCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156730gCt extends AbstractC1156680gCo {
    public final long LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156730gCt)) {
            return false;
        }
        C1156730gCt c1156730gCt = (C1156730gCt) obj;
        return this.LIZ == c1156730gCt.LIZ && this.LIZIZ == c1156730gCt.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DrawEnd(drawEndTimestamp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFirstBind=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156730gCt(long j, boolean z) {
        this.LIZ = j;
        this.LIZIZ = z;
    }
}
