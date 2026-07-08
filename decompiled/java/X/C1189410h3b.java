package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189410h3b implements InterfaceC0148002o {
    public final Boolean LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final AbstractC1623806Xk<PoiReviewsApi.PoiWriteReviewResponse> LLILZ;
    public final C1189480h3i LLILZIL;
    public final Boolean LLILZLL;

    public C1189410h3b() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1189410h3b)) {
            return false;
        }
        C1189410h3b c1189410h3b = (C1189410h3b) obj;
        return Intrinsics.LJFF(this.LL, c1189410h3b.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1189410h3b.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1189410h3b.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1189410h3b.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1189410h3b.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1189410h3b.LLILZLL);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZ.hashCode()) * 31;
        C1189480h3i c1189480h3i = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c1189480h3i == null ? 0 : c1189480h3i.hashCode())) * 31;
        Boolean bool2 = this.LLILZLL;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailWriteReviewState(eligible=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eligibleExtraInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", reviewsResp=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", location=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", needEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1189410h3b(int i) {
        Boolean bool = Boolean.FALSE;
        this(bool, null, null, C491101vh.LIZ, null, bool);
    }

    public C1189410h3b(Boolean bool, String str, String str2, AbstractC1623806Xk<PoiReviewsApi.PoiWriteReviewResponse> abstractC1623806Xk, C1189480h3i c1189480h3i, Boolean bool2) {
        this.LL = bool;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = abstractC1623806Xk;
        this.LLILZIL = c1189480h3i;
        this.LLILZLL = bool2;
    }

    public static C1189410h3b LIZ(C1189410h3b c1189410h3b, Boolean bool, String str, String str2, C1623606Xi c1623606Xi, Boolean bool2) {
        C1189480h3i c1189480h3i = c1189410h3b.LLILZIL;
        c1189410h3b.getClass();
        return new C1189410h3b(bool, str, str2, c1623606Xi, c1189480h3i, bool2);
    }
}
