package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04GW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04GW implements InterfaceC1755100vm0 {
    public final PromotionEntrance LL;

    @Override // X.InterfaceC1755100vm0
    public final String LIZ() {
        return "promotion";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C04GW) && Intrinsics.LJFF(this.LL, ((C04GW) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaProductPromotionVO(promotionEntrance=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04GW(PromotionEntrance promotionEntrance) {
        this.LL = promotionEntrance;
    }
}
