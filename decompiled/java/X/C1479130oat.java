package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479130oat implements InterfaceC1479150oav {
    public static int LIZJ = 10;
    public static volatile C1479130oat LIZLLL;
    public final C1478820oaO LIZ;
    public InterfaceC1479150oav LIZIZ;

    public static C1479130oat LJIIIIZZ() {
        if (LIZLLL == null) {
            synchronized (C1479130oat.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C1479130oat();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    @Override // X.InterfaceC1479150oav
    public final double LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC1479150oav
    public final void LIZIZ() {
        this.LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC1479150oav
    public final C1478850oaR[] LJFF() {
        return this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC1479160oaw
    public final double getSpeed() {
        return this.LIZIZ.getSpeed();
    }

    public C1479130oat() {
        C1478820oaO c1478820oaO = new C1478820oaO();
        this.LIZ = c1478820oaO;
        this.LIZIZ = c1478820oaO;
    }

    public static int LJII() {
        double speed = LJIIIIZZ().getSpeed();
        if (speed == -1.0d) {
            return -1;
        }
        return (int) ((speed / 8.0d) / 1000.0d);
    }

    @Override // X.InterfaceC1479150oav
    public final void LIZJ(int i) {
        this.LIZIZ.LIZJ(i);
    }

    @Override // X.InterfaceC1479150oav
    public final void LIZLLL(double d) {
        this.LIZIZ.LIZLLL(d);
    }

    @Override // X.InterfaceC1479150oav
    public final void LJI(InterfaceC1478780oaK interfaceC1478780oaK) {
        this.LIZIZ.LJI(interfaceC1478780oaK);
    }

    @Override // X.InterfaceC1479150oav
    public final void LJ(double d, double d2, long j) {
        this.LIZIZ.LJ(d, d2, j);
    }
}
