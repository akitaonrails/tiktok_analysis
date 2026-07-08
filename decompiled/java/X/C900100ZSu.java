package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900100ZSu {
    public static C461530I7z LIZ(InterfaceC900110ZSv interfaceC900110ZSv, InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC900110ZSv interfaceC900110ZSv2;
        boolean z;
        if ((interfaceC1891350zJl instanceof InterfaceC900110ZSv) && (interfaceC900110ZSv2 = (InterfaceC900110ZSv) interfaceC1891350zJl) != null) {
            if (Intrinsics.LJFF(interfaceC900110ZSv.LLILII().LIZ.LIZ.getContentPB(), interfaceC900110ZSv2.LLILII().LIZ.LIZ.getContentPB()) && Intrinsics.LJFF(interfaceC900110ZSv.LLJILLL(), interfaceC900110ZSv2.LLJILLL())) {
                z = false;
            } else {
                z = true;
            }
            C900120ZSw c900120ZSw = new C900120ZSw(z, !Intrinsics.LJFF(interfaceC900110ZSv.LIZJ(), interfaceC900110ZSv2.LIZJ()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(interfaceC900110ZSv, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c900120ZSw, 5);
        }
        return C461450I7r.LIZIZ(interfaceC900110ZSv, interfaceC1891350zJl);
    }
}
