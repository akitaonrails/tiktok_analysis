package X;

import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.MiniCardModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.ui.RewardAdContainer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ci1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022270ci1 {
    public final /* synthetic */ RewardAdContainer LIZ;

    public C1022270ci1(RewardAdContainer rewardAdContainer) {
        this.LIZ = rewardAdContainer;
    }

    public final void LIZ(String str) {
        Object hostModel;
        Aweme aweme;
        Long lValueOf;
        AwemeRawAd awemeRawAd;
        Object hostModel2;
        long j;
        int autoShowSecond;
        RewardAdContainer rewardAdContainer = this.LIZ;
        InterfaceC1031540cwy interfaceC1031540cwy = rewardAdContainer.LLJIJIL;
        UrlModel clickTrackUrlList = null;
        if (interfaceC1031540cwy != null) {
            hostModel = interfaceC1031540cwy.getHostModel();
        } else {
            hostModel = null;
        }
        if ((hostModel instanceof Aweme) && (aweme = (Aweme) hostModel) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InterfaceC1031720cxG interfaceC1031720cxGOR = rewardAdContainer.OR();
            if (interfaceC1031720cxGOR != null) {
                interfaceC1031720cxGOR.LIZJ(aweme, str, linkedHashMap);
            }
            if (Intrinsics.LJFF(str, "auto_show_feedplay")) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    MiniCardModel miniCardModel = awemeRawAd2.getMiniCardModel();
                    if (miniCardModel != null) {
                        autoShowSecond = miniCardModel.getAutoShowSecond();
                    } else {
                        autoShowSecond = 0;
                    }
                    j = autoShowSecond;
                } else {
                    j = 0;
                }
                lValueOf = Long.valueOf(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            } else if (Intrinsics.LJFF(str, "auto_show_feedfinish")) {
                lValueOf = Long.valueOf(rewardAdContainer.getVideoDuration());
            } else {
                lValueOf = null;
            }
            InterfaceC1031540cwy interfaceC1031540cwy2 = rewardAdContainer.LLJIJIL;
            if (interfaceC1031540cwy2 != null && (hostModel2 = interfaceC1031540cwy2.getHostModel()) != null) {
                HashMap<String, Object> customAdExtraDataParams = interfaceC1031540cwy2.getCustomAdExtraDataParams();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(customAdExtraDataParams);
                linkedHashMap2.putAll(linkedHashMap);
                if (lValueOf != null && lValueOf.longValue() > 0) {
                    linkedHashMap2.put("show_timing", Long.valueOf(lValueOf.longValue()));
                }
                interfaceC1031540cwy2.trackEvent(new C1031310cwb("draw_ad", "realtime_click", str, linkedHashMap2), hostModel2);
            }
            InterfaceC1031540cwy interfaceC1031540cwy3 = rewardAdContainer.LLJIJIL;
            if (interfaceC1031540cwy3 != null) {
                Object hostModel3 = interfaceC1031540cwy3.getHostModel();
                RewardAdModel rewardAdModel = interfaceC1031540cwy3.getRewardAdModel();
                if (rewardAdModel != null && (awemeRawAd = rewardAdModel.awemeRawAd) != null) {
                    clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                }
                if (hostModel3 != null && clickTrackUrlList != null && interfaceC1031540cwy3 != null) {
                    interfaceC1031540cwy3.track3rdPartyURL(new C1031370cwh(clickTrackUrlList, "click", 12), hostModel3);
                }
            }
        }
    }
}
