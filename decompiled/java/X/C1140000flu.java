package X;

import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0flu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140000flu extends AbstractC1140540fmm {
    public C1140000flu(C1140290fmN c1140290fmN) {
        super(c1140290fmN);
    }

    @Override // X.AbstractC1140540fmm
    public final void LIZ(final AbstractC1140580fmq abstractC1140580fmq, C1139900flk c1139900flk) {
        LinkedList<C1139900flk> linkedList;
        HashMap<String, C1140610fmt> map;
        Boolean boolValueOf = null;
        if (c1139900flk != null && (map = c1139900flk.LIZ) != null) {
            boolValueOf = Boolean.valueOf(map.containsKey(c1139900flk.LIZ()));
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C1140610fmt c1140610fmt = c1139900flk.LIZ.get(c1139900flk.LIZ());
            if (c1140610fmt != null && (linkedList = c1140610fmt.LIZ) != null) {
                linkedList.add(c1139900flk);
                return;
            }
            return;
        }
        if (c1139900flk == null || c1139900flk.LIZ == null) {
            return;
        }
        C1140610fmt c1140610fmt2 = new C1140610fmt();
        c1139900flk.LIZ.put(c1139900flk.LIZ(), c1140610fmt2);
        LinkedList<C1139900flk> linkedList2 = c1140610fmt2.LIZ;
        if (linkedList2 != null) {
            linkedList2.add(c1139900flk);
        }
        AbstractC1140580fmq abstractC1140580fmq2 = new AbstractC1140580fmq(abstractC1140580fmq) { // from class: X.0flt
            @Override // X.AbstractC1140580fmq
            public final void LIZ(C1139900flk c1139900flk2) {
                HashMap<String, C1140610fmt> map2;
                LinkedList<C1139900flk> linkedList3;
                if (c1139900flk2 != null && (map2 = c1139900flk2.LIZ) != null && map2.containsKey(c1139900flk2.LIZ())) {
                    C1140610fmt c1140610fmt3 = c1139900flk2.LIZ.get(c1139900flk2.LIZ());
                    if (c1140610fmt3 != null && (linkedList3 = c1140610fmt3.LIZ) != null) {
                        for (C1139900flk c1139900flk3 : linkedList3) {
                            c1139900flk3.LJI = c1139900flk2.LJI;
                            c1139900flk3.LJII = c1139900flk2.LJII;
                            c1139900flk3.LJIIJJI = c1139900flk2.LJIIJJI;
                            c1139900flk3.LJIIJ = c1139900flk2.LJIIJ;
                            c1139900flk3.LJIIIZ = c1139900flk2.LJIIIZ;
                            c1139900flk3.LJIIIIZZ = c1139900flk2.LJIIIIZZ;
                            AbstractC1140580fmq abstractC1140580fmq3 = this.LIZ;
                            if (abstractC1140580fmq3 != null) {
                                abstractC1140580fmq3.LIZ(c1139900flk3);
                            }
                        }
                    }
                    c1139900flk2.LIZ.remove(c1139900flk2.LIZ());
                }
            }
        };
        AbstractC1140540fmm abstractC1140540fmm = this.LIZ;
        if (abstractC1140540fmm == null) {
            return;
        }
        abstractC1140540fmm.LIZ(abstractC1140580fmq2, c1139900flk);
    }
}
