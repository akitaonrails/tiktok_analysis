package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0KqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530000KqU {
    public static final C530000KqU LIZ = new C530000KqU();

    public static void LIZ(boolean z, AwS552S0100000_8 awS552S0100000_8) {
        if (z) {
            LIZ.getClass();
            LIZLLL("TikTok-CreativeMediaSelector", awS552S0100000_8);
        }
    }

    public static final void LIZIZ(String str, Function0<String> function0) {
        LIZ.getClass();
        LIZLLL(str, function0);
    }

    public static void LIZLLL(String str, Function0 function0) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("studio_enable_media_selector_log", 1) == 1) {
            C533780Kwa c533780Kwa = C533780Kwa.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[thread-");
            sbLIZ2.append(C786410Ut5.u3().getName());
            sbLIZ2.append("] ");
            sbLIZ2.append((String) function0.invoke());
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            C201955140j.LIZJ(c533780Kwa, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
