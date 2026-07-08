package Y;

import X.C0C9L;
import X.C0CLQ;
import X.C1C7U;
import X.C20144713rx;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C836440Wra;
import X.C844470XAv;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.Calendar;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ACallableS149S0000000_12 implements Callable {
    public final int $t;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public ACallableS149S0000000_12(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS149S0000000_12 aCallableS149S0000000_12) {
        C1C7U.LIZ("FeedFetchModel@3835.doFetchFeedList$1L$1L");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "feed_banned");
            jSONObject.put(Scene.SCENE_SERVICE, "feed");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C844470XAv.LIZ.getClass();
        AppLog.recordMiscLog(C844470XAv.LIZ(), "app_perf", jSONObject);
        C1C7U.LIZIZ("FeedFetchModel@3835.doFetchFeedList$1L$1L");
        return null;
    }

    public static final Object call$1(ACallableS149S0000000_12 aCallableS149S0000000_12) {
        C1C7U.LIZ("VideoViewCounter@7578.increaseViewedCount$1L");
        if (!C0C9L.LIZ().getBoolean("has_reported_viewed_50_many_days", false)) {
            int i = C0C9L.LIZ().getInt("many_days_viewed_count", 0);
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZLLL();
            int i2 = i + 1;
            C0C9L.LIZIZ().putInt("many_days_viewed_count", i2).apply();
            if (i2 >= 30) {
                if (!C0C9L.LIZ().getBoolean("has_reported_viewed_30_many_days", false)) {
                    if (C2222691Bz1.LJIIIZ()) {
                        C836440Wra.LJI(new C20144713rx(939524112), "af_vvfinish_allday30");
                    }
                    C0C9L.LIZIZ().putBoolean("has_reported_viewed_30_many_days", true).apply();
                }
                if (i2 >= 50 && !C0C9L.LIZ().getBoolean("has_reported_viewed_50_many_days", false)) {
                    if (C2222691Bz1.LJIIIZ()) {
                        C836440Wra.LJI(new C20144713rx(939524113), "af_vvfinish_allday50");
                    }
                    C0C9L.LIZIZ().putBoolean("has_reported_viewed_50_many_days", true).apply();
                }
            }
        }
        if (C2222691Bz1.LJIIIZ() || C2222691Bz1.LJIIJ()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(calendar.getTimeInMillis());
            sbLIZ.append("");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String string = C0C9L.LIZ().getString("current_data", "");
            int i3 = C0C9L.LIZ().getInt("one_day_viewed_count", 0);
            if (!TextUtils.equals(strLIZIZ, string)) {
                C0C9L.LIZIZ().putInt("one_day_viewed_count", 0).apply();
                C0C9L.LIZIZ().putString("current_data", strLIZIZ).apply();
                i3 = 0;
            }
            int i4 = i3 + 1;
            C0C9L.LIZIZ().putInt("one_day_viewed_count", i4).apply();
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZLLL();
            if (C2222691Bz1.LJIIJ() && i4 >= 10 && !C0C9L.LIZ().getBoolean("has_reported_viewed_10_one_day", false)) {
                C836440Wra.LJI(new C20144713rx(939524098), "af_vvfinish_aday10");
                C0C9L.LIZIZ().putBoolean("has_reported_viewed_10_one_day", true).apply();
            }
            if (C2222691Bz1.LJIIJ() && i4 >= 20 && !C0C9L.LIZ().getBoolean("has_reported_viewed_20_one_day", false)) {
                C836440Wra.LJI(new C20144713rx(939524099), "af_vvfinish_aday20");
                C0C9L.LIZIZ().putBoolean("has_reported_viewed_20_one_day", true).apply();
            }
            if (C0CLQ.LIZ() && C2222691Bz1.LJIIJ() && i4 >= 10 && !C0C9L.LIZ().getBoolean("has_reported_viewed_10_one_day_login", false)) {
                C836440Wra.LJI(new C20144713rx(939524100), "af_vvfinish_aday10_login");
                C0C9L.LIZIZ().putBoolean("has_reported_viewed_10_one_day_login", true).apply();
            }
            if (C0CLQ.LIZ() && C2222691Bz1.LJIIJ() && i4 >= 20 && !C0C9L.LIZ().getBoolean("has_reported_viewed_20_one_day_login", false)) {
                C836440Wra.LJI(new C20144713rx(939524101), "af_vvfinish_aday20_login");
                C0C9L.LIZIZ().putBoolean("has_reported_viewed_20_one_day_login", true).apply();
            }
            if (C0CLQ.LIZ() && C2222691Bz1.LJIIJ() && i4 >= 30 && !C0C9L.LIZ().getBoolean("has_reported_viewed_30_one_day_login", false)) {
                C836440Wra.LJI(new C20144713rx(939524102), "af_vvfinish_aday30_login");
                C0C9L.LIZIZ().putBoolean("has_reported_viewed_30_one_day_login", true).apply();
            }
            if (C0CLQ.LIZ() && C2222691Bz1.LJIIJ() && i4 >= 50) {
                if (!C0C9L.LIZ().getBoolean("has_reported_viewed_50_one_day_login", false)) {
                    C836440Wra.LJI(new C20144713rx(939524103), "af_vvfinish_aday50_login");
                    C0C9L.LIZIZ().putBoolean("has_reported_viewed_50_one_day_login", true).apply();
                }
            } else if (i4 >= 30) {
            }
            if (!C0C9L.LIZ().getBoolean("has_reported_viewed_30_one_day", false)) {
                C836440Wra.LJI(new C20144713rx(939524104), "af_vvfinish_aday30");
                C0C9L.LIZIZ().putBoolean("has_reported_viewed_30_one_day", true).apply();
            }
            if (i4 >= 50 && !C0C9L.LIZ().getBoolean("has_reported_viewed_50_one_day", false)) {
                C836440Wra.LJI(new C20144713rx(939524105), "af_vvfinish_aday50");
                C0C9L.LIZIZ().putBoolean("has_reported_viewed_50_one_day", true).apply();
            }
        }
        C1C7U.LIZIZ("VideoViewCounter@7578.increaseViewedCount$1L");
        return null;
    }
}
