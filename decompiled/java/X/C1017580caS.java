package X;

import android.graphics.Point;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0caS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017580caS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final Aweme aweme, final String str, final boolean z) {
        final AwemeRawAd awemeRawAd;
        final AwemePlayFunModel playFunModel;
        ExecutorService logThreadPool;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (playFunModel = awemeRawAd.getPlayFunModel()) == null) {
            return;
        }
        Callable callable = new Callable() { // from class: X.0XJ5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit unit;
                List<String> urlList;
                C1C7U.LIZ("AdPlayFunMonitorLog@93ca.monitorStatusRate$1");
                try {
                    int i = z ? 0 : 1;
                    JSONObject jSONObject = new JSONObject();
                    UrlModel urlModel = playFunModel.imageInfo;
                    unit = null;
                    if (urlModel != null && (urlList = urlModel.getUrlList()) != null && !urlList.isEmpty()) {
                        jSONObject.put("material_url", urlList.get(0));
                    }
                    jSONObject.put("creative_id", awemeRawAd.getCreativeId().longValue());
                    jSONObject.put("log_extra", awemeRawAd.getLogExtra());
                    jSONObject.put("aweme_id", aweme.getAid());
                    IMonitorDepend iMonitorDependLIZJ = C2214471Bll.LIZJ();
                    if (iMonitorDependLIZJ != null) {
                        iMonitorDependLIZJ.monitorStatusRate(str, i, jSONObject);
                        unit = Unit.LIZ;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    unit = Unit.LIZ;
                }
                C1C7U.LIZIZ("AdPlayFunMonitorLog@93ca.monitorStatusRate$1");
                return unit;
            }
        };
        IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
        if (iAppLogDependLIZ != null) {
            logThreadPool = iAppLogDependLIZ.getLogThreadPool();
        } else {
            logThreadPool = null;
        }
        C15O7.LIZIZ(callable, logThreadPool, null);
    }

    public static void LIZIZ(Aweme aweme, boolean z, String str, Point point, Point point2) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            int i = !z ? 1 : 0;
            HashMap<String, String> map = new HashMap<>();
            map.put("state", str);
            if (point != null) {
                map.put("egg_coordinate_x", String.valueOf(point.x));
                map.put("egg_coordinate_y", String.valueOf(point.y));
            }
            if (point2 != null) {
                map.put("text_coordinate_x", String.valueOf(point2.x));
                map.put("text_coordinate_y", String.valueOf(point2.y));
            }
            C1017570caR c1017570caR = new C1017570caR("playfun", "show_result", i, System.currentTimeMillis());
            c1017570caR.LJ = aweme.getAid();
            c1017570caR.LJFF = awemeRawAd.getCreativeIdStr();
            c1017570caR.LJI = awemeRawAd.getLogExtra();
            c1017570caR.LJIIIIZZ = map;
            C1017560caQ.LJFF(c1017570caR);
            if (Intrinsics.LJFF(str, "display")) {
                LIZ(aweme, "aweme_ad_play_fun_show_error_rate", z);
            }
        }
    }
}
