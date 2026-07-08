package X;

/* JADX INFO: renamed from: X.0VYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799540VYa {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C799540VYa() {
        this(false, false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C799540VYa)) {
            return false;
        }
        C799540VYa c799540VYa = (C799540VYa) obj;
        return this.LIZ == c799540VYa.LIZ && this.LIZIZ == c799540VYa.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + (this.LIZIZ ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WebViewMonitorReportOptions(isSparkThird=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isChromeCustomTab=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C799540VYa(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
