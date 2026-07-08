package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PBQ {
    public final int LIZ;
    public C0PG3 LIZIZ;
    public InterfaceC648350Pbt LIZJ;
    public String LIZLLL;
    public final C09AE LJ;
    public String LJFF;
    public boolean LJI;

    public C0PBQ(int i) {
        Object c098200Yq;
        C0PG3 c0pg3 = C0PG3.INIT;
        this.LIZ = i;
        this.LIZIZ = c0pg3;
        this.LIZJ = null;
        this.LIZLLL = null;
        try {
            c098200Yq = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0PBP(this, null), 2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LJ = (C09AE) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
