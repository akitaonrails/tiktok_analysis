package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: renamed from: X.0StL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735610StL {
    public static String LIZIZ(Aweme aweme) {
        VideoUrlModel playAddr;
        if (aweme != null) {
            try {
                if (!AwemeExtKt.isAdTraffic(aweme) || aweme.getVideo() == null || (playAddr = aweme.getVideo().getPlayAddr()) == null) {
                    return null;
                }
                return playAddr.getOriginUri();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public static String LIZ(int i, String str, boolean z) {
        if (TextUtils.equals(str, "following_window")) {
            return "following_window";
        }
        if (TextUtils.equals(str, "homepage_friends")) {
            return "homepage_friends";
        }
        if (TextUtils.equals(str, "paid_series_detail_page")) {
            return "paid_series_detail_page";
        }
        if (TextUtils.equals(str, "homepage_nearby")) {
            return "homepage_nearby";
        }
        if (C2277711EDh.LIZIZ.LJIIL(str)) {
            return str;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    String str2 = "personal_homepage";
                    if (i != 1000 && i != 1001) {
                        str2 = "others_homepage";
                        if (i != 2000 && i != 2001) {
                            if (i != 3002) {
                                if (i != 3003) {
                                    if (i != 4000) {
                                        if (i != 4001) {
                                            if (i != 9000) {
                                                if (i != 9001) {
                                                    if (i != 21000) {
                                                        if (TextUtils.equals(str, "upload")) {
                                                            return "release";
                                                        }
                                                        return str;
                                                    }
                                                    return "mall_racun_channel";
                                                }
                                                return "playlist";
                                            }
                                            return "discovery";
                                        }
                                        return "single_Msong_fresh";
                                    }
                                    if (z) {
                                        return "single_song";
                                    }
                                    return "single_song_hot";
                                }
                                return "challenge_fresh";
                            }
                            return "challenge";
                        }
                    }
                    return str2;
                }
                return "homepage_fresh";
            }
            return "homepage_follow";
        }
        return "homepage_hot";
    }
}
