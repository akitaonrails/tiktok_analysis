package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.030z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7751030z {
    public final AbstractC723102s1 LIZ;
    public final AnonymousClass0376 LIZIZ;
    public final AnonymousClass0376 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7751030z)) {
            return false;
        }
        C7751030z c7751030z = (C7751030z) obj;
        return Intrinsics.LJFF(this.LIZ, c7751030z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c7751030z.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c7751030z.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressTransformResult(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", addressVO=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stateAddressVO=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7751030z(AbstractC723102s1 abstractC723102s1, AnonymousClass0376 anonymousClass0376, AnonymousClass0376 anonymousClass03762) {
        this.LIZ = abstractC723102s1;
        this.LIZIZ = anonymousClass0376;
        this.LIZJ = anonymousClass03762;
    }
}
