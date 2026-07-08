package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.config.EcSearchRewardsCoinModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0QxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687120QxK {
    public static final EcSearchRewardsCoinModel LIZ = new EcSearchRewardsCoinModel(3, 0, "mact_e_search", 2, new ArrayList());

    public static final EcSearchRewardsCoinModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcSearchRewardsCoinModel ecSearchRewardsCoinModel = LIZ;
        EcSearchRewardsCoinModel ecSearchRewardsCoinModel2 = (EcSearchRewardsCoinModel) settingsManagerLIZLLL.LJIIIIZZ("ec_search_rewards_coin", EcSearchRewardsCoinModel.class, ecSearchRewardsCoinModel);
        return ecSearchRewardsCoinModel2 != null ? ecSearchRewardsCoinModel2 : ecSearchRewardsCoinModel;
    }
}
