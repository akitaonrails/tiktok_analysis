package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399330mWB {
    public static final C1399330mWB LIZ = new C1399330mWB();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static List<? extends Aweme> LIZLLL;
    public static List<? extends Aweme> LJ;

    public static void LIZ(List list) {
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        if (jCurrentTimeMillis > 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "lazy_load_lite_duration");
            C20684815ws.LJIILLIIL("tool_performance_music_detail_tracker", c2344009Gk.LIZ);
        }
        LIZLLL = list;
    }

    public static void LIZIZ(List list) {
        int iMin;
        int size;
        int awemeType;
        int awemeType2;
        int iIntValue;
        int awemeType3;
        String uri;
        Aweme aweme;
        Video video;
        UrlModel cover;
        String uri2;
        Aweme aweme2;
        Video video2;
        UrlModel cover2;
        Aweme aweme3;
        Aweme aweme4;
        VideoMaskInfo videoMaskInfo;
        Integer num;
        Aweme aweme5;
        Aweme aweme6;
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
        if (jCurrentTimeMillis > 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "lazy_load_items_duration");
            C20684815ws.LJIILLIIL("tool_performance_music_detail_tracker", c2344009Gk.LIZ);
        }
        LJ = list;
        List<? extends Aweme> list2 = LIZLLL;
        if (list2 != null) {
            iMin = list2.size();
        } else {
            iMin = 0;
        }
        List<? extends Aweme> list3 = LJ;
        if (list3 != null) {
            size = list3.size();
        } else {
            size = 0;
        }
        int iAbs = Math.abs(iMin - size);
        if (iAbs > 0) {
            iMin = Math.min(iMin, size);
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iMin; i4++) {
            List<? extends Aweme> list4 = LIZLLL;
            if (list4 != null && (aweme6 = (Aweme) C13LP.LJJJLZIJ(i4, list4)) != null) {
                awemeType = aweme6.getAwemeType();
            } else {
                awemeType = 0;
            }
            List<? extends Aweme> list5 = LJ;
            if (list5 != null && (aweme5 = (Aweme) C13LP.LJJJLZIJ(i4, list5)) != null) {
                awemeType2 = aweme5.getAwemeType();
            } else {
                awemeType2 = 0;
            }
            if (awemeType != awemeType2) {
                i++;
            }
            List<? extends Aweme> list6 = LIZLLL;
            if (list6 != null && (aweme4 = (Aweme) C13LP.LJJJLZIJ(i4, list6)) != null && (videoMaskInfo = aweme4.getVideoMaskInfo()) != null && (num = videoMaskInfo.maskType) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            List<? extends Aweme> list7 = LJ;
            if (list7 != null && (aweme3 = (Aweme) C13LP.LJJJLZIJ(i4, list7)) != null) {
                awemeType3 = aweme3.getAwemeType();
            } else {
                awemeType3 = 0;
            }
            if (iIntValue != awemeType3) {
                i2++;
            }
            List<? extends Aweme> list8 = LIZLLL;
            String str = "";
            if (list8 == null || (aweme2 = (Aweme) C13LP.LJJJLZIJ(i4, list8)) == null || (video2 = aweme2.getVideo()) == null || (cover2 = video2.getCover()) == null || (uri = cover2.getUri()) == null) {
                uri = "";
            }
            List<? extends Aweme> list9 = LJ;
            if (list9 != null && (aweme = (Aweme) C13LP.LJJJLZIJ(i4, list9)) != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (uri2 = cover.getUri()) != null) {
                str = uri2;
            }
            if (!Intrinsics.LJFF(uri, str)) {
                i3++;
            }
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZJ(iAbs, "lazy_load_missing_item_count");
        c2344009Gk2.LIZJ(i, "lazy_load_mismatch_awemetype_count");
        c2344009Gk2.LIZJ(i2, "lazy_load_mismatch_masktype_count");
        c2344009Gk2.LIZJ(i3, "lazy_load_mismatch_url_count");
        C20684815ws.LJIILLIIL("tool_performance_music_detail_tracker", c2344009Gk2.LIZ);
    }
}
