package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11hC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19568411hC<Param, Target> {
    public final String LIZ;
    public final Param LIZIZ;
    public int LIZLLL;
    public C19569211hK LJFF;
    public final AtomicInteger LIZJ = new AtomicInteger(-1);
    public final AtomicBoolean LJ = new AtomicBoolean(false);

    public abstract void LIZIZ(C19568211hA c19568211hA);

    public void LIZJ() {
    }

    public boolean LIZLLL() {
        return false;
    }

    public final void LIZ(int i) {
        this.LIZJ.set(i);
    }

    public AbstractC19568411hC(String str, Param param) {
        this.LIZ = str;
        this.LIZIZ = param;
        LIZ(0);
    }
}
