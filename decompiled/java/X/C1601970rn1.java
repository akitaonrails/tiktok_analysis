package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601970rn1 {
    public static final C1601970rn1 LIZ = new C1601970rn1();

    static {
        System.currentTimeMillis();
        new Pair(0, 0L);
        new Pair("", "");
        new Pair(0, 0L);
        new Pair("", "");
        new Pair("", "");
    }

    public static void LIZ(JSONObject jSONObject) {
        int iIntValue;
        boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
        int i = !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII;
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        jSONObject.putOpt("from_start_to_current_duration", Long.valueOf(jElapsedRealtime));
        jSONObject.putOpt("is_hybrid_ab_recv", Integer.valueOf(iIntValue));
        jSONObject.putOpt("is_cold_start_first_launch", Integer.valueOf(zBooleanValue ? 1 : 0));
        jSONObject.putOpt("is_did_ready", Integer.valueOf(i));
        C0CR3.LIZ.getClass();
        jSONObject.putOpt("is_hybrid_ab_api_rev", Integer.valueOf(C0CR3.LJIIIZ ? 1 : 0));
        jSONObject.putOpt("is_in_nuj_process", Integer.valueOf(C19254610Um.LIZIZ.LJJIJIIJI()));
        C1913090zsp.LIZ.getClass();
        jSONObject.putOpt("feed_status_on_video_show", Boolean.valueOf(C1913090zsp.LJ));
    }
}
