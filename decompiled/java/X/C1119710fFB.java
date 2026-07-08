package X;

import android.view.View;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: renamed from: X.0fFB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119710fFB {
    public final Queue<C1119760fFG> LIZ = new LinkedList();
    public final Map<View, C1119770fFH> LIZIZ = new HashMap();
    public C1119760fFG LIZJ;

    public final void LIZIZ() {
        C1119760fFG c1119760fFG;
        if (this.LIZJ != null || (c1119760fFG = (C1119760fFG) ((LinkedList) this.LIZ).poll()) == null) {
            return;
        }
        LIZJ(c1119760fFG);
        this.LIZJ = c1119760fFG;
        if (!c1119760fFG.LIZLLL.LIZLLL()) {
            c1119760fFG.LIZLLL.LJIILL = new C1119750fFF(c1119760fFG);
        } else {
            if (c1119760fFG.LIZLLL.LIZIZ.isLaidOut()) {
                C1119700fFA.LIZJ(c1119760fFG);
                return;
            }
            ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d = new ViewOnLayoutChangeListenerC1151610g4d(c1119760fFG, 22);
            c1119760fFG.LIZJ = viewOnLayoutChangeListenerC1151610g4d;
            c1119760fFG.LIZLLL.LIZIZ.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
        }
    }

    public final C1119760fFG LIZ(long j) {
        C1119760fFG c1119760fFG = this.LIZJ;
        if (c1119760fFG != null && c1119760fFG.LIZ == j) {
            return c1119760fFG;
        }
        for (C1119760fFG c1119760fFG2 : this.LIZ) {
            if (c1119760fFG2.LIZ == j) {
                return c1119760fFG2;
            }
        }
        return null;
    }

    public final void LIZJ(C1119760fFG c1119760fFG) {
        ((LinkedList) this.LIZ).remove(c1119760fFG);
        C1119770fFH c1119770fFH = (C1119770fFH) ((HashMap) this.LIZIZ).get(c1119760fFG.LIZLLL.LIZIZ);
        if (c1119770fFH != null && !c1119770fFH.LIZ.isEmpty()) {
            ((LinkedList) c1119770fFH.LIZ).remove(c1119760fFG);
            if (c1119770fFH.LIZ.isEmpty()) {
                c1119760fFG.LIZLLL.LIZIZ.removeOnAttachStateChangeListener(c1119770fFH.LIZIZ);
                ((HashMap) this.LIZIZ).remove(c1119760fFG.LIZLLL.LIZIZ);
            }
        }
    }
}
