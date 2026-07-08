package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.LivePhotoStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ojt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1484710ojt extends AbstractC1484760ojy {
    public final LivePhotoStruct LIZ;
    public final C721780SSy LIZIZ;
    public final C1482560ogQ LIZJ;

    public AbstractC1484710ojt(LivePhotoStruct livePhotoStruct, C721780SSy c721780SSy) {
        String str;
        List<BitRate> bitRate;
        int i;
        this.LIZ = livePhotoStruct;
        this.LIZIZ = c721780SSy;
        Aweme aweme = c721780SSy.LIZ;
        LivePhotoStruct livePhotoStruct2 = c721780SSy.LIZIZ;
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = livePhotoStruct2.livePhotoVid;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZLLL = C721770SSx.LIZ(livePhotoStruct2);
        C1482580ogS c1482580ogSLIZ = c1058540deW.LIZ();
        C1479570obb c1479570obb = new C1479570obb();
        c1479570obb.LJJIIZ = "mp4";
        c1479570obb.LJII = true;
        c1479570obb.LJI = false;
        c1479570obb.LIZIZ = c721780SSy.LJ.isLoop();
        c1479570obb.LJJ = true;
        c1479570obb.LJIIZILJ = C2097908Jt.LIZJ(new Pair("photo", "photoandtext_livephoto"));
        if (c721780SSy.LIZLLL) {
            str = "photoandtext_post_mode_detail";
        } else {
            str = "photoandtext_feed";
        }
        c1479570obb.LJIILL = str;
        c1479570obb.LJJII = aweme.getAwemeType();
        c1479570obb.LJJIIJ = c721780SSy.LIZJ;
        c1482580ogSLIZ.LJ = new C1482570ogR(c1479570obb);
        C1351990lHp c1351990lHp = new C1351990lHp(c1482580ogSLIZ);
        Video video = livePhotoStruct2.videoModel;
        c1351990lHp.LIZ = video != null ? video.getVideoModelStr() : null;
        c1482580ogSLIZ.LIZLLL = c1351990lHp;
        Video video2 = livePhotoStruct2.videoModel;
        if (video2 != null && (bitRate = video2.getBitRate()) != null) {
            for (BitRate bitRate2 : bitRate) {
                C1058540deW c1058540deW2 = new C1058540deW(c1482580ogSLIZ);
                if (bitRate2.isBytevc1() == 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                c1058540deW2.LIZJ = i;
                c1058540deW2.LJ = bitRate2.getSize();
                c1058540deW2.LIZIZ = bitRate2.getUrlKey();
                c1058540deW2.LIZLLL = bitRate2.urlList();
                C1484750ojx c1484750ojx = new C1484750ojx(c1058540deW2);
                c1484750ojx.LIZ = bitRate2.getBitRate();
                c1484750ojx.LIZIZ = bitRate2.getGearName();
                c1484750ojx.LIZJ = bitRate2.getQualityType();
                c1058540deW2.LJI = c1484750ojx;
                c1058540deW2.LIZ();
            }
        }
        this.LIZJ = new C1484680ojq(c1482580ogSLIZ).LIZ();
    }
}
