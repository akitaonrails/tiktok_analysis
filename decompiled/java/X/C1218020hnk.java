package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218020hnk implements InterfaceC0148002o {
    public final List<C1218270ho9> LL;
    public final C291001Au<String> LLILLJJLI;
    public final C291001Au<String> LLILLL;
    public final C291001Au<String> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218020hnk)) {
            return false;
        }
        C1218020hnk c1218020hnk = (C1218020hnk) obj;
        return Intrinsics.LJFF(this.LL, c1218020hnk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218020hnk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1218020hnk.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1218020hnk.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageAdminState(adminList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", removeOtherSuccessEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", failureToast=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", removeSelfSuccessEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1218020hnk(List<C1218270ho9> list, C291001Au<String> c291001Au, C291001Au<String> c291001Au2, C291001Au<String> c291001Au3) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
    }

    public static C1218020hnk LIZ(C1218020hnk c1218020hnk, List list, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        if ((i & 1) != 0) {
            list = c1218020hnk.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1218020hnk.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1218020hnk.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au3 = c1218020hnk.LLILZ;
        }
        c1218020hnk.getClass();
        return new C1218020hnk(list, c291001Au, c291001Au2, c291001Au3);
    }
}
