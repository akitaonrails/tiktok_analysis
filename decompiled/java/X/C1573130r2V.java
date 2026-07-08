package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.VipSubscriptionPurchaseOption;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573130r2V {
    public final List<VipSubscriptionPurchaseOption> LIZ;
    public final String LIZIZ;
    public final UrlModel LIZJ;
    public final Map<String, String> LIZLLL;
    public final Map<String, String> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573130r2V)) {
            return false;
        }
        C1573130r2V c1573130r2V = (C1573130r2V) obj;
        return Intrinsics.LJFF(this.LIZ, c1573130r2V.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1573130r2V.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1573130r2V.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1573130r2V.LIZLLL) && Intrinsics.LJFF(this.LJ, c1573130r2V.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        UrlModel urlModel = this.LIZJ;
        return ((((iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipPlanSelectorUiState(plans=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedPlanId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", backgroundImg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", displayPriceMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", originalPriceMap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1573130r2V(List<VipSubscriptionPurchaseOption> list, String str, UrlModel urlModel, Map<String, String> map, Map<String, String> map2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = urlModel;
        this.LIZLLL = map;
        this.LJ = map2;
    }
}
