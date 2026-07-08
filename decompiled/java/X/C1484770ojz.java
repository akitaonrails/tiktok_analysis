package X;

import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ojz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484770ojz {
    public static final /* synthetic */ int LIZ = 0;

    public static C1482560ogQ LIZ(Aweme aweme, boolean z, TrendingListViewModel trendingListViewModel) {
        String str;
        String str2;
        List<BitRate> bitRate;
        int i;
        VideoUrlModel h264PlayAddr;
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = aweme.getAid();
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        Video video = aweme.getVideo();
        if (video != null && (h264PlayAddr = video.getH264PlayAddr()) != null) {
            c1058540deW.LIZLLL = h264PlayAddr.getUrlList();
            c1058540deW.LIZIZ = h264PlayAddr.getUrlKey();
        }
        C1482570ogR c1482570ogRLIZ = c1058540deW.LIZ().LIZ();
        C1479570obb c1479570obb = c1482570ogRLIZ.LIZIZ;
        C1742820vSC c1742820vSC = trendingListViewModel.LL;
        String videoModelStr = null;
        if (c1742820vSC != null) {
            str = c1742820vSC.LJIIIIZZ;
        } else {
            str = null;
        }
        String str3 = "auction";
        if (Intrinsics.LJFF(str, "auction")) {
            str2 = "gec_auction";
        } else {
            str2 = "gec_trending";
            str3 = "trends";
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("enter_from", str3);
        c1479570obb.LJFF = map;
        c1479570obb.LJJIIJ = str3;
        c1479570obb.LJIILL = str2;
        c1479570obb.LJIIZILJ = C2097608Jq.LJIIJ(new Pair("gec", str2));
        c1479570obb.LJJII = aweme.getAwemeType();
        c1482570ogRLIZ.LIZIZ.LJJ = z;
        c1482570ogRLIZ.LIZ(EnumC1046760dLW.VIDEO);
        C1482580ogS c1482580ogS2 = c1482570ogRLIZ.LIZ;
        c1482580ogS2.LJ = c1482570ogRLIZ;
        C1351990lHp c1351990lHp = new C1351990lHp(c1482580ogS2);
        Video video2 = aweme.getVideo();
        if (video2 != null) {
            videoModelStr = video2.getVideoModelStr();
        }
        c1351990lHp.LIZ = videoModelStr;
        c1482580ogS2.LIZLLL = c1351990lHp;
        Video video3 = aweme.getVideo();
        if (video3 == null || (bitRate = video3.getBitRate()) == null) {
            bitRate = C13BV.INSTANCE;
        }
        for (BitRate bitRate2 : bitRate) {
            C1058540deW c1058540deW2 = new C1058540deW(c1482580ogS2);
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
        return new C1484680ojq(c1482580ogS2).LIZ();
    }
}
