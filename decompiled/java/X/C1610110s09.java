package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s09, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610110s09 implements InterfaceC0148002o {
    public final EnumC21697819vs LL;
    public final boolean LLILLJJLI;
    public final Boolean LLILLL;

    public C1610110s09() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1610110s09)) {
            return false;
        }
        C1610110s09 c1610110s09 = (C1610110s09) obj;
        return this.LL == c1610110s09.LL && this.LLILLJJLI == c1610110s09.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1610110s09.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        Boolean bool = this.LLILLL;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCellState(roomStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shouldShowStaticCard=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isInLinkMicBeforePause=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1610110s09(int i) {
        this(EnumC21697819vs.NORMAL, false, null);
    }

    public C1610110s09(EnumC21697819vs enumC21697819vs, boolean z, Boolean bool) {
        this.LL = enumC21697819vs;
        this.LLILLJJLI = z;
        this.LLILLL = bool;
    }

    public static C1610110s09 LIZ(C1610110s09 c1610110s09, EnumC21697819vs enumC21697819vs, boolean z, Boolean bool, int i) {
        if ((i & 1) != 0) {
            enumC21697819vs = c1610110s09.LL;
        }
        if ((i & 2) != 0) {
            z = c1610110s09.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            bool = c1610110s09.LLILLL;
        }
        c1610110s09.getClass();
        return new C1610110s09(enumC21697819vs, z, bool);
    }
}
