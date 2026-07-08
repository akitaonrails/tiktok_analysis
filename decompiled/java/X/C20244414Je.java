package X;

import android.view.WindowInsets;

/* JADX INFO: renamed from: X.14Je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20244414Je extends C20245214Jm {
    public final WindowInsets.Builder LIZIZ;

    public C20244414Je() {
        this.LIZIZ = new WindowInsets.Builder();
    }

    @Override // X.C20245214Jm
    public final C20244614Jg LIZIZ() {
        LIZ();
        C20244614Jg c20244614JgLIZLLL = C20244614Jg.LIZLLL(null, this.LIZIZ.build());
        c20244614JgLIZLLL.LIZ.LJIILJJIL(this.LIZ);
        return c20244614JgLIZLLL;
    }

    public C20244414Je(C20244614Jg c20244614Jg) {
        WindowInsets.Builder builder;
        WindowInsets windowInsetsLIZJ = c20244614Jg.LIZJ();
        if (windowInsetsLIZJ != null) {
            builder = new WindowInsets.Builder(windowInsetsLIZJ);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.LIZIZ = builder;
    }

    @Override // X.C20245214Jm
    public final void LIZLLL(C20244814Ji c20244814Ji) {
        this.LIZIZ.setMandatorySystemGestureInsets(c20244814Ji.LJ());
    }

    @Override // X.C20245214Jm
    public final void LJ(C20244814Ji c20244814Ji) {
        this.LIZIZ.setSystemGestureInsets(c20244814Ji.LJ());
    }

    @Override // X.C20245214Jm
    public final void LJFF(C20244814Ji c20244814Ji) {
        this.LIZIZ.setSystemWindowInsets(c20244814Ji.LJ());
    }

    @Override // X.C20245214Jm
    public final void LJI(C20244814Ji c20244814Ji) {
        this.LIZIZ.setTappableElementInsets(c20244814Ji.LJ());
    }
}
