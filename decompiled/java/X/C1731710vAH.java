package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.data.BroadcasterProductsData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.data.PermissionBannedInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vAH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731710vAH implements InterfaceC636340Oxc<C1731710vAH, C1731700vAG> {
    public final C627660Ojc<C1731700vAG> LL;
    public final AbstractC1623806Xk<BroadcasterProductsData> LLILLJJLI;
    public final ArrayList<C1731700vAG> LLILLL;
    public final ArrayList<C1731700vAG> LLILZ;
    public final PermissionBannedInfo LLILZIL;

    public C1731710vAH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1731710vAH)) {
            return false;
        }
        C1731710vAH c1731710vAH = (C1731710vAH) obj;
        return Intrinsics.LJFF(this.LL, c1731710vAH.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1731710vAH.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1731710vAH.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1731710vAH.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1731710vAH.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        ArrayList<C1731700vAG> arrayList = this.LLILLL;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<C1731700vAG> arrayList2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        PermissionBannedInfo permissionBannedInfo = this.LLILZIL;
        return iHashCode3 + (permissionBannedInfo != null ? permissionBannedInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", broadcasterProductsData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", productList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", searchResult=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", permissionBannedInfo=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1731700vAG> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1731700vAG> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1731710vAH(int i) {
        this(new C627660Ojc(null, null, null, null, 15), C491101vh.LIZ, null, null, null);
    }

    public C1731710vAH(C627660Ojc<C1731700vAG> c627660Ojc, AbstractC1623806Xk<BroadcasterProductsData> abstractC1623806Xk, ArrayList<C1731700vAG> arrayList, ArrayList<C1731700vAG> arrayList2, PermissionBannedInfo permissionBannedInfo) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = arrayList;
        this.LLILZ = arrayList2;
        this.LLILZIL = permissionBannedInfo;
    }

    public static C1731710vAH LIZ(C1731710vAH c1731710vAH, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, ArrayList arrayList, ArrayList arrayList2, PermissionBannedInfo permissionBannedInfo, int i) {
        PermissionBannedInfo permissionBannedInfo2 = permissionBannedInfo;
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = arrayList;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1731710vAH.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c1731710vAH.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            arrayList4 = c1731710vAH.LLILLL;
        }
        if ((i & 8) != 0) {
            arrayList3 = c1731710vAH.LLILZ;
        }
        if ((i & 16) != 0) {
            permissionBannedInfo2 = c1731710vAH.LLILZIL;
        }
        c1731710vAH.getClass();
        return new C1731710vAH(c627660Ojc2, abstractC1623806Xk2, arrayList4, arrayList3, permissionBannedInfo2);
    }
}
