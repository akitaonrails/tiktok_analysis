package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0WcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826970WcJ {
    public static final C826970WcJ LIZ = new C826970WcJ();

    public static void LIZ(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("is_kids_mode", z ? 1 : 0);
        bundle.putInt("user_mode", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUserMode());
        bundle.putInt("user_period", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUserPeriod());
        bundle.putInt("kids_test_param", 1);
        bundle.putInt("kids_test_case", 2);
        AppLog.setCustomerHeader(bundle);
        AppLog.clearWhenSwitchChildMode(z);
        if (z) {
            AppLog.setEventFilterByClient(C13BV.INSTANCE, false);
            try {
                C2203431BLp.LIZIZ.LIZIZ("KID_MODE");
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).updateVESDKDeviceId("");
        C807620VmC c807620VmC = C807630VmD.LIZ;
        C827000WcM c827000WcM = c807620VmC.LJII;
        if (c827000WcM == null) {
            c827000WcM = new C827000WcM();
        }
        c807620VmC.LIZ(c827000WcM);
        C827070WcT.LIZ.getClass();
        C827070WcT.LIZIZ();
        C788700Uwm.LIZ.getClass();
        C1551950qUL c1551950qULLJIILL = C1552050qUV.LJIILL();
        if (c1551950qULLJIILL != null) {
            c1551950qULLJIILL.LJI("");
        }
        C792400V6o.LIZ("device_id", "");
        C792400V6o.LIZ("install_id", "");
        HashMap map = new HashMap();
        map.put("deviceid", "");
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        TTVideoEngine.LJLJLLL(map);
        C803190Vf3.LIZ().LIZ = "";
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).updateDeviceIdAndInstallId("", "");
    }
}
