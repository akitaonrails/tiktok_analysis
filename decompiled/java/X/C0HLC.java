package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HLC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLC {
    public final boolean LIZ;
    public final InterfaceC439650HLv LIZIZ;
    public final C0HM3 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HLC)) {
            return false;
        }
        C0HLC c0hlc = (C0HLC) obj;
        return this.LIZ == c0hlc.LIZ && Intrinsics.LJFF(this.LIZIZ, c0hlc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0hlc.LIZJ);
    }

    public C0HLC(boolean z, InterfaceC439650HLv interfaceC439650HLv, C0HM3 c0hm3) {
        this.LIZ = z;
        this.LIZIZ = interfaceC439650HLv;
        this.LIZJ = c0hm3;
    }

    public static C0HLC LIZ(C0HLC c0hlc, boolean z, InterfaceC439650HLv interfaceC439650HLv, C0HM3 c0hm3, int i) {
        if ((i & 1) != 0) {
            z = c0hlc.LIZ;
        }
        if ((i & 2) != 0) {
            interfaceC439650HLv = c0hlc.LIZIZ;
        }
        if ((i & 4) != 0) {
            c0hm3 = c0hlc.LIZJ;
        }
        c0hlc.getClass();
        return new C0HLC(z, interfaceC439650HLv, c0hm3);
    }
}
