package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0NUM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NUM implements InterfaceC594710NUf {
    public final C0NU9 LIZ;
    public final C0NUP LIZIZ;
    public final C0NUO LIZJ;
    public final C594670NUb LIZLLL;
    public final C0NUV LJ;
    public final C0NUL LJFF;

    public final C0NUI LIZIZ(C0NUN c0nun) {
        C0NUO c0nuo = this.LIZJ;
        AwS375S0200000_9 awS375S0200000_9 = new AwS375S0200000_9(this, c0nun, 112);
        synchronized (c0nuo.LIZ) {
            try {
                C0NUI c0nuiLIZJ = c0nuo.LIZIZ.LIZJ(c0nun);
                if (c0nuiLIZJ != null) {
                    if (c0nuiLIZJ.LJIIIZ()) {
                        return c0nuiLIZJ;
                    }
                    c0nuo.LIZIZ.LJ(c0nun);
                }
                try {
                    C0NUI c0nui = (C0NUI) awS375S0200000_9.invoke(new AwS375S0200000_9(c0nuo, c0nun, 113));
                    synchronized (c0nuo.LIZ) {
                        try {
                            if (c0nuo.LIZIZ.LIZJ(c0nun) == null && c0nui.LJIIIZ()) {
                                c0nuo.LIZIZ.LIZLLL(c0nun, c0nui);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return c0nui;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public C0NUM(C0O2Q c0o2q, C0NUQ c0nuq) {
        C0NUO c0nuo = C0NUS.LIZ;
        C594670NUb c594670NUb = new C594670NUb(C0NUS.LIZIZ);
        C0NUV c0nuv = new C0NUV();
        this.LIZ = c0o2q;
        this.LIZIZ = c0nuq;
        this.LIZJ = c0nuo;
        this.LIZLLL = c594670NUb;
        this.LJ = c0nuv;
        this.LJFF = new C0NUL(this);
    }

    @Override // X.InterfaceC594710NUf
    public final C0NUI LIZ(AbstractC1696400uFK abstractC1696400uFK, C1680190tpB c1680190tpB, int i, int i2) {
        this.LIZIZ.LIZLLL(abstractC1696400uFK);
        C1680190tpB c1680190tpBLIZJ = this.LIZIZ.LIZJ(c1680190tpB);
        this.LIZIZ.LIZ(i);
        this.LIZIZ.LIZIZ(i2);
        this.LIZ.getCacheKey();
        return LIZIZ(new C0NUN(abstractC1696400uFK, c1680190tpBLIZJ, i, i2, null));
    }
}
