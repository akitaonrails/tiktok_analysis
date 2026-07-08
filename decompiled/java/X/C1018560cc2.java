package X;

import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.feed.model.MiniCardModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.rich.reward.ui.GmtRewardAdContainer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018560cc2 {
    public final /* synthetic */ GmtRewardAdContainer LIZ;

    public C1018560cc2(GmtRewardAdContainer gmtRewardAdContainer) {
        this.LIZ = gmtRewardAdContainer;
    }

    public final void LIZ(String str) {
        GmtRewardAdModel rewardAdModel;
        GMTBaseModel gMTBaseModel;
        Object hostModel;
        int autoShowSecond;
        Object hostModel2;
        GmtRewardAdContainer gmtRewardAdContainer = this.LIZ;
        InterfaceC1032120cxu interfaceC1032120cxu = gmtRewardAdContainer.LLJJ;
        if (interfaceC1032120cxu != null && (rewardAdModel = interfaceC1032120cxu.getRewardAdModel()) != null && (gMTBaseModel = rewardAdModel.awemeRawAd) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InterfaceC1032380cyK interfaceC1032380cyKRR = gmtRewardAdContainer.RR();
            Long lValueOf = null;
            if (interfaceC1032380cyKRR != null) {
                InterfaceC1032120cxu interfaceC1032120cxu2 = gmtRewardAdContainer.LLJJ;
                if (interfaceC1032120cxu2 != null) {
                    hostModel2 = interfaceC1032120cxu2.getHostModel();
                } else {
                    hostModel2 = null;
                }
                interfaceC1032380cyKRR.LJI(hostModel2, str, linkedHashMap);
            }
            if (Intrinsics.LJFF(str, "auto_show_feedplay")) {
                MiniCardModel miniCardModel = gMTBaseModel.getMiniCardModel();
                if (miniCardModel != null) {
                    autoShowSecond = miniCardModel.getAutoShowSecond();
                } else {
                    autoShowSecond = 0;
                }
                lValueOf = Long.valueOf(((long) autoShowSecond) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            } else if (Intrinsics.LJFF(str, "auto_show_feedfinish")) {
                lValueOf = Long.valueOf(gmtRewardAdContainer.getVideoDuration());
            }
            InterfaceC1032120cxu interfaceC1032120cxu3 = gmtRewardAdContainer.LLJJ;
            if (interfaceC1032120cxu3 != null && (hostModel = interfaceC1032120cxu3.getHostModel()) != null) {
                HashMap<String, Object> customAdExtraDataParams = interfaceC1032120cxu3.getCustomAdExtraDataParams();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(customAdExtraDataParams);
                linkedHashMap2.putAll(linkedHashMap);
                if (lValueOf != null && lValueOf.longValue() > 0) {
                    linkedHashMap2.put("show_timing", Long.valueOf(lValueOf.longValue()));
                }
                interfaceC1032120cxu3.trackEvent(new C1031480cws("draw_ad", "realtime_click", str, linkedHashMap2), hostModel);
            }
            C1018530cbz.LIZ(gmtRewardAdContainer.LLJJ);
        }
    }
}
