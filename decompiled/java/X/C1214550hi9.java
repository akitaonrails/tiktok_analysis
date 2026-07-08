package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hi9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214550hi9 implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1214550hi9)) {
            return false;
        }
        C1214550hi9 c1214550hi9 = (C1214550hi9) obj;
        return Intrinsics.LJFF(this.LL, c1214550hi9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1214550hi9.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBottomEntranceState(hintText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", recommendText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1214550hi9(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
