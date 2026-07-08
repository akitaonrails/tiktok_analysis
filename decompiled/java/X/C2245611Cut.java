package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAb;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAbModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245611Cut extends C09AY implements Function0<AdPitayaReRankClientAbModel> {
    public C2245611Cut() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.expirement.AdPitayaReRankClientAbModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AdPitayaReRankClientAbModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AdPitayaReRankClientAbModel adPitayaReRankClientAbModel = AdPitayaReRankClientAb.DEFAULT;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("feed_ad_pitaya_re_rank_client", AdPitayaReRankClientAbModel.class, adPitayaReRankClientAbModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : adPitayaReRankClientAbModel;
    }
}
