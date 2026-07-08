package X;

/* JADX INFO: renamed from: X.0qky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562260qky extends AbstractC1562180qkq {
    public final double LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1562260qky) && Double.compare(this.LIZIZ, ((C1562260qky) obj).LIZIZ) == 0;
    }

    public final int hashCode() {
        return C786410Ut5.X2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ListFpsPerformanceParams(fps=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1562260qky(double d) {
        this.LIZIZ = d;
    }
}
