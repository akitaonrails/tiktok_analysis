package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729860v7I implements InterfaceC636340Oxc<C1729860v7I, ImageItem> {
    public final AbstractC1623806Xk<Boolean> LL;
    public final Boolean LLILLJJLI;
    public final int LLILLL;
    public final AbstractC1623806Xk<C1729520v6k> LLILZ;
    public final long LLILZIL;
    public final AbstractC1623806Xk<Boolean> LLILZLL;
    public final AbstractC1623806Xk<Boolean> LLIZ;
    public final C627660Ojc<ImageItem> LLIZLLLIL;

    public C1729860v7I() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1729860v7I)) {
            return false;
        }
        C1729860v7I c1729860v7I = (C1729860v7I) obj;
        return Intrinsics.LJFF(this.LL, c1729860v7I.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1729860v7I.LLILLJJLI) && this.LLILLL == c1729860v7I.LLILLL && Intrinsics.LJFF(this.LLILZ, c1729860v7I.LLILZ) && this.LLILZIL == c1729860v7I.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1729860v7I.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1729860v7I.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1729860v7I.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Boolean bool = this.LLILLJJLI;
        return ((((((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageListState(fetchListStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isEmptyList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", totalImageCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", uploadImageStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", uploadImageProgress=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", useEffectStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", cancelDisplayStatus=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<ImageItem> getListItemState() {
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
    public final C627660Ojc<ImageItem> getListState() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1729860v7I(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, null, 0, c491101vh, -1L, c491101vh, c491101vh, new C627660Ojc(null, null, null, null, 15));
    }

    public C1729860v7I(AbstractC1623806Xk<Boolean> abstractC1623806Xk, Boolean bool, int i, AbstractC1623806Xk<C1729520v6k> abstractC1623806Xk2, long j, AbstractC1623806Xk<Boolean> abstractC1623806Xk3, AbstractC1623806Xk<Boolean> abstractC1623806Xk4, C627660Ojc<ImageItem> c627660Ojc) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = bool;
        this.LLILLL = i;
        this.LLILZ = abstractC1623806Xk2;
        this.LLILZIL = j;
        this.LLILZLL = abstractC1623806Xk3;
        this.LLIZ = abstractC1623806Xk4;
        this.LLIZLLLIL = c627660Ojc;
    }

    public static C1729860v7I LIZ(C1729860v7I c1729860v7I, AbstractC1623806Xk abstractC1623806Xk, Boolean bool, int i, AbstractC1623806Xk abstractC1623806Xk2, long j, AbstractC1623806Xk abstractC1623806Xk3, AbstractC1623806Xk abstractC1623806Xk4, C627660Ojc c627660Ojc, int i2) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        AbstractC1623806Xk abstractC1623806Xk5 = abstractC1623806Xk4;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk3;
        long j2 = j;
        AbstractC1623806Xk abstractC1623806Xk7 = abstractC1623806Xk2;
        int i3 = i;
        Boolean bool2 = bool;
        AbstractC1623806Xk abstractC1623806Xk8 = abstractC1623806Xk;
        if ((i2 & 1) != 0) {
            abstractC1623806Xk8 = c1729860v7I.LL;
        }
        if ((i2 & 2) != 0) {
            bool2 = c1729860v7I.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i3 = c1729860v7I.LLILLL;
        }
        if ((i2 & 8) != 0) {
            abstractC1623806Xk7 = c1729860v7I.LLILZ;
        }
        if ((i2 & 16) != 0) {
            j2 = c1729860v7I.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            abstractC1623806Xk6 = c1729860v7I.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            abstractC1623806Xk5 = c1729860v7I.LLIZ;
        }
        if ((i2 & 128) != 0) {
            c627660Ojc2 = c1729860v7I.LLIZLLLIL;
        }
        c1729860v7I.getClass();
        return new C1729860v7I(abstractC1623806Xk8, bool2, i3, abstractC1623806Xk7, j2, abstractC1623806Xk6, abstractC1623806Xk5, c627660Ojc2);
    }
}
