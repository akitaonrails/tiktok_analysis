package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.property.SmartCompileModelV1;

/* JADX INFO: renamed from: X.0nZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439970nZj {
    public static SmartCompileModelV1 LIZ() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_smart_compile_effect", true)) {
            return (SmartCompileModelV1) SettingsManager.LIZLLL().LJIIIIZZ("smart_compile_model", SmartCompileModelV1.class, null);
        }
        return null;
    }
}
