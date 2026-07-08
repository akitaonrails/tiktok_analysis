package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Reb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700990Reb {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(C700970ReZ c700970ReZ) {
        if (c700970ReZ == null) {
            return false;
        }
        Object objInvoke = Boolean.FALSE;
        C701120Reo c701120Reo = new C701120Reo();
        synchronized (c700970ReZ) {
            Iterator it2 = ((ArrayList) c700970ReZ.LIZIZ).iterator();
            while (it2.hasNext()) {
                objInvoke = c701120Reo.invoke(objInvoke, it2.next());
            }
        }
        if (((Boolean) objInvoke).booleanValue()) {
            c700970ReZ.LJ = "changed";
        }
        return !Intrinsics.LJFF(c700970ReZ.LJ, "not_changed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    public static void LIZIZ(C700170RdH c700170RdH, C700970ReZ c700970ReZ, AbstractC701310Rf7 abstractC701310Rf7, C698680Ras c698680Ras) {
        List list;
        C700950ReX c700950ReX;
        List<C700970ReZ> list2;
        ?? arrayList;
        if (c700170RdH != null) {
            C701220Rey c701220Rey = new C701220Rey(c700170RdH, c700970ReZ, abstractC701310Rf7, c698680Ras);
            List<String> list3 = null;
            if (abstractC701310Rf7 instanceof C701300Rf6) {
                ((ArrayList) c700170RdH.LJIJJ).clear();
                Function0<List<String>> function0 = c700170RdH.LJFF;
                if (function0 == null || (arrayList = (List) function0.invoke()) == 0 || arrayList.isEmpty()) {
                    C700970ReZ c700970ReZLIZ = c700170RdH.LIZ.LIZ(c700170RdH.LIZLLL);
                    if (c700970ReZLIZ != null && (c700950ReX = c700970ReZLIZ.LJFF) != null && (list2 = c700950ReX.LIZIZ) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                        Iterator<C700970ReZ> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().LIZJ);
                        }
                        ((ArrayList) c700170RdH.LJIJJ).addAll(arrayList);
                    }
                } else {
                    ((ArrayList) c700170RdH.LJIJJ).addAll(arrayList);
                }
                new C00SD(c700170RdH);
                C0T6L.LIZLLL();
                ForkJoinPool forkJoinPool = c701220Rey.LIZ.LIZIZ;
                C700170RdH c700170RdH2 = c701220Rey.LIZ;
                C700970ReZ c700970ReZ2 = c701220Rey.LIZIZ;
                C698680Ras c698680Ras2 = c701220Rey.LIZJ;
                if (c698680Ras2 != null) {
                    list3 = c698680Ras2.LIZIZ;
                }
                forkJoinPool.invoke(new C700790ReH(c700170RdH2, c700970ReZ2, list3));
                return;
            }
            if (abstractC701310Rf7 instanceof C701320Rf8) {
                if (c698680Ras != null) {
                    list3 = c698680Ras.LIZIZ;
                }
                if (C866950Xzh.LIZIZ(list3)) {
                    ForkJoinPool forkJoinPool2 = c700170RdH.LIZIZ;
                    if (c698680Ras == null || (list = c698680Ras.LIZIZ) == null) {
                        list = C13BV.INSTANCE;
                    }
                    forkJoinPool2.invoke(new C701010Red(c700170RdH, c700970ReZ, list));
                }
            }
        }
    }
}
