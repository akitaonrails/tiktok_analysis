package X;

import Y.ARunnableS133S0100000_33;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21690519uh {
    public static final RunnableC1700570uM3 LJIIIIZZ = new RunnableC1700570uM3();
    public boolean LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC21690919ul LIZLLL;
    public final View LJ;
    public final C21690619ui LJFF;
    public final ARunnableS133S0100000_33 LJI;
    public C21690719uj LJII;

    public final void LIZ() {
        try {
            int i = this.LJFF.LIZLLL.getInt(this.LIZLLL);
            C21690619ui c21690619ui = this.LJFF;
            c21690619ui.LIZLLL.setInt(this.LIZLLL, i & (~c21690619ui.LJII) & (~c21690619ui.LJI));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21690519uh(InterfaceC21690919ul interfaceC21690919ul) {
        Object obj = C21690619ui.LJIIJ;
        synchronized (obj) {
            try {
                if (C21690619ui.LJIIIZ == null) {
                    synchronized (obj) {
                        try {
                            C21690619ui.LJIIIZ = new C21690619ui();
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C21690619ui c21690619ui = C21690619ui.LJIIIZ;
        this.LJFF = c21690619ui;
        this.LJI = new ARunnableS133S0100000_33(this, 28);
        this.LJII = null;
        new ARunnableS133S0100000_33(this, 29);
        if (!(interfaceC21690919ul instanceof View)) {
            return;
        }
        this.LIZLLL = interfaceC21690919ul;
        this.LJ = (View) interfaceC21690919ul;
        this.LIZJ = c21690619ui.LJIIIIZZ;
    }
}
