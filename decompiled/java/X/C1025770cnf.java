package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0cnf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025770cnf {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ(Integer num, EnumC1027330cqB enumC1027330cqB) {
        int iIntValue;
        int iIntValue2;
        if (num != null) {
            num.intValue();
            switch (C1027320cqA.LIZ[enumC1027330cqB.ordinal()]) {
                case 1:
                    return Integer.valueOf((num.intValue() & 67108864) | 67108864);
                case 2:
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("pns_jsb_dfid_fix", false)) {
                        iIntValue2 = 335544320;
                    } else {
                        iIntValue2 = (num.intValue() & 67108864) | 67108864;
                    }
                    return Integer.valueOf(iIntValue2);
                case 3:
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("pns_jsb_dfid_fix", false)) {
                        iIntValue = 1207969305;
                    } else {
                        iIntValue = (num.intValue() & 67108864) | 67108864;
                    }
                    return Integer.valueOf(iIntValue);
                case 4:
                    return Integer.valueOf((num.intValue() & SpeechEngineDefines.TTS_WORK_MODE_BOTH) | 24576);
                case 5:
                    return Integer.valueOf((num.intValue() & SpeechEngineDefines.TTS_WORK_MODE_BOTH) | SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                case 6:
                    return Integer.valueOf((num.intValue() & SpeechEngineDefines.TTS_WORK_MODE_BOTH) | 20480);
                case 7:
                    return Integer.valueOf((num.intValue() & SpeechEngineDefines.TTS_WORK_MODE_BOTH) | 28672);
                default:
                    throw new C1954807lC();
            }
        }
        return null;
    }
}
