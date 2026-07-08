package X;

/* JADX INFO: renamed from: X.0NrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606940NrI {
    public final long LIZ;
    public final boolean LIZIZ;

    public C606940NrI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C606940NrI)) {
            return false;
        }
        C606940NrI c606940NrI = (C606940NrI) obj;
        return this.LIZ == c606940NrI.LIZ && this.LIZIZ == c606940NrI.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfflinePollState(version=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inFlight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C606940NrI(int i) {
        this(0L, false);
    }

    public C606940NrI(long j, boolean z) {
        this.LIZ = j;
        this.LIZIZ = z;
    }
}
