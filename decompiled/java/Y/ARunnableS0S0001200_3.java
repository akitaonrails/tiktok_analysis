package Y;

import X.C1C7U;
import X.C2103208Lu;
import X.C2103408Lw;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2103508Lx;
import android.os.Handler;
import java.lang.ref.Reference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS0S0001200_3 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f277i0;
    public long j1;
    public long j2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S0001200_3 aRunnableS0S0001200_3) {
        long j = aRunnableS0S0001200_3.j1;
        int i = aRunnableS0S0001200_3.f277i0;
        long j2 = aRunnableS0S0001200_3.j2;
        C1C7U.LIZ("LeakWatcher@97d2.start$1L");
        C2103208Lu c2103208Lu = C2103208Lu.LIZ;
        C786410Ut5.LJJZZIII((Handler) C2103208Lu.LJII.getValue(), new ARunnableS0S0001200_3(j, i, j2, 1));
        C1C7U.LIZIZ("LeakWatcher@97d2.start$1L");
    }

    public static final void run$1(ARunnableS0S0001200_3 aRunnableS0S0001200_3) {
        C2103408Lw c2103408Lw;
        long j = aRunnableS0S0001200_3.j1;
        int i = aRunnableS0S0001200_3.f277i0;
        long j2 = aRunnableS0S0001200_3.j2;
        C1C7U.LIZ("LeakWatcher@97d2.start$lambda$5$1L");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - C2103208Lu.LJIIIZ > j) {
            C2103208Lu.LJIIIZ = jCurrentTimeMillis;
            if (C2103208Lu.LJIIJ) {
                System.out.println((Object) "LocalLeakWatcher WeakRef GC event");
            }
            while (true) {
                Reference<? extends Object> referencePoll = C2103208Lu.LIZLLL.poll();
                if (!(referencePoll instanceof C2103408Lw) || (c2103408Lw = (C2103408Lw) referencePoll) == null) {
                    break;
                }
                Iterator it2 = ((CopyOnWriteArrayList) C2103208Lu.LJIIIIZZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC2103508Lx) it2.next()).LIZ(c2103408Lw.LIZIZ, c2103408Lw.LIZ, c2103408Lw.LIZLLL, false);
                }
                C2103208Lu.LJ.remove(Integer.valueOf(c2103408Lw.LIZIZ));
                C2103208Lu.LJFF.remove(c2103408Lw);
            }
            HashSet<C2103408Lw> hashSet = C2103208Lu.LJFF;
            if (!hashSet.isEmpty()) {
                if (C2103208Lu.LJIIJ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LocalLeakWatcher pre retain objs:");
                    sbLIZ.append(hashSet.size());
                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C2103408Lw c2103408Lw2 : hashSet) {
                    int i2 = c2103408Lw2.LIZJ;
                    if (i2 >= i) {
                        long j3 = c2103408Lw2.LJ;
                        if (j3 <= 0 || jCurrentTimeMillis - j3 >= j2) {
                            linkedHashSet.add(c2103408Lw2);
                            C2103208Lu.LJ.remove(Integer.valueOf(c2103408Lw2.LIZIZ));
                            Iterator it3 = ((CopyOnWriteArrayList) C2103208Lu.LJIIIIZZ).iterator();
                            while (it3.hasNext()) {
                                ((InterfaceC2103508Lx) it3.next()).LIZ(c2103408Lw2.LIZIZ, c2103408Lw2.LIZ, c2103408Lw2.LIZLLL, true);
                            }
                        }
                    }
                    c2103408Lw2.LIZJ = i2 + 1;
                }
                HashSet<C2103408Lw> hashSet2 = C2103208Lu.LJFF;
                hashSet2.removeAll(linkedHashSet);
                if (C2103208Lu.LJIIJ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LocalLeakWatcher next loop retain objs:");
                    sbLIZ2.append(hashSet2.size());
                    sbLIZ2.append(" ids:");
                    sbLIZ2.append(C2103208Lu.LJ.size());
                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        C1C7U.LIZIZ("LeakWatcher@97d2.start$lambda$5$1L");
    }

    public ARunnableS0S0001200_3(long j, int i, long j2, int i2) {
        this.$t = i2;
        this.j1 = j;
        this.f277i0 = i;
        this.j2 = j2;
    }
}
