package X;

import com.ss.android.ugc.aweme.feed.experiment.FeedNetworkApiMobSettingModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742570vRn extends C09AY implements Function0<Boolean> {
    public C1742570vRn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FeedNetworkApiMobSettingModel feedNetworkApiMobSettingModel = C1742580vRo.LIZ;
        FeedNetworkApiMobSettingModel feedNetworkApiMobSettingModel2 = (FeedNetworkApiMobSettingModel) c0c64LJIILLIIL.LJJII(FeedNetworkApiMobSettingModel.class, feedNetworkApiMobSettingModel, "feed_network_api_mob_setting", true);
        if (feedNetworkApiMobSettingModel2 != null) {
            feedNetworkApiMobSettingModel = feedNetworkApiMobSettingModel2;
        }
        return Boolean.valueOf(feedNetworkApiMobSettingModel.enable);
    }
}
