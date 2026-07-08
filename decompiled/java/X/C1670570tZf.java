package X;

/* JADX INFO: renamed from: X.0tZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670570tZf {
    public final long LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1670570tZf)) {
            return false;
        }
        C1670570tZf c1670570tZf = (C1670570tZf) obj;
        return C1680770tq7.LIZ(this.LIZ, c1670570tZf.LIZ) && this.LIZIZ == c1670570tZf.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageOptions(resizeOptions=");
        sbLIZ.append((Object) C1680770tq7.LJFF(this.LIZ));
        sbLIZ.append(", roundAsCircle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public C1670570tZf(long j, boolean z) {
        this.LIZ = j;
        this.LIZIZ = z;
    }
}
