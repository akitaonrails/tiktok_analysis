package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MXO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXO {
    public static boolean LIZ(C0MXT c0mxt, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C0MXT) || !Intrinsics.LJFF(C0I6Y.LIZ(c0mxt).getUuid(), C0I6Y.LIZ((InterfaceC461380I7k) interfaceC1891350zJl).getUuid()) || !Intrinsics.LJFF(c0mxt.LJJIII(), ((C0MXT) interfaceC1891350zJl).LJJIII())) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(C0MXT c0mxt, InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC461380I7k interfaceC461380I7k;
        C869590Y9l c869590Y9l;
        String uuid = null;
        if ((interfaceC1891350zJl instanceof C0MXT) && (interfaceC461380I7k = (InterfaceC461380I7k) interfaceC1891350zJl) != null && (c869590Y9l = interfaceC461380I7k.LLILII().LIZ.LIZ) != null) {
            uuid = c869590Y9l.getUuid();
        }
        return Intrinsics.LJFF(uuid, C0I6Y.LIZ(c0mxt).getUuid());
    }

    public static C461530I7z LIZJ(C0MXT c0mxt, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0MXT c0mxt2;
        if ((interfaceC1891350zJl instanceof C0MXT) && (c0mxt2 = (C0MXT) interfaceC1891350zJl) != null) {
            C0MXK c0mxk = new C0MXK(!Intrinsics.LJFF(c0mxt.LJJIII(), c0mxt2.LJJIII()));
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0mxt, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0mxk, 5);
        }
        return C461450I7r.LIZIZ(c0mxt, interfaceC1891350zJl);
    }
}
