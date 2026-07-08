package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1165750gRR implements InterfaceC636340Oxc<C1165750gRR, InterfaceC1891350zJl> {
    public final EnumC1164730gPn LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final String LLILLL;
    public final C291001Au<Integer> LLILZ;
    public final C627660Ojc<InterfaceC1891350zJl> LLILZIL;

    public C1165750gRR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165750gRR)) {
            return false;
        }
        C1165750gRR c1165750gRR = (C1165750gRR) obj;
        return this.LL == c1165750gRR.LL && Intrinsics.LJFF(this.LLILLJJLI, c1165750gRR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1165750gRR.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1165750gRR.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1165750gRR.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Integer> c291001Au2 = this.LLILZ;
        return ((iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArtistMusicFeaturedVideoState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showRecordSheet=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedAwemeId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", toastMessageId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
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
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LLILZIL;
    }

    public /* synthetic */ C1165750gRR(int i) {
        this(EnumC1164730gPn.DEFAULT, null, "", null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1165750gRR(EnumC1164730gPn enumC1164730gPn, C291001Au<Boolean> c291001Au, String str, C291001Au<Integer> c291001Au2, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = enumC1164730gPn;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = str;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c627660Ojc;
    }

    public static C1165750gRR LIZ(C1165750gRR c1165750gRR, EnumC1164730gPn enumC1164730gPn, C291001Au c291001Au, String str, C291001Au c291001Au2, C627660Ojc c627660Ojc, int i) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C291001Au c291001Au3 = c291001Au2;
        String str2 = str;
        C291001Au c291001Au4 = c291001Au;
        EnumC1164730gPn enumC1164730gPn2 = enumC1164730gPn;
        if ((i & 1) != 0) {
            enumC1164730gPn2 = c1165750gRR.LL;
        }
        if ((i & 2) != 0) {
            c291001Au4 = c1165750gRR.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str2 = c1165750gRR.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au3 = c1165750gRR.LLILZ;
        }
        if ((i & 16) != 0) {
            c627660Ojc2 = c1165750gRR.LLILZIL;
        }
        c1165750gRR.getClass();
        return new C1165750gRR(enumC1164730gPn2, c291001Au4, str2, c291001Au3, c627660Ojc2);
    }
}
