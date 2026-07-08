package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1Aek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184641Aek {
    public static boolean LIZIZ;
    public static long LIZ = -1;
    public static final AtomicBoolean LIZJ = new AtomicBoolean(true);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final C01GW LJ = C452501pT.LIZIZ(new C1249104uf());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C2184691Aep());
    public static final C01GW LJI = C452501pT.LIZIZ(new C2184671Aen());
    public static final C01GW LJII = C452501pT.LIZIZ(new C2184681Aeo());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C2184661Aem());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C2184651Ael());

    public static final boolean LIZ() {
        return ((Boolean) LJIIIIZZ.getValue()).booleanValue() ? LIZJ.compareAndSet(true, false) : !((Boolean) LJIIIZ.getValue()).booleanValue();
    }

    public static int LIZIZ() {
        return ((Number) LJ.getValue()).intValue();
    }
}
