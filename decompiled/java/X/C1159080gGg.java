package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159080gGg implements InterfaceC0148002o {
    public final Map<Long, C1576640r8A> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C1159080gGg() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159080gGg)) {
            return false;
        }
        C1159080gGg c1159080gGg = (C1159080gGg) obj;
        return Intrinsics.LJFF(this.LL, c1159080gGg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159080gGg.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159080gGg.LLILLL);
    }

    public final int hashCode() {
        Map<Long, C1576640r8A> map = this.LL;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        return iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesPurchaseSummaryState(pricesWithCurrency=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dismissSummarySheetEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", changePurchaseButtonLoadingStatusEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1159080gGg(Map<Long, C1576640r8A> map, C291001Au<Unit> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = map;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }

    public static C1159080gGg LIZ(C1159080gGg c1159080gGg, Map map, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            map = c1159080gGg.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1159080gGg.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1159080gGg.LLILLL;
        }
        c1159080gGg.getClass();
        return new C1159080gGg(map, c291001Au, c291001Au2);
    }
}
