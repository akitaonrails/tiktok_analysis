package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1240980iOm implements InterfaceC636340Oxc<C1240980iOm, C1240530iO3> {
    public final EnumC1241070iOv LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final C627660Ojc<C1240530iO3> LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1240980iOm)) {
            return false;
        }
        C1240980iOm c1240980iOm = (C1240980iOm) obj;
        return this.LL == c1240980iOm.LL && Intrinsics.LJFF(this.LLILLJJLI, c1240980iOm.LLILLJJLI) && this.LLILLL == c1240980iOm.LLILLL && Intrinsics.LJFF(this.LLILZ, c1240980iOm.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1240980iOm.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1240980iOm.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31;
        String str = this.LLILZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZIL;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistorySearchResultListState(pageLoadState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dataCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", resultKeyword=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", resultSearchId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1240530iO3> getListItemState() {
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
    public final C627660Ojc<C1240530iO3> getListState() {
        return this.LLILZLL;
    }

    public C1240980iOm(EnumC1241070iOv enumC1241070iOv, String str, int i, String str2, String str3, C627660Ojc<C1240530iO3> c627660Ojc) {
        this.LL = enumC1241070iOv;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = c627660Ojc;
    }

    public static C1240980iOm LIZ(C1240980iOm c1240980iOm, EnumC1241070iOv enumC1241070iOv, String str, int i, String str2, String str3, C627660Ojc c627660Ojc, int i2) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        String str4 = str3;
        String str5 = str2;
        int i3 = i;
        String str6 = str;
        EnumC1241070iOv enumC1241070iOv2 = enumC1241070iOv;
        if ((i2 & 1) != 0) {
            enumC1241070iOv2 = c1240980iOm.LL;
        }
        if ((i2 & 2) != 0) {
            str6 = c1240980iOm.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i3 = c1240980iOm.LLILLL;
        }
        if ((i2 & 8) != 0) {
            str5 = c1240980iOm.LLILZ;
        }
        if ((i2 & 16) != 0) {
            str4 = c1240980iOm.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c627660Ojc2 = c1240980iOm.LLILZLL;
        }
        c1240980iOm.getClass();
        return new C1240980iOm(enumC1241070iOv2, str6, i3, str5, str4, c627660Ojc2);
    }
}
