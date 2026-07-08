package X;

import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182540gsW implements InterfaceC1891350zJl {
    public final PoiDetailApi.RecommendedDish LL;
    public boolean LLILLJJLI;

    public C1182540gsW() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1182540gsW)) {
            return false;
        }
        C1182540gsW c1182540gsW = (C1182540gsW) obj;
        return Intrinsics.LJFF(this.LL, c1182540gsW.LL) && this.LLILLJJLI == c1182540gsW.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        PoiDetailApi.RecommendedDish recommendedDish = this.LL;
        return ((recommendedDish == null ? 0 : recommendedDish.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendedDishItem(dish=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        PoiDetailApi.RecommendedDish recommendedDish;
        if (!(interfaceC1891350zJl instanceof C1182540gsW) || (recommendedDish = this.LL) == null || !recommendedDish.areContentsTheSame(((C1182540gsW) interfaceC1891350zJl).LL) || this.LLILLJJLI != ((C1182540gsW) interfaceC1891350zJl).LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String dishId;
        if (!(interfaceC1891350zJl instanceof C1182540gsW)) {
            return false;
        }
        PoiDetailApi.RecommendedDish recommendedDish = this.LL;
        String dishId2 = null;
        if (recommendedDish != null) {
            dishId = recommendedDish.getDishId();
        } else {
            dishId = null;
        }
        PoiDetailApi.RecommendedDish recommendedDish2 = ((C1182540gsW) interfaceC1891350zJl).LL;
        if (recommendedDish2 != null) {
            dishId2 = recommendedDish2.getDishId();
        }
        return Intrinsics.LJFF(dishId, dishId2);
    }

    public C1182540gsW(PoiDetailApi.RecommendedDish recommendedDish, boolean z) {
        this.LL = recommendedDish;
        this.LLILLJJLI = z;
    }
}
