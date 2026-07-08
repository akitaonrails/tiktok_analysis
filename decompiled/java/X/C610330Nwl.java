package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;

/* JADX INFO: renamed from: X.0Nwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610330Nwl {
    public static final /* synthetic */ C610330Nwl LIZ = new C610330Nwl();
    public static final String LIZIZ = C0CQT.LIZJ;
    public static final String LIZJ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    public static final int LIZLLL;
    public static final String LJ;
    public static final String LJFF;

    static {
        C844470XAv.LIZ.getClass();
        LIZLLL = C844470XAv.LJIIJ;
        LJ = C844470XAv.LJFF();
        LJFF = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    public static String LIZ() {
        return ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage();
    }
}
