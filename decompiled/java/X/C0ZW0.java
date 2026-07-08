package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZW0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZW0 {
    public static boolean LIZ(C0ZW3 c0zw3, C0ZW3 c0zw32) {
        if (c0zw3 instanceof C900930ZVz) {
            if (!(c0zw32 instanceof C900930ZVz)) {
                return false;
            }
            return Intrinsics.LJFF(((C900930ZVz) c0zw3).LIZ, ((C900930ZVz) c0zw32).LIZ);
        }
        if (c0zw3 instanceof C900900ZVw) {
            return c0zw32 instanceof C900900ZVw;
        }
        throw new C1954807lC();
    }

    public static boolean LIZIZ(C0ZW3 c0zw3, C0ZW3 c0zw32) {
        if (c0zw3 instanceof C900930ZVz) {
            if (!(c0zw32 instanceof C900930ZVz)) {
                return false;
            }
            return Intrinsics.LJFF(((C900930ZVz) c0zw3).LJ, ((C900930ZVz) c0zw32).LJ);
        }
        if (c0zw3 instanceof C900900ZVw) {
            if (!(c0zw32 instanceof C900900ZVw)) {
                return false;
            }
            return Intrinsics.LJFF(((C900900ZVw) c0zw3).LIZ, ((C900900ZVw) c0zw32).LIZ);
        }
        throw new C1954807lC();
    }

    public static boolean LIZJ(C0ZW3 c0zw3, C0ZW3 c0zw32) {
        if (c0zw3 instanceof C900930ZVz) {
            if (!(c0zw32 instanceof C900930ZVz)) {
                return false;
            }
            C900930ZVz c900930ZVz = (C900930ZVz) c0zw3;
            C900930ZVz c900930ZVz2 = (C900930ZVz) c0zw32;
            if (!Intrinsics.LJFF(c900930ZVz.LIZIZ, c900930ZVz2.LIZIZ) || !Intrinsics.LJFF(c900930ZVz.LIZJ, c900930ZVz2.LIZJ) || !Intrinsics.LJFF(c900930ZVz.LIZLLL, c900930ZVz2.LIZLLL)) {
                return false;
            }
            return true;
        }
        if (c0zw3 instanceof C900900ZVw) {
            return c0zw32 instanceof C900900ZVw;
        }
        throw new C1954807lC();
    }
}
