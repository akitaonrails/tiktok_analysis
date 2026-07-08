package X;

/* JADX INFO: renamed from: X.00I0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00I0 {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00I0) && this.LIZ == ((C00I0) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Running(startElapsedMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00I0(long j) {
        this.LIZ = j;
    }
}
