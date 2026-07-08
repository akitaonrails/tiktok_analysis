package X;

/* JADX INFO: renamed from: X.0toa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679820toa {
    public final long LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        return (C1685910tyP.LJIIJ(this.LIZ) * 31) + C1685910tyP.LJIIJ(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectionColors(selectionHandleColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZ));
        sbLIZ.append(", selectionBackgroundColor=");
        sbLIZ.append((Object) C1685910tyP.LJIIJJI(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1679820toa)) {
            return false;
        }
        C1679820toa c1679820toa = (C1679820toa) obj;
        if (C1685910tyP.LJ(this.LIZ, c1679820toa.LIZ) && C1685910tyP.LJ(this.LIZIZ, c1679820toa.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1679820toa(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
