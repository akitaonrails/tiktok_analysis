package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HRK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HRK implements InterfaceC0148002o {
    public final Set<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>> LL;
    public final Integer LLILLJJLI;
    public final int LLILLL;
    public final List<C0HQC> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HRK)) {
            return false;
        }
        C0HRK c0hrk = (C0HRK) obj;
        return Intrinsics.LJFF(this.LL, c0hrk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hrk.LLILLJJLI) && this.LLILLL == c0hrk.LLILLL && Intrinsics.LJFF(this.LLILZ, c0hrk.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Integer num = this.LLILLJJLI;
        return ((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioIdDropdownState(selectedIds=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectionError=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedTab=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", idConfigurations=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0HRK(Set<? extends C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>>> set, Integer num, int i, List<C0HQC> list) {
        this.LL = set;
        this.LLILLJJLI = num;
        this.LLILLL = i;
        this.LLILZ = list;
    }

    public static C0HRK LIZ(C0HRK c0hrk, Set set, Integer num, int i, int i2) {
        List<C0HQC> list;
        if ((i2 & 1) != 0) {
            set = c0hrk.LL;
        }
        if ((i2 & 2) != 0) {
            num = c0hrk.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i = c0hrk.LLILLL;
        }
        if ((i2 & 8) != 0) {
            list = c0hrk.LLILZ;
        } else {
            list = null;
        }
        c0hrk.getClass();
        return new C0HRK(set, num, i, list);
    }
}
