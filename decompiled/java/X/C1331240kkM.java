package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331240kkM implements InterfaceC1332030kld {
    public static final Object LIZJ = new Object();
    public static C1331240kkM LIZLLL;
    public static int LJ;
    public InterfaceC1324680kZm LIZ;
    public C1331240kkM LIZIZ;

    public static C1331240kkM LIZ() {
        synchronized (LIZJ) {
            try {
                C1331240kkM c1331240kkM = LIZLLL;
                if (c1331240kkM == null) {
                    return new C1331240kkM();
                }
                LIZLLL = c1331240kkM.LIZIZ;
                c1331240kkM.LIZIZ = null;
                LJ--;
                return c1331240kkM;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        synchronized (LIZJ) {
            try {
                int i = LJ;
                if (i < 5) {
                    this.LIZ = null;
                    LJ = i + 1;
                    C1331240kkM c1331240kkM = LIZLLL;
                    if (c1331240kkM != null) {
                        this.LIZIZ = c1331240kkM;
                    }
                    LIZLLL = this;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1332030kld
    public final InterfaceC1324680kZm getCacheKey() {
        InterfaceC1324680kZm interfaceC1324680kZm = this.LIZ;
        return interfaceC1324680kZm instanceof C1324710kZp ? ((C1324710kZp) interfaceC1324680kZm).LIZ : interfaceC1324680kZm;
    }
}
