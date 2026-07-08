package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;

/* JADX INFO: renamed from: X.0ifH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251210ifH {
    public static final C1251210ifH LIZ = new C1251210ifH();

    public static String LIZ() {
        ILiveOuterService iLiveOuterService;
        ILiveEventOuterService iLiveEventOuterServiceK5;
        String liveEventListSchema;
        ILiveEventOuterService iLiveEventOuterServiceK52;
        ILiveOuterService iLiveOuterService2 = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        boolean liveEventSimplifyCreateEnable = (iLiveOuterService2 == null || (iLiveEventOuterServiceK52 = iLiveOuterService2.K5()) == null) ? false : iLiveEventOuterServiceK52.getLiveEventSimplifyCreateEnable();
        SettingsManager.LIZLLL().getClass();
        return (!liveEventSimplifyCreateEnable || (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) == null || (iLiveEventOuterServiceK5 = iLiveOuterService.K5()) == null || (liveEventListSchema = iLiveEventOuterServiceK5.getLiveEventListSchema()) == null) ? SettingsManager.LJI("personal_live_event_list", "") : liveEventListSchema;
    }

    public static boolean LIZIZ() {
        ILiveOuterService iLiveOuterService;
        Boolean bool;
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager == null || (iLiveOuterService = (ILiveOuterService) serviceManager.getService(ILiveOuterService.class)) == null || (bool = (Boolean) iLiveOuterService.LIZJ(Boolean.FALSE, "show_live_info")) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
