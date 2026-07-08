package X;

import Y.ARunnableS100S0200000_31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.157I, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C157I extends C2217421BqW implements Function0<Unit> {
    public C157I(C157K c157k) {
        super(0, c157k, C157K.class, "checkTimeoutTasks", "checkTimeoutTasks()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        synchronized (this.receiver) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<InterfaceC20334914hX, LinkedList<C157M>> entry : C157K.LJ.entrySet()) {
                InterfaceC20334914hX key = entry.getKey();
                LinkedList<C157M> value = entry.getValue();
                Long lLIZJ = key.LIZJ();
                if (lLIZJ != null) {
                    long jLongValue = lLIZJ.longValue();
                    Iterator<C157M> it2 = value.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        C157M next = it2.next();
                        Long l = next.LIZ;
                        if (l != null && jCurrentTimeMillis - l.longValue() > jLongValue) {
                            C157K c157k = C157K.LJIIIIZZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append('[');
                            sbLIZ.append(next.LIZLLL);
                            sbLIZ.append("]checkTimeoutTasks: task timeout detected, workType = ");
                            sbLIZ.append(key.LIZIZ());
                            sbLIZ.append(", nodeId = ");
                            sbLIZ.append(next.LJ);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c157k.getClass();
                            C157K.LJFF(strLIZIZ);
                            if (key.LIZLLL()) {
                                linkedHashSet.add(next.LIZLLL);
                            }
                            it2.remove();
                            arrayList.add(new Pair(key, next));
                            i++;
                        }
                    }
                    if (i > 0) {
                        C157K c157k2 = C157K.LJIIIIZZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("checkTimeoutTasks: workType(");
                        sbLIZ2.append(key.LIZIZ());
                        sbLIZ2.append(") cleaned ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(" timeout tasks");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c157k2.getClass();
                        C157K.LJFF(strLIZIZ2);
                    }
                }
            }
            if ((!linkedHashSet.isEmpty()) || (!arrayList.isEmpty())) {
                C157K.LJI.submit(new ARunnableS100S0200000_31(linkedHashSet, arrayList, 4));
            }
        }
        return Unit.LIZ;
    }
}
