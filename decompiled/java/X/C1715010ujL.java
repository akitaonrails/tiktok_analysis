package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ujL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715010ujL {
    public static final String LIZ(InterfaceC1715120ujW interfaceC1715120ujW) {
        if (interfaceC1715120ujW instanceof C991740bum) {
            return "PASS";
        }
        if (interfaceC1715120ujW instanceof C1714980ujI) {
            return "REJECT";
        }
        if (interfaceC1715120ujW instanceof C1715000ujK) {
            return "PENDING";
        }
        if (Intrinsics.LJFF(interfaceC1715120ujW, C1715280ujm.LIZ)) {
            return "SESSION_EXPIRED";
        }
        if (!Intrinsics.LJFF(interfaceC1715120ujW, C1715270ujl.LIZ)) {
            return "PENDING";
        }
        return "CANCEL";
    }
}
