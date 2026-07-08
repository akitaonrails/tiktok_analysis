package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.ies.im.core.api.service.IGlobalActionExecutor;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.ChatUserSetting;
import com.ss.android.ugc.aweme.im.sdk.common.controller.websocket.IMBusinessWsPayload;
import com.ss.android.ugc.aweme.im.search.api.IMSearchApi;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.impl.privacy.UserSettingService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0Z5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894160Z5y implements IAwemeImManager {
    public C0ZUN LIZ;
    public boolean LIZIZ;
    public final C891960Yyw LIZJ = new C0H62() { // from class: X.0Yyw
        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            if (((Boolean) C285090BFj.LJJI.getValue()).booleanValue() && !C0CN5.LJII()) {
                return;
            }
            AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(602);
            if (c0o0l2 == C0O0L.AVAILABLE && ((Boolean) aFwS201S0000000_14.invoke()).booleanValue()) {
                C08TN.LIZ().LJ("aweme_im_manager_on_event", false);
                if (((Number) C293410Bel.LIZ.getValue()).intValue() <= 1) {
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIJJLI(C0YMO.NET);
                }
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("imsdk_enable_nqe_resume_retry_scheduler", false)) {
                    ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIIL().LJIILJJIL().LJFF();
                }
                C08TN.LIZ().LJI("aweme_im_manager_on_event");
            }
        }
    };
    public final C891970Yyx LIZLLL = new C0CSC() { // from class: X.0Yyx
        public EnumC325100Com LIZ;

        {
            INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
            this.LIZ = iNetworkStateService != null ? iNetworkStateService.getNetworkStatus() : null;
        }

        @Override // X.C0CSC
        public final void LIZ(EnumC325100Com enumC325100Com) {
            EnumC325100Com enumC325100Com2;
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("imsdk_enable_nqe_resume_retry_scheduler", false) || enumC325100Com == (enumC325100Com2 = this.LIZ)) {
                return;
            }
            EnumC325100Com enumC325100Com3 = EnumC325100Com.STRONG;
            if (enumC325100Com == enumC325100Com3 || (enumC325100Com == EnumC325100Com.WEAK && enumC325100Com2 != enumC325100Com3)) {
                ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIIL().LJIILJJIL().LJFF();
            }
            this.LIZ = enumC325100Com;
        }
    };

    @Override // com.ss.android.ugc.aweme.im.service.IAwemeImManager
    public final void LIZIZ() {
        IIMPreloadService iIMPreloadService;
        C876340YZk.LIZIZ(null, 3);
        if (!C461720I8s.LJ()) {
            C1906130zhb.LIZ().LIZIZ.edit().remove("userid").remove("token").commit();
            IIMPreloadService iIMPreloadService2 = (IIMPreloadService) PluggableExtentionKt.pluggableSpi$default(IIMPreloadService.class, false, false, false, 14, null);
            if (iIMPreloadService2 == null || iIMPreloadService2.LIZ() == null) {
                return;
            }
            C1329305Id.LIZLLL();
            return;
        }
        long jLIZJ = C461720I8s.LIZJ();
        boolean z = jLIZJ != C1906130zhb.LIZ().LIZIZ.getLong("userid", -1L);
        C1906130zhb.LIZ().LIZIZ.edit().putLong("userid", jLIZJ).commit();
        if (z && (iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpi$default(IIMPreloadService.class, false, false, false, 14, null)) != null && iIMPreloadService.LIZ() != null) {
            C1329305Id.LIZLLL();
        }
        UserSettingService.LIZ.getClass();
        if (C894170Z5z.LIZIZ == null) {
            C894170Z5z.LIZIZ = (UserSettingService) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(UserSettingService.class);
        }
        C894170Z5z.LIZIZ.getUserSettings("").LJJIJIIJI(C11S5.LIZ()).LJJIIZI(new C11L5() { // from class: X.0znH
            @Override // X.C11L5
            public final void accept(Object obj, Object obj2) {
                PushSettings pushSettings = (PushSettings) obj;
                if (pushSettings != null) {
                    C1906130zhb.LIZ().LIZ.edit().putString("chat_user_setting", C051M.LJ(new ChatUserSetting(pushSettings.chatSet, pushSettings.chatSettingsPanel, pushSettings.chatUserType), false)).apply();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAwemeImManager
    public final void LJ() {
        C876340YZk.LIZIZ(null, 3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAwemeImManager
    public final void LIZ() {
        IIMCoreDependProxyService iIMCoreDependProxyServiceLIZ;
        C0YNW c0ynwLIZJ;
        C1DW6 c1dw6;
        if (this.LIZIZ) {
            return;
        }
        try {
            C08TN.LIZ().LJ("cold_boot_init_im", false);
            IIMCoreDependProxyService.LIZ.getClass();
            IIMCoreDependProxyService iIMCoreDependProxyServiceLIZ2 = C882420YjY.LIZ();
            if (iIMCoreDependProxyServiceLIZ2 != null) {
                iIMCoreDependProxyServiceLIZ2.LIZJ();
                WsDependImpl.LL.LJ(new InterfaceC883440YlC() { // from class: X.0YlH
                    @Override // X.InterfaceC883440YlC
                    public final void LIZ(C0Z46 c0z46) {
                    }

                    @Override // X.InterfaceC883440YlC
                    public final void LJI(WsChannelMsg wsChannelMsg) {
                        if (wsChannelMsg.service != 1015 || wsChannelMsg.method != 1 || !C461720I8s.LJ()) {
                            return;
                        }
                        try {
                            IMBusinessWsPayload iMBusinessWsPayload = (IMBusinessWsPayload) C051M.LIZIZ(IMBusinessWsPayload.class, new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
                            if (iMBusinessWsPayload != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onReceivedMsg: ");
                                sbLIZ.append(iMBusinessWsPayload.action);
                                C2188811AlT.LIZIZ(sbLIZ);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Unknown action: ");
                                sbLIZ2.append(iMBusinessWsPayload.action);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                });
            }
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0ynwLIZJ = iIMCoreProxyServiceLIZ.LIZJ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (c1dw6 = (C1DW6) c0ynwLIZJ.LJIIJ.getValue()) != null) {
                ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ(c1dw6);
            }
            IMSearchApi.LIZ.getClass();
            C689060R1c.LIZ().LIZ();
            IGlobalActionExecutor.LJIIJJI.getClass();
            IGlobalActionExecutor value = C894080Z5q.LIZIZ.getValue();
            if (value != null && (iIMCoreDependProxyServiceLIZ = C882420YjY.LIZ()) != null) {
                iIMCoreDependProxyServiceLIZ.LIZ();
                C883250Ykt c883250Ykt = C883250Ykt.LL;
                C883250Ykt.LIZIZ(value);
            }
            C08TN.LIZ().LJI("cold_boot_init_im");
            C0ZVP.LIZIZ.init();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAwemeImManager
    public final void LIZJ() {
        C036E.LIZ.LIZLLL(this.LIZJ);
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null) {
            iNetworkStateService.removeNetworkChangeObserver(this.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAwemeImManager
    public final void LJFF() {
        C036E.LIZ.LIZ(this.LIZJ);
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        if (iNetworkStateService != null) {
            iNetworkStateService.observerNetworkChange(this.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAwemeImManager
    public final C0ZUN getProxy() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.IAwemeImManager
    public final void LIZLLL(C0ZUN c0zun) {
        this.LIZ = c0zun;
    }
}
