package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;

/* JADX INFO: renamed from: X.106M, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C106M {
    public static final C106M LIZ = new C106M();

    public static String LIZ(int i, boolean z) {
        return z ? i != 1 ? i != 4 ? i != 5 ? "unknown" : "no one" : "friends" : "public" : i != 1 ? i != 2 ? "" : "off" : "on";
    }

    public static void LIZIZ(int i, int i2, String str, boolean z) {
        String strLJIIIZ;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", str);
        c191969108h.LIZLLL("original_status", LIZ(i, z));
        c191969108h.LIZLLL("to_status", LIZ(i2, z));
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            strLJIIIZ = iPrivacySettingsDepService.LJIIIZ();
        } else {
            strLJIIIZ = null;
        }
        c191969108h.LIZLLL("inbox_mode", strLJIIIZ);
        c1163504gr.onEventV3("change_activity_status", c191969108h.LIZ);
    }
}
