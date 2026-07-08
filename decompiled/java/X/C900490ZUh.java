package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900490ZUh {
    public static C461530I7z LIZ(InterfaceC900500ZUi interfaceC900500ZUi, InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC900500ZUi interfaceC900500ZUi2;
        if ((interfaceC1891350zJl instanceof InterfaceC900500ZUi) && (interfaceC900500ZUi2 = (InterfaceC900500ZUi) interfaceC1891350zJl) != null) {
            C900510ZUj c900510ZUj = new C900510ZUj(!Intrinsics.LJFF(interfaceC900500ZUi.getContent(), interfaceC900500ZUi2.getContent()), !Intrinsics.LJFF(interfaceC900500ZUi.LIZJ(), interfaceC900500ZUi2.LIZJ()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(interfaceC900500ZUi, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c900510ZUj, 5);
        }
        return C461450I7r.LIZIZ(interfaceC900500ZUi, interfaceC1891350zJl);
    }
}
