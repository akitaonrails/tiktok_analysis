package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141790fon {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final Integer LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1141790fon)) {
            return false;
        }
        C1141790fon c1141790fon = (C1141790fon) obj;
        return this.LIZ == c1141790fon.LIZ && Intrinsics.LJFF(this.LIZIZ, c1141790fon.LIZIZ) && this.LIZJ == c1141790fon.LIZJ && Float.compare(this.LIZLLL, c1141790fon.LIZLLL) == 0 && Intrinsics.LJFF(this.LJ, c1141790fon.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpanParams(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", paddingWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31;
        Integer num = this.LJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public C1141790fon(int i, String str, Integer num) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        float fLIZIZ = C418440Gaw.LIZIZ(4);
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = iLIZIZ;
        this.LIZLLL = fLIZIZ;
        this.LJ = num;
    }
}
