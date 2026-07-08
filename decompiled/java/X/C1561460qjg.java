package X;

/* JADX INFO: renamed from: X.0qjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561460qjg {
    public final long LIZ;

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        long j = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GridItemSpan(packedValue=");
        sbLIZ.append(j);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1561460qjg(long j) {
        this.LIZ = j;
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1561460qjg) || j != ((C1561460qjg) obj).LIZ) {
            return false;
        }
        return true;
    }
}
