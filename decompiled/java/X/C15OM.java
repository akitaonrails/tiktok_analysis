package X;

import Y.ARunnableS100S0200000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15OM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15OM implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C15OG LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DuetWithMovieHelper@adfe.goDuetWithMovie$1");
        try {
            try {
                C810560Vqw.LIZJ(new ARunnableS100S0200000_31(this.LLILLL.LJJIIZI.LJIIJ(this.LL, ""), this, 42));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLL.LJ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DuetWithMovieHelper@adfe.goDuetWithMovie$1");
    }

    public C15OM(C15OG c15og, String str, String str2) {
        this.LLILLL = c15og;
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
