package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182570gsZ implements InterfaceC0148002o {
    public final PoiDetailApi.RecommendedDish LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final long LLILZ;

    public C1182570gsZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1182570gsZ)) {
            return false;
        }
        C1182570gsZ c1182570gsZ = (C1182570gsZ) obj;
        return Intrinsics.LJFF(this.LL, c1182570gsZ.LL) && this.LLILLJJLI == c1182570gsZ.LLILLJJLI && this.LLILLL == c1182570gsZ.LLILLL && this.LLILZ == c1182570gsZ.LLILZ;
    }

    public final int hashCode() {
        PoiDetailApi.RecommendedDish recommendedDish = this.LL;
        return ((((((recommendedDish == null ? 0 : recommendedDish.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendDishesGalleryState(dish=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userLiked=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", likeNum=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1182570gsZ(int i) {
        this(null, false, false, -1L);
    }

    public C1182570gsZ(PoiDetailApi.RecommendedDish recommendedDish, boolean z, boolean z2, long j) {
        this.LL = recommendedDish;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = j;
    }

    public static C1182570gsZ LIZ(C1182570gsZ c1182570gsZ, PoiDetailApi.RecommendedDish recommendedDish, boolean z, boolean z2, long j, int i) {
        long j2 = j;
        boolean z3 = z2;
        boolean z4 = z;
        PoiDetailApi.RecommendedDish recommendedDish2 = recommendedDish;
        if ((i & 1) != 0) {
            recommendedDish2 = c1182570gsZ.LL;
        }
        if ((i & 2) != 0) {
            z4 = c1182570gsZ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z3 = c1182570gsZ.LLILLL;
        }
        if ((i & 8) != 0) {
            j2 = c1182570gsZ.LLILZ;
        }
        c1182570gsZ.getClass();
        return new C1182570gsZ(recommendedDish2, z4, z3, j2);
    }
}
