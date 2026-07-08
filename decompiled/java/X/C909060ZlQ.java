package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZlQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909060ZlQ {
    public static final C909060ZlQ LIZ = new C909060ZlQ();
    public static Keva LIZIZ;

    public static String LIZ() {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!(!Intrinsics.LJFF(strLIZIZ, "-1")) || strLIZIZ == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_action_bar_button_config_list");
        sbLIZ.append('_');
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
