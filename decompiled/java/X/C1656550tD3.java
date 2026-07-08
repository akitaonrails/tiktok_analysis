package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0tD3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656550tD3 {
    public static final boolean LIZ() {
        boolean zLIZ;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "is_advanced_mobile_effects_enabled", true, false)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1656530tD1.LIZ.getClass();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(null)) {
            zLIZ = false;
        } else {
            AtomicBoolean atomicBoolean = C1656530tD1.LIZIZ;
            if (atomicBoolean.get()) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", "checkPluginInstalled cache flag true");
                zLIZ = true;
            } else {
                zLIZ = false;
                CreativeToolsPluginService creativeToolsPluginService2 = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
                if (creativeToolsPluginService2 != null && creativeToolsPluginService2.LJI(null)) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", "checkPluginInstalled isBundle:true");
                    C20191713zX.LIZ.getClass();
                    zLIZ = C20191713zX.LIZ();
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", "checkPluginInstalledInner ShipPlugin.isReady:" + zLIZ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkPluginInstalledInner result:");
                sbLIZ.append(zLIZ);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", C2188811AlT.LIZIZ(sbLIZ));
                atomicBoolean.set(zLIZ);
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "ame_enable_opt_df_load", true, false) && !zLIZ) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectCreatorAABUtil", "checkPluginInstalledInner not install reload");
                    C20191713zX.LIZ.LIZJ();
                }
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dynamicFeatureLoadState by normal check time cost:");
        sbLIZ2.append(jCurrentTimeMillis2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("MobileEffectAB", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("dynamicFeatureLoadState ret:");
        sbLIZ3.append(zLIZ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("MobileEffectAB", C2188811AlT.LIZIZ(sbLIZ3));
        return zLIZ;
    }

    public static final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "is_advanced_mobile_effects_enabled", true, false);
    }
}
