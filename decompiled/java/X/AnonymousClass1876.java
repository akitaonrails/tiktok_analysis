package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.settings.ECSurpriseSetAnimDebugInfo;

/* JADX INFO: renamed from: X.1876, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1876 {
    public static final ECSurpriseSetAnimDebugInfo LIZ = new ECSurpriseSetAnimDebugInfo(false, 167, 167, 167, 167, 0, 0, 180);

    public static ECSurpriseSetAnimDebugInfo LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECSurpriseSetAnimDebugInfo eCSurpriseSetAnimDebugInfo = LIZ;
        ECSurpriseSetAnimDebugInfo eCSurpriseSetAnimDebugInfo2 = (ECSurpriseSetAnimDebugInfo) settingsManagerLIZLLL.LJIIIIZZ("ttkec_surprise_set_anim_debug", ECSurpriseSetAnimDebugInfo.class, eCSurpriseSetAnimDebugInfo);
        return eCSurpriseSetAnimDebugInfo2 != null ? eCSurpriseSetAnimDebugInfo2 : eCSurpriseSetAnimDebugInfo;
    }
}
