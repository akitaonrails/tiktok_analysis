package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04GD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04GD {
    public final Integer LIZ;
    public final String LIZIZ;
    public final EntranceBannerInfo LIZJ;
    public final HashMap<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04GD)) {
            return false;
        }
        C04GD c04gd = (C04GD) obj;
        return Intrinsics.LJFF(this.LIZ, c04gd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04gd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c04gd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c04gd.LIZLLL);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EntranceBannerInfo entranceBannerInfo = this.LIZJ;
        return ((iHashCode2 + (entranceBannerInfo != null ? entranceBannerInfo.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPromotionEntranceVO(style=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bannerInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04GD(Integer num, String str, EntranceBannerInfo entranceBannerInfo, HashMap<String, Object> map) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = entranceBannerInfo;
        this.LIZLLL = map;
    }
}
