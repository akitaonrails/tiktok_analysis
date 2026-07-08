package X;

import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import java.util.List;

/* JADX INFO: renamed from: X.0ojv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484730ojv {
    public static final /* synthetic */ int LIZ = 0;

    public static C1482560ogQ LIZ(VideoInfo videoInfo, boolean z, boolean z2, String str, String str2, String str3, long j, OnPreRenderListener onPreRenderListener) {
        VideoUrlModel playAddr;
        List<String> urlList;
        String urlKey;
        String videoModelStr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"PktOffsetMap\":\"[{\\\"offset\\\":");
        sbLIZ.append(C0C64.LJIILLIIL().LJIJ(31744, 2560000, "ec_video_extra_size", true));
        sbLIZ.append(",\\\"time\\\":9,\\\"frame\\\":9}]\"}");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Video video = videoInfo.video;
        if (video != null) {
            playAddr = video.getPlayAddr();
        } else {
            playAddr = null;
        }
        int iLJFF = (int) C13LZ.LJFF(j, 0L, 2147483647L);
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = videoInfo.videoId;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        if (playAddr == null || (urlList = playAddr.getUrlList()) == null) {
            urlList = C13BV.INSTANCE;
        }
        c1058540deW.LIZLLL = urlList;
        String str4 = "";
        if (playAddr == null || (urlKey = playAddr.getUrlKey()) == null) {
            urlKey = "";
        }
        c1058540deW.LIZIZ = urlKey;
        c1058540deW.LJII = strLIZIZ;
        C1482570ogR c1482570ogRLIZ = C1484700ojs.LIZ(c1058540deW.LIZ(), z, z2, str, str2, null, str3, iLJFF, onPreRenderListener);
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        C1484700ojs.LIZIZ(c1482580ogS2, video, strLIZIZ);
        C1351990lHp c1351990lHp = new C1351990lHp(c1482580ogS2);
        if (video != null && (videoModelStr = video.getVideoModelStr()) != null) {
            str4 = videoModelStr;
        }
        c1351990lHp.LIZ = str4;
        c1482580ogS2.LIZLLL = c1351990lHp;
        return new C1484680ojq(c1482580ogS2).LIZ();
    }
}
