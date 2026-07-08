package X;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19W4, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19W4 {
    public Interpolator LIZJ;
    public C19WE LIZLLL;
    public boolean LJ;
    public long LIZIZ = -1;
    public final C19WB LJFF = new C21550819Vq() { // from class: X.19WB
        public boolean LIZ;
        public int LIZIZ;

        @Override // X.C19WE
        public final void LIZ() {
            int i = this.LIZIZ + 1;
            this.LIZIZ = i;
            if (i == this.LIZJ.LIZ.size()) {
                C19WE c19we = this.LIZJ.LIZLLL;
                if (c19we != null) {
                    c19we.LIZ();
                }
                this.LIZIZ = 0;
                this.LIZ = false;
                this.LIZJ.LJ = false;
            }
        }

        @Override // X.C21550819Vq, X.C19WE
        public final void LIZIZ() {
            if (this.LIZ) {
                return;
            }
            this.LIZ = true;
            C19WE c19we = this.LIZJ.LIZLLL;
            if (c19we != null) {
                c19we.LIZIZ();
            }
        }
    };
    public final ArrayList<C19WF> LIZ = new ArrayList<>();

    public final void LIZ() {
        if (this.LJ) {
            Iterator<C19WF> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
            this.LJ = false;
        }
    }

    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        for (C19WF c19wf : this.LIZ) {
            long j = this.LIZIZ;
            if (j >= 0) {
                c19wf.LIZJ(j);
            }
            Interpolator interpolator = this.LIZJ;
            if (interpolator != null) {
                c19wf.LIZLLL(interpolator);
            }
            if (this.LIZLLL != null) {
                c19wf.LJ(this.LJFF);
            }
            c19wf.LJFF();
        }
        this.LJ = true;
    }
}
