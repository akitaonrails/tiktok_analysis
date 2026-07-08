package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;

/* JADX INFO: renamed from: X.17wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21194017wo {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(UsPopupCardVO usPopupCardVO) {
        return C770702zh.LIZ(LIZJ(usPopupCardVO));
    }

    public static String LIZJ(UsPopupCardVO usPopupCardVO) {
        LynxCardInfo lynxCardInfo;
        String str;
        if (usPopupCardVO == null || (lynxCardInfo = usPopupCardVO.lynxCardInfo) == null || (str = lynxCardInfo.lynxCardSchema) == null) {
            return "";
        }
        return str;
    }

    public static void LIZ(PopProductResp popProductResp, boolean z) {
        if (C1867300ygy.LIZ() && !z && popProductResp.cardType == 1) {
            Product product = popProductResp.product;
            if ((product != null && product.productType == 2) || popProductResp.lynxCardInfo != null) {
                return;
            }
            String strLJI = "aweme://roma_redirect/?spark_page=gec_content_live_pin_product_card";
            try {
                SettingsManager.LIZLLL().getClass();
                strLJI = SettingsManager.LJI("audience_pin_product_card_schema", "aweme://roma_redirect/?spark_page=gec_content_live_pin_product_card");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            popProductResp.lynxCardInfo = new LynxCardInfo(strLJI, String.valueOf(popProductResp.popCardId), 1, null, null);
        }
    }
}
