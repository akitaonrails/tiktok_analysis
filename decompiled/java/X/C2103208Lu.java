package X;

import Y.ARunnableS0S0001200_3;
import Y.ARunnableS10S0000100_3;
import android.os.Handler;
import com.bytedance.memrelief.gc.WeakRefQueueMonitor;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2103208Lu {
    public static int LIZIZ;
    public static long LJIIIZ;
    public static boolean LJIIJ;
    public static final C2103208Lu LIZ = new C2103208Lu();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final ReferenceQueue<Object> LIZLLL = new ReferenceQueue<>();
    public static final HashSet<Integer> LJ = new HashSet<>();
    public static final HashSet<C2103408Lw> LJFF = new HashSet<>();
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1236));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1235));
    public static final List<InterfaceC2103508Lx> LJIIIIZZ = new CopyOnWriteArrayList();

    public static void LIZ(int i, long j, int i2, boolean z, int i3) {
        long j2;
        C2103208Lu c2103208Lu = LIZ;
        if ((i3 & 1) != 0) {
            i = 1;
        }
        if ((i3 & 2) != 0) {
            j2 = Mp4ScreenVideoLoadTimeout.CONTROL;
        } else {
            j2 = 0;
        }
        if ((i3 & 4) != 0) {
            j = 60000;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if ((i3 & 16) != 0) {
            z = false;
        }
        synchronized (c2103208Lu) {
            if (LIZJ.compareAndSet(false, true)) {
                LIZIZ = i2;
                if (z) {
                    long j3 = j - Mp4ScreenVideoLoadTimeout.CONTROL;
                    C786410Ut5.LJLIIL(j3, (Handler) LJII.getValue(), new ARunnableS10S0000100_3(j3, 0));
                }
                WeakRefQueueMonitor.addGcWatcher(new ARunnableS0S0001200_3(j2, i, j, 0));
            }
        }
    }

    public static void LIZIZ(final String str, final int i, int i2, final boolean z, final Object obj) {
        if (LIZJ.get() && i2 == LIZIZ) {
            C786410Ut5.LJJZZIII((Handler) LJII.getValue(), new Runnable() { // from class: X.08Lv
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2 = z;
                    Object obj2 = obj;
                    String str2 = str;
                    int i3 = i;
                    C1C7U.LIZ("LeakWatcher@97d2.watch$1L");
                    long jCurrentTimeMillis = z2 ? System.currentTimeMillis() : 0L;
                    int iIdentityHashCode = System.identityHashCode(obj2);
                    HashSet<Integer> hashSet = C2103208Lu.LJ;
                    if (!hashSet.contains(Integer.valueOf(iIdentityHashCode))) {
                        hashSet.add(Integer.valueOf(iIdentityHashCode));
                        HashSet<C2103408Lw> hashSet2 = C2103208Lu.LJFF;
                        hashSet2.add(new C2103408Lw(obj2, i3, iIdentityHashCode, str2, jCurrentTimeMillis, C2103208Lu.LIZLLL));
                        if (C2103208Lu.LJIIJ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("LocalLeakWatcher watch type:");
                            sbLIZ.append(i3);
                            sbLIZ.append(" name:");
                            sbLIZ.append(str2);
                            sbLIZ.append(" identity:0x");
                            sbLIZ.append(Integer.toHexString(iIdentityHashCode));
                            sbLIZ.append(" now retain objs:");
                            sbLIZ.append(hashSet2.size());
                            sbLIZ.append(" ids:");
                            sbLIZ.append(hashSet.size());
                            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else if (C2103208Lu.LJIIJ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("LocalLeakWatcher skip as already watched name:");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(" identity:0x");
                        sbLIZ2.append(Integer.toHexString(iIdentityHashCode));
                        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    C1C7U.LIZIZ("LeakWatcher@97d2.watch$1L");
                }
            });
        }
    }
}
