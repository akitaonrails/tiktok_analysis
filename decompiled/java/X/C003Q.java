package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.003Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C003Q {
    public final C003P LIZ;
    public final C003P LIZIZ;
    public final C003P LIZJ;

    public C003Q() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C003Q)) {
            return false;
        }
        C003Q c003q = (C003Q) obj;
        return Intrinsics.LJFF(this.LIZ, c003q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c003q.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c003q.LIZJ);
    }

    public final int hashCode() {
        C003P c003p = this.LIZ;
        int iHashCode = (c003p == null ? 0 : c003p.hashCode()) * 31;
        C003P c003p2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c003p2 == null ? 0 : c003p2.hashCode())) * 31;
        C003P c003p3 = this.LIZJ;
        return iHashCode2 + (c003p3 != null ? c003p3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetLocation(town=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", city=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", country=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C003Q(C003P c003p, C003P c003p2, C003P c003p3) {
        this.LIZ = c003p;
        this.LIZIZ = c003p2;
        this.LIZJ = c003p3;
    }
}
