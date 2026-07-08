package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0sAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616490sAR {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        Video video;
        boolean z;
        boolean z2;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video == null) {
            return false;
        }
        if (aweme.isAd()) {
            if (C1010120cOQ.LJIJI(aweme)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null && C1017180cZo.LJJII(awemeRawAd)) {
                    z = true;
                } else {
                    z = false;
                }
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null && C1017180cZo.LJJIII(awemeRawAd2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2 && !C276200As6.LIZ()) {
                    return false;
                }
            } else if (!C294480BgU.LIZIZ()) {
                return false;
            }
        }
        int awemeType = aweme.getAwemeType();
        if (awemeType == 160 || awemeType == 150 || awemeType == 43 || C729510SjV.LJJ(aweme) || awemeType == 101) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Aweme aweme) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LLJJJJ().LJFF()) {
            return LIZ(aweme);
        }
        if (!c19252910Tv.LIZLLL().LJIJI().LLJJJJ().LJFF() && c19252910Tv.LIZLLL().LJIIJ().LIZ() == 1) {
            return false;
        }
        return LIZ(aweme);
    }
}
