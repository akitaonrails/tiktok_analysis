package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Arrays;

/* JADX INFO: renamed from: X.10Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19210510Dn {
    public static final CharSequence LIZ(Context context) {
        SettingsManager.LIZLLL().getClass();
        String str = "";
        String strLJI = SettingsManager.LJI("ai_remix_toggle_subtitle_learn_more_schema", "");
        if (strLJI.length() != 0) {
            str = strLJI;
        }
        return C0TTR.LIZ(context, C555520LqY.LIZ(C0C9P.AI_REMIX_SUBTITLE, 2131846000, "remix_privacySettings_aiReuseToggle_desc", Arrays.copyOf(new Object[0], 0)), C0TTR.LIZIZ(str));
    }
}
