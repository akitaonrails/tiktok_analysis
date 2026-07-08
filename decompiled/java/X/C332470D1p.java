package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332470D1p implements Serializable {
    public final C332870D3d aiOverview;
    public final AbstractC332520D1u apiState;
    public final C332570D1z ratingHeader;
    public final C332460D1o reviewList;

    public final C332470D1p copy(C332570D1z c332570D1z, C332870D3d c332870D3d, C332460D1o c332460D1o, AbstractC332520D1u abstractC332520D1u) {
        return new C332470D1p(c332570D1z, c332870D3d, c332460D1o, abstractC332520D1u);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332470D1p)) {
            return false;
        }
        C332470D1p c332470D1p = (C332470D1p) obj;
        return Intrinsics.LJFF(this.ratingHeader, c332470D1p.ratingHeader) && Intrinsics.LJFF(this.aiOverview, c332470D1p.aiOverview) && Intrinsics.LJFF(this.reviewList, c332470D1p.reviewList) && Intrinsics.LJFF(this.apiState, c332470D1p.apiState);
    }

    public int hashCode() {
        C332570D1z c332570D1z = this.ratingHeader;
        int iHashCode = (c332570D1z == null ? 0 : c332570D1z.hashCode()) * 31;
        C332870D3d c332870D3d = this.aiOverview;
        int iHashCode2 = (iHashCode + (c332870D3d == null ? 0 : c332870D3d.hashCode())) * 31;
        C332460D1o c332460D1o = this.reviewList;
        return ((iHashCode2 + (c332460D1o != null ? c332460D1o.hashCode() : 0)) * 31) + this.apiState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReviewSectionUiState(ratingHeader=");
        sbLIZ.append(this.ratingHeader);
        sbLIZ.append(", aiOverview=");
        sbLIZ.append(this.aiOverview);
        sbLIZ.append(", reviewList=");
        sbLIZ.append(this.reviewList);
        sbLIZ.append(", apiState=");
        sbLIZ.append(this.apiState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332470D1p(C332570D1z c332570D1z, C332870D3d c332870D3d, C332460D1o c332460D1o, AbstractC332520D1u abstractC332520D1u) {
        this.ratingHeader = c332570D1z;
        this.aiOverview = c332870D3d;
        this.reviewList = c332460D1o;
        this.apiState = abstractC332520D1u;
    }
}
