package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489210JGl {
    public static int LIZ(InterfaceC489200JGk interfaceC489200JGk) {
        return ((((((((((527 + interfaceC489200JGk.LJIIIIZZ().hashCode()) * 31) + interfaceC489200JGk.LJIILIIL().hashCode()) * 31) + interfaceC489200JGk.LIZLLL()) * 31) + interfaceC489200JGk.LJIIL()) * 31) + (interfaceC489200JGk.LJIL() ? 1 : 0)) * 31) + (interfaceC489200JGk.isMute() ? 1 : 0);
    }

    public static boolean LIZIZ(InterfaceC489200JGk interfaceC489200JGk, InterfaceC489200JGk interfaceC489200JGk2) {
        String strLIZJ = interfaceC489200JGk.LIZJ();
        String strLIZJ2 = interfaceC489200JGk2.LIZJ();
        if (strLIZJ.length() > 0 && strLIZJ2.length() > 0) {
            return Intrinsics.LJFF(strLIZJ, strLIZJ2);
        }
        if (interfaceC489200JGk.LJ(true) == interfaceC489200JGk2.LJ(true)) {
            return true;
        }
        return false;
    }
}
