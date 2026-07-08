package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335130DBv extends AbstractC335160DBy {
    public final AbstractC334660DAa LIZ;
    public final C0DAO LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C335130DBv)) {
            return false;
        }
        C335130DBv c335130DBv = (C335130DBv) obj;
        return Intrinsics.LJFF(this.LIZ, c335130DBv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c335130DBv.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingAddress(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageFlowState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335130DBv(AbstractC334660DAa abstractC334660DAa, C0DAO c0dao) {
        this.LIZ = abstractC334660DAa;
        this.LIZIZ = c0dao;
    }
}
