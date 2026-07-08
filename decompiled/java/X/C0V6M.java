package X;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: X.0V6M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V6M {
    public static volatile boolean LIZ;

    public static void LIZ(C0V6O c0v6o) {
        C792420V6q.LIZJ = c0v6o;
        Context contextN3 = c0v6o.LIZ;
        if (contextN3 != null) {
            if (!(contextN3 instanceof Application)) {
                contextN3 = C786410Ut5.N3(contextN3);
            }
            C792190V5t.LIZIZ = (Application) contextN3;
        }
        C792420V6q.LJIIJ = System.currentTimeMillis();
        C792420V6q.LJIIJJI = System.currentTimeMillis();
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("APM init start in process ");
            sbLIZ.append(C792400V6o.LIZIZ());
            C792910V8n.LIZ("APM-Hub", C2188811AlT.LIZIZ(sbLIZ));
        }
        C792910V8n.LIZ = new C792900V8m() { // from class: X.0V8l
            @Override // X.C792900V8m, X.InterfaceC792920V8o
            public final void e(String str, String str2) {
                C793440VAo.LIZIZ(str, str2, null);
            }

            @Override // X.C792900V8m, X.InterfaceC792920V8o
            public final void e(String str, String str2, Throwable th) {
                C793440VAo.LIZIZ(str, str2, th);
            }
        };
        C792590V7h.LIZ.put(C0V7R.class, new C792680V7q());
    }
}
