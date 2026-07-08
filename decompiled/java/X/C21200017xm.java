package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21200017xm {
    public final boolean LIZ = C21200717xt.LIZ();
    public final PriorityBlockingQueue<C0T93> LIZIZ = new PriorityBlockingQueue<>();
    public final HashMap<Integer, C21200117xn> LIZJ = new HashMap<>();
    public C21200117xn LIZLLL;
    public Integer LJ;
    public boolean LJFF;

    public C21200017xm() {
        this.LJFF = C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_live_room_animation_timing_type", true) == 2;
    }

    public final void LIZ(C21200117xn c21200117xn) {
        int i = c21200117xn.LIZ;
        if (this.LIZJ.get(Integer.valueOf(i)) == null) {
            this.LIZIZ.add(new C0T93(i, c21200117xn.LIZIZ));
            this.LIZJ.put(Integer.valueOf(i), c21200117xn);
        } else {
            this.LIZJ.put(Integer.valueOf(i), c21200117xn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C21200117xn r5) {
        /*
            r4 = this;
            boolean r0 = r4.LIZ
            if (r0 == 0) goto L15
            if (r5 == 0) goto L15
            boolean r0 = r4.LJFF
            if (r0 != 0) goto L7b
            boolean r0 = r5.LIZLLL
            if (r0 != 0) goto L7b
            X.17xn r0 = r4.LIZLLL
            if (r0 == 0) goto L16
            r4.LIZ(r5)
        L15:
            return
        L16:
            int r3 = r5.LIZ
            java.util.concurrent.PriorityBlockingQueue<X.0T93> r0 = r4.LIZIZ
            java.util.Iterator r2 = r0.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto L30
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0T93 r0 = (X.C0T93) r0
            int r0 = r0.LL
            if (r0 == r3) goto L1e
        L30:
            X.0T93 r1 = (X.C0T93) r1
            if (r1 == 0) goto L4a
            int r0 = r1.LL
            java.util.HashMap<java.lang.Integer, X.17xn> r1 = r4.LIZJ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.17xn r0 = (X.C21200117xn) r0
            if (r0 == 0) goto L4a
            int r1 = r5.LIZIZ
            int r0 = r0.LIZIZ
            if (r1 > r0) goto L77
        L4a:
            kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r0 = r5.LIZJ
            if (r0 == 0) goto L77
            r4.LIZLLL = r5
            r4.LJ(r5)
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "shouldShowCard:"
            r1.append(r0)
            int r0 = r5.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LJ(r0)
            java.lang.Integer r1 = r4.LJ
            kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r0 = r5.LIZJ
            if (r0 == 0) goto L15
            r0.invoke(r1)
            return
        L77:
            r4.LIZ(r5)
            return
        L7b:
            r4.LIZ(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21200017xm.LIZIZ(X.17xn):void");
    }

    public final C21200117xn LIZJ(int i) {
        C21200117xn c21200117xn = this.LIZLLL;
        if (c21200117xn != null && c21200117xn.LIZ == i) {
            return c21200117xn;
        }
        return this.LIZJ.get(Integer.valueOf(i));
    }

    public final C21200117xn LIZLLL(int i) {
        return this.LIZJ.get(Integer.valueOf(i));
    }

    public final void LJ(C21200117xn c21200117xn) {
        C0T93 next;
        this.LIZJ.remove(Integer.valueOf(c21200117xn.LIZ));
        PriorityBlockingQueue<C0T93> priorityBlockingQueue = this.LIZIZ;
        Iterator<C0T93> it2 = priorityBlockingQueue.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LL == c21200117xn.LIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        priorityBlockingQueue.remove(next);
    }

    public final void LJFF(C21200117xn c21200117xn, boolean z) {
        C0T93 c0t93;
        int i;
        if (this.LIZ && c21200117xn != null) {
            C21200117xn c21200117xn2 = this.LIZLLL;
            if (c21200117xn2 != null && (i = c21200117xn2.LIZ) == c21200117xn.LIZ) {
                this.LJ = Integer.valueOf(i);
                this.LIZLLL = null;
            }
            LJ(c21200117xn);
            if (this.LIZLLL == null && z && (c0t93 = (C0T93) C13LP.LJJJLIIL(this.LIZIZ)) != null) {
                LIZIZ(this.LIZJ.get(Integer.valueOf(c0t93.LL)));
            }
        }
    }

    public final void LJI(int i, Function1<? super C21200117xn, Boolean> function1) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeTaskAndShowNext:");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C21200117xn c21200117xnLIZJ = LIZJ(i);
        if (c21200117xnLIZJ != null) {
            if (function1 == null || function1.invoke(c21200117xnLIZJ).booleanValue()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("find card:");
                sbLIZ2.append(i);
                sbLIZ2.append(", remove and show next,queue:");
                sbLIZ2.append(this.LIZIZ.size());
                C2341109Fh.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                LJFF(c21200117xnLIZJ, true);
            }
        }
    }
}
