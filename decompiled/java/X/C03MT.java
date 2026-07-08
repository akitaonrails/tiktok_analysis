package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03MT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MT {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("pipo_tts_osp_ccdc_select_style", false) && C037R.LIZ();
    }

    public static boolean LIZIZ(String str) {
        if (LIZ()) {
            if (!Intrinsics.LJFF(str, "pm_pi_ccdc_all")) {
                C03SY.LIZ.getClass();
                if (C03SY.LJIIZILJ(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
