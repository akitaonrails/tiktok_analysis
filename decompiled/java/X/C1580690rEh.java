package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580690rEh implements InterfaceC0148002o {
    public final C1580720rEk LL;
    public final C1580610rEZ LLILLJJLI;
    public final C1580600rEY LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1580690rEh)) {
            return false;
        }
        C1580690rEh c1580690rEh = (C1580690rEh) obj;
        return Intrinsics.LJFF(this.LL, c1580690rEh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1580690rEh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1580690rEh.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1580610rEZ c1580610rEZ = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1580610rEZ == null ? 0 : c1580610rEZ.hashCode())) * 31;
        C1580600rEY c1580600rEY = this.LLILLL;
        return iHashCode2 + (c1580600rEY != null ? c1580600rEY.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SideBarListState(action=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", containerConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1580690rEh(C1580720rEk c1580720rEk, C1580610rEZ c1580610rEZ, C1580600rEY c1580600rEY) {
        this.LL = c1580720rEk;
        this.LLILLJJLI = c1580610rEZ;
        this.LLILLL = c1580600rEY;
    }
}
