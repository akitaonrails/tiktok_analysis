package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718160SFa {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        String mixId;
        new Object() { // from class: X.0SFb
        }.getClass();
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("drama_auto_play_next", true)) {
            return false;
        }
        Aweme aweme = videoItemParams.getAweme();
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null && interfaceC1577520r9aLIZIZ.LJI(videoItemParams.mEventType)) {
            if (aweme != null) {
                if (aweme.isPaidContent) {
                    return true;
                }
                PlayListInfo playListInfo = aweme.playlist_info;
                if (playListInfo != null && (mixId = playListInfo.getMixId()) != null && mixId.length() != 0) {
                    return true;
                }
            }
        } else if (Intrinsics.LJFF(videoItemParams.mEventType, "homepage_hot")) {
            if (aweme != null && aweme.isPaidContent && ((Boolean) C0AUD.LIZ.getValue()).booleanValue()) {
                return true;
            }
        } else {
            return C695070ROf.LIZ(aweme);
        }
        return false;
    }
}
