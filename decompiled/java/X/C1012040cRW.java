package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0cRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012040cRW implements InterfaceC1002890cCl {
    public static volatile C1012040cRW LJIILIIL;
    public C0N0Y LIZ;
    public String LIZIZ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public long LIZJ = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public String LJIIIZ = "";
    public int LJIIL = -1;

    public static C1012040cRW LIZIZ() {
        if (LJIILIIL == null) {
            synchronized (C1012040cRW.class) {
                try {
                    if (LJIILIIL == null) {
                        LJIILIIL = new C1012040cRW();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILIIL;
    }

    @Override // X.InterfaceC1002890cCl
    public final void LIZ(boolean z) {
        this.LJIIJ = z;
    }
}
