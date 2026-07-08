package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988820bq4 {
    public static final C988820bq4 LIZ = new C988820bq4();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C08AZ());

    public static Map LIZIZ() {
        return (Map) LIZIZ.getValue();
    }

    public static final long LIZ(Aweme aweme) {
        float fFloatValue;
        AwemeRawAd awemeRawAd;
        Float effectivePlayTime;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (effectivePlayTime = awemeRawAd.getEffectivePlayTime()) != null) {
            fFloatValue = effectivePlayTime.floatValue();
        } else {
            fFloatValue = 3.0f;
        }
        return C814420VxA.LIZJ(fFloatValue * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static final boolean LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C988820bq4 c988820bq4 = LIZ;
        c988820bq4.getClass();
        if ((LIZJ(c988820bq4, aweme) & 1) == 0) {
            return false;
        }
        return true;
    }

    public static final void LJFF(String str) {
        LIZ.getClass();
        for (Aweme aweme : C09RB.LJJII(C09RB.LJIIIZ(new C08LY(C2097808Js.LJIJJLI(LIZIZ()), AFwS252S0000000_16.get$arr$(679)), new AwS67S1000000_16(str, 47)))) {
            if (LJII(aweme)) {
                C988820bq4 c988820bq4 = LIZ;
                c988820bq4.getClass();
                LJ(aweme, "click");
                c988820bq4.LJI(aweme);
            }
            C988820bq4 c988820bq42 = LIZ;
            c988820bq42.getClass();
            LIZIZ().put(aweme, Integer.valueOf(LIZJ(c988820bq42, aweme) | 1));
        }
    }

    public static final boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.useEffectivePlayAction()) {
            return true;
        }
        return false;
    }

    public final void LJI(Aweme aweme) {
        LIZIZ().put(aweme, Integer.valueOf(LIZJ(this, aweme) | 2));
    }

    public static int LIZJ(C988820bq4 c988820bq4, Aweme aweme) {
        if (aweme == null) {
            c988820bq4.getClass();
            return 0;
        }
        c988820bq4.getClass();
        Integer num = (Integer) LIZIZ().get(aweme);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void LJ(Aweme aweme, String str) {
        UrlModel effectivePlayTrackUrlList;
        Long creativeId;
        String logExtra;
        if (LJII(aweme)) {
            HashMap map = new HashMap();
            map.put("trueview_play_type", str);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C1001140c9w c1001140c9w = new C1001140c9w();
            c1001140c9w.LIZ = aweme.getAwemeRawAd();
            c1001140c9w.LJ = map;
            JSONObject jSONObjectLIZ = c1001140c9w.LIZ();
            if (awemeRawAd != null) {
                C994130byd.LIZ("draw_ad", "trueview_play", jSONObjectLIZ, awemeRawAd);
            }
        } else {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            C1001140c9w c1001140c9w2 = new C1001140c9w();
            c1001140c9w2.LIZ = aweme.getAwemeRawAd();
            JSONObject jSONObjectLIZ2 = c1001140c9w2.LIZ();
            if (awemeRawAd2 != null) {
                C994130byd.LIZ("draw_ad", "trueview_play", jSONObjectLIZ2, awemeRawAd2);
            }
        }
        if (AwemeExtKt.isAdTraffic(aweme)) {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                effectivePlayTrackUrlList = awemeRawAd3.getEffectivePlayTrackUrlList();
                creativeId = awemeRawAd3.getCreativeId();
                logExtra = awemeRawAd3.getLogExtra();
            } else {
                effectivePlayTrackUrlList = null;
                creativeId = null;
                logExtra = null;
            }
            new AwS630S0100000_16(aweme, 106);
            C2201691BEx.LIZ("play_valid", effectivePlayTrackUrlList, creativeId, logExtra);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "trueview_play", awemeRawAd3);
            if (!LJII(aweme)) {
                str = null;
            }
            c1022820ciuLIZLLL.LIZIZ(str, "trueview_play_type");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }
}
