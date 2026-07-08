package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar.PoiRecommendFeatureBottomBarModule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0guS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183740guS implements InterfaceC111300bX {
    public final PoiRecommendFeatureBottomBarModule LL;
    public final C1184490gvf LLILLJJLI;
    public final PoiButton LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183740guS)) {
            return false;
        }
        C1183740guS c1183740guS = (C1183740guS) obj;
        return Intrinsics.LJFF(this.LL, c1183740guS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1183740guS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1183740guS.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureBottomBarHierarchyData(module=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shareParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", button=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183740guS(PoiRecommendFeatureBottomBarModule poiRecommendFeatureBottomBarModule, C1184490gvf c1184490gvf, PoiButton poiButton) {
        this.LL = poiRecommendFeatureBottomBarModule;
        this.LLILLJJLI = c1184490gvf;
        this.LLILLL = poiButton;
    }
}
