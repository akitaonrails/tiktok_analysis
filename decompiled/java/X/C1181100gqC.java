package X;

import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181100gqC implements InterfaceC1891350zJl {
    public final PoiRecommendFeatureDetailTabItem LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1181100gqC)) {
            return false;
        }
        C1181100gqC c1181100gqC = (C1181100gqC) obj;
        return Intrinsics.LJFF(this.LL, c1181100gqC.LL) && this.LLILLJJLI == c1181100gqC.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureDetailTabPowerItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1181100gqC(PoiRecommendFeatureDetailTabItem poiRecommendFeatureDetailTabItem, boolean z) {
        this.LL = poiRecommendFeatureDetailTabItem;
        this.LLILLJJLI = z;
    }
}
