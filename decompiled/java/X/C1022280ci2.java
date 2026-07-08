package X;

import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.ui.RewardAdContainer;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ci2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022280ci2 {
    public static final void LIZ(RewardAdContainer rewardAdContainer, boolean z) {
        UrlModel playTrackUrlList;
        AwemeRawAd awemeRawAd;
        Object hostModel;
        InterfaceC1031540cwy interfaceC1031540cwy = rewardAdContainer.LLJIJIL;
        int i = rewardAdContainer.LLJJIJIIJIL;
        if (interfaceC1031540cwy != null && (hostModel = interfaceC1031540cwy.getHostModel()) != null) {
            interfaceC1031540cwy.trackEvent(new C1031310cwb("play", C2097908Jt.LIZJ(new Pair("play_order", Integer.valueOf(i))), 4), hostModel);
        }
        InterfaceC1031540cwy interfaceC1031540cwy2 = rewardAdContainer.LLJIJIL;
        int i2 = rewardAdContainer.LLJJIJIIJIL;
        if (interfaceC1031540cwy2 != null) {
            Object hostModel2 = interfaceC1031540cwy2.getHostModel();
            RewardAdModel rewardAdModel = interfaceC1031540cwy2.getRewardAdModel();
            if (rewardAdModel != null && (awemeRawAd = rewardAdModel.awemeRawAd) != null) {
                playTrackUrlList = awemeRawAd.getPlayTrackUrlList();
            } else {
                playTrackUrlList = null;
            }
            if (hostModel2 != null && playTrackUrlList != null && interfaceC1031540cwy2 != null) {
                new JSONObject().put("play_order", i2);
                interfaceC1031540cwy2.track3rdPartyURL(new C1031370cwh(playTrackUrlList, "play", 8), hostModel2);
            }
        }
        if (z) {
            C1032910czB.LJI(rewardAdContainer.LLJIJIL, true, null, 12);
        }
    }
}
