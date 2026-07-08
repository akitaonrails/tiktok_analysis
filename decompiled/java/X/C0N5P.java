package X;

import Y.ARunnableS14S1100000_9;
import Y.ARunnableS5S1000000_9;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.jato.gfx.DoFrameController;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N5P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5P implements C0N5X, C0V3N {
    public static final C0N5P LIZ = new C0N5P();
    public static final Map<String, C0N5R> LIZIZ = new LinkedHashMap();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public static long LIZLLL = -1;
    public static final C01GW LJ = C452501pT.LIZIZ(new C0N5T());
    public static final C01GW LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static C0N5S LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static C0N5R LJIIJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0N5V());
        LJFF = c01gwLIZIZ;
        LJIIIIZZ = (C0V3M) c01gwLIZIZ.getValue();
        LJIIIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(486));
    }

    @Override // X.C0V3N
    public final void LIZ() {
        if (((C0N5Q) LJ.getValue()).LIZ == null || DoFrameController.LIZIZ != 0) {
            return;
        }
        DoFrameController.LIZIZ = 7;
    }

    @Override // X.C0V3N
    public final void LIZIZ() {
        if (LIZLLL == -1) {
            if (LJI && !LJII && C805950VjV.LIZ()) {
                LJII = true;
                return;
            }
            return;
        }
        C0N5R c0n5r = LJIIJ;
        if (c0n5r != null) {
            long jUptimeMillis = SystemClock.uptimeMillis() - LIZLLL;
            if (jUptimeMillis < c0n5r.LIZ || jUptimeMillis > c0n5r.LIZIZ) {
                return;
            }
            LIZLLL = -1L;
            Iterator it2 = ((CopyOnWriteArrayList) LJIIIZ.getValue()).iterator();
            while (it2.hasNext()) {
                ((C0N5W) it2.next()).LIZ();
            }
            C0N5Q c0n5q = (C0N5Q) LJ.getValue();
            c0n5q.getClass();
            if (DoFrameController.LIZIZ == 7) {
                ((C0N5U) c0n5q.LIZIZ.getValue()).LIZIZ();
            }
        }
    }

    public static void LJ(String str) {
        C0N5R c0n5r;
        Map<String, C0N5R> map = LIZIZ;
        if (map.isEmpty()) {
            return;
        }
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJL(LIZJ, new ARunnableS5S1000000_9(str, 4));
            return;
        }
        if (!map.containsKey(str)) {
            return;
        }
        map.remove(str);
        if (!map.isEmpty()) {
            Iterator<Map.Entry<String, C0N5R>> it2 = map.entrySet().iterator();
            c0n5r = null;
            while (it2.hasNext()) {
                C0N5R value = it2.next().getValue();
                if (c0n5r == null || value.LIZ < c0n5r.LIZ) {
                    c0n5r = value;
                }
            }
        } else {
            c0n5r = null;
        }
        LJIIJ = c0n5r;
        if (LIZIZ.isEmpty()) {
            ((C0N5Q) LJ.getValue()).LIZ = null;
            if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                DoFrameController.LJIIIIZZ = null;
                if (DoFrameController.LIZIZ == 7) {
                    DoFrameController.LIZIZ = 0;
                }
                LJIIIIZZ.LJIIJJI();
                return;
            }
            throw new IllegalStateException("must call in main thread");
        }
    }

    @Override // X.C0N5X
    public final void LIZJ(long j) {
        LIZLLL = j;
        LJII = true;
    }

    public final void LIZLLL(String str, C0N5R c0n5r) {
        long j = c0n5r.LIZ;
        if (j >= 0) {
            long j2 = c0n5r.LIZIZ;
            if (j2 >= 0 && j <= j2 && j >= 16) {
                Map<String, C0N5R> map = LIZIZ;
                if (map.containsKey(str)) {
                    return;
                }
                if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    C786410Ut5.LJL(LIZJ, new ARunnableS14S1100000_9(c0n5r, str, 13));
                    return;
                }
                C0N5R c0n5r2 = LJIIJ;
                if (c0n5r2 == null || c0n5r.LIZ < c0n5r2.LIZ) {
                    LJIIJ = c0n5r;
                }
                map.put(str, c0n5r);
                if (map.size() == 1) {
                    C0N5Q c0n5q = (C0N5Q) LJ.getValue();
                    c0n5q.LIZ = this;
                    if (DoFrameController.LIZIZ == 0) {
                        DoFrameController.LIZIZ = 7;
                    }
                    if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
                        DoFrameController.LJIIIIZZ = c0n5q;
                        LJIIIIZZ.LJFF(this);
                    } else {
                        throw new IllegalStateException("must call in main thread");
                    }
                }
                LJII = false;
            }
        }
    }
}
