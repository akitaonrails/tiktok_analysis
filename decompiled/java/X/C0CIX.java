package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.text.a0;
import lth.o;

/* JADX INFO: renamed from: X.0CIX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CIX {
    public static C856350Xib LIZ(int i, String str, String str2) {
        boolean z;
        C19292410dm currentUser = o.LJIIZILJ.getCurrentUser();
        boolean z2 = true;
        if ((currentUser != null && currentUser.LJIIJJI()) || i == 2 || i == 1 || str2 == null || (((Boolean) C262980ASi.LIZ.getValue()).booleanValue() && a0.LJJJIL(str2) && (str == null || a0.LJJJIL(str)))) {
            z = true;
        } else {
            z = false;
        }
        SettingsManager.LIZLLL().getClass();
        boolean zLIZ = SettingsManager.LIZ("allowed_post_prompts", false);
        if (z || !zLIZ) {
            z2 = false;
        }
        return new C856350Xib(str, str2, z2);
    }
}
