package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630870Oon implements InterfaceC0148002o {
    public final boolean LL;
    public final Boolean LLILLJJLI;
    public final boolean LLILLL;

    public C630870Oon() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C630870Oon)) {
            return false;
        }
        C630870Oon c630870Oon = (C630870Oon) obj;
        return this.LL == c630870Oon.LL && Intrinsics.LJFF(this.LLILLJJLI, c630870Oon.LLILLJJLI) && this.LLILLL == c630870Oon.LLILLL;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        Boolean bool = this.LLILLJJLI;
        return ((iZ2 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDraftState(show=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasRegister=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needUpdate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C630870Oon(int i) {
        this(false, null, false);
    }

    public C630870Oon(boolean z, Boolean bool, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = bool;
        this.LLILLL = z2;
    }

    public static C630870Oon LIZ(C630870Oon c630870Oon, boolean z, Boolean bool, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c630870Oon.LL;
        }
        if ((i & 2) != 0) {
            bool = c630870Oon.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c630870Oon.LLILLL;
        }
        c630870Oon.getClass();
        return new C630870Oon(z, bool, z2);
    }
}
