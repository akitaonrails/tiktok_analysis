package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O4V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O4V<PO> extends C0O4U<PO> {
    public final String LIZJ;
    public final PO LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O4V)) {
            return false;
        }
        C0O4V c0o4v = (C0O4V) obj;
        return Intrinsics.LJFF(this.LIZJ, c0o4v.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0o4v.LIZLLL) && this.LJ == c0o4v.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZJ.hashCode() * 31;
        PO po = this.LIZLLL;
        return ((iHashCode + (po == null ? 0 : po.hashCode())) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultCacheEntry(key=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", v=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", updateTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0O4V(String str, PO po, long j) {
        super(po, j);
        this.LIZJ = str;
        this.LIZLLL = po;
        this.LJ = j;
    }
}
