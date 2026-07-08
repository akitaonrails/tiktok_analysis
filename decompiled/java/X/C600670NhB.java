package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.ccdc.libra.PipoAndroidCcdcOcrImplementControlModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600670NhB {
    public static final PipoAndroidCcdcOcrImplementControlModel LIZ;

    static {
        new C600670NhB();
        LIZ = new PipoAndroidCcdcOcrImplementControlModel(true, true, false, true, null);
    }

    public static final PipoAndroidCcdcOcrImplementControlModel LIZ(String str) {
        PipoAndroidCcdcOcrImplementControlModel pipoAndroidCcdcOcrImplementControlModel;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoAndroidCcdcOcrImplementControlModel pipoAndroidCcdcOcrImplementControlModel2 = LIZ;
        PipoAndroidCcdcOcrImplementControlModel pipoAndroidCcdcOcrImplementControlModel3 = (PipoAndroidCcdcOcrImplementControlModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_android_ccdc_ocr_implement_control", PipoAndroidCcdcOcrImplementControlModel.class, pipoAndroidCcdcOcrImplementControlModel2);
        if (pipoAndroidCcdcOcrImplementControlModel3 != null) {
            pipoAndroidCcdcOcrImplementControlModel2 = pipoAndroidCcdcOcrImplementControlModel3;
        }
        Map<String, PipoAndroidCcdcOcrImplementControlModel> map = pipoAndroidCcdcOcrImplementControlModel2.byEntrance;
        if (map != null && (pipoAndroidCcdcOcrImplementControlModel = map.get(str)) != null) {
            return pipoAndroidCcdcOcrImplementControlModel;
        }
        return pipoAndroidCcdcOcrImplementControlModel2;
    }
}
