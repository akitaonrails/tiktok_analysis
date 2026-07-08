package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07dx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1909907dx {
    public final String LIZ;
    public double LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1909907dx)) {
            return false;
        }
        C1909907dx c1909907dx = (C1909907dx) obj;
        return Intrinsics.LJFF(this.LIZ, c1909907dx.LIZ) && Double.compare(this.LIZIZ, c1909907dx.LIZIZ) == 0;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.X2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomModel(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1909907dx(String str, double d) {
        this.LIZ = str;
        this.LIZIZ = d;
    }
}
