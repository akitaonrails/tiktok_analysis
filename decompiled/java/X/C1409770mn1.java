package X;

/* JADX INFO: renamed from: X.0mn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409770mn1 extends AbstractC1409800mn4 {
    public final boolean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409770mn1)) {
            return false;
        }
        C1409770mn1 c1409770mn1 = (C1409770mn1) obj;
        return this.LIZ == c1409770mn1.LIZ && this.LIZIZ == c1409770mn1.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorPage(showRetryButton=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataSentinel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1409770mn1(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = z;
        this.LIZIZ = jCurrentTimeMillis;
    }
}
