package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gHC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159400gHC implements InterfaceC0148002o {
    public final C291001Au<C1581340rFk> LL;
    public final boolean LLILLJJLI;

    public C1159400gHC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159400gHC)) {
            return false;
        }
        C1159400gHC c1159400gHC = (C1159400gHC) obj;
        return Intrinsics.LJFF(this.LL, c1159400gHC.LL) && this.LLILLJJLI == c1159400gHC.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightBridgeVMState(skylightStatusEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", friendsPageSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159400gHC(int i) {
        this(new C291001Au(new C1581340rFk(true, "", null)), true);
    }

    public C1159400gHC(C291001Au<C1581340rFk> c291001Au, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
    }

    public static C1159400gHC LIZ(C1159400gHC c1159400gHC, C291001Au c291001Au, boolean z, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1159400gHC.LL;
        }
        if ((i & 2) != 0) {
            z = c1159400gHC.LLILLJJLI;
        }
        c1159400gHC.getClass();
        return new C1159400gHC(c291001Au, z);
    }
}
