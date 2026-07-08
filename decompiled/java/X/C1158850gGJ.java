package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158850gGJ implements InterfaceC0148002o {
    public final boolean LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final List<Integer> LLILLL;
    public final String LLILZ;

    public C1158850gGJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158850gGJ)) {
            return false;
        }
        C1158850gGJ c1158850gGJ = (C1158850gGJ) obj;
        return this.LL == c1158850gGJ.LL && Intrinsics.LJFF(this.LLILLJJLI, c1158850gGJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158850gGJ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1158850gGJ.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        List<Integer> list = this.LLILLL;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LLILZ;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileLinksOrderState(statusViewChangeVisibility=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", updateSuccess=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", resetOrder=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toastMsg=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158850gGJ(int i) {
        this(false, null, null, null);
    }

    public C1158850gGJ(boolean z, C291001Au<Boolean> c291001Au, List<Integer> list, String str) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = list;
        this.LLILZ = str;
    }

    public static C1158850gGJ LIZ(C1158850gGJ c1158850gGJ, boolean z, C291001Au c291001Au, List list, String str, int i) {
        if ((i & 1) != 0) {
            z = c1158850gGJ.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1158850gGJ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list = c1158850gGJ.LLILLL;
        }
        if ((i & 8) != 0) {
            str = c1158850gGJ.LLILZ;
        }
        c1158850gGJ.getClass();
        return new C1158850gGJ(z, c291001Au, list, str);
    }
}
