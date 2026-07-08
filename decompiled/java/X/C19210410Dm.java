package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Arrays;

/* JADX INFO: renamed from: X.10Dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19210410Dm {
    public static final C19210410Dm LIZ = new C19210410Dm();

    public static CharSequence LIZ(Context context, CharSequence charSequence) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("enable_video_privacy_settings_ai_allow_subtitle_fallback", true)) {
            return charSequence;
        }
        String strLIZ = C555520LqY.LIZ(C0C9P.AI_REMIX_SUBTITLE, 2131846000, "remix_privacySettings_aiReuseToggle_desc", Arrays.copyOf(new Object[0], 0));
        if (strLIZ.length() == 0) {
            return charSequence;
        }
        SettingsManager.LIZLLL().getClass();
        String str = "";
        String strLJI = SettingsManager.LJI("ai_remix_toggle_subtitle_learn_more_schema", "");
        if (strLJI.length() != 0) {
            str = strLJI;
        }
        return C0TTR.LIZ(context, strLIZ, C0TTR.LIZIZ(str));
    }
}
