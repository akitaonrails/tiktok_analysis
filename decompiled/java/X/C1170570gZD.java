package X;

import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gZD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170570gZD implements InterfaceC0148002o {
    public final AbstractC1623806Xk<CollectionDetail> LL;
    public final AbstractC1623806Xk<C291001Au<List<C1171050gZz>>> LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final boolean LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1170570gZD() {
        this(null, 0L, false, 0 == true ? 1 : 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1170570gZD)) {
            return false;
        }
        C1170570gZD c1170570gZD = (C1170570gZD) obj;
        return Intrinsics.LJFF(this.LL, c1170570gZD.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1170570gZD.LLILLJJLI) && this.LLILLL == c1170570gZD.LLILLL && this.LLILZ == c1170570gZD.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1170570gZD.LLILZIL) && this.LLILZLL == c1170570gZD.LLILZLL;
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCollectionContentState(detail=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", fetchBannerData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showBannerUi=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1170570gZD(C1623606Xi c1623606Xi, long j, boolean z, C291001Au c291001Au, int i) {
        C491101vh c491101vh;
        C291001Au c291001Au2 = c291001Au;
        boolean z2 = z;
        long j2 = j;
        AbstractC1623806Xk abstractC1623806Xk = c1623606Xi;
        if ((i & 1) != 0) {
            c491101vh = C491101vh.LIZ;
        } else {
            c491101vh = null;
        }
        this(c491101vh, (i & 2) != 0 ? C491101vh.LIZ : abstractC1623806Xk, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? new C291001Au(Boolean.FALSE) : c291001Au2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1170570gZD(AbstractC1623806Xk<CollectionDetail> abstractC1623806Xk, AbstractC1623806Xk<? extends C291001Au<? extends List<C1171050gZz>>> abstractC1623806Xk2, long j, boolean z, C291001Au<Boolean> c291001Au, boolean z2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = c291001Au;
        this.LLILZLL = z2;
    }

    public static C1170570gZD LIZ(C1170570gZD c1170570gZD, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, boolean z, C291001Au c291001Au, boolean z2, int i) {
        long j;
        boolean z3 = z2;
        C291001Au c291001Au2 = c291001Au;
        boolean z4 = z;
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk4 = c1170570gZD.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk3 = c1170570gZD.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            j = c1170570gZD.LLILLL;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            z4 = c1170570gZD.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c1170570gZD.LLILZIL;
        }
        if ((i & 32) != 0) {
            z3 = c1170570gZD.LLILZLL;
        }
        c1170570gZD.getClass();
        return new C1170570gZD(abstractC1623806Xk4, abstractC1623806Xk3, j, z4, c291001Au2, z3);
    }
}
