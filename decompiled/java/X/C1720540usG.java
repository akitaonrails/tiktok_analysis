package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0usG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720540usG {
    public static boolean LIZ(InterfaceC1720550usH interfaceC1720550usH, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof InterfaceC1720550usH)) {
            return false;
        }
        return Intrinsics.LJFF(interfaceC1720550usH.toString(), interfaceC1891350zJl.toString());
    }

    public static boolean LIZIZ(InterfaceC1720550usH interfaceC1720550usH, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof InterfaceC1720550usH)) {
            return false;
        }
        return Intrinsics.LJFF(interfaceC1720550usH.getId(), ((InterfaceC1720550usH) interfaceC1891350zJl).getId());
    }
}
