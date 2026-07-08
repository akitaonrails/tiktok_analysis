package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776840wL4 {
    public static final C1776840wL4 LJ = new C1776840wL4(null, 15);
    public final AbstractC1776820wL2 LIZ;
    public final AbstractC1776860wL6 LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;

    public C1776840wL4() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1776840wL4)) {
            return false;
        }
        C1776840wL4 c1776840wL4 = (C1776840wL4) obj;
        return Intrinsics.LJFF(this.LIZ, c1776840wL4.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1776840wL4.LIZIZ) && this.LIZJ == c1776840wL4.LIZJ && Float.compare(this.LIZLLL, c1776840wL4.LIZLLL) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SheetConfig(sizeMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", gestureEnabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", roundRadius=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        new C1776840wL4(new C1776810wL1(0.8f), 14);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1776840wL4(C1776810wL1 c1776810wL1, int i) {
        C1776850wL5 c1776850wL5;
        boolean z;
        AbstractC1776820wL2 abstractC1776820wL2 = (i & 1) != 0 ? C1776830wL3.LIZ : c1776810wL1;
        if ((i & 2) != 0) {
            c1776850wL5 = C1776850wL5.LIZ;
        } else {
            c1776850wL5 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(abstractC1776820wL2, c1776850wL5, z, 0.0f);
    }

    public C1776840wL4(AbstractC1776820wL2 abstractC1776820wL2, AbstractC1776860wL6 abstractC1776860wL6, boolean z, float f) {
        this.LIZ = abstractC1776820wL2;
        this.LIZIZ = abstractC1776860wL6;
        this.LIZJ = z;
        this.LIZLLL = f;
    }
}
