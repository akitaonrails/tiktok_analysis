package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.presenter.IEdmSettingService;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupActionsConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C435101mf {
    public static final C435101mf LIZ = new C435101mf();

    public static void LIZ(PopupActionsConfig popupActionsConfig, C19EG c19eg, Function1 function1) {
        C19476611Hw c19476611HwLIZ;
        C19476611Hw c19476611HwLIZIZ;
        if (popupActionsConfig.edmConsent) {
            int i = C2187451AjH.LIZ;
            ComplianceServiceProvider.LJIJ().LIZIZ(EnumC1238710iL7.GRANTED);
            IPopupInfoService iPopupInfoService = (IPopupInfoService) PluggableExtentionKt.pluggableSpi$default(IPopupInfoService.class, false, false, false, 14, null);
            if (iPopupInfoService != null) {
                iPopupInfoService.LIZLLL(false);
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(c19eg, 20));
        }
        if (popupActionsConfig.edmSubscribe) {
            try {
                IEdmSettingService iEdmSettingService = (IEdmSettingService) PluggableExtentionKt.pluggableSpi$default(IEdmSettingService.class, false, false, false, 14, null);
                if (iEdmSettingService != null && (c19476611HwLIZ = iEdmSettingService.LIZ()) != null) {
                    c19476611HwLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C516201zk(c19eg, 24), new C516201zk(c19eg, 25));
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("EDM_subscribe", "updateEdmSubscribeStatus(1) network error", e);
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(c19eg, 21));
            }
        }
        if (popupActionsConfig.smsConsent) {
            try {
                ISmsSettingService iSmsSettingService = (ISmsSettingService) PluggableExtentionKt.pluggableSpi$default(ISmsSettingService.class, false, false, false, 14, null);
                if (iSmsSettingService != null && (c19476611HwLIZIZ = iSmsSettingService.LIZIZ(1)) != null) {
                    c19476611HwLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C515801zg(function1, c19eg, 4), new C515801zg(function1, c19eg, 5));
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("SMS_consent", "updateSmsConsentStatus(1) network error", e2);
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIIZ(2131834217);
                c1389890mGx.LJIIJJI();
                if (function1 != null) {
                    function1.invoke(e2.toString());
                }
            }
        }
    }
}
