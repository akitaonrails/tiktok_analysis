package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0wsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797750wsn {
    public static final C1797750wsn LIZ = new C1797750wsn();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static C1797880wt0 LIZJ;

    public final synchronized void LIZ(C1797890wt1 c1797890wt1) {
        if (!c1797890wt1.LJII) {
            C1797880wt0 c1797880wt0 = LIZJ;
            if (c1797880wt0 != null) {
                c1797880wt0.LIZ();
                c1797880wt0.LJIIJJI.LIZ();
            }
            LIZIZ.set(false);
            LIZJ = null;
            return;
        }
        AtomicBoolean atomicBoolean = LIZIZ;
        if (atomicBoolean.get()) {
            return;
        }
        C1797880wt0 c1797880wt02 = LIZJ;
        if (c1797880wt02 != null) {
            c1797880wt02.LIZ();
            c1797880wt02.LJIIJJI.LIZ();
        }
        LIZJ = new C1797880wt0(c1797890wt1);
        atomicBoolean.set(true);
    }
}
