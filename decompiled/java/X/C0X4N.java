package X;

import Y.ARunnableS92S0000000_13;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.childhook.services.ChildHookServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.cubes.GoogleCubesService;
import com.ss.android.ugc.aweme.cubesapi.IGoogleCubesApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import com.ss.android.ugc.aweme.launcher.service.interceptor.IChildHookService;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.share.ShareService;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X4N, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4N {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile long LIZLLL;
    public static final C0X4N LIZ = new C0X4N();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(310));

    public static void LIZ() {
        IAVEffectService iAVEffectServiceEffectService;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && ((AbstractC848400XPy) iAccountUserServiceLJFF).isLogin()) {
            AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) iAccountUserServiceLJFF;
            AppLog.setUserId(CastLongProtector.parseLong(abstractC848400XPy.getCurUserId()));
            AppLog.setSessionKey(abstractC848400XPy.LJIIZILJ());
        }
        ComplianceServiceProvider.LJII().LJIILLIIL();
        C0XQ7.LJFF();
        AbstractC848400XPy.LJJIJLIJ();
        C10EU.LIZ = null;
        C10EU.LIZIZ = null;
        ComplianceServiceProvider.LJIILJJIL().LJ(false);
        ComplianceServiceProvider.LJIILJJIL().LJIILIIL(EnumC1876780ywG.REJECT, EnumC1915980zxU.CONSENT_KIDS_MODE, "removeDeviceConsent", null);
        ISecApi iSecApi = (ISecApi) ServiceManager.get().getService(ISecApi.class);
        if (iSecApi != null) {
            iSecApi.reportData(C0X4S.LOGGED.getReportName());
        }
        ShareService shareService = (ShareService) ServiceManager.get().getService(ShareService.class);
        if (shareService != null) {
            C844470XAv.LIZ.getClass();
            shareService.LJIILLIIL(C844470XAv.LIZ(), true);
        }
        ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class);
        if (iCommonFeedApiService != null) {
            iCommonFeedApiService.LIZJ();
        }
        IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class);
        if (iPNSDeviceConsentService != null) {
            iPNSDeviceConsentService.LJIIJ();
        }
        IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
        if (iExternalService != null) {
            Context contextLJFF = C2214201BlK.LJFF();
            if (contextLJFF == null) {
                C844470XAv.LIZ.getClass();
                contextLJFF = C844470XAv.LIZ();
            }
            IAVPublishService iAVPublishServicePublishService = iExternalService.publishService();
            if (iAVPublishServicePublishService != null) {
                iAVPublishServicePublishService.cancelSynthesis(contextLJFF, "ftc_login");
            }
            IAbilityService iAbilityServiceAbilityService = iExternalService.abilityService();
            if (iAbilityServiceAbilityService != null && (iAVEffectServiceEffectService = iAbilityServiceAbilityService.effectService()) != null) {
                iAVEffectServiceEffectService.clearCacheInFTC();
            }
        }
        IPNSDeviceConsentService iPNSDeviceConsentService2 = (IPNSDeviceConsentService) ServiceManager.get().getService(IPNSDeviceConsentService.class);
        if (iPNSDeviceConsentService2 != null) {
            iPNSDeviceConsentService2.LJFF("ftc_login", false);
        }
        ISettingManagerService iSettingManagerService = (ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class);
        if (iSettingManagerService != null) {
            iSettingManagerService.LIZ();
        }
        IKidsCommonService iKidsCommonService = (IKidsCommonService) ServiceManager.get().getService(IKidsCommonService.class);
        if (iKidsCommonService != null) {
            iKidsCommonService.LJII();
        }
        IGoogleCubesApi iGoogleCubesApiLJI = GoogleCubesService.LJI();
        if (iGoogleCubesApiLJI != null) {
            iGoogleCubesApiLJI.LJ(true, null);
        }
    }

    public static void LIZIZ() throws Throwable {
        SharePrefCache.inst().clearCache();
        ISettingManagerService iSettingManagerService = (ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class);
        if (iSettingManagerService != null) {
            iSettingManagerService.LIZIZ(1);
        }
        ComplianceServiceProvider.LJJI().LJIILIIL();
        ComplianceServiceProvider.LJII().LJIILIIL();
        C10EU.LIZ = null;
        C10EU.LIZIZ = null;
        Bundle bundle = new Bundle();
        bundle.putInt("user_mode", 0);
        bundle.putInt("user_period", 0);
        AppLog.setCustomerHeader(bundle);
        IKidsCommonService iKidsCommonService = (IKidsCommonService) ServiceManager.get().getService(IKidsCommonService.class);
        if (iKidsCommonService != null) {
            iKidsCommonService.clearCache();
        }
        ComplianceServiceProvider.LJIILJJIL().LJ(false);
        ComplianceServiceProvider.LJIILJJIL().LJIILIIL(EnumC1876780ywG.REJECT, EnumC1915980zxU.CONSENT_KIDS_LOGIN_ONCE, "removeDeviceConsent", null);
        ShareService shareService = (ShareService) ServiceManager.get().getService(ShareService.class);
        if (shareService != null) {
            C844470XAv.LIZ.getClass();
            shareService.LJIILLIIL(C844470XAv.LIZ(), true);
        }
        ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class);
        if (iCommonFeedApiService != null) {
            iCommonFeedApiService.LJIJJLI();
        }
        ComplianceServiceProvider.LJIL().LJJJJ();
    }

    public static void LIZJ(final String str) {
        IChildHookService iChildHookService;
        IRuleEngineService iRuleEngineService = (IRuleEngineService) PluggableExtentionKt.pluggableSpi$default(IRuleEngineService.class, false, false, false, 14, null);
        if (iRuleEngineService != null) {
            iRuleEngineService.LIZIZ();
        }
        C788700Uwm.LIZ.getClass();
        C791820V4i c791820V4i = C787900UvU.LIZ;
        c791820V4i.LIZJ(new ARunnableS92S0000000_13(10));
        c791820V4i.LIZIZ = false;
        c791820V4i.LJFF(c791820V4i.LIZLLL);
        c791820V4i.LJFF(c791820V4i.LJ);
        Object objLIZ = C04TD.LIZ(IChildHookService.class, false);
        if (objLIZ != null) {
            iChildHookService = (IChildHookService) objLIZ;
        } else {
            if (C04TD.LLJIJIL == null) {
                synchronized (IChildHookService.class) {
                    if (C04TD.LLJIJIL == null) {
                        C04TD.LLJIJIL = new ChildHookServiceImpl();
                    }
                }
            }
            iChildHookService = C04TD.LLJIJIL;
        }
        if (iChildHookService != null) {
            Context contextLJFF = C2214201BlK.LJFF();
            if (contextLJFF == null) {
                C844470XAv.LIZ.getClass();
                contextLJFF = C844470XAv.LIZ();
            }
            iChildHookService.LIZIZ(contextLJFF);
            iChildHookService.LIZJ();
            iChildHookService.LIZ();
        }
        C842820X4m c842820X4m = C842820X4m.LIZ;
        C842790X4j c842790X4j = new C842790X4j(11, str, true, true, true, false);
        InterfaceC842850X4p interfaceC842850X4p = new InterfaceC842850X4p() { // from class: X.0X4R
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str2, boolean z) {
                C0X4N c0x4n = C0X4N.LIZ;
                String str3 = str;
                c0x4n.getClass();
                C0X4N.LIZLLL(str3, true);
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str2, boolean z) {
                C0X4N c0x4n = C0X4N.LIZ;
                String str3 = str;
                c0x4n.getClass();
                C0X4N.LIZLLL(str3, false);
            }
        };
        c842820X4m.getClass();
        C842820X4m.LIZIZ(c842790X4j, interfaceC842850X4p);
    }

    public static void LJ(String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId != null && strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId.length() != 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_did_change", str2);
        c2344009Gk.LJIIIIZZ("delay", String.valueOf(System.currentTimeMillis() - LIZLLL));
        ((Keva) LJ.getValue()).storeString("kid_change_did", c2344009Gk.LIZ.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0X4O] */
    public static void LIZLLL(final String str, final boolean z) {
        LIZLLL = System.currentTimeMillis();
        ComplianceServiceProvider.LJII().LJIILJJIL(new Runnable() { // from class: X.0X4O
            /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    r3 = this;
                    boolean r0 = r1     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L53
                    if (r0 == 0) goto Ld
                    X.0X4N r0 = X.C0X4N.LIZ     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L53
                    r0.getClass()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L53
                    X.C0X4N.LIZ()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L53
                    goto L15
                Ld:
                    X.0X4N r0 = X.C0X4N.LIZ     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L53
                    r0.getClass()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L53
                    X.C0X4N.LIZIZ()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L53
                L15:
                    X.0X4N r1 = X.C0X4N.LIZ
                    java.lang.String r0 = r2
                    r1.getClass()
                    X.C0X4N.LJ(r0)
                    boolean r1 = r1
                    java.lang.String r0 = r2
                    X.C0X4N.LJFF(r0, r1)
                    boolean r0 = r1
                    if (r0 == 0) goto L4f
                    goto L44
                L2b:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L53
                    X.0X4N r1 = X.C0X4N.LIZ
                    java.lang.String r0 = r2
                    r1.getClass()
                    X.C0X4N.LJ(r0)
                    boolean r1 = r1
                    java.lang.String r0 = r2
                    X.C0X4N.LJFF(r0, r1)
                    boolean r0 = r1
                    if (r0 == 0) goto L4f
                L44:
                    X.C08Q1.LIZLLL()
                L47:
                    java.lang.String r1 = r2
                    X.0X4Q r0 = X.C0X4Q.RELAUNCH_TASK
                    X.C0X4N.LJI(r1, r0)
                    return
                L4f:
                    X.C08Q1.LIZ()
                    goto L47
                L53:
                    r2 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L53
                    X.0X4N r1 = X.C0X4N.LIZ
                    java.lang.String r0 = r2
                    r1.getClass()
                    X.C0X4N.LJ(r0)
                    boolean r1 = r1
                    java.lang.String r0 = r2
                    X.C0X4N.LJFF(r0, r1)
                    boolean r0 = r1
                    if (r0 == 0) goto L77
                    X.C08Q1.LIZLLL()
                L6f:
                    java.lang.String r1 = r2
                    X.0X4Q r0 = X.C0X4Q.RELAUNCH_TASK
                    X.C0X4N.LJI(r1, r0)
                    throw r2
                L77:
                    X.C08Q1.LIZ()
                    goto L6f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0X4O.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("KidsLoginUtils@ee7c.relaunchTask$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("KidsLoginUtils@ee7c.relaunchTask$1");
            }
        }, z);
    }

    public static void LJFF(String str, boolean z) {
        String str2;
        List<String> listLJJI = ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI();
        if (z) {
            if (listLJJI.size() == 1 && Intrinsics.LJFF(ListProtector.get(listLJJI, 0), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                return;
            }
        } else if (listLJJI.size() == 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("isKidsLogin", str2);
        c2344009Gk.LJIIIIZZ("delay", String.valueOf(System.currentTimeMillis() - LIZLLL));
        ((Keva) LJ.getValue()).storeString("user_mode_data_invalid", c2344009Gk.LIZ.toString());
    }

    public static void LJI(String str, C0X4Q c0x4q) {
        int i = C0X4P.LIZ[c0x4q.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZJ = true;
            } else {
                throw new C1954807lC();
            }
        } else {
            LIZIZ = true;
        }
        if (LIZJ && LIZIZ) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            ((Keva) LJ.getValue()).storeString("state_machine_restart_app", c2344009Gk.LIZ.toString());
            Context contextLJFF = C2214201BlK.LJFF();
            if (contextLJFF == null) {
                C844470XAv.LIZ.getClass();
                contextLJFF = C844470XAv.LIZ();
            }
            ComplianceServiceProvider.LJII().LJIILL(contextLJFF);
        }
    }
}
