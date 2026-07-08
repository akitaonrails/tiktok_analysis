package X;

import com.ss.android.ugc.aweme.commercialize.service.AdOmSdkManagerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0buU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991560buU {
    public static final C991560buU LIZ = new C991560buU();

    public static void LIZ(C1022820ciu c1022820ciu, Aweme aweme) {
        String originUri;
        String strLIZJ;
        VideoUrlModel playAddr;
        if (aweme == null) {
            return;
        }
        Video video = aweme.getVideo();
        if (video == null || (playAddr = video.getPlayAddr()) == null || (originUri = playAddr.getOriginUri()) == null) {
            originUri = "";
        }
        if (originUri.length() != 0) {
            c1022820ciu.LIZIZ(originUri, "bsh_video_id");
        }
        AdOmSdkManagerService adOmSdkManagerService = (AdOmSdkManagerService) PluggableExtentionKt.pluggableSpi$default(AdOmSdkManagerService.class, false, false, false, 14, null);
        if (adOmSdkManagerService != null && (strLIZJ = adOmSdkManagerService.LIZJ(aweme)) != null && strLIZJ.length() != 0) {
            c1022820ciu.LIZIZ(strLIZJ, "bsh_card_area");
        }
    }
}
