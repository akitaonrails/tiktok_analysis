package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRX {
    public static C461530I7z LIZ(C0ZRY c0zry, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ZRY c0zry2;
        if ((interfaceC1891350zJl instanceof C0ZRY) && (c0zry2 = (C0ZRY) interfaceC1891350zJl) != null) {
            C0ZRZ c0zrz = new C0ZRZ(!Intrinsics.LJFF(c0zry.getContent(), c0zry2.getContent()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zry, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zrz, 5);
        }
        return C461450I7r.LIZIZ(c0zry, interfaceC1891350zJl);
    }
}
