package X;

import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hNT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201730hNT implements InterfaceC636340Oxc<C1201730hNT, Object> {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final InterfaceC1201800hNa LLILZ;
    public final Pair<Boolean, LocationRegion> LLILZIL;
    public final LocationRegion LLILZLL;
    public final C627660Ojc<Object> LLIZ;

    public C1201730hNT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1201730hNT)) {
            return false;
        }
        C1201730hNT c1201730hNT = (C1201730hNT) obj;
        return Intrinsics.LJFF(this.LL, c1201730hNT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1201730hNT.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1201730hNT.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1201730hNT.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1201730hNT.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1201730hNT.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1201730hNT.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InterfaceC1201800hNa interfaceC1201800hNa = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (interfaceC1201800hNa == null ? 0 : interfaceC1201800hNa.hashCode())) * 31;
        Pair<Boolean, LocationRegion> pair = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (pair == null ? 0 : pair.hashCode())) * 31;
        LocationRegion locationRegion = this.LLILZLL;
        return ((iHashCode5 + (locationRegion != null ? locationRegion.hashCode() : 0)) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegionSearchState(keyword=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentCountryCode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentCountryName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", allRegions=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedRegion=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", userCurrentRegion=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<Object> getListItemState() {
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
    public final C627660Ojc<Object> getListState() {
        return this.LLIZ;
    }

    public /* synthetic */ C1201730hNT(int i) {
        this(null, null, null, null, null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C1201730hNT(String str, String str2, String str3, InterfaceC1201800hNa interfaceC1201800hNa, Pair<Boolean, LocationRegion> pair, LocationRegion locationRegion, C627660Ojc<Object> c627660Ojc) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = interfaceC1201800hNa;
        this.LLILZIL = pair;
        this.LLILZLL = locationRegion;
        this.LLIZ = c627660Ojc;
    }

    public static C1201730hNT LIZ(C1201730hNT c1201730hNT, String str, String str2, String str3, InterfaceC1201800hNa interfaceC1201800hNa, Pair pair, LocationRegion locationRegion, C627660Ojc c627660Ojc, int i) {
        C627660Ojc c627660Ojc2 = c627660Ojc;
        LocationRegion locationRegion2 = locationRegion;
        Pair pair2 = pair;
        InterfaceC1201800hNa interfaceC1201800hNa2 = interfaceC1201800hNa;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = c1201730hNT.LL;
        }
        if ((i & 2) != 0) {
            str5 = c1201730hNT.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str4 = c1201730hNT.LLILLL;
        }
        if ((i & 8) != 0) {
            interfaceC1201800hNa2 = c1201730hNT.LLILZ;
        }
        if ((i & 16) != 0) {
            pair2 = c1201730hNT.LLILZIL;
        }
        if ((i & 32) != 0) {
            locationRegion2 = c1201730hNT.LLILZLL;
        }
        if ((i & 64) != 0) {
            c627660Ojc2 = c1201730hNT.LLIZ;
        }
        c1201730hNT.getClass();
        return new C1201730hNT(str6, str5, str4, interfaceC1201800hNa2, pair2, locationRegion2, c627660Ojc2);
    }
}
