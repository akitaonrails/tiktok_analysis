package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.recording.settings.AdLandPagePreClickRuleModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07N0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07N0 extends C09AY implements Function0<AdLandPagePreClickRuleModel> {
    public C07N0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.recording.settings.AdLandPagePreClickRuleModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AdLandPagePreClickRuleModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        AdLandPagePreClickRuleModel adLandPagePreClickRuleModel = C1851507Mz.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ads_engaged_info_config", AdLandPagePreClickRuleModel.class, adLandPagePreClickRuleModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : adLandPagePreClickRuleModel;
    }
}
