package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.experiment.NudgeFrequencyModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0ZDC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDC implements C0Z9Z {
    public static final C0ZDC LIZIZ = new C0ZDC();
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final Set<String> LIZLLL = new LinkedHashSet();

    @Override // X.C0Z9Z
    public final void LJIILIIL() {
        ((LinkedHashMap) LIZJ).clear();
        LIZLLL.clear();
    }

    @Override // X.C0Z9Z
    public final boolean LJJJJI(C0ZD9 c0zd9) {
        Set<String> set = LIZLLL;
        C0ZDJ.LIZ.getClass();
        return set.contains(C0ZDJ.LIZ(c0zd9));
    }

    public static boolean LIZIZ(C0ZDI c0zdi, String str) {
        long millis;
        Map<String, Long> map = LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0zdi);
        sbLIZ.append('_');
        sbLIZ.append(str);
        Long l = (Long) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (l == null) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        int i = C0ZDH.LIZ[c0zdi.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        millis = 10000;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    NudgeFrequencyModel nudgeFrequencyModel = C0ZDF.LIZ;
                    NudgeFrequencyModel nudgeFrequencyModel2 = (NudgeFrequencyModel) settingsManagerLIZLLL.LJIIIIZZ("nudge_frequency_control", NudgeFrequencyModel.class, nudgeFrequencyModel);
                    if (nudgeFrequencyModel2 != null) {
                        nudgeFrequencyModel = nudgeFrequencyModel2;
                    }
                    millis = timeUnit.toMillis(nudgeFrequencyModel.frequency);
                }
            } else {
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                NudgeFrequencyModel nudgeFrequencyModel3 = C0ZDF.LIZ;
                NudgeFrequencyModel nudgeFrequencyModel4 = (NudgeFrequencyModel) settingsManagerLIZLLL2.LJIIIIZZ("nudge_frequency_control", NudgeFrequencyModel.class, nudgeFrequencyModel3);
                if (nudgeFrequencyModel4 != null) {
                    nudgeFrequencyModel3 = nudgeFrequencyModel4;
                }
                millis = timeUnit2.toMillis(nudgeFrequencyModel3.frequency);
            }
        } else {
            millis = 0;
        }
        if (jCurrentTimeMillis > millis) {
            return true;
        }
        return false;
    }

    @Override // X.C0Z9Z
    public final boolean LJJIFFI(EnumC896030ZDd enumC896030ZDd, String str, String str2) {
        C0ZDJ.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC896030ZDd);
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return LIZLLL.contains(C2188811AlT.LIZIZ(sbLIZ));
    }
}
