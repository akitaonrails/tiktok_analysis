package X;

import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;

/* JADX INFO: renamed from: X.0cbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018530cbz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC1032120cxu interfaceC1032120cxu) {
        GMTBaseModel gMTBaseModel;
        UrlModel clickTrackUrlList = null;
        if (interfaceC1032120cxu != null) {
            Object hostModel = interfaceC1032120cxu.getHostModel();
            GmtRewardAdModel rewardAdModel = interfaceC1032120cxu.getRewardAdModel();
            if (rewardAdModel != null && (gMTBaseModel = rewardAdModel.awemeRawAd) != null) {
                clickTrackUrlList = gMTBaseModel.getClickTrackUrlList();
            }
            if (hostModel != null && clickTrackUrlList != null && interfaceC1032120cxu != null) {
                interfaceC1032120cxu.track3rdPartyURL(new C1031380cwi(clickTrackUrlList, "click", 12), hostModel);
            }
        }
    }

    public static void LIZIZ(InterfaceC1032120cxu interfaceC1032120cxu) {
        GMTBaseModel gMTBaseModel;
        UrlModel trackUrlList = null;
        if (interfaceC1032120cxu != null) {
            Object hostModel = interfaceC1032120cxu.getHostModel();
            GmtRewardAdModel rewardAdModel = interfaceC1032120cxu.getRewardAdModel();
            if (rewardAdModel != null && (gMTBaseModel = rewardAdModel.awemeRawAd) != null) {
                trackUrlList = gMTBaseModel.getTrackUrlList();
            }
            if (hostModel != null && trackUrlList != null && interfaceC1032120cxu != null) {
                interfaceC1032120cxu.track3rdPartyURL(new C1031380cwi(trackUrlList, "show", 12), hostModel);
            }
        }
    }
}
