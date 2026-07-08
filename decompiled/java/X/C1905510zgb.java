package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.experiment.TakoEmojiPatternModel;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0zgb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905510zgb {
    public static final Pattern LIZ;

    static {
        Pattern patternCompile;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            TakoEmojiPatternModel takoEmojiPatternModel = C1905520zgc.LIZ;
            TakoEmojiPatternModel takoEmojiPatternModel2 = (TakoEmojiPatternModel) settingsManagerLIZLLL.LJIIIIZZ("tako_emoji_pattern", TakoEmojiPatternModel.class, takoEmojiPatternModel);
            if (takoEmojiPatternModel2 != null) {
                takoEmojiPatternModel = takoEmojiPatternModel2;
            }
            patternCompile = PatternProtector.compile(takoEmojiPatternModel.regex);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            patternCompile = PatternProtector.compile(C1905520zgc.LIZ.regex);
        }
        LIZ = patternCompile;
    }

    public static final Map<String, String> LIZ(String str) {
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new AbstractC1905540zge<Map<String, String>>() { // from class: X.0zga
            }.getType();
            c1227904rF.getClass();
            return (Map) C1227904rF.LIZJ(str, type);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
