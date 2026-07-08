package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ggG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174940ggG implements InterfaceC0148002o {
    public final List<C1174910ggD> LL;
    public final List<C1174920ggE> LLILLJJLI;
    public final Integer LLILLL;
    public final Integer LLILZ;
    public final boolean LLILZIL;

    public C1174940ggG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174940ggG)) {
            return false;
        }
        C1174940ggG c1174940ggG = (C1174940ggG) obj;
        return Intrinsics.LJFF(this.LL, c1174940ggG.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1174940ggG.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1174940ggG.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1174940ggG.LLILZ) && this.LLILZIL == c1174940ggG.LLILZIL;
    }

    public final int hashCode() {
        List<C1174910ggD> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<C1174920ggE> list2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLILZ;
        return ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModeFilterState(landmarkList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", distanceList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", landmarkScrollPosition=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", distanceScrollPosition=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showErrorPage=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1174940ggG(int i) {
        this(false, null, null, null, null);
    }

    public static C1174940ggG LIZ(C1174940ggG c1174940ggG, List list, List list2, boolean z) {
        Integer num = c1174940ggG.LLILLL;
        Integer num2 = c1174940ggG.LLILZ;
        c1174940ggG.getClass();
        return new C1174940ggG(z, list, list2, num, num2);
    }

    public C1174940ggG(boolean z, List list, List list2, Integer num, Integer num2) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = num;
        this.LLILZ = num2;
        this.LLILZIL = z;
    }
}
