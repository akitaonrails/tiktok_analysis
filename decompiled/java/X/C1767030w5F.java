package X;

import com.bytedance.analytics.util.BtmPageSourceConfigModel;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0w5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767030w5F extends C09AY implements Function0<BtmPageSourceConfigModel> {
    public C1767030w5F() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.analytics.util.BtmPageSourceConfigModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final BtmPageSourceConfigModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BtmPageSourceConfigModel btmPageSourceConfigModel = C1767020w5E.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("btm_source_page_info_config", BtmPageSourceConfigModel.class, btmPageSourceConfigModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : btmPageSourceConfigModel;
    }
}
