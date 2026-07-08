package X;

import android.os.Handler;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0VYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799570VYd {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C799560VYc());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C799550VYb());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0V4A());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C0V4B());
    public static final C01GW LJ = C452501pT.LIZIZ(new C0V48());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C0V49());
    public static final C01GW LJI = C452501pT.LIZIZ(new C589190N8z());
    public static final C01GW LJII = C452501pT.LIZIZ(new C08TY());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C799580VYe());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C08TZ());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C589180N8y());
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(new C309770CCh());
    public static final C01GW LJIIL = C452501pT.LIZIZ(new C0CFP());
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(new C309780CCi());
    public static int LJIILJJIL;

    public static int LIZ() {
        C799900VZk.LIZ.getClass();
        int iLJIJI = C799900VZk.LJFF().LJIJI();
        return iLJIJI <= 0 ? Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)) : iLJIJI;
    }

    public static Handler LIZIZ() {
        return (Handler) LJIIL.getValue();
    }

    public static Handler LIZJ() {
        return (Handler) LJIILIIL.getValue();
    }

    public static ExecutorService LJ(C0CO3 c0co3) {
        if (c0co3 == C0CO3.P0) {
            return (ExecutorService) LJIIJ.getValue();
        }
        return (ExecutorService) LJIIIZ.getValue();
    }

    @InterfaceC1294060jmO
    public static ExecutorService LJFF(boolean z) {
        if (!z) {
            return (ExecutorService) LJI.getValue();
        }
        return (ExecutorService) LJIIIIZZ.getValue();
    }

    public static ExecutorService LIZLLL(C0CCZ c0ccz, boolean z) {
        if (c0ccz instanceof InterfaceC799590VYf) {
            InterfaceC799590VYf interfaceC799590VYf = (InterfaceC799590VYf) c0ccz;
            C0VU1 c0vu1ThreadType = interfaceC799590VYf.threadType();
            if (c0vu1ThreadType != null) {
                int i = C0VU2.LIZ[c0vu1ThreadType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (interfaceC799590VYf.level() == 1) {
                            return (ExecutorService) LJ.getValue();
                        }
                        if (z) {
                            return (ExecutorService) LIZIZ.getValue();
                        }
                        return (ExecutorService) LIZ.getValue();
                    }
                } else {
                    if (interfaceC799590VYf.level() == 1) {
                        return (ExecutorService) LJFF.getValue();
                    }
                    if (z) {
                        return (ExecutorService) LIZLLL.getValue();
                    }
                    return (ExecutorService) LIZJ.getValue();
                }
            }
            throw new C1954807lC();
        }
        return (ExecutorService) LJ.getValue();
    }
}
