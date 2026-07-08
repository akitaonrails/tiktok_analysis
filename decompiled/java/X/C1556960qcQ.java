package X;

import com.ss.android.ugc.aweme.behavior.popup.MarketplacePopupParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556960qcQ extends AbstractC1556970qcR {
    public final MarketplacePopupParams LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556960qcQ) && Intrinsics.LJFF(this.LIZ, ((C1556960qcQ) obj).LIZ);
    }

    public final int hashCode() {
        MarketplacePopupParams marketplacePopupParams = this.LIZ;
        if (marketplacePopupParams == null) {
            return 0;
        }
        return marketplacePopupParams.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupOnClick(onClickParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556960qcQ(MarketplacePopupParams marketplacePopupParams) {
        this.LIZ = marketplacePopupParams;
    }
}
