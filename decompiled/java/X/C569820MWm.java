package X;

import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.theater.common.AITheaterCameoImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569820MWm {
    public final InterfaceC549230LgP LIZ;
    public final List<PortraitStyleItem> LIZIZ;
    public final InterfaceC1665500tRU<PortraitStyleItem> LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Integer LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C569820MWm)) {
            return false;
        }
        C569820MWm c569820MWm = (C569820MWm) obj;
        return Intrinsics.LJFF(this.LIZ, c569820MWm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c569820MWm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c569820MWm.LIZJ) && this.LIZLLL == c569820MWm.LIZLLL && this.LJ == c569820MWm.LJ && this.LJFF == c569820MWm.LJFF && Intrinsics.LJFF(this.LJI, c569820MWm.LJI) && this.LJII == c569820MWm.LJII;
    }

    public final int hashCode() {
        InterfaceC549230LgP interfaceC549230LgP = this.LIZ;
        int iHashCode = (interfaceC549230LgP == null ? 0 : interfaceC549230LgP.hashCode()) * 31;
        List<PortraitStyleItem> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        InterfaceC1665500tRU<PortraitStyleItem> interfaceC1665500tRU = this.LIZJ;
        int iHashCode3 = (((((((iHashCode2 + (interfaceC1665500tRU == null ? 0 : interfaceC1665500tRU.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        Integer num = this.LJI;
        return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitTabPageState(cameoState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", styleList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", carouselList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isInitialLoading=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isLoadingMore=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", nextPageCursor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isLoggedIn=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ() {
        C549290LgV c549290LgV;
        InterfaceC549230LgP interfaceC549230LgP = this.LIZ;
        if (!(interfaceC549230LgP instanceof C549290LgV) || (c549290LgV = (C549290LgV) interfaceC549230LgP) == null) {
            return null;
        }
        return c549290LgV.LIZ;
    }

    public final String LIZJ() {
        C549290LgV c549290LgV;
        AITheaterCameoImageModel aITheaterCameoImageModel;
        List<String> urlList;
        InterfaceC549230LgP interfaceC549230LgP = this.LIZ;
        if (!(interfaceC549230LgP instanceof C549290LgV) || (c549290LgV = (C549290LgV) interfaceC549230LgP) == null || (aITheaterCameoImageModel = c549290LgV.LIZIZ) == null || (urlList = aITheaterCameoImageModel.getUrlList()) == null) {
            return null;
        }
        return (String) C13LP.LJJJLL(urlList);
    }

    public static C569820MWm LIZ(C569820MWm c569820MWm, InterfaceC549230LgP interfaceC549230LgP, List list, boolean z, boolean z2, Integer num, int i) {
        InterfaceC1665500tRU<PortraitStyleItem> interfaceC1665500tRU;
        boolean z3;
        boolean z4;
        Integer num2 = num;
        boolean z5 = z2;
        boolean z6 = z;
        List list2 = list;
        InterfaceC549230LgP interfaceC549230LgP2 = interfaceC549230LgP;
        if ((i & 1) != 0) {
            interfaceC549230LgP2 = c569820MWm.LIZ;
        }
        if ((i & 2) != 0) {
            list2 = c569820MWm.LIZIZ;
        }
        if ((i & 4) != 0) {
            interfaceC1665500tRU = c569820MWm.LIZJ;
        } else {
            interfaceC1665500tRU = null;
        }
        if ((i & 8) != 0) {
            z3 = c569820MWm.LIZLLL;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z6 = c569820MWm.LJ;
        }
        if ((i & 32) != 0) {
            z5 = c569820MWm.LJFF;
        }
        if ((i & 64) != 0) {
            num2 = c569820MWm.LJI;
        }
        if ((i & 128) != 0) {
            z4 = c569820MWm.LJII;
        } else {
            z4 = false;
        }
        c569820MWm.getClass();
        return new C569820MWm(interfaceC549230LgP2, list2, interfaceC1665500tRU, z3, z6, z5, num2, z4);
    }

    public C569820MWm(InterfaceC549230LgP interfaceC549230LgP, List<PortraitStyleItem> list, InterfaceC1665500tRU<PortraitStyleItem> interfaceC1665500tRU, boolean z, boolean z2, boolean z3, Integer num, boolean z4) {
        this.LIZ = interfaceC549230LgP;
        this.LIZIZ = list;
        this.LIZJ = interfaceC1665500tRU;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = num;
        this.LJII = z4;
    }
}
