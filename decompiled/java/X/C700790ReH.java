package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ReH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700790ReH extends RecursiveTask<C700950ReX> {
    public static final int $stable = 8;
    public final C700170RdH LL;
    public final C700970ReZ node;
    public final List<String> nodeKeys;

    @Override // java.util.concurrent.RecursiveTask
    public C700950ReX compute() {
        C700950ReX c700950ReXLIZIZ;
        C700970ReZ c700970ReZ = this.node;
        int iLIZIZ = c700970ReZ != null ? c700970ReZ.LIZIZ() : 0;
        new C700860ReO(this);
        C0T6L.LIZLLL();
        C238400w2 c238400w2 = new C238400w2();
        if (iLIZIZ > 0) {
            c238400w2.element = System.currentTimeMillis();
            new C700880ReQ(c238400w2, this);
            C0T6L.LIZLLL();
        }
        C700170RdH c700170RdH = this.LL;
        C700970ReZ c700970ReZ2 = this.node;
        C700950ReX c700950ReX = null;
        if (c700970ReZ2 != null) {
            if (Intrinsics.LJFF(c700970ReZ2.LJ, "not_changed")) {
                c700950ReXLIZIZ = c700970ReZ2.LJFF;
                C701240Rf0 c701240Rf0 = c700970ReZ2.LJIIIIZZ;
                if (c701240Rf0 != null && c701240Rf0.LIZJ != null) {
                    C700800ReI.LIZIZ(c700970ReZ2, c700170RdH, c700950ReXLIZIZ, c700970ReZ2.LIZJ);
                }
            } else {
                List listLIZJ = c700970ReZ2.LIZJ(new C701190Rev(c700170RdH, this));
                RecursiveTask.invokeAll(listLIZJ);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) listLIZJ).iterator();
                while (it2.hasNext()) {
                    Object objJoin = ((ForkJoinTask) it2.next()).join();
                    if (objJoin != null) {
                        arrayList.add(objJoin);
                    }
                }
                synchronized (this) {
                    c700950ReXLIZIZ = LIZIZ(c700170RdH, c700970ReZ2, arrayList);
                }
            }
            if (c700950ReXLIZIZ != null) {
                c700950ReXLIZIZ.LJ = C701300Rf6.LIZ;
                c700950ReX = c700950ReXLIZIZ;
            }
        }
        if (iLIZIZ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            new C700900ReS(c238400w2, this, c700950ReX);
            C0T6L.LIZLLL();
            new C700890ReR(jCurrentTimeMillis, this, c238400w2);
            C0T6L.LIZLLL();
        }
        return c700950ReX;
    }

    public C700790ReH(C700170RdH c700170RdH, C700970ReZ c700970ReZ, List<String> list) {
        this.LL = c700170RdH;
        this.node = c700970ReZ;
        this.nodeKeys = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b2 A[LOOP:6: B:201:0x03ac->B:203:0x03b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c6 A[LOOP:7: B:205:0x03c0->B:207:0x03c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ec  */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C700950ReX LIZ(X.C700170RdH r15, X.C700970ReZ r16, java.util.List r17) {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700790ReH.LIZ(X.0RdH, X.0ReZ, java.util.List):X.0ReX");
    }

    public final synchronized C700950ReX LIZIZ(C700170RdH c700170RdH, C700970ReZ c700970ReZ, List list) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((C700950ReX) it2.next()).LIZIZ, arrayList);
        }
        return LIZ(c700170RdH, c700970ReZ, C13LP.LLIIII(arrayList));
    }
}
