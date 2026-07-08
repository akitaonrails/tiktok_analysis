package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ug.settings.XOpenHookConfigModel;

/* JADX INFO: renamed from: X.0w4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766550w4T {
    public static final XOpenHookConfigModel LIZ;

    static {
        XOpenHookConfigModel xOpenHookConfigModel = new XOpenHookConfigModel(null, null);
        XOpenHookConfigModel xOpenHookConfigModel2 = (XOpenHookConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_ug_xopen_btm_hook_config", XOpenHookConfigModel.class, xOpenHookConfigModel);
        if (xOpenHookConfigModel2 != null) {
            xOpenHookConfigModel = xOpenHookConfigModel2;
        }
        LIZ = xOpenHookConfigModel;
    }
}
