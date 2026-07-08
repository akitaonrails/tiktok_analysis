package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900620ZUu {
    public static C461530I7z LIZ(InterfaceC900630ZUv interfaceC900630ZUv, InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC900630ZUv interfaceC900630ZUv2;
        if ((interfaceC1891350zJl instanceof InterfaceC900630ZUv) && (interfaceC900630ZUv2 = (InterfaceC900630ZUv) interfaceC1891350zJl) != null) {
            C900640ZUw c900640ZUw = new C900640ZUw(!Intrinsics.LJFF(interfaceC900630ZUv.getContent(), interfaceC900630ZUv2.getContent()), !Intrinsics.LJFF(interfaceC900630ZUv.LIZJ(), interfaceC900630ZUv2.LIZJ()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(interfaceC900630ZUv, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c900640ZUw, 5);
        }
        return C461450I7r.LIZIZ(interfaceC900630ZUv, interfaceC1891350zJl);
    }
}
