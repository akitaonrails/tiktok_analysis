package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1868407Tm {
    public final C1683130ttv LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868407Tm)) {
            return false;
        }
        C1868407Tm c1868407Tm = (C1868407Tm) obj;
        return Intrinsics.LJFF(this.LIZ, c1868407Tm.LIZ) && Float.compare(this.LIZIZ, c1868407Tm.LIZIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentRect(rect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C1868407Tm(C1683130ttv c1683130ttv, float f) {
        this.LIZ = c1683130ttv;
        this.LIZIZ = f;
    }
}
