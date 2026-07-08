package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.feed.idelpreload.exp.IDLEPreloadSettingModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1001480cAU extends C09AY implements Function0<IDLEPreloadSettingModel> {
    public C1001480cAU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ad.feed.idelpreload.exp.IDLEPreloadSettingModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IDLEPreloadSettingModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        IDLEPreloadSettingModel iDLEPreloadSettingModel = C1001430cAP.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("commerce_idle_preload_setting", IDLEPreloadSettingModel.class, iDLEPreloadSettingModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : iDLEPreloadSettingModel;
    }
}
