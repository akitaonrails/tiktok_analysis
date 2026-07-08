package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ujQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715060ujQ {
    public final C1715110ujV<Boolean> LIZ;
    public final C1715110ujV<C1715230ujh> LIZIZ;
    public final C1715110ujV<C1715260ujk> LIZJ;
    public final C1715110ujV<Boolean> LIZLLL;
    public final boolean LJ;
    public final InterfaceC1715120ujW LJFF;

    public C1715060ujQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1715060ujQ)) {
            return false;
        }
        C1715060ujQ c1715060ujQ = (C1715060ujQ) obj;
        return Intrinsics.LJFF(this.LIZ, c1715060ujQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1715060ujQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1715060ujQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1715060ujQ.LIZLLL) && this.LJ == c1715060ujQ.LJ && Intrinsics.LJFF(this.LJFF, c1715060ujQ.LJFF);
    }

    public /* synthetic */ C1715060ujQ(int i) {
        this(new C1715110ujV(null), new C1715110ujV(null), new C1715110ujV(null), new C1715110ujV(null), false, null);
    }

    public C1715060ujQ(C1715110ujV<Boolean> c1715110ujV, C1715110ujV<C1715230ujh> c1715110ujV2, C1715110ujV<C1715260ujk> c1715110ujV3, C1715110ujV<Boolean> c1715110ujV4, boolean z, InterfaceC1715120ujW interfaceC1715120ujW) {
        this.LIZ = c1715110ujV;
        this.LIZIZ = c1715110ujV2;
        this.LIZJ = c1715110ujV3;
        this.LIZLLL = c1715110ujV4;
        this.LJ = z;
        this.LJFF = interfaceC1715120ujW;
    }

    public static C1715060ujQ LIZ(C1715060ujQ c1715060ujQ, C1715110ujV c1715110ujV, C1715110ujV c1715110ujV2, C1715110ujV c1715110ujV3, C1715110ujV c1715110ujV4, boolean z, InterfaceC1715120ujW interfaceC1715120ujW, int i) {
        InterfaceC1715120ujW interfaceC1715120ujW2 = interfaceC1715120ujW;
        boolean z2 = z;
        C1715110ujV c1715110ujV5 = c1715110ujV4;
        C1715110ujV c1715110ujV6 = c1715110ujV3;
        C1715110ujV c1715110ujV7 = c1715110ujV2;
        C1715110ujV c1715110ujV8 = c1715110ujV;
        if ((i & 1) != 0) {
            c1715110ujV8 = c1715060ujQ.LIZ;
        }
        if ((i & 2) != 0) {
            c1715110ujV7 = c1715060ujQ.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1715110ujV6 = c1715060ujQ.LIZJ;
        }
        if ((i & 8) != 0) {
            c1715110ujV5 = c1715060ujQ.LIZLLL;
        }
        if ((i & 16) != 0) {
            z2 = c1715060ujQ.LJ;
        }
        if ((i & 32) != 0) {
            interfaceC1715120ujW2 = c1715060ujQ.LJFF;
        }
        c1715060ujQ.getClass();
        return new C1715060ujQ(c1715110ujV8, c1715110ujV7, c1715110ujV6, c1715110ujV5, z2, interfaceC1715120ujW2);
    }
}
