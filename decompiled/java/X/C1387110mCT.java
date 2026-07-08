package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeUpdateExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mCT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387110mCT {
    public static C1387110mCT LIZJ;
    public final Map<String, Aweme> LIZ = new ConcurrentHashMap();
    public final Map<String, Aweme> LIZIZ = new ConcurrentHashMap();

    public final Aweme LIZ(String str) {
        if (TextUtils.isEmpty(str) || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, str) || TextUtils.isEmpty(str)) {
            return null;
        }
        return (Aweme) ((ConcurrentHashMap) this.LIZ).get(str);
    }

    public final AwemeStatistics LIZIZ(String str) {
        Aweme awemeLIZ;
        if (TextUtils.isEmpty(str) || (awemeLIZ = LIZ(str)) == null) {
            return null;
        }
        AwemeStatistics statistics = awemeLIZ.getStatistics();
        if (statistics == null) {
            AwemeStatistics awemeStatistics = new AwemeStatistics();
            awemeLIZ.setStatistics(awemeStatistics);
            return awemeStatistics;
        }
        return statistics;
    }

    public final Aweme LIZLLL(Aweme aweme) {
        String str;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            if (aweme.getVideo() != null && AwemeExtKt.isAdTraffic(aweme)) {
                if (C1017070cZd.LLIZLLLIL(aweme)) {
                    str = "topview";
                } else {
                    str = "is_ads";
                }
                aweme.getVideo().setVideoAdTag(str);
            }
            Aweme aweme2 = (Aweme) ((ConcurrentHashMap) this.LIZ).get(aweme.getAid());
            if (aweme2 != null) {
                String awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme2);
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    awemeRawAd.addReusableExtraParam("aweme_updated", 1);
                }
                AwemeUpdateExtKt.update(aweme2, aweme);
                LIZJ(aweme2, awemeRawAdIdStr);
                return aweme2;
            }
            ((ConcurrentHashMap) this.LIZ).put(aweme.getAid(), aweme);
            LIZJ(aweme, null);
            return aweme;
        }
        return aweme;
    }

    public final void LIZJ(Aweme aweme, String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, AwemeExtKt.getAwemeRawAdIdStr(aweme))) {
            C19719512Dh.LIZJ(this.LIZIZ).remove(str);
        }
        String awemeRawAdIdStr = AwemeExtKt.getAwemeRawAdIdStr(aweme);
        if (!TextUtils.isEmpty(awemeRawAdIdStr)) {
            ((ConcurrentHashMap) this.LIZIZ).put(awemeRawAdIdStr, aweme);
        }
    }
}
