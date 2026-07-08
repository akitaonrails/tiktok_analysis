package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DCA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DCA {
    public final C0DCR LIZ;
    public final C0DCQ LIZIZ;
    public final C0DCS LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DCA)) {
            return false;
        }
        C0DCA c0dca = (C0DCA) obj;
        return Intrinsics.LJFF(this.LIZ, c0dca.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0dca.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0dca.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneStepInfoCardState(delivery=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", address=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", total=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DCA(C0DCR c0dcr, C0DCQ c0dcq, C0DCS c0dcs) {
        this.LIZ = c0dcr;
        this.LIZIZ = c0dcq;
        this.LIZJ = c0dcs;
    }
}
