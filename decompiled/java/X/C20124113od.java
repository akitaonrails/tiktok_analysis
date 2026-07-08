package X;

import Y.ARunnableS6S0110100_30;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.13od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20124113od {
    public static volatile C20124113od LJIIJ;
    public final C20124213oe LIZ;
    public final Context LIZIZ;
    public Executor LIZJ;
    public final Executor LIZLLL;
    public ComponentCallbacks2C20124013oc LJ;
    public C20124413og LJFF;
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final AtomicInteger LJII = new AtomicInteger(0);
    public long LJIIIIZZ = 0;
    public long LJIIIZ = 0;

    public final void LIZIZ() {
        this.LJI.set(false);
        if (this.LJFF != null) {
            C20125113on c20125113onLIZIZ = C20125113on.LIZIZ();
            C20124413og c20124413og = this.LJFF;
            c20125113onLIZIZ.getClass();
            if (c20124413og != null) {
                ((CopyOnWriteArrayList) C20125113on.LIZIZ).remove(c20124413og);
            }
            this.LJFF = null;
        }
        ComponentCallbacks2C20124013oc componentCallbacks2C20124013oc = this.LJ;
        if (componentCallbacks2C20124013oc != null) {
            this.LIZIZ.unregisterComponentCallbacks(componentCallbacks2C20124013oc);
            this.LJ = null;
        }
        Executor executor = this.LIZJ;
        if (executor == null || !(executor instanceof ExecutorService)) {
            return;
        }
        ((ExecutorService) executor).shutdown();
        this.LIZJ = null;
    }

    public C20124113od(C20124213oe c20124213oe) {
        this.LIZ = c20124213oe;
        this.LIZIZ = c20124213oe.LIZ;
        this.LIZLLL = c20124213oe.LIZIZ;
    }

    public final void LIZ(boolean z) {
        if (!this.LJI.get()) {
            return;
        }
        if (this.LJII.get() >= this.LIZ.LJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Reached max execution count: ");
            sbLIZ.append(this.LIZ.LJI);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZIZ();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.LJIIIIZZ;
        C20124213oe c20124213oe = this.LIZ;
        if (j < c20124213oe.LJ || jCurrentTimeMillis - this.LJIIIZ < c20124213oe.LJFF) {
            return;
        }
        Executor executor = this.LIZLLL;
        if (executor == null) {
            executor = this.LIZJ;
        }
        executor.execute(new ARunnableS6S0110100_30(this, z, jCurrentTimeMillis, 1));
    }
}
