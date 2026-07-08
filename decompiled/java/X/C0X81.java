package X;

import com.bytedance.hybrid.spark.security.impl.service.lynx.LynxTemplateVerifySettings;

/* JADX INFO: renamed from: X.0X81, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X81 {
    public static final LynxTemplateVerifySettings LIZ = new LynxTemplateVerifySettings(false, 0, null, null, null, null, null, 127, null);
    public static LynxTemplateVerifySettings LIZIZ;

    public static final LynxTemplateVerifySettings LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (LynxTemplateVerifySettings) C0C64.LJIILLIIL().LJJII(LynxTemplateVerifySettings.class, LIZ, "lynx_template_verify_settings", true);
        }
        LynxTemplateVerifySettings lynxTemplateVerifySettings = LIZIZ;
        return lynxTemplateVerifySettings == null ? LIZ : lynxTemplateVerifySettings;
    }
}
