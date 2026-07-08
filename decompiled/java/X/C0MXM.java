package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MXM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXM {
    public static C461530I7z LIZ(C0MXL c0mxl, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0MXL c0mxl2;
        if ((interfaceC1891350zJl instanceof C0MXL) && (c0mxl2 = (C0MXL) interfaceC1891350zJl) != null) {
            C0MXJ c0mxj = new C0MXJ(!Intrinsics.LJFF(c0mxl.LJJIII(), c0mxl2.LJJIII()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0mxl, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0mxj, 5);
        }
        return C461450I7r.LIZIZ(c0mxl, interfaceC1891350zJl);
    }
}
