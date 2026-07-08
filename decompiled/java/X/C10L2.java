package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10L2, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10L2 {
    public static void LIZ(InterfaceC207200166c interfaceC207200166c, String str) {
        if (!Intrinsics.LJFF(interfaceC207200166c.wk().getEventType(), str)) {
            interfaceC207200166c.wk().ab0(true);
        }
        interfaceC207200166c.wk().setEventType(str);
    }
}
