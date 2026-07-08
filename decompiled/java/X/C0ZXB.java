package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZXB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXB {
    public static C461530I7z LIZ(C0ZXC c0zxc, InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        if ((interfaceC1891350zJl instanceof C0ZXC) && interfaceC1891350zJl != null) {
            C0ZXC c0zxc2 = (C0ZXC) interfaceC1891350zJl;
            boolean z3 = !Intrinsics.LJFF(c0zxc.LLJ(), c0zxc2.LLJ());
            boolean z4 = !Intrinsics.LJFF(c0zxc.LJII(), c0zxc2.LJII());
            boolean z5 = false;
            if (Intrinsics.LJFF(c0zxc.LJLLJ(), c0zxc2.LJLLJ()) && Intrinsics.LJFF(c0zxc.LJJIJ(), c0zxc2.LJJIJ())) {
                z = false;
            } else {
                z = true;
            }
            if (c0zxc.LJJJJJ() != c0zxc2.LJJJJJ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c0zxc.LJLLILLLL() != c0zxc2.LJLLILLLL()) {
                z5 = true;
            }
            C0ZXG c0zxg = new C0ZXG(z3, z4, z, z2, z5);
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zxc, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zxg, 5);
        }
        return C461450I7r.LIZIZ(c0zxc, interfaceC1891350zJl);
    }
}
