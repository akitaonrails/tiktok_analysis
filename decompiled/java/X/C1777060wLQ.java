package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777060wLQ {
    public final float LIZ;
    public final AbstractC1811540xF2 LIZIZ;
    public final C1777070wLR LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777060wLQ)) {
            return false;
        }
        C1777060wLQ c1777060wLQ = (C1777060wLQ) obj;
        return Float.compare(this.LIZ, c1777060wLQ.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c1777060wLQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777060wLQ.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Params(marginDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dimens=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public C1777060wLQ(float f, AbstractC1811540xF2 abstractC1811540xF2, C1777070wLR c1777070wLR) {
        this.LIZ = f;
        this.LIZIZ = abstractC1811540xF2;
        this.LIZJ = c1777070wLR;
    }
}
