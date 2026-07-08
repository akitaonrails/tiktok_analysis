package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.mall.pad.EcShopPad;
import java.util.Collections;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0wD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771910wD7 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(320));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(317));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(318));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(319));
    public static final EcShopPad LJ = new EcShopPad(1, 1, 1, 1, 1, 30, Collections.singletonList("tiktok_ecommerce_mall_channel_runtime"));

    public static boolean LIZ() {
        Integer num;
        return ((Number) LIZLLL.getValue()).intValue() == 1 && (num = LIZIZ().enableApi) != null && num.intValue() == 1;
    }

    public static int LIZJ() {
        if (((Boolean) LIZJ.getValue()).booleanValue()) {
            return 0;
        }
        return ((Number) LIZLLL.getValue()).intValue();
    }

    public static EcShopPad LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcShopPad ecShopPad = LJ;
        EcShopPad ecShopPad2 = (EcShopPad) settingsManagerLIZLLL.LJIIIIZZ("ec_mall_pad_config", EcShopPad.class, ecShopPad);
        return ecShopPad2 != null ? ecShopPad2 : ecShopPad;
    }
}
