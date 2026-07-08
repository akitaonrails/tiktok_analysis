package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898630ZNd {
    public static C461530I7z LIZ(C0ZNK c0znk, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ZNK c0znk2;
        if ((interfaceC1891350zJl instanceof C0ZNK) && (c0znk2 = (C0ZNK) interfaceC1891350zJl) != null) {
            C0ZNV c0znv = new C0ZNV(!Intrinsics.LJFF(c0znk.getReason(), c0znk2.getReason()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0znk, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0znv, 5);
        }
        return C461450I7r.LIZIZ(c0znk, interfaceC1891350zJl);
    }
}
