package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404000mdi {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZIZ(String str) {
        if (!Intrinsics.LJFF(str, "adjust_item_enhance") && !Intrinsics.LJFF(str, "adjust_item_noise")) {
            return 0.5f;
        }
        return 0.0f;
    }

    public static Pair LIZJ(String str) {
        if (!Intrinsics.LJFF(str, "adjust_item_enhance") && !Intrinsics.LJFF(str, "adjust_item_noise")) {
            return new Pair(-100, 100);
        }
        return new Pair(0, 100);
    }

    public static int LIZ(float f, String str) {
        return (int) ((f * (((Number) r2.getSecond()).intValue() - r1)) + ((Number) LIZJ(str).getFirst()).intValue());
    }

    public static boolean LIZLLL(float f, String str) {
        boolean z;
        if (f == LIZIZ(str)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}
