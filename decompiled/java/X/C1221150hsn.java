package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1221150hsn implements InterfaceC636340Oxc<C1221150hsn, C1220990hsX> {
    public final C291001Au<List<C1221030hsb>> LL;
    public final C291001Au<Set<C1221030hsb>> LLILLJJLI;
    public final C291001Au<C1221030hsb> LLILLL;
    public final C291001Au<EnumC1221420htE> LLILZ;
    public final C291001Au<EnumC584790Mwf> LLILZIL;
    public final C291001Au<C1221260hsy> LLILZLL;
    public final C291001Au<EnumC1221250hsx> LLIZ;
    public final C291001Au<C1221230hsv> LLIZLLLIL;
    public final C291001Au<C0CCH> LLJ;
    public final C627660Ojc<C1220990hsX> LLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1221150hsn)) {
            return false;
        }
        C1221150hsn c1221150hsn = (C1221150hsn) obj;
        return Intrinsics.LJFF(this.LL, c1221150hsn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1221150hsn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1221150hsn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1221150hsn.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1221150hsn.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1221150hsn.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1221150hsn.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1221150hsn.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1221150hsn.LLJ) && Intrinsics.LJFF(this.LLJI, c1221150hsn.LLJI);
    }

    public final int hashCode() {
        return (((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarSelectorState(dataSource=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedDownloadItems=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedAvatar=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aigcPath=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", powerListFooterState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", saveAvatarLoadingState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", avatarDownloadInfo=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", fragmentAction=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1220990hsX> getListItemState() {
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
    public final C627660Ojc<C1220990hsX> getListState() {
        return this.LLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1221150hsn(C291001Au<? extends List<C1221030hsb>> c291001Au, C291001Au<? extends Set<C1221030hsb>> c291001Au2, C291001Au<C1221030hsb> c291001Au3, C291001Au<? extends EnumC1221420htE> c291001Au4, C291001Au<? extends EnumC584790Mwf> c291001Au5, C291001Au<C1221260hsy> c291001Au6, C291001Au<? extends EnumC1221250hsx> c291001Au7, C291001Au<C1221230hsv> c291001Au8, C291001Au<? extends C0CCH> c291001Au9, C627660Ojc<C1220990hsX> c627660Ojc) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
        this.LLIZ = c291001Au7;
        this.LLIZLLLIL = c291001Au8;
        this.LLJ = c291001Au9;
        this.LLJI = c627660Ojc;
    }

    public static C1221150hsn LIZ(C1221150hsn c1221150hsn, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, C627660Ojc c627660Ojc, int i) {
        C291001Au<C0CCH> c291001Au9;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C291001Au c291001Au10 = c291001Au8;
        C291001Au c291001Au11 = c291001Au7;
        C291001Au c291001Au12 = c291001Au6;
        C291001Au c291001Au13 = c291001Au5;
        C291001Au c291001Au14 = c291001Au4;
        C291001Au c291001Au15 = c291001Au3;
        C291001Au c291001Au16 = c291001Au2;
        C291001Au c291001Au17 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au17 = c1221150hsn.LL;
        }
        if ((i & 2) != 0) {
            c291001Au16 = c1221150hsn.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au15 = c1221150hsn.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au14 = c1221150hsn.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au13 = c1221150hsn.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au12 = c1221150hsn.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au11 = c1221150hsn.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au10 = c1221150hsn.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au9 = c1221150hsn.LLJ;
        } else {
            c291001Au9 = null;
        }
        if ((i & 512) != 0) {
            c627660Ojc2 = c1221150hsn.LLJI;
        }
        c1221150hsn.getClass();
        return new C1221150hsn(c291001Au17, c291001Au16, c291001Au15, c291001Au14, c291001Au13, c291001Au12, c291001Au11, c291001Au10, c291001Au9, c627660Ojc2);
    }
}
