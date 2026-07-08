package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.trill.feedback.api.CSPPageApi;

/* JADX INFO: renamed from: X.0Nwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610340Nwm {
    public static CSPPageApi.CSPButtonRequestBody LIZ() {
        CSPPageApi.LIZ.getClass();
        String str = C610330Nwl.LJFF;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        return new CSPPageApi.CSPButtonRequestBody("TIKTOK_APP_RAP_INDEX_V2", "TIKTOK_APP_RAP_INDEX", C610330Nwl.LIZ(), lLJIILIIL != null ? lLJIILIIL.longValue() : 0L, C610330Nwl.LIZJ, C610330Nwl.LIZLLL, str, C610330Nwl.LJ, C786410Ut5.t2(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getCountryLocale()), "tiktok-android", "", "");
    }
}
