package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ENx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363750ENx {
    public static final C0E12 LIZ = new C0E12("EditorProKeva");

    public static int LIZ() {
        return LIZ.getInt("control_view_height", -1);
    }

    public static boolean LIZJ() {
        C0E12 c0e12 = LIZ;
        if (c0e12.LIZ("guideShown_new_", false)) {
            return true;
        }
        c0e12.getClass();
        Map<String, ?> all = c0e12.LIZ.getAll();
        if (all.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (u.LJJIIJZLJL(entry.getKey(), "guideAnimUidShow_new_", false) && Intrinsics.LJFF(Boolean.TRUE, entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        return LIZ.LIZ(str, false);
    }

    public static boolean LIZLLL(String str) {
        C0E12 c0e12 = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guideAnimUidShow_new__");
        sbLIZ.append(str);
        return c0e12.LIZ(C2188811AlT.LIZIZ(sbLIZ), false);
    }

    public static void LJ(String str) {
        LIZ.LIZIZ(str, true);
    }

    public static void LJFF(int i) {
        LIZ.LIZJ("control_view_height", i);
    }
}
