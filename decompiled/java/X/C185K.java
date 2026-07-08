package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.FlashSaleEnhancementCurveUiConfig;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.185K, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185K {
    public final C185I LIZ;
    public final C185H LIZIZ;
    public final AnonymousClass1868 LIZJ;
    public final PriceTextConfig LIZLLL;
    public final FlashSaleEnhancementCurveUiConfig LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C185K)) {
            return false;
        }
        C185K c185k = (C185K) obj;
        return Intrinsics.LJFF(this.LIZ, c185k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c185k.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c185k.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c185k.LIZLLL) && Intrinsics.LJFF(this.LJ, c185k.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        AnonymousClass1868 anonymousClass1868 = this.LIZJ;
        int iHashCode2 = (iHashCode + (anonymousClass1868 == null ? 0 : anonymousClass1868.hashCode())) * 31;
        PriceTextConfig priceTextConfig = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (priceTextConfig == null ? 0 : priceTextConfig.hashCode())) * 31;
        FlashSaleEnhancementCurveUiConfig flashSaleEnhancementCurveUiConfig = this.LJ;
        return iHashCode3 + (flashSaleEnhancementCurveUiConfig != null ? flashSaleEnhancementCurveUiConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaFlashSaleEnhancementPriceData(priceInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sceneVM=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priceStyleConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sceneTextStyleConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", curveUiConfig=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C185K LIZ(C185K c185k, C185H c185h) {
        C185I c185i = c185k.LIZ;
        AnonymousClass1868 anonymousClass1868 = c185k.LIZJ;
        PriceTextConfig priceTextConfig = c185k.LIZLLL;
        FlashSaleEnhancementCurveUiConfig flashSaleEnhancementCurveUiConfig = c185k.LJ;
        c185k.getClass();
        return new C185K(c185i, c185h, anonymousClass1868, priceTextConfig, flashSaleEnhancementCurveUiConfig);
    }

    public C185K(C185I c185i, C185H c185h, AnonymousClass1868 anonymousClass1868, PriceTextConfig priceTextConfig, FlashSaleEnhancementCurveUiConfig flashSaleEnhancementCurveUiConfig) {
        this.LIZ = c185i;
        this.LIZIZ = c185h;
        this.LIZJ = anonymousClass1868;
        this.LIZLLL = priceTextConfig;
        this.LJ = flashSaleEnhancementCurveUiConfig;
    }
}
