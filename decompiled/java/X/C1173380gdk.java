package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173380gdk implements InterfaceC1173760geM<C1173380gdk, AbstractC1157040gDO> {
    public final C627660Ojc<AbstractC1157040gDO> LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Integer LLILZLL;

    public C1173380gdk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1173380gdk)) {
            return false;
        }
        C1173380gdk c1173380gdk = (C1173380gdk) obj;
        return Intrinsics.LJFF(this.LL, c1173380gdk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1173380gdk.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1173380gdk.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1173380gdk.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1173380gdk.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1173380gdk.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.LLILZLL;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryArchiveV2ListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entryCollectionAwemeId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", entryRealAwemeId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedCollectionAwemeId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedRealAwemeId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onThisDayTopOffset=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<AbstractC1157040gDO> getListItemState() {
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

    @Override // X.InterfaceC1173760geM
    public final String LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1173760geM
    public final String LJIIIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1173760geM
    public final String LJIILL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1173760geM
    public final String LJIILLIIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<AbstractC1157040gDO> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1173380gdk(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null, null, null, null);
    }

    public C1173380gdk(C627660Ojc<AbstractC1157040gDO> c627660Ojc, String str, String str2, String str3, String str4, Integer num) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = num;
    }

    public static C1173380gdk LIZ(C1173380gdk c1173380gdk, C627660Ojc c627660Ojc, String str, String str2, String str3, String str4, Integer num, int i) {
        Integer num2 = num;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1173380gdk.LL;
        }
        if ((i & 2) != 0) {
            str8 = c1173380gdk.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str7 = c1173380gdk.LLILLL;
        }
        if ((i & 8) != 0) {
            str6 = c1173380gdk.LLILZ;
        }
        if ((i & 16) != 0) {
            str5 = c1173380gdk.LLILZIL;
        }
        if ((i & 32) != 0) {
            num2 = c1173380gdk.LLILZLL;
        }
        c1173380gdk.getClass();
        return new C1173380gdk(c627660Ojc2, str8, str7, str6, str5, num2);
    }
}
