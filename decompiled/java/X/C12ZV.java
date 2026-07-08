package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.12ZV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZV implements Runnable {
    public final /* synthetic */ C12Z4 LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    public final void LIZ() throws Throwable {
        this.LL.LJJJLIIL();
        C12Z4 c12z4 = this.LL;
        Runnable runnable = this.LLILLJJLI;
        c12z4.LJIIL().LJ();
        if (c12z4.LJIILL == null) {
            c12z4.LJIILL = new ArrayList();
        }
        ((ArrayList) c12z4.LJIILL).add(runnable);
        this.LL.LJJJLZIJ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzmj@399e.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzmj@399e.run");
    }

    public C12ZV(C12Z4 c12z4, Runnable runnable) {
        this.LL = c12z4;
        this.LLILLJJLI = runnable;
    }
}
