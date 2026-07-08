package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import webcast.data.PromoteCouponInfo;

/* JADX INFO: renamed from: X.1AHN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHN extends C1809480xBi {
    public final int LIZLLL;
    public PromoteCouponInfo LJ;

    @Override // X.C1809480xBi
    public final String LIZ() {
        String str;
        if (!LiveCenterStructureOpt.INSTANCE.isEnable()) {
            PromoteCouponInfo promoteCouponInfo = this.LJ;
            return (promoteCouponInfo == null || (str = promoteCouponInfo.formattedPrice) == null) ? "" : str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        PromoteCouponInfo promoteCouponInfo2 = this.LJ;
        sbLIZ.append(promoteCouponInfo2 != null ? promoteCouponInfo2.formattedPrice : null);
        sbLIZ.append(' ');
        sbLIZ.append(C497740JfY.LJIIJJI(2131755788, this.LIZ));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return strLIZIZ != null ? strLIZIZ : "";
    }

    @Override // X.C1809480xBi
    public final long LIZJ() {
        PromoteCouponInfo promoteCouponInfo = this.LJ;
        if (promoteCouponInfo != null) {
            return promoteCouponInfo.expireTime * 1000;
        }
        return 0L;
    }

    @Override // X.C1809480xBi
    public final String LIZLLL() {
        return LiveCenterStructureOpt.INSTANCE.isEnable() ? "ttlive_icon_promote_coupon_opt.png" : "ttlive_prop_promote_coupon.png";
    }

    public C1AHN(int i) {
        this.LIZLLL = i;
    }
}
