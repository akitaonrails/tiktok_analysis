package X;

/* JADX INFO: renamed from: X.0mmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409730mmx extends AbstractC1409710mmv {
    public final boolean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409730mmx)) {
            return false;
        }
        C1409730mmx c1409730mmx = (C1409730mmx) obj;
        return this.LIZ == c1409730mmx.LIZ && this.LIZIZ == c1409730mmx.LIZIZ;
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

    public C1409730mmx() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = true;
        this.LIZIZ = jCurrentTimeMillis;
    }
}
