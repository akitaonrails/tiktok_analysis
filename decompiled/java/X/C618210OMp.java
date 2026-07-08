package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0OMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618210OMp {
    public static AbstractC1623806Xk LIZ(AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2) {
        Throwable th;
        C491001vg c491001vg;
        AbstractC1623806Xk c491001vg2;
        C491001vg c491001vg3;
        boolean z = abstractC1623806Xk2 instanceof C491001vg;
        if (!z && !(abstractC1623806Xk instanceof C491001vg)) {
            if ((abstractC1623806Xk2 instanceof C1623606Xi) && (abstractC1623806Xk instanceof C1623606Xi)) {
                c491001vg2 = new C1623606Xi(Unit.LIZ);
            } else if (!(abstractC1623806Xk2 instanceof C1623706Xj) && !(abstractC1623806Xk instanceof C1623706Xj) && !(abstractC1623806Xk2 instanceof C491101vh) && !(abstractC1623806Xk instanceof C491101vh)) {
                c491001vg2 = new C491001vg(new Throwable("Unhandled page load state"));
            } else {
                c491001vg2 = new C1623706Xj();
            }
        } else {
            if (!(abstractC1623806Xk instanceof C491001vg) || (c491001vg3 = (C491001vg) abstractC1623806Xk) == null || (th = c491001vg3.LIZ) == null) {
                if (z && (c491001vg = (C491001vg) abstractC1623806Xk2) != null) {
                    th = c491001vg.LIZ;
                } else {
                    th = new Throwable("Unknown page load failure");
                }
            }
            c491001vg2 = new C491001vg(th);
        }
        C0OPX.LJII("BBArch [PageStatusVM] merge == " + c491001vg2 + " (list=" + abstractC1623806Xk + ", info=" + abstractC1623806Xk2 + ')');
        return c491001vg2;
    }
}
