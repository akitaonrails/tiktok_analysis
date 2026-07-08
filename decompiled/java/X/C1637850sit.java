package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637850sit {
    public static final boolean LIZIZ(InterfaceC379610EuV interfaceC379610EuV) {
        C565600MGg c565600MGg = (C565600MGg) interfaceC379610EuV.getDiContainer().LJIIL(null, C565600MGg.class);
        if (c565600MGg == null || !c565600MGg.LIZ) {
            return false;
        }
        return true;
    }

    public static final void LIZ(InterfaceC379610EuV interfaceC379610EuV, Function0<Unit> function0) {
        C565600MGg c565600MGg = (C565600MGg) interfaceC379610EuV.getDiContainer().LJIIL(null, C565600MGg.class);
        if (c565600MGg != null && c565600MGg.LIZ) {
            function0.invoke();
        }
    }
}
