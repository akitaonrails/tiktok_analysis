package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.PdpLynxCardConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.PdpLynxCardModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158380gFY {
    public static final Map<String, Integer> LIZ;

    static {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PdpLynxCardConfig pdpLynxCardConfig = C1158390gFZ.LIZ;
        PdpLynxCardConfig pdpLynxCardConfig2 = (PdpLynxCardConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_pdp_lynx_card_config", PdpLynxCardConfig.class, pdpLynxCardConfig);
        if (pdpLynxCardConfig2 != null) {
            pdpLynxCardConfig = pdpLynxCardConfig2;
        }
        List<PdpLynxCardModel> list = pdpLynxCardConfig.cards;
        ArrayList arrayList = new ArrayList();
        for (PdpLynxCardModel pdpLynxCardModel : list) {
            String str = pdpLynxCardModel.viewType;
            if (str != null) {
                arrayList.add(new Pair(str, Integer.valueOf(pdpLynxCardModel.powerItemContentType)));
            }
        }
        LIZ = C2097608Jq.LJIILLIIL(arrayList);
    }
}
