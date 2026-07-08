package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Xbt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852190Xbt {
    public static final C852190Xbt LIZ = new C852190Xbt();
    public static long LIZIZ;

    public static C0XGR LIZ(int i, long j, Activity activity) {
        Bundle bundle;
        C0XGR c0xgr = new C0XGR();
        try {
            bundle = activity.getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        C852170Xbr.LIZ.getClass();
        Map mapLJI = C852170Xbr.LJI(bundle);
        HashMap map = new HashMap();
        if (mapLJI != null) {
            map.putAll(mapLJI);
        }
        C852170Xbr.LIZJ(c0xgr, map);
        String str = "";
        c0xgr.LIZLLL("enter_from", "");
        String string = bundle.getString("login_panel_type");
        if (string == null) {
            string = "";
        }
        c0xgr.LIZLLL("login_panel_type", string);
        String string2 = bundle.getString("channel");
        if (string2 == null) {
            string2 = "";
        }
        c0xgr.LIZLLL("channel", string2);
        c0xgr.LIZ(0, "is_register");
        c0xgr.LIZ(i, "error_code");
        c0xgr.LIZLLL("user_id", "");
        c0xgr.LIZIZ(SystemClock.elapsedRealtime() - j, "stay_time");
        c0xgr.LIZLLL("platform", "tiktok");
        String string3 = bundle.getString("group_id");
        if (string3 == null) {
            string3 = "";
        }
        c0xgr.LIZLLL("group_id", string3);
        String string4 = bundle.getString("author_id");
        if (string4 == null) {
            string4 = "";
        }
        c0xgr.LIZLLL("author_id", string4);
        String string5 = bundle.getString("log_pb");
        if (TextUtils.isEmpty(string5)) {
            string5 = "";
        }
        c0xgr.LIZLLL("log_pb", string5);
        String string6 = bundle.getString("previous_login_method");
        if (string6 != null) {
            str = string6;
        }
        c0xgr.LIZLLL("previous_login_method", str);
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            c0xgr.LIZ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        C0CR3.LIZ.getClass();
        c0xgr.LIZ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        c0xgr.LIZ(1, "is_express_login");
        return c0xgr;
    }
}
