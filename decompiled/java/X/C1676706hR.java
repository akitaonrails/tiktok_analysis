package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.prompts.api.experiments.PromptUFCExtrasConfig;

/* JADX INFO: renamed from: X.06hR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1676706hR {
    public static final PromptUFCExtrasConfig LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final boolean LIZLLL;

    static {
        C0I0B.LJFF.LIZJ();
        LIZ = new PromptUFCExtrasConfig(2200L, 400L, C894660Z7w.LIZJ());
        LIZIZ = LIZ().maxWaitDuration;
        LIZJ = LIZ().bufferDuration;
        LIZLLL = LIZ().enableLogs;
    }

    public static PromptUFCExtrasConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PromptUFCExtrasConfig promptUFCExtrasConfig = LIZ;
        PromptUFCExtrasConfig promptUFCExtrasConfig2 = (PromptUFCExtrasConfig) settingsManagerLIZLLL.LJIIIIZZ("im_prompt_ufc_config", PromptUFCExtrasConfig.class, promptUFCExtrasConfig);
        return promptUFCExtrasConfig2 != null ? promptUFCExtrasConfig2 : promptUFCExtrasConfig;
    }
}
