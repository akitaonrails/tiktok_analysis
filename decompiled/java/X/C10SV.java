package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.util.Map;

/* JADX INFO: renamed from: X.10SV, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SV {
    public static void LIZ(C2344009Gk c2344009Gk) {
        int iIntValue;
        String str;
        Integer numValueOf;
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII;
        boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
        int i = !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0;
        C844470XAv.LIZ.getClass();
        if (C824390WVp.LIZJ(C844470XAv.LIZ())) {
            str = "on";
        } else {
            str = "off";
        }
        int iLJI = ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJI();
        c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
        c2344009Gk.LIZJ(iIntValue, "is_hybrid_ab_recv");
        c2344009Gk.LIZJ(zBooleanValue ? 1 : 0, "is_cold_start_first_launch");
        c2344009Gk.LIZJ(i, "is_did_ready");
        C0CR3.LIZ.getClass();
        c2344009Gk.LIZJ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        c2344009Gk.LIZJ(C19254610Um.LIZIZ.LJJIJIIJI(), "is_in_nuj_process");
        C1913090zsp.LIZ.getClass();
        c2344009Gk.LJ(Boolean.valueOf(C1913090zsp.LJ), "feed_status_on_video_show");
        c2344009Gk.LJ(Boolean.valueOf(C1913090zsp.LJI), "is_google_attribution_ready");
        c2344009Gk.LJFF("push_permission_status", str);
        c2344009Gk.LIZJ(iLJI, "push_permission_popup_times");
        C10SW.LIZ.getClass();
        c2344009Gk.LJFF("is_af_recv", C10SW.LJI.getDesc());
        c2344009Gk.LJFF("is_gg_ads_recv", C10SW.LJFF.getDesc());
        c2344009Gk.LJFF("is_short_link_recv", C10SW.LJII.getDesc());
        c2344009Gk.LJFF("is_long_link_recv", C10SW.LJIIIIZZ.getDesc());
        c2344009Gk.LJFF("has_referrer_link", C10SW.LIZJ());
        c2344009Gk.LJFF("current_nuj_node", C19240310Oz.LIZ);
        INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null);
        if (iNewUserJourneyService != null) {
            numValueOf = Integer.valueOf(iNewUserJourneyService.LJIILLIIL());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "nuj_times");
        int i2 = C10SW.LJIIJ;
        if (i2 == 1) {
            c2344009Gk.LIZJ(i2, "is_one_loop");
        }
    }

    public final void onEventV3(C10H5 c10h5) {
        C20684815ws.onEventV3(c10h5.toString());
    }

    public static void LIZIZ(C10H5 c10h5, Map map) {
        C20684815ws.LJIILLIIL(c10h5.toString(), map);
    }
}
