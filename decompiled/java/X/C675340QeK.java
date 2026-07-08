package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.model.EcomVideoCorrectInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675340QeK implements InterfaceC636340Oxc<C675340QeK, InterfaceC660330PvD> {
    public final String LL;
    public final String LLILLJJLI;
    public final EcomVideoCorrectInfo LLILLL;
    public final C627660Ojc<InterfaceC660330PvD> LLILZ;

    public C675340QeK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C675340QeK)) {
            return false;
        }
        C675340QeK c675340QeK = (C675340QeK) obj;
        return Intrinsics.LJFF(this.LL, c675340QeK.LL) && Intrinsics.LJFF(this.LLILLJJLI, c675340QeK.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c675340QeK.LLILLL) && Intrinsics.LJFF(this.LLILZ, c675340QeK.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        EcomVideoCorrectInfo ecomVideoCorrectInfo = this.LLILLL;
        return ((iHashCode + (ecomVideoCorrectInfo == null ? 0 : ecomVideoCorrectInfo.hashCode())) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcVideoListVMState(searchId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", imprId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", correctInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC660330PvD> getListItemState() {
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
    public final C627660Ojc<InterfaceC660330PvD> getListState() {
        return this.LLILZ;
    }

    public /* synthetic */ C675340QeK(int i) {
        this("", "", null, new C627660Ojc(null, null, null, null, 15));
    }

    public C675340QeK(String str, String str2, EcomVideoCorrectInfo ecomVideoCorrectInfo, C627660Ojc<InterfaceC660330PvD> c627660Ojc) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = ecomVideoCorrectInfo;
        this.LLILZ = c627660Ojc;
    }

    public static C675340QeK LIZ(C675340QeK c675340QeK, String str, String str2, EcomVideoCorrectInfo ecomVideoCorrectInfo, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            str = c675340QeK.LL;
        }
        if ((i & 2) != 0) {
            str2 = c675340QeK.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            ecomVideoCorrectInfo = c675340QeK.LLILLL;
        }
        if ((i & 8) != 0) {
            c627660Ojc = c675340QeK.LLILZ;
        }
        c675340QeK.getClass();
        return new C675340QeK(str, str2, ecomVideoCorrectInfo, c627660Ojc);
    }
}
