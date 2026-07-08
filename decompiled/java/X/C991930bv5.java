package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991930bv5 {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991930bv5)) {
            return false;
        }
        C991930bv5 c991930bv5 = (C991930bv5) obj;
        return this.LIZ == c991930bv5.LIZ && this.LIZIZ == c991930bv5.LIZIZ && Intrinsics.LJFF(this.LIZJ, c991930bv5.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItalicsSpanPart(start=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", italicsText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991930bv5(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
