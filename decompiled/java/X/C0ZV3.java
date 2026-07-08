package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZV3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZV3 {
    public static C461530I7z LIZ(C0ZV4 c0zv4, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ZV4 c0zv42;
        if ((interfaceC1891350zJl instanceof C0ZV4) && (c0zv42 = (C0ZV4) interfaceC1891350zJl) != null) {
            C0ZV5 c0zv5 = new C0ZV5(!Intrinsics.LJFF(c0zv4.getContent(), c0zv42.getContent()), !Intrinsics.LJFF(c0zv4.LIZJ(), c0zv42.LIZJ()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zv4, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zv5, 5);
        }
        return C461450I7r.LIZIZ(c0zv4, interfaceC1891350zJl);
    }
}
