package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.core.settings.AcShopUcpPdpSkuModel;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D48, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D48 {
    public static final AcShopUcpPdpSkuModel LIZ = new AcShopUcpPdpSkuModel(8, true, 5, "USD", 2, true, "https://ads.tiktok.com/openapi_bff/ucp/agent-profiles/default", null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4016));

    public static final String LIZ() {
        String str = LIZIZ().catalogContextCurrency;
        return (!(a0.LJJJIL(str) ^ true) || str == null) ? LIZ.catalogContextCurrency : str;
    }

    public static final AcShopUcpPdpSkuModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AcShopUcpPdpSkuModel acShopUcpPdpSkuModel = LIZ;
        AcShopUcpPdpSkuModel acShopUcpPdpSkuModel2 = (AcShopUcpPdpSkuModel) settingsManagerLIZLLL.LJIIIIZZ("ac_shop_ucp_pdp_sku", AcShopUcpPdpSkuModel.class, acShopUcpPdpSkuModel);
        return acShopUcpPdpSkuModel2 != null ? acShopUcpPdpSkuModel2 : acShopUcpPdpSkuModel;
    }

    public static final boolean LIZJ(int i) {
        AcShopUcpPdpSkuModel acShopUcpPdpSkuModelLIZIZ = LIZIZ();
        if (!acShopUcpPdpSkuModelLIZIZ.enableTextModeWhenColorExceed || i <= acShopUcpPdpSkuModelLIZIZ.colorVisualMaxCount) {
            return true;
        }
        return false;
    }
}
