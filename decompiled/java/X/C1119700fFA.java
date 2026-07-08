package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0fFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119700fFA {
    public static InterfaceC1119790fFJ LIZ;
    public static InterfaceC1102490enP LIZIZ;
    public static boolean LIZJ;
    public static BPEAHandler LIZLLL;

    public static long LIZIZ(C1119660fF6 c1119660fF6) {
        if (c1119660fF6 != null && c1119660fF6.LIZ != null && c1119660fF6.LIZIZ != null && c1119660fF6.LIZJ != null) {
            C1119710fFB c1119710fFB = C1113870f5l.LIZ;
            c1119710fFB.getClass();
            C1119760fFG c1119760fFG = new C1119760fFG();
            c1119760fFG.LIZ = SystemClock.uptimeMillis();
            c1119760fFG.LIZLLL = c1119660fF6;
            c1119760fFG.LIZIZ = new C1151820g4y(c1119710fFB, c1119660fF6, 8);
            C1119770fFH c1119770fFH = (C1119770fFH) ((HashMap) c1119710fFB.LIZIZ).get(c1119660fF6.LIZIZ);
            if (c1119770fFH == null) {
                c1119770fFH = new C1119770fFH();
                ((HashMap) c1119710fFB.LIZIZ).put(c1119760fFG.LIZLLL.LIZIZ, c1119770fFH);
                ViewOnAttachStateChangeListenerC1151620g4e viewOnAttachStateChangeListenerC1151620g4e = new ViewOnAttachStateChangeListenerC1151620g4e(c1119710fFB, 8);
                c1119770fFH.LIZIZ = viewOnAttachStateChangeListenerC1151620g4e;
                c1119760fFG.LIZLLL.LIZIZ.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1151620g4e);
            }
            ((LinkedList) c1119770fFH.LIZ).add(c1119760fFG);
            ((LinkedList) c1119710fFB.LIZ).offer(c1119760fFG);
            c1119710fFB.LIZIZ();
            return c1119760fFG.LIZ;
        }
        if (C011Z.LIZ.LIZIZ() != null) {
            C20441214yg.LJ("LiveTooltip", "TooltipUtils.enqueueTooltip failed : check params");
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0331  */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0Gga, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(final X.C1119760fFG r25) {
        /*
            Method dump skipped, instruction units count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1119700fFA.LIZJ(X.0fFG):void");
    }

    public static void LIZ(int i, long j) {
        C1119710fFB c1119710fFB;
        C1119760fFG c1119760fFGLIZ;
        if (j > 0 && (c1119760fFGLIZ = (c1119710fFB = C1113870f5l.LIZ).LIZ(j)) != null) {
            if (c1119710fFB.LIZJ == c1119760fFGLIZ) {
                c1119710fFB.LIZJ = null;
            } else {
                c1119710fFB.LIZJ(c1119760fFGLIZ);
            }
            C1119740fFE c1119740fFE = c1119760fFGLIZ.LJ;
            if (c1119740fFE != null) {
                c1119740fFE.LL = i;
                c1119740fFE.dismiss();
                return;
            }
            View.OnLayoutChangeListener onLayoutChangeListener = c1119760fFGLIZ.LIZJ;
            if (onLayoutChangeListener == null) {
                return;
            }
            c1119760fFGLIZ.LIZLLL.LIZIZ.removeOnLayoutChangeListener(onLayoutChangeListener);
            c1119710fFB.LIZIZ();
        }
    }
}
