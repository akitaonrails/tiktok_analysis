package X;

import java.util.HashMap;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS81S1000000_31;

/* JADX INFO: renamed from: X.157L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C157L {
    public static final void LIZ(C1D82 c1d82, EnumC207165164t enumC207165164t) {
        C157M c157m;
        C157M c157m2;
        C157K c157k = C157K.LJIIIIZZ;
        InterfaceC20334914hX interfaceC20334914hX = c1d82.LJIIJ;
        String str = c1d82.LJI;
        synchronized (c157k) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("finishNode: workType = ");
            sbLIZ.append(interfaceC20334914hX.LIZIZ());
            sbLIZ.append(", nodeId = ");
            sbLIZ.append(str);
            sbLIZ.append(", finishType = ");
            sbLIZ.append(enumC207165164t);
            C157K.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            LinkedList<C157M> linkedList = C157K.LIZLLL.get(interfaceC20334914hX);
            boolean z = false;
            Integer numValueOf = null;
            if (linkedList != null) {
                Pair pairLJIIJ = C157K.LJIIJ(linkedList, new AwS81S1000000_31(str, 2));
                if (((Boolean) pairLJIIJ.getFirst()).booleanValue() && (c157m2 = (C157M) pairLJIIJ.getSecond()) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('[');
                    sbLIZ2.append(c157m2.LIZLLL);
                    sbLIZ2.append("]finishNode: removed from waiting queue, workType = ");
                    sbLIZ2.append(interfaceC20334914hX.LIZIZ());
                    sbLIZ2.append(", nodeId = ");
                    sbLIZ2.append(c157m2.LJ);
                    C157K.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                    C157K.LJIIIIZZ(c157m2.LJFF, c157m2.LJI, c157m2.LIZLLL, false);
                }
            }
            HashMap<InterfaceC20334914hX, LinkedList<C157M>> map = C157K.LJ;
            LinkedList<C157M> linkedList2 = map.get(interfaceC20334914hX);
            if (linkedList2 != null) {
                Pair pairLJIIJ2 = C157K.LJIIJ(linkedList2, new AwS81S1000000_31(str, 3));
                if (((Boolean) pairLJIIJ2.getFirst()).booleanValue() && (c157m = (C157M) pairLJIIJ2.getSecond()) != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('[');
                    sbLIZ3.append(c157m.LIZLLL);
                    sbLIZ3.append("]finishNode: removed from running queue, workType = ");
                    sbLIZ3.append(interfaceC20334914hX.LIZIZ());
                    sbLIZ3.append(", ");
                    sbLIZ3.append("nodeId = ");
                    sbLIZ3.append(c157m.LJ);
                    sbLIZ3.append(", remainingRunningCount = ");
                    LinkedList<C157M> linkedList3 = map.get(interfaceC20334914hX);
                    if (linkedList3 != null) {
                        numValueOf = Integer.valueOf(linkedList3.size());
                    }
                    sbLIZ3.append(numValueOf);
                    C157K.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                    c157k.LJIIIZ(interfaceC20334914hX);
                    Object obj = c157m.LJFF;
                    String str2 = c157m.LIZLLL;
                    if (enumC207165164t == EnumC207165164t.Success) {
                        z = true;
                    }
                    C157K.LJIIIIZZ(obj, interfaceC20334914hX, str2, z);
                }
            }
        }
    }
}
