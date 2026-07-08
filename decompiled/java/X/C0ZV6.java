package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZV6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZV6 {
    public static C461530I7z LIZ(C0ZV7 c0zv7, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ZV7 c0zv72;
        if ((interfaceC1891350zJl instanceof C0ZV7) && (c0zv72 = (C0ZV7) interfaceC1891350zJl) != null) {
            C0ZV8 c0zv8 = new C0ZV8(!Intrinsics.LJFF(c0zv7.getContent(), c0zv72.getContent()), !Intrinsics.LJFF(c0zv7.LIZJ(), c0zv72.LIZJ()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zv7, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zv8, 5);
        }
        return C461450I7r.LIZIZ(c0zv7, interfaceC1891350zJl);
    }
}
