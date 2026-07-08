package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PipoTtsOspBlikConfigModel;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03hE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C911003hE {
    public static final PipoTtsOspBlikConfigModel LIZ = new PipoTtsOspBlikConfigModel(0, 0, 0, false, null, null, false, 127, null);

    public static final boolean LIZ() {
        return LIZLLL().enableParallelPolling;
    }

    public static final int LIZIZ() {
        return LIZLLL().pollingInterval;
    }

    public static final int LIZJ() {
        return LIZLLL().pollingTimes;
    }

    public static PipoTtsOspBlikConfigModel LIZLLL() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsOspBlikConfigModel pipoTtsOspBlikConfigModel = LIZ;
        PipoTtsOspBlikConfigModel pipoTtsOspBlikConfigModel2 = (PipoTtsOspBlikConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_osp_blik_config", PipoTtsOspBlikConfigModel.class, pipoTtsOspBlikConfigModel);
        return pipoTtsOspBlikConfigModel2 != null ? pipoTtsOspBlikConfigModel2 : pipoTtsOspBlikConfigModel;
    }

    public static final boolean LJ(String str) {
        List<String> list;
        if (str != null && !a0.LJJJIL(str) && (list = LIZLLL().errorCodes) != null && list.contains(str)) {
            return true;
        }
        return false;
    }
}
