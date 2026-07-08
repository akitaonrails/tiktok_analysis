package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851730Xb9 {
    public static boolean LIZ() {
        Set<String> set = C1260730iud.LIZ;
        String str = C1260730iud.LIZIZ;
        if (set.contains(str)) {
            return false;
        }
        if (Intrinsics.LJFF(str, "BR")) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("br_move_age_gate_later_settings", true)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ() {
        C852810Xct.LIZ.getClass();
        if (C852810Xct.LIZIZ) {
            return false;
        }
        return LIZ();
    }
}
