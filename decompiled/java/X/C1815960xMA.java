package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815960xMA implements InterfaceC636340Oxc<C1815960xMA, InterfaceC1816030xMH> {
    public final C627660Ojc<InterfaceC1816030xMH> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final C1804840x4E LLILZ;
    public final HashMap<String, ArrayList<InterfaceC1816020xMG>> LLILZIL;
    public final C1151400g4I LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;

    public C1815960xMA() {
        this(false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1815960xMA)) {
            return false;
        }
        C1815960xMA c1815960xMA = (C1815960xMA) obj;
        return Intrinsics.LJFF(this.LL, c1815960xMA.LL) && this.LLILLJJLI == c1815960xMA.LLILLJJLI && this.LLILLL == c1815960xMA.LLILLL && Intrinsics.LJFF(this.LLILZ, c1815960xMA.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1815960xMA.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1815960xMA.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1815960xMA.LLIZ) && this.LLIZLLLIL == c1815960xMA.LLIZLLLIL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        C1804840x4E c1804840x4E = this.LLILZ;
        int iHashCode2 = (iHashCode + (c1804840x4E == null ? 0 : c1804840x4E.hashCode())) * 31;
        HashMap<String, ArrayList<InterfaceC1816020xMG>> map = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        C1151400g4I c1151400g4I = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (c1151400g4I == null ? 0 : c1151400g4I.hashCode())) * 31;
        String str = this.LLIZ;
        return ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackageListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showExchangeEntrance=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", canExchange=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", originDiamondQueryData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", rechargeItemMap=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", lastSelectRechargeItem=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", panelChannel=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", popupCancel=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1816030xMH> getListItemState() {
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
    public final C627660Ojc<InterfaceC1816030xMH> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1815960xMA(boolean z, int i) {
        C627660Ojc c627660Ojc;
        boolean z2 = z;
        if ((i & 1) != 0) {
            c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        } else {
            c627660Ojc = null;
        }
        this(c627660Ojc, false, (i & 4) != 0 ? false : z2, null, null, null, null, false);
    }

    public C1815960xMA(C627660Ojc<InterfaceC1816030xMH> c627660Ojc, boolean z, boolean z2, C1804840x4E c1804840x4E, HashMap<String, ArrayList<InterfaceC1816020xMG>> map, C1151400g4I c1151400g4I, String str, boolean z3) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c1804840x4E;
        this.LLILZIL = map;
        this.LLILZLL = c1151400g4I;
        this.LLIZ = str;
        this.LLIZLLLIL = z3;
    }

    public static C1815960xMA LIZ(C1815960xMA c1815960xMA, C627660Ojc c627660Ojc, boolean z, C1804840x4E c1804840x4E, HashMap map, C1151400g4I c1151400g4I, String str, boolean z2, int i) {
        boolean z3;
        boolean z4 = z2;
        String str2 = str;
        C1151400g4I c1151400g4I2 = c1151400g4I;
        HashMap map2 = map;
        C1804840x4E c1804840x4E2 = c1804840x4E;
        boolean z5 = z;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1815960xMA.LL;
        }
        if ((i & 2) != 0) {
            z5 = c1815960xMA.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z3 = c1815960xMA.LLILLL;
        } else {
            z3 = false;
        }
        if ((i & 8) != 0) {
            c1804840x4E2 = c1815960xMA.LLILZ;
        }
        if ((i & 16) != 0) {
            map2 = c1815960xMA.LLILZIL;
        }
        if ((i & 32) != 0) {
            c1151400g4I2 = c1815960xMA.LLILZLL;
        }
        if ((i & 64) != 0) {
            str2 = c1815960xMA.LLIZ;
        }
        if ((i & 128) != 0) {
            z4 = c1815960xMA.LLIZLLLIL;
        }
        c1815960xMA.getClass();
        return new C1815960xMA(c627660Ojc2, z5, z3, c1804840x4E2, map2, c1151400g4I2, str2, z4);
    }
}
