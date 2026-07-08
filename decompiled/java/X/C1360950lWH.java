package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360950lWH extends AbstractC1360960lWI {
    public final EnumC1355300lNA LIZ;
    public final C1360910lWD LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1360950lWH)) {
            return false;
        }
        C1360950lWH c1360950lWH = (C1360950lWH) obj;
        return this.LIZ == c1360950lWH.LIZ && Intrinsics.LJFF(this.LIZIZ, c1360950lWH.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Preemptable(owner=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", policy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1360960lWI
    public final EnumC1355300lNA LIZ() {
        return this.LIZ;
    }

    public C1360950lWH(EnumC1355300lNA enumC1355300lNA, C1360910lWD c1360910lWD) {
        this.LIZ = enumC1355300lNA;
        this.LIZIZ = c1360910lWD;
    }
}
