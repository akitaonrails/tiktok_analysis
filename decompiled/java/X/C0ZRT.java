package X;

/* JADX INFO: renamed from: X.0ZRT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRT {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZRT)) {
            return false;
        }
        C0ZRT c0zrt = (C0ZRT) obj;
        return this.LIZ == c0zrt.LIZ && this.LIZIZ == c0zrt.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NudeFilterDiff(isNudityMask=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isNude=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZRT(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
