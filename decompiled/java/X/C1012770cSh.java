package X;

import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012770cSh {
    public static final void LIZ(C1012780cSi c1012780cSi) {
        AwemeRawAd awemeRawAd;
        c1012780cSi.LIZLLL = EnumC993360bxO.CLICK;
        c1012780cSi.LIZIZ = "background_ad";
        Aweme aweme = c1012780cSi.LIZ;
        Map<String, Object> map = c1012780cSi.LJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZLLL = C1019100ccu.LIZLLL(aweme);
        String str = "";
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        map.put("anchor_id", strLIZLLL);
        String strLJ = C1019100ccu.LJ(aweme);
        if (strLJ != null) {
            str = strLJ;
        }
        map.put("room_id", str);
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            map.put("pack_content_type", awemeRawAd.getType());
        }
        c1012780cSi.LJI.LIZLLL(aweme, map);
        c1012780cSi.LJI.LIZJ(aweme, map, jCurrentTimeMillis);
        c1012780cSi.LJI.LIZIZ(aweme, map, c1012780cSi.LIZJ, c1012780cSi.LIZIZ, c1012780cSi.LJFF);
    }

    public static final void LIZIZ(C1012780cSi c1012780cSi) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        c1012780cSi.LIZLLL = EnumC993360bxO.CLICK;
        c1012780cSi.LIZIZ = "draw_ad";
        Aweme aweme = c1012780cSi.LIZ;
        Map<String, Object> map = c1012780cSi.LJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZLLL = C1019100ccu.LIZLLL(aweme);
        String str = "";
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        map.put("anchor_id", strLIZLLL);
        String strLJ = C1019100ccu.LJ(aweme);
        if (strLJ != null) {
            str = strLJ;
        }
        map.put("room_id", str);
        c1012780cSi.LJI.LIZLLL(aweme, map);
        if (aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
            map.put("charge_type", Integer.valueOf(awemeRawAdLJJIJLIJ.getChargeType()));
            map.put("system_origin", Integer.valueOf(awemeRawAdLJJIJLIJ.getSystemOrigin()));
            map.put("pack_content_type", awemeRawAdLJJIJLIJ.getType());
        }
        c1012780cSi.LJI.LIZIZ(aweme, map, c1012780cSi.LIZJ, c1012780cSi.LIZIZ, c1012780cSi.LJFF);
        c1012780cSi.LJI.LIZ(aweme, map, jCurrentTimeMillis, c1012780cSi.LIZJ);
        c1012780cSi.LJI.LIZJ(aweme, map, jCurrentTimeMillis);
        int i = 0;
        if (Intrinsics.LJFF(c1012780cSi.LIZJ, "button")) {
            map.put("is_lynx", 0);
            map.put("button_type", 2);
            map.put("show_type", ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJJJJ());
        }
        if (Intrinsics.LJFF(c1012780cSi.LIZJ, "slide")) {
            map.put("is_under_guide", Integer.valueOf(C0SQJ.LIZJ ? 1 : 0));
        }
        if (Intrinsics.LJFF(c1012780cSi.LIZJ, "title")) {
            if (aweme != null && AwemeBizExtKt.isDesMoreTextShow(aweme)) {
                i = 1;
            }
            map.put("if_title_collapsed", Integer.valueOf(i));
        }
    }

    public static final void LIZJ(C1012780cSi c1012780cSi) {
        c1012780cSi.LIZIZ = "homepage_ad";
        c1012780cSi.LIZLLL = EnumC993360bxO.CLICK;
        Aweme aweme = c1012780cSi.LIZ;
        Map<String, Object> map = c1012780cSi.LJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZLLL = C1019100ccu.LIZLLL(aweme);
        String str = "";
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        map.put("anchor_id", strLIZLLL);
        String strLJ = C1019100ccu.LJ(aweme);
        if (strLJ != null) {
            str = strLJ;
        }
        map.put("room_id", str);
        c1012780cSi.LJI.LIZIZ(aweme, map, c1012780cSi.LIZJ, c1012780cSi.LIZIZ, c1012780cSi.LJFF);
        c1012780cSi.LJI.LIZLLL(aweme, map);
        c1012780cSi.LJI.LIZJ(aweme, map, jCurrentTimeMillis);
    }

    public static final void LIZLLL(C1012780cSi c1012780cSi) {
        Aweme aweme = c1012780cSi.LIZ;
        Map<String, Object> map = c1012780cSi.LJ;
        String strLIZLLL = C1019100ccu.LIZLLL(aweme);
        String str = "";
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        map.put("anchor_id", strLIZLLL);
        String strLJ = C1019100ccu.LJ(aweme);
        if (strLJ != null) {
            str = strLJ;
        }
        map.put("room_id", str);
    }
}
