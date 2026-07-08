package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.155b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC204625155b {
    public final C155H LIZ;
    public final C204639155p LIZIZ;
    public final AbstractC204621154x LIZJ;
    public final C155W LIZLLL;
    public boolean LJ = true;

    public abstract void LIZ(View view);

    public abstract void LIZIZ(LifecycleOwner lifecycleOwner);

    public void LIZLLL() {
    }

    public final void LIZJ(boolean z) {
        if (!this.LIZLLL.K5()) {
            C204639155p c204639155p = this.LIZIZ;
            if (c204639155p.LIZ) {
                c204639155p.LIZ = false;
                this.LIZJ.LJIJJ().LIZLLL = 1.0f;
                this.LJ = false;
                C155Z c155z = this.LIZ.LJIIL;
                float f = this.LIZJ.LJIJJ().LIZLLL;
                this.LIZJ.LJIJJ();
                c155z.LJJ(f);
                return;
            }
        }
        this.LIZJ.LJIJJ().LIZIZ = z;
        if (z) {
            C155Z c155z2 = this.LIZ.LJIIL;
            if (this.LIZJ.LJIJJ().LIZLLL == 0.0f) {
                this.LIZJ.LJIJJ().LIZLLL = 1.0f;
            }
            float f2 = this.LIZJ.LJIJJ().LIZLLL;
            this.LIZJ.LJIJJ();
            c155z2.LJJ(f2);
            if (this.LIZLLL.K5()) {
                c155z2.LJII();
            }
        } else {
            this.LIZ.LJIIL.LJJ(0.0f);
        }
        if (!this.LJ) {
            this.LIZ.LJIILIIL.LJIIL(z);
        }
        this.LJ = false;
    }

    public AbstractC204625155b(C155H c155h, C204639155p c204639155p, AbstractC204621154x abstractC204621154x, C155W c155w) {
        this.LIZ = c155h;
        this.LIZIZ = c204639155p;
        this.LIZJ = abstractC204621154x;
        this.LIZLLL = c155w;
    }
}
