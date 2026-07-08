package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lRL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357890lRL {
    public static boolean LIZ(InterfaceC1357880lRK interfaceC1357880lRK, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof InterfaceC1357880lRK)) {
            return false;
        }
        InterfaceC1357880lRK interfaceC1357880lRK2 = (InterfaceC1357880lRK) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(interfaceC1357880lRK.LLD().repostId, interfaceC1357880lRK2.LLD().repostId) || !Intrinsics.LJFF(interfaceC1357880lRK.LLD().repostTime, interfaceC1357880lRK2.LLD().repostTime)) {
            return false;
        }
        return C1361260lWm.LIZ(interfaceC1357880lRK, interfaceC1891350zJl);
    }
}
