package X;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.1AtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2193821AtY implements InterfaceC2193951Atl, C136U {
    public final Lock LIZ = new ReentrantLock();
    public final C2193931Atj LIZIZ;
    public final AbstractC1498070p5R LIZJ;
    public final InterfaceC2193951Atl LIZLLL;
    public final AbstractC2193941Atk LJ;
    public final String LJFF;
    public final Collection<Object> LJI;

    static {
        Logger.getLogger(C2193821AtY.class.getName());
    }

    public C2193821AtY(C2193831AtZ c2193831AtZ) {
        String strLIZLLL;
        c2193831AtZ.LIZ.getClass();
        this.LIZJ = c2193831AtZ.LIZIZ;
        this.LJ = c2193831AtZ.LIZJ;
        C199537135j c199537135j = c2193831AtZ.LIZLLL;
        if (c199537135j == null) {
            strLIZLLL = null;
        } else {
            strLIZLLL = c199537135j.LIZLLL();
        }
        this.LJFF = strLIZLLL;
        this.LIZLLL = c2193831AtZ.LJFF;
        this.LJI = Collections.unmodifiableCollection(c2193831AtZ.LJI);
        C2193931Atj c2193931Atj = c2193831AtZ.LJ;
        c2193931Atj.getClass();
        this.LIZIZ = c2193931Atj;
    }
}
