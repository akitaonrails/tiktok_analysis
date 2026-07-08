package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.verify.ab.PipoVerifyCandidateConfigModel;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01vC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C488001vC extends C2217421BqW implements Function1<String, Integer> {
    public C488001vC(C488101vD c488101vD) {
        super(1, c488101vD, C488101vD.class, "getCandidateSwitchShowRetryCount", "getCandidateSwitchShowRetryCount(Ljava/lang/String;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(String str) {
        Object next;
        String str2 = str;
        C488101vD c488101vD = C488101vD.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoVerifyCandidateConfigModel pipoVerifyCandidateConfigModel = C488101vD.LIZIZ;
        PipoVerifyCandidateConfigModel pipoVerifyCandidateConfigModel2 = (PipoVerifyCandidateConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_verify_candidate_config", PipoVerifyCandidateConfigModel.class, pipoVerifyCandidateConfigModel);
        if (pipoVerifyCandidateConfigModel2 != null) {
            pipoVerifyCandidateConfigModel = pipoVerifyCandidateConfigModel2;
        }
        pipoVerifyCandidateConfigModel.getClass();
        int iIntValue = 1;
        if (str2 != null && !a0.LJJJIL(str2)) {
            Map<String, Integer> mapLJ = pipoVerifyCandidateConfigModel.candidateSwitchShowRetryCount;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            Iterator<T> it2 = mapLJ.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (u.LJIJI((String) ((Map.Entry) next).getKey(), str2, true)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null) {
                iIntValue = ((Number) entry.getValue()).intValue();
            }
        }
        return Integer.valueOf(iIntValue);
    }
}
