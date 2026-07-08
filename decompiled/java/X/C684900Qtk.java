package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qtk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684900Qtk {
    public static boolean LIZ(InterfaceC684740QtU interfaceC684740QtU, InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC685020Qtw interfaceC685020Qtw;
        String itemId = interfaceC684740QtU.getItemId();
        String itemId2 = null;
        if ((interfaceC1891350zJl instanceof InterfaceC685020Qtw) && (interfaceC685020Qtw = (InterfaceC685020Qtw) interfaceC1891350zJl) != null) {
            itemId2 = interfaceC685020Qtw.getItemId();
        }
        return Intrinsics.LJFF(itemId, itemId2);
    }
}
