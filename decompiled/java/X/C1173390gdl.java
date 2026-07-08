package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gdl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173390gdl implements InterfaceC1173760geM<C1173390gdl, AbstractC1156990gDJ> {
    public final C627660Ojc<AbstractC1156990gDJ> LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;

    public C1173390gdl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1173390gdl)) {
            return false;
        }
        C1173390gdl c1173390gdl = (C1173390gdl) obj;
        return Intrinsics.LJFF(this.LL, c1173390gdl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1173390gdl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1173390gdl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1173390gdl.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1173390gdl.LLILZIL);
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
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryArchiveV2CalendarState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entryCollectionAwemeId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", entryRealAwemeId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedCollectionAwemeId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedRealAwemeId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<AbstractC1156990gDJ> getListItemState() {
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
    public final C627660Ojc<AbstractC1156990gDJ> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1173390gdl(int i) {
        this(new C627660Ojc(null, null, null, null, 15), null, null, null, null);
    }

    public C1173390gdl(C627660Ojc<AbstractC1156990gDJ> c627660Ojc, String str, String str2, String str3, String str4) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
