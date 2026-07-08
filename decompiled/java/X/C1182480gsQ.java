package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182480gsQ implements InterfaceC0148002o {
    public final String LL;
    public final ArrayList<PoiDetailApi.RecommendedDish> LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<PoiDetailApi.RecommendedDish> LLIZ;

    public C1182480gsQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1182480gsQ)) {
            return false;
        }
        C1182480gsQ c1182480gsQ = (C1182480gsQ) obj;
        return Intrinsics.LJFF(this.LL, c1182480gsQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1182480gsQ.LLILLJJLI) && this.LLILLL == c1182480gsQ.LLILLL && Intrinsics.LJFF(this.LLILZ, c1182480gsQ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1182480gsQ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1182480gsQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1182480gsQ.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ArrayList<PoiDetailApi.RecommendedDish> arrayList = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.LLILLL) * 31;
        String str2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<PoiDetailApi.RecommendedDish> c291001Au3 = this.LLIZ;
        return iHashCode5 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendDishesState(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", dishes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", refreshPoiEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", poiRefreshDoneEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", pendingLikeEvent=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1182480gsQ(int i) {
        this(null, null, 0, null, null, null, null);
    }

    public C1182480gsQ(String str, ArrayList<PoiDetailApi.RecommendedDish> arrayList, int i, String str2, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<PoiDetailApi.RecommendedDish> c291001Au3) {
        this.LL = str;
        this.LLILLJJLI = arrayList;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = c291001Au;
        this.LLILZLL = c291001Au2;
        this.LLIZ = c291001Au3;
    }

    public static C1182480gsQ LIZ(C1182480gsQ c1182480gsQ, String str, ArrayList arrayList, int i, String str2, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, int i2) {
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        String str3 = str2;
        int i3 = i;
        ArrayList arrayList2 = arrayList;
        String str4 = str;
        if ((i2 & 1) != 0) {
            str4 = c1182480gsQ.LL;
        }
        if ((i2 & 2) != 0) {
            arrayList2 = c1182480gsQ.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i3 = c1182480gsQ.LLILLL;
        }
        if ((i2 & 8) != 0) {
            str3 = c1182480gsQ.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au6 = c1182480gsQ.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c291001Au5 = c1182480gsQ.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            c291001Au4 = c1182480gsQ.LLIZ;
        }
        c1182480gsQ.getClass();
        return new C1182480gsQ(str4, arrayList2, i3, str3, c291001Au6, c291001Au5, c291001Au4);
    }
}
