package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS40S0200100_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Red, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701010Red extends RecursiveTask<C700950ReX> {
    public static final int $stable = 8;
    public final C700170RdH LL;
    public final List<String> LLILLJJLI;
    public final C700970ReZ node;

    @Override // java.util.concurrent.RecursiveTask
    public C700950ReX compute() {
        List<C700970ReZ> list;
        Iterable arrayList;
        Collection arrayList2;
        List<C700970ReZ> list2;
        List<C700970ReZ> list3;
        C700970ReZ c700970ReZ = this.node;
        int iLIZIZ = c700970ReZ != null ? c700970ReZ.LIZIZ() : 0;
        new AwS555S0100000_11(this, 44);
        C0T6L.LIZLLL();
        C238400w2 c238400w2 = new C238400w2();
        if (iLIZIZ > 0) {
            c238400w2.element = System.currentTimeMillis();
            new AwS412S0200000_11(c238400w2, this, 4);
            C0T6L.LIZLLL();
        }
        C700170RdH c700170RdH = this.LL;
        C700970ReZ c700970ReZ2 = this.node;
        List<String> list4 = this.LLILLJJLI;
        C700950ReX c700950ReX = null;
        if (c700970ReZ2 != null) {
            List listLIZJ = c700970ReZ2.LIZJ(new AwS377S0200000_11(c700170RdH, (C700170RdH) list4, (List<String>) 6));
            RecursiveTask.invokeAll(listLIZJ);
            Iterator it2 = ((ArrayList) listLIZJ).iterator();
            while (it2.hasNext()) {
                ((ForkJoinTask) it2.next()).join();
            }
            c700970ReZ2.LJ = "not_changed";
            C700950ReX c700950ReX2 = c700970ReZ2.LJFF;
            if (c700950ReX2 != null && (list = c700950ReX2.LIZIZ) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (C700970ReZ c700970ReZ3 : list) {
                    if (list4.contains(c700970ReZ3.LIZJ)) {
                        arrayList3.add(c700970ReZ3);
                    }
                }
                C700950ReX c700950ReX3 = c700970ReZ2.LJFF;
                if (c700950ReX3 == null || (list3 = c700950ReX3.LIZIZ) == null || (arrayList = C13LP.LLIIII(list3)) == null) {
                    arrayList = new ArrayList();
                }
                List listLJLI = C13LP.LJLI(arrayList, arrayList3);
                C700950ReX c700950ReX4 = c700970ReZ2.LJFF;
                if (c700950ReX4 == null || (list2 = c700950ReX4.LIZJ) == null || (arrayList2 = C13LP.LLIIII(list2)) == null) {
                    arrayList2 = new ArrayList();
                }
                c700970ReZ2.LJFF = c700950ReX2 != null ? C700950ReX.LIZ(c700950ReX2, null, listLJLI, C13LP.LJLIL(arrayList3, arrayList2), null, 25) : null;
            }
            C700950ReX c700950ReX5 = c700970ReZ2.LJFF;
            if (c700950ReX5 != null) {
                c700950ReX5.LJ = C701320Rf8.LIZ;
                c700950ReX = c700950ReX5;
            }
        }
        if (iLIZIZ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            new AwS255S0300000_11(c238400w2, this, c700950ReX, 1);
            C0T6L.LIZLLL();
            new AwS40S0200100_11(jCurrentTimeMillis, this, c238400w2, 0);
            C0T6L.LIZLLL();
        }
        return c700950ReX;
    }

    public C701010Red(C700170RdH c700170RdH, C700970ReZ c700970ReZ, List<String> list) {
        this.LL = c700170RdH;
        this.node = c700970ReZ;
        this.LLILLJJLI = list;
    }
}
