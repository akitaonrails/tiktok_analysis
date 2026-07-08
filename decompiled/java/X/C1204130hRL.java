package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hRL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204130hRL implements InterfaceC0148002o {
    public final AbstractC1204360hRi<C1204080hRG> LL;
    public final C1193740hAa LLILLJJLI;
    public final C1203960hR4 LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<C1158190gFF> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;

    public C1204130hRL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1204130hRL)) {
            return false;
        }
        C1204130hRL c1204130hRL = (C1204130hRL) obj;
        return Intrinsics.LJFF(this.LL, c1204130hRL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1204130hRL.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1204130hRL.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1204130hRL.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1204130hRL.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1204130hRL.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1193740hAa c1193740hAa = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1193740hAa == null ? 0 : c1193740hAa.hashCode())) * 31;
        C1203960hR4 c1203960hR4 = this.LLILLL;
        return ((((((iHashCode2 + (c1203960hR4 != null ? c1203960hR4.hashCode() : 0)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyState(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", prfNetworkData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageLoadTracker=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", refreshItemDecoration=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", chunkPatch=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", chunkEnd=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1204130hRL(int i) {
        C1204390hRl c1204390hRl = C1204390hRl.LIZ;
        Boolean bool = Boolean.FALSE;
        this(c1204390hRl, null, null, new C291001Au(bool), new C291001Au(new C1158190gFF((List) null, false, 7)), new C291001Au(bool));
    }

    public C1204130hRL(AbstractC1204360hRi<C1204080hRG> abstractC1204360hRi, C1193740hAa c1193740hAa, C1203960hR4 c1203960hR4, C291001Au<Boolean> c291001Au, C291001Au<C1158190gFF> c291001Au2, C291001Au<Boolean> c291001Au3) {
        this.LL = abstractC1204360hRi;
        this.LLILLJJLI = c1193740hAa;
        this.LLILLL = c1203960hR4;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = c291001Au3;
    }

    public static C1204130hRL LIZ(C1204130hRL c1204130hRL, AbstractC1204360hRi abstractC1204360hRi, C1193740hAa c1193740hAa, C1203960hR4 c1203960hR4, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        C1203960hR4 c1203960hR42 = c1203960hR4;
        C1193740hAa c1193740hAa2 = c1193740hAa;
        AbstractC1204360hRi abstractC1204360hRi2 = abstractC1204360hRi;
        if ((i & 1) != 0) {
            abstractC1204360hRi2 = c1204130hRL.LL;
        }
        if ((i & 2) != 0) {
            c1193740hAa2 = c1204130hRL.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1203960hR42 = c1204130hRL.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c1204130hRL.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au5 = c1204130hRL.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au4 = c1204130hRL.LLILZLL;
        }
        c1204130hRL.getClass();
        return new C1204130hRL(abstractC1204360hRi2, c1193740hAa2, c1203960hR42, c291001Au6, c291001Au5, c291001Au4);
    }
}
