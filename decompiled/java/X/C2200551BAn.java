package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200551BAn implements C1BBD {
    public C19914612vw LIZIZ;
    public final C819140WBk LIZJ;

    public final void LIZ(C2200661BAy c2200661BAy) {
        try {
            LJI(c2200661BAy, this.LIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJFF(C1BB3 c1bb3) {
        try {
            C819140WBk c819140WBk = this.LIZJ;
            C1BBA c1bbaLJIJJLI = C1BB0.LJIJJLI();
            c1bbaLJIJJLI.LJFF(this.LIZIZ);
            c1bbaLJIJJLI.LIZLLL();
            C1BB0.LJJIII((C1BB0) c1bbaLJIJJLI.LLILLJJLI, c1bb3);
            c819140WBk.LIZ((C1BB0) c1bbaLJIJJLI.LIZIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C2200551BAn(Context context, C19914612vw c19914612vw) {
        this.LIZJ = new C819140WBk(context);
        this.LIZIZ = c19914612vw;
    }

    public final void LIZIZ(C2200661BAy c2200661BAy, int i) {
        try {
            C19914712vx c19914712vx = (C19914712vx) this.LIZIZ.LJIILIIL();
            c19914712vx.LIZLLL();
            C19914612vw.LJJIJIIJIL((C19914612vw) c19914712vx.LLILLJJLI, i);
            this.LIZIZ = (C19914612vw) c19914712vx.LIZIZ();
            LIZ(c2200661BAy);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJI(C2200661BAy c2200661BAy, C19914612vw c19914612vw) {
        if (c2200661BAy == null) {
            return;
        }
        try {
            C1BBA c1bbaLJIJJLI = C1BB0.LJIJJLI();
            c1bbaLJIJJLI.LJFF(c19914612vw);
            c1bbaLJIJJLI.LIZLLL();
            C1BB0.LJJ((C1BB0) c1bbaLJIJJLI.LLILLJJLI, c2200661BAy);
            this.LIZJ.LIZ((C1BB0) c1bbaLJIJJLI.LIZIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJII(C2200671BAz c2200671BAz, C19914612vw c19914612vw) {
        if (c2200671BAz == null) {
            return;
        }
        try {
            C1BBA c1bbaLJIJJLI = C1BB0.LJIJJLI();
            c1bbaLJIJJLI.LJFF(c19914612vw);
            c1bbaLJIJJLI.LIZLLL();
            C1BB0.LJJI((C1BB0) c1bbaLJIJJLI.LLILLJJLI, c2200671BAz);
            this.LIZJ.LIZ((C1BB0) c1bbaLJIJJLI.LIZIZ());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZJ(C2200661BAy c2200661BAy, int i, long j) {
        try {
            C19914712vx c19914712vx = (C19914712vx) this.LIZIZ.LJIILIIL();
            c19914712vx.LIZLLL();
            C19914612vw.LJJIJIIJIL((C19914612vw) c19914712vx.LLILLJJLI, i);
            C19914612vw c19914612vw = (C19914612vw) c19914712vx.LIZIZ();
            this.LIZIZ = c19914612vw;
            if (j != 0) {
                C19914712vx c19914712vx2 = (C19914712vx) c19914612vw.LJIILIIL();
                c19914712vx2.LIZLLL();
                C19914612vw.LJJIJL((C19914612vw) c19914712vx2.LLILLJJLI, j);
                c19914612vw = (C19914612vw) c19914712vx2.LIZIZ();
            }
            LJI(c2200661BAy, c19914612vw);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(C2200661BAy c2200661BAy, long j, boolean z) {
        C19914612vw c19914612vw;
        try {
            C2200641BAw c2200641BAw = (C2200641BAw) c2200661BAy.LJIILIIL();
            C19914512vv c19914512vv = (C19914512vv) c2200661BAy.LJJII().LJIILIIL();
            c19914512vv.LIZLLL();
            C19914412vu.LJJIFFI((C19914412vu) c19914512vv.LLILLJJLI, z);
            c2200641BAw.LIZLLL();
            C2200661BAy.LJIJJ((C2200661BAy) c2200641BAw.LLILLJJLI, (C19914412vu) c19914512vv.LIZIZ());
            C2200661BAy c2200661BAy2 = (C2200661BAy) c2200641BAw.LIZIZ();
            if (j == 0) {
                c19914612vw = this.LIZIZ;
            } else {
                C19914712vx c19914712vx = (C19914712vx) this.LIZIZ.LJIILIIL();
                c19914712vx.LIZLLL();
                C19914612vw.LJJIJL((C19914612vw) c19914712vx.LLILLJJLI, j);
                c19914612vw = (C19914612vw) c19914712vx.LIZIZ();
            }
            LJI(c2200661BAy2, c19914612vw);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJ(C2200661BAy c2200661BAy, int i, long j, boolean z) {
        C19914612vw c19914612vw;
        try {
            C19914712vx c19914712vx = (C19914712vx) this.LIZIZ.LJIILIIL();
            c19914712vx.LIZLLL();
            C19914612vw.LJJIJIIJIL((C19914612vw) c19914712vx.LLILLJJLI, i);
            this.LIZIZ = (C19914612vw) c19914712vx.LIZIZ();
            C2200641BAw c2200641BAw = (C2200641BAw) c2200661BAy.LJIILIIL();
            C19914512vv c19914512vv = (C19914512vv) c2200661BAy.LJJII().LJIILIIL();
            c19914512vv.LIZLLL();
            C19914412vu.LJJIFFI((C19914412vu) c19914512vv.LLILLJJLI, z);
            c2200641BAw.LIZLLL();
            C2200661BAy.LJIJJ((C2200661BAy) c2200641BAw.LLILLJJLI, (C19914412vu) c19914512vv.LIZIZ());
            C2200661BAy c2200661BAy2 = (C2200661BAy) c2200641BAw.LIZIZ();
            if (j == 0) {
                c19914612vw = this.LIZIZ;
            } else {
                C19914712vx c19914712vx2 = (C19914712vx) this.LIZIZ.LJIILIIL();
                c19914712vx2.LIZLLL();
                C19914612vw.LJJIJL((C19914612vw) c19914712vx2.LLILLJJLI, j);
                c19914612vw = (C19914612vw) c19914712vx2.LIZIZ();
            }
            LJI(c2200661BAy2, c19914612vw);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
