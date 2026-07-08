package X;

import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.ui.RewardAdContainer;

/* JADX INFO: renamed from: X.0cxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031760cxK {
    public final /* synthetic */ RewardAdContainer LIZ;

    public final AwemeRawAd LIZ() {
        RewardAdModel rewardAdModel;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LIZ.LLJIJIL;
        if (interfaceC1031540cwy == null || (rewardAdModel = interfaceC1031540cwy.getRewardAdModel()) == null) {
            return null;
        }
        return rewardAdModel.awemeRawAd;
    }

    public final Video LIZIZ() {
        RewardAdModel rewardAdModel;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LIZ.LLJIJIL;
        if (interfaceC1031540cwy == null || (rewardAdModel = interfaceC1031540cwy.getRewardAdModel()) == null) {
            return null;
        }
        return rewardAdModel.video;
    }

    public C1031760cxK(RewardAdContainer rewardAdContainer) {
        this.LIZ = rewardAdContainer;
    }
}
