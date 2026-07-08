package X;

import com.bytedance.hybrid.spark.security.impl.service.lynx.LynxTemplateVerifyDialogSettings;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0X85, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X85 {
    public static final LynxTemplateVerifyDialogSettings LIZ = new LynxTemplateVerifyDialogSettings("", EnumC843650X7r.NONE.getCode(), "", null, "", "");

    public static final LynxTemplateVerifyDialogSettings LIZ() {
        try {
            return (LynxTemplateVerifyDialogSettings) SettingsManager.LIZLLL().LJIIIIZZ("lynx_template_verify_dialog_settings", LynxTemplateVerifyDialogSettings.class, LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return null;
        }
    }
}
