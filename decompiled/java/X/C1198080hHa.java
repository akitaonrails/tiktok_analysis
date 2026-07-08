package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsVideoListResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198080hHa implements InterfaceC636340Oxc<C1198080hHa, C1158280gFO> {
    public final C627660Ojc<C1158280gFO> LL;
    public final AbstractC1198100hHc<MyMomentsVideoListResponse> LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;

    public C1198080hHa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1198080hHa)) {
            return false;
        }
        C1198080hHa c1198080hHa = (C1198080hHa) obj;
        return Intrinsics.LJFF(this.LL, c1198080hHa.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1198080hHa.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1198080hHa.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1198080hHa.LLILZ) && this.LLILZIL == c1198080hHa.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1198080hHa.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LLILZ;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddLocationPageState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", inviterID=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", userType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showBanner=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1158280gFO> getListItemState() {
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
    public final C627660Ojc<C1158280gFO> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1198080hHa(int i) {
        this(new C627660Ojc(null, null, null, null, 15), C1198090hHb.LIZ, null, null, false, "");
    }

    public C1198080hHa(C627660Ojc<C1158280gFO> c627660Ojc, AbstractC1198100hHc<MyMomentsVideoListResponse> abstractC1198100hHc, String str, Integer num, boolean z, String str2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1198100hHc;
        this.LLILLL = str;
        this.LLILZ = num;
        this.LLILZIL = z;
        this.LLILZLL = str2;
    }

    public static C1198080hHa LIZ(C1198080hHa c1198080hHa, C627660Ojc c627660Ojc, AbstractC1198100hHc abstractC1198100hHc, String str, Integer num, String str2, int i) {
        boolean z;
        String str3 = str2;
        Integer num2 = num;
        String str4 = str;
        AbstractC1198100hHc abstractC1198100hHc2 = abstractC1198100hHc;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i & 1) != 0) {
            c627660Ojc2 = c1198080hHa.LL;
        }
        if ((i & 2) != 0) {
            abstractC1198100hHc2 = c1198080hHa.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str4 = c1198080hHa.LLILLL;
        }
        if ((i & 8) != 0) {
            num2 = c1198080hHa.LLILZ;
        }
        if ((i & 16) != 0) {
            z = c1198080hHa.LLILZIL;
        } else {
            z = false;
        }
        if ((i & 32) != 0) {
            str3 = c1198080hHa.LLILZLL;
        }
        c1198080hHa.getClass();
        return new C1198080hHa(c627660Ojc2, abstractC1198100hHc2, str4, num2, z, str3);
    }
}
