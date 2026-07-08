package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.common.ab.PipoTtpayExtraConfigModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ulz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716650ulz {
    public static List LIZ() {
        String currentLocaleStr = C1717770unn.LIZLLL().getCurrentLocaleStr(C1717770unn.LIZJ().getApplicationContext());
        Map<String, List<String>> map = LIZJ().landingImg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(currentLocaleStr);
        sbLIZ.append("_round");
        List<String> list = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (list != null && !list.isEmpty()) {
            return list;
        }
        Map<String, List<String>> map2 = LIZJ().landingImg;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("en");
        sbLIZ2.append("_round");
        return map2.get(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static List LIZIZ() {
        String currentLocaleStr = C1717770unn.LIZLLL().getCurrentLocaleStr(C1717770unn.LIZJ().getApplicationContext());
        Map<String, List<String>> map = LIZJ().landingLottie;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(currentLocaleStr);
        sbLIZ.append("_round");
        List<String> list = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (list != null && !list.isEmpty()) {
            return list;
        }
        Map<String, List<String>> map2 = LIZJ().landingLottie;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("en");
        sbLIZ2.append("_round");
        return map2.get(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static PipoTtpayExtraConfigModel LIZJ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtpayExtraConfigModel pipoTtpayExtraConfigModel = C1716660um0.LIZ;
        PipoTtpayExtraConfigModel pipoTtpayExtraConfigModel2 = (PipoTtpayExtraConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ttpay_extra_config", PipoTtpayExtraConfigModel.class, pipoTtpayExtraConfigModel);
        return pipoTtpayExtraConfigModel2 != null ? pipoTtpayExtraConfigModel2 : pipoTtpayExtraConfigModel;
    }
}
