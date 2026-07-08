package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.tako.setting.TakoVoiceInputBugfixParams;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1AoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190691AoV {
    public static final TakoVoiceInputBugfixParams LIZ = new TakoVoiceInputBugfixParams(true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(260));

    public static boolean LIZ() {
        if (((Boolean) C0B18.LIZ.getValue()).booleanValue()) {
            return ((Boolean) LIZIZ.getValue()).booleanValue();
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TakoVoiceInputBugfixParams takoVoiceInputBugfixParams = LIZ;
        TakoVoiceInputBugfixParams takoVoiceInputBugfixParams2 = (TakoVoiceInputBugfixParams) settingsManagerLIZLLL.LJIIIIZZ("tako_voice_input_bugfix_config", TakoVoiceInputBugfixParams.class, takoVoiceInputBugfixParams);
        if (takoVoiceInputBugfixParams2 != null) {
            takoVoiceInputBugfixParams = takoVoiceInputBugfixParams2;
        }
        return takoVoiceInputBugfixParams.enable;
    }
}
