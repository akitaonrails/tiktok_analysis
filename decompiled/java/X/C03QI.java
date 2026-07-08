package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PipoAndroidTtsOspTimeCostOptimizeModel;

/* JADX INFO: renamed from: X.03QI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03QI {
    public static final C03QI LIZ = new C03QI();
    public static final PipoAndroidTtsOspTimeCostOptimizeModel LIZIZ = new PipoAndroidTtsOspTimeCostOptimizeModel(false, false, false);

    public static PipoAndroidTtsOspTimeCostOptimizeModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoAndroidTtsOspTimeCostOptimizeModel pipoAndroidTtsOspTimeCostOptimizeModel = LIZIZ;
        PipoAndroidTtsOspTimeCostOptimizeModel pipoAndroidTtsOspTimeCostOptimizeModel2 = (PipoAndroidTtsOspTimeCostOptimizeModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_android_tts_osp_time_cost_optimize", PipoAndroidTtsOspTimeCostOptimizeModel.class, pipoAndroidTtsOspTimeCostOptimizeModel);
        return pipoAndroidTtsOspTimeCostOptimizeModel2 != null ? pipoAndroidTtsOspTimeCostOptimizeModel2 : pipoAndroidTtsOspTimeCostOptimizeModel;
    }
}
