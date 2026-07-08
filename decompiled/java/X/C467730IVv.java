package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467730IVv {
    public static int LIZ;

    public static void LIZ(Boolean bool, Boolean bool2, int i) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if (LIZ != 1) {
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool2, bool3)) {
                LIZ = 1;
            } else {
                if (!Intrinsics.LJFF(bool, bool3)) {
                    return;
                }
                LIZ = 2;
            }
        }
    }
}
