package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697100RWa implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C697100RWa)) {
            return false;
        }
        C697100RWa c697100RWa = (C697100RWa) obj;
        return Intrinsics.LJFF(this.LL, c697100RWa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c697100RWa.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvoidUpvoteState(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isRecTag=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C697100RWa(C291001Au c291001Au, String str) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
    }
}
