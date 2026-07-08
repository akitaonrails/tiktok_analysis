package X;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.12wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19918612wa {
    public C19927912y5 LIZ = new C19927912y5();

    public final C19927912y5 LIZJ() {
        C19927912y5 c19927912y5 = new C19927912y5();
        if (this.LIZ.LIZ == null) {
            c19927912y5.LIZ = C19888812rm.LLILZIL;
        } else {
            c19927912y5.LIZ = new C19888812rm(this.LIZ.LIZ, false);
        }
        if (this.LIZ.LIZIZ == null) {
            c19927912y5.LIZIZ = C19889012ro.LLILZIL;
        } else {
            c19927912y5.LIZIZ = new C19889012ro(this.LIZ.LIZIZ, false);
        }
        if (this.LIZ.LIZJ == null) {
            c19927912y5.LIZJ = C19888812rm.LLILZIL;
        } else {
            c19927912y5.LIZJ = new C19888812rm(this.LIZ.LIZJ, false);
        }
        if (this.LIZ.LIZLLL == null) {
            c19927912y5.LIZLLL = Collections.emptyList();
        } else {
            c19927912y5.LIZLLL = Collections.unmodifiableList(new ArrayList(this.LIZ.LIZLLL));
        }
        if (this.LIZ.LJ == null) {
            c19927912y5.LJ = Collections.emptyList();
            return c19927912y5;
        }
        c19927912y5.LJ = Collections.unmodifiableList(new ArrayList(this.LIZ.LJ));
        return c19927912y5;
    }

    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final C19918612wa clone() {
        C19927912y5 c19927912y5 = new C19927912y5();
        if (this.LIZ.LIZ == null) {
            c19927912y5.LIZ = null;
        } else {
            c19927912y5.LIZ = new C19888812rm(this.LIZ.LIZ, true);
        }
        if (this.LIZ.LIZIZ == null) {
            c19927912y5.LIZIZ = null;
        } else {
            c19927912y5.LIZIZ = new C19889012ro(this.LIZ.LIZIZ, true);
        }
        if (this.LIZ.LIZJ == null) {
            c19927912y5.LIZJ = null;
        } else {
            c19927912y5.LIZJ = new C19888812rm(this.LIZ.LIZJ, true);
        }
        if (this.LIZ.LIZLLL == null) {
            c19927912y5.LIZLLL = null;
        } else {
            c19927912y5.LIZLLL = new ArrayList(this.LIZ.LIZLLL);
        }
        if (this.LIZ.LJ == null) {
            c19927912y5.LJ = null;
        } else {
            c19927912y5.LJ = new ArrayList(this.LIZ.LJ);
        }
        C19918612wa c19918612wa = new C19918612wa();
        c19918612wa.LIZ = c19927912y5;
        return c19918612wa;
    }

    public final void LIZ(AbstractC19922812xG abstractC19922812xG) {
        C19927912y5 c19927912y5 = this.LIZ;
        if (c19927912y5.LIZLLL == null) {
            c19927912y5.LIZLLL = new ArrayList();
        }
        this.LIZ.LIZLLL.add(abstractC19922812xG);
    }

    public final void LIZIZ(long j) {
        C19927912y5 c19927912y5 = this.LIZ;
        if (c19927912y5.LIZ == null) {
            c19927912y5.LIZ = new C19888812rm();
        }
        this.LIZ.LIZ.LJ(j);
    }

    public final void LJ(C19927912y5 c19927912y5) {
        if (!c19927912y5.LIZ.isEmpty()) {
            C19927912y5 c19927912y52 = this.LIZ;
            if (c19927912y52.LIZ == null) {
                c19927912y52.LIZ = new C19888812rm();
            }
            this.LIZ.LIZ.addAll(c19927912y5.LIZ);
        }
        if (!c19927912y5.LIZIZ.isEmpty()) {
            C19927912y5 c19927912y53 = this.LIZ;
            if (c19927912y53.LIZIZ == null) {
                c19927912y53.LIZIZ = new C19889012ro();
            }
            this.LIZ.LIZIZ.addAll(c19927912y5.LIZIZ);
        }
        if (!c19927912y5.LIZJ.isEmpty()) {
            C19927912y5 c19927912y54 = this.LIZ;
            if (c19927912y54.LIZJ == null) {
                c19927912y54.LIZJ = new C19888812rm();
            }
            this.LIZ.LIZJ.addAll(c19927912y5.LIZJ);
        }
        if (!c19927912y5.LIZLLL.isEmpty()) {
            C19927912y5 c19927912y55 = this.LIZ;
            if (c19927912y55.LIZLLL == null) {
                c19927912y55.LIZLLL = new ArrayList();
            }
            this.LIZ.LIZLLL.addAll(c19927912y5.LIZLLL);
        }
        if (!c19927912y5.LJ.isEmpty()) {
            C19927912y5 c19927912y56 = this.LIZ;
            if (c19927912y56.LJ == null) {
                c19927912y56.LJ = new ArrayList();
            }
            this.LIZ.LJ.addAll(c19927912y5.LJ);
        }
    }
}
