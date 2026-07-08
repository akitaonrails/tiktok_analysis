package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556720qc2 implements InterfaceC0148002o {
    public final C1755990vnR LL;

    public C1556720qc2() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556720qc2) && Intrinsics.LJFF(this.LL, ((C1556720qc2) obj).LL);
    }

    public final int hashCode() {
        C1755990vnR c1755990vnR = this.LL;
        if (c1755990vnR == null) {
            return 0;
        }
        return c1755990vnR.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselSparkCellState(containerData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556720qc2(C1755990vnR c1755990vnR) {
        this.LL = c1755990vnR;
    }
}
