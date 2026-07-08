package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistJumpSchema;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerBackground;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaBannerCountDown;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.bannerlayout.SeaSkuPanelWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;

/* JADX INFO: renamed from: X.0323, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0323 {
    public static C950203nY LIZ(SeaSkuPanelWaistBanner seaSkuPanelWaistBanner) {
        C03CS c03cs;
        String str;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(seaSkuPanelWaistBanner));
        AnonymousClass0324 anonymousClass0324 = C03CS.Companion;
        Integer num = seaSkuPanelWaistBanner.positionType;
        anonymousClass0324.getClass();
        int value = C03GL.INSERT_BANNER.getValue();
        if (num != null && num.intValue() == value) {
            c03cs = C03CS.DOUBLE_LINE;
        } else {
            c03cs = C03CS.SINGLE_LINE;
        }
        Integer numValueOf2 = Integer.valueOf(c03cs.getValue());
        SeaBannerBackground seaBannerBackground = seaSkuPanelWaistBanner.background;
        Icon icon = seaSkuPanelWaistBanner.startIcon;
        ECRichText eCRichText = seaSkuPanelWaistBanner.startText;
        ECRichText eCRichText2 = seaSkuPanelWaistBanner.endText;
        SeaBannerCountDown seaBannerCountDown = seaSkuPanelWaistBanner.bannerCountDown;
        Icon icon2 = seaSkuPanelWaistBanner.endSuffixIcon;
        WaistJumpSchema waistJumpSchema = seaSkuPanelWaistBanner.jumpSchema;
        if (waistJumpSchema != null) {
            str = waistJumpSchema.schema;
        } else {
            str = null;
        }
        return new C950203nY(numValueOf, numValueOf2, seaBannerBackground, icon, eCRichText, eCRichText2, seaBannerCountDown, icon2, str, C1741890vQh.LJIIJ(seaSkuPanelWaistBanner.daInfo));
    }
}
