package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715206ne implements InterfaceC0148002o {
    public final C291001Au<C1715806nk> LL;
    public final C291001Au<C1715606ni> LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1715206ne)) {
            return false;
        }
        C1715206ne c1715206ne = (C1715206ne) obj;
        return Intrinsics.LJFF(this.LL, c1715206ne.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1715206ne.LLILLJJLI) && this.LLILLL == c1715206ne.LLILLL;
    }

    public final int hashCode() {
        C291001Au<C1715806nk> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<C1715606ni> c291001Au2 = this.LLILLJJLI;
        return ((iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatRoomAlphaVideoVMState(playVideoEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cancelPlayVideoEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1715206ne(C291001Au<C1715806nk> c291001Au, C291001Au<C1715606ni> c291001Au2, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = z;
    }

    public static C1715206ne LIZ(C1715206ne c1715206ne, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        boolean z;
        if ((i & 1) != 0) {
            c291001Au = c1715206ne.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1715206ne.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1715206ne.LLILLL;
        } else {
            z = false;
        }
        c1715206ne.getClass();
        return new C1715206ne(c291001Au, c291001Au2, z);
    }
}
