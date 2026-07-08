package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xF1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811530xF1 extends AbstractC1811580xF6 {
    public final C1811680xFG LIZ;
    public final C1778110wN7 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811530xF1)) {
            return false;
        }
        C1811530xF1 c1811530xF1 = (C1811530xF1) obj;
        return Intrinsics.LJFF(this.LIZ, c1811530xF1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1811530xF1.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Normal(topology=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1811530xF1(C1811680xFG c1811680xFG, C1778110wN7 c1778110wN7) {
        this.LIZ = c1811680xFG;
        this.LIZIZ = c1778110wN7;
    }
}
