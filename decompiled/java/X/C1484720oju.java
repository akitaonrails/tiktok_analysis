package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0oju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484720oju {
    public static final /* synthetic */ int LIZ = 0;

    public static C1482560ogQ LIZ(Aweme aweme, String str, String str2, boolean z, boolean z2) {
        VideoUrlModel h264PlayAddr;
        List<String> urlList;
        C1482580ogS c1482580ogS;
        String urlKey;
        Video video = aweme.getVideo();
        if (video == null) {
            c1482580ogS = new C1482580ogS();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("{\"PktOffsetMap\":\"[{\\\"offset\\\":");
            sbLIZ.append(C0C64.LJIILLIIL().LJIJ(31744, 2560000, "ec_video_extra_size", true));
            sbLIZ.append(",\\\"time\\\":9,\\\"frame\\\":9}]\"}");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (video.checkVideo(video.getPlayAddr())) {
                h264PlayAddr = video.getPlayAddr();
            } else {
                h264PlayAddr = video.getH264PlayAddr();
            }
            C1482580ogS c1482580ogS2 = new C1482580ogS();
            String aid = aweme.getAid();
            String str3 = "";
            if (aid == null) {
                aid = "";
            }
            c1482580ogS2.LIZ = aid;
            C1058540deW c1058540deW = new C1058540deW(c1482580ogS2);
            if (h264PlayAddr == null || (urlList = h264PlayAddr.getUrlList()) == null) {
                urlList = C13BV.INSTANCE;
            }
            c1058540deW.LIZLLL = urlList;
            c1058540deW.LJII = strLIZIZ;
            if (h264PlayAddr != null && (urlKey = h264PlayAddr.getUrlKey()) != null) {
                str3 = urlKey;
            }
            c1058540deW.LIZIZ = str3;
            C1482570ogR c1482570ogRLIZ = C1484700ojs.LIZ(c1058540deW.LIZ(), z, z2, str, str2, Integer.valueOf(aweme.getAwemeType()), null, 0L, null);
            c1482580ogS = c1482570ogRLIZ.LIZ;
            c1482580ogS.LJ = c1482570ogRLIZ;
            C1484700ojs.LIZIZ(c1482580ogS, video, strLIZIZ);
            C1351990lHp c1351990lHp = new C1351990lHp(c1482580ogS);
            c1351990lHp.LIZ = video.getVideoModelStr();
            c1482580ogS.LIZLLL = c1351990lHp;
        }
        return new C1484680ojq(c1482580ogS).LIZ();
    }
}
