package X;

/* JADX INFO: renamed from: X.0fPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125970fPH extends AbstractC1125980fPI {
    public final boolean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1125970fPH)) {
            return false;
        }
        C1125970fPH c1125970fPH = (C1125970fPH) obj;
        return this.LIZ == c1125970fPH.LIZ && this.LIZIZ == c1125970fPH.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckImageInCacheResult(inCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", id=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1125970fPH(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
