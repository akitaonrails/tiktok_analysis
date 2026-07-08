package X;

import Y.ARunnableS13S0100100_7;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0KXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519090KXj implements InterfaceC519080KXi {
    public static final List<Integer> LJIIJJI = C1697810uHb.LJIIJJI(1, 2);
    public volatile boolean LJII;
    public long LJIIIIZZ;
    public final ExecutorService LIZ = C786410Ut5.d4(3);
    public final ExecutorService LIZIZ = C786410Ut5.h4();
    public final ScheduledExecutorService LIZJ = C807400Vlq.LJ();
    public final PriorityQueue<RunnableC519060KXg> LIZLLL = new PriorityQueue<>();
    public final HashMap<Long, Future<?>> LJ = new HashMap<>();
    public final ConcurrentHashMap<Long, Runnable> LJFF = new ConcurrentHashMap<>();
    public final C01GW LJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(311));
    public final int LJIIIZ = 20;
    public Set<Integer> LJIIJ = new LinkedHashSet();

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C519090KXj.LIZJ():void");
    }

    @Override // X.InterfaceC519080KXi
    public final void LIZ(long j) {
        this.LIZIZ.submit(new ARunnableS13S0100100_7(this, j, 13));
    }

    public final RunnableC519060KXg LIZIZ(Function1<? super RunnableC519060KXg, Boolean> function1) {
        for (RunnableC519060KXg runnableC519060KXg : this.LIZLLL) {
            if (function1.invoke(runnableC519060KXg).booleanValue()) {
                return runnableC519060KXg;
            }
        }
        return null;
    }
}
