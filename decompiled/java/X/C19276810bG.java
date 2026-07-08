package X;

import Y.ACallableS431S0100000_28;
import android.app.Activity;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxView;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService;
import com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.service.IPhotoTopicBannerService;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.gamora.celebration.ICreationPreloadAssetService;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10bG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19276810bG implements InterfaceC20251114Lt {
    public final WeakReference<Context> LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ InterfaceC1246720iY2 LIZLLL;
    public final /* synthetic */ C2273301DyS LJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC20251114Lt
    public final void A() {
        IActionBarMemoryCacheService iActionBarMemoryCacheService;
        C2273351DyX.LJ.storeBoolean("user_change_locale", true);
        C2273301DyS c2273301DyS = this.LJ;
        String str = this.LIZJ;
        I18nManagerServiceApi i18nManagerServiceApi = c2273301DyS.LIZIZ;
        NxRewordManager.LJ(i18nManagerServiceApi != null ? i18nManagerServiceApi.LIZLLL(str) : null);
        Context context = this.LIZ.get();
        if (context == null) {
            return;
        }
        C838680WvC.LIZ().LIZJ(context, this.LIZJ);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            activityLIZ.finish();
        }
        C1594160raQ.LIZ.LIZ = false;
        C1489210or9.LIZ(2);
        this.LJ.getClass();
        C2273301DyS.LJ(context);
        InterfaceC1246720iY2 interfaceC1246720iY2 = this.LIZLLL;
        if (interfaceC1246720iY2 != null) {
            C19277110bJ c19277110bJ = (C19277110bJ) interfaceC1246720iY2;
            String str2 = c19277110bJ.LIZ;
            String str3 = c19277110bJ.LIZIZ;
            String str4 = c19277110bJ.LIZJ.LLJILLL;
            try {
                JSONObject jSONObject = new JSONObject();
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("pre_label", str2);
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put("label", str3);
                jSONObject.put("enter_from", str4);
                AppLogNewUtils.onEventV3("save_app_language_change", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            C1478160oZK.LIZ().clearCache();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Keva.getRepo("TTSettingData").erase("last_get_setting_time");
        if (PluggableExtentionKt.pluggableSpi(ISettingManagerService.class) != null) {
            ((ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class)).LIZIZ(2);
        }
        C2273301DyS c2273301DyS2 = this.LJ;
        c2273301DyS2.getClass();
        C1BVK.LIZIZ().LIZ(null, new ACallableS431S0100000_28(c2273301DyS2, 3), 0);
        if (ComplianceServiceProvider.LJIIIZ() != null && C294580Bge.LIZ()) {
            ComplianceServiceProvider.LJIIIZ().LJ(null, null);
        }
        this.LJ.LIZJ.U4().LIZ();
        AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) C0XQ7.LJFF();
        if (abstractC848400XPy.isLogin()) {
            abstractC848400XPy.LJIIIZ(((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        }
        C19277010bI.LIZ.getClass();
        IPhotoTopicBannerService iPhotoTopicBannerService = C19277010bI.LIZIZ;
        if (iPhotoTopicBannerService != null) {
            iPhotoTopicBannerService.LIZIZ();
        }
        C988700bps.LIZ.LIZIZ().notifyLocaleChange(this.LJ.LIZIZ.LJIJJLI(context));
        if (PluggableExtentionKt.pluggableSpi(IIMService.class) != null) {
            C1336205Ku.LIZ(false).getImInitializeService().LIZ();
        }
        if (PluggableExtentionKt.pluggableSpi(GeckoLocalService.class) != null) {
            ((GeckoLocalService) PluggableExtentionKt.pluggableSpi(GeckoLocalService.class)).LIZ();
        }
        String strLJIILJJIL = this.LJ.LIZIZ.LJIILJJIL(this.LIZIZ);
        C1536660q5g.LIZ.getClass();
        LynxEnv.inst().setLocale(strLJIILJJIL);
        C1529870puj.LIZ.getClass();
        Iterator it2 = ((LinkedHashMap) C1529870puj.LIZJ()).entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) ((Reference) ((Map.Entry) it2.next()).getValue()).get();
            if (interfaceC1541990qEH != 0) {
                InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
                if ((interfaceC1531560pxS != null ? interfaceC1531560pxS.getType() : null) == EnumC1067640dtC.LYNX) {
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    javaOnlyMap.putString("locale", strLJIILJJIL);
                    ((LynxView) interfaceC1541990qEH).sendGlobalEventToLepus("onLocaleChanged", Collections.singletonList(javaOnlyMap));
                }
            }
        }
        C1508730pMd.LIZ.getClass();
        INoticeService iNoticeService = C1508730pMd.LIZIZ;
        if (iNoticeService != null) {
            iNoticeService.notifyLocaleChange(this.LJ.LIZIZ.LJIJJLI(context));
        }
        if (PluggableExtentionKt.pluggableSpi(IStrategyPlatformService.class) != null) {
            ((IStrategyPlatformService) PluggableExtentionKt.pluggableSpi(IStrategyPlatformService.class)).LJFF().LIZ();
        }
        if (PluggableExtentionKt.pluggableSpi(ILightInteractionPlatformService.class) != null) {
            ((InterfaceC913290ZsF) PluggableExtentionKt.pluggableSpi(ILightInteractionPlatformService.class)).LIZ();
        }
        if (((Boolean) C287780BPs.LIZ.getValue()).booleanValue() && (iActionBarMemoryCacheService = (IActionBarMemoryCacheService) PluggableExtentionKt.pluggableSpi(IActionBarMemoryCacheService.class)) != null) {
            iActionBarMemoryCacheService.LIZ();
        }
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIIJJI().LJIILIIL();
        InterfaceC632180Oqu interfaceC632180Oqu = C632170Oqt.LIZ;
        if (interfaceC632180Oqu != null) {
            interfaceC632180Oqu.LIZIZ();
        }
        this.LJ.getClass();
        try {
            ICreationPreloadAssetService iCreationPreloadAssetService = (ICreationPreloadAssetService) PluggableExtentionKt.pluggableSpi(ICreationPreloadAssetService.class);
            if (iCreationPreloadAssetService != null) {
                iCreationPreloadAssetService.LIZIZ();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            ComplianceServiceProvider.LJIJJ().LJJI("switch_language");
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public C19276810bG(C2273301DyS c2273301DyS, Context context, String str, C19277110bJ c19277110bJ) {
        this.LJ = c2273301DyS;
        this.LIZIZ = context;
        this.LIZJ = str;
        this.LIZLLL = c19277110bJ;
        this.LIZ = new WeakReference<>(this.LIZIZ);
    }
}
