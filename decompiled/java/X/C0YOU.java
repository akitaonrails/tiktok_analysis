package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YOU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOU {
    public static final void LIZ(C0YEM c0yem, C0YOY c0yoy, InterfaceC873750YPl interfaceC873750YPl) {
        if (c0yoy == null) {
            return;
        }
        try {
            c0yoy.onEvent(interfaceC873750YPl);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("listener threw: ");
            sbLIZ.append(e);
            c868780Y6iLIZLLL.LJIIIIZZ("SendMessageEventDispatcher", C2188811AlT.LIZIZ(sbLIZ), null);
            c0yem.LJIIZILJ().LJFF().getEventTracker().LIZLLL("SendMessageEventDispatcher", e);
        }
    }
}
