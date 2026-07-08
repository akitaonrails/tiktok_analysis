package X;

/* JADX INFO: renamed from: X.0OxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636170OxL extends AbstractC636210OxP {
    public final boolean LIZ;
    public final boolean LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C636170OxL() {
        boolean z = false;
        this(z, z, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C636170OxL)) {
            return false;
        }
        C636170OxL c636170OxL = (C636170OxL) obj;
        return this.LIZ == c636170OxL.LIZ && this.LIZIZ == c636170OxL.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(nextHasMore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", prevHasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C636170OxL(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public /* synthetic */ C636170OxL(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
