package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.04mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1198504mV {
    public final List<Pair<Long, Integer>> LIZ;
    public final int LIZIZ;

    public C1198504mV() {
        this(C13BV.INSTANCE);
    }

    public C1198504mV(List list) {
        Iterator it2 = list.iterator();
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue += ((Number) ((Pair) it2.next()).getSecond()).intValue();
        }
        this.LIZ = list;
        this.LIZIZ = iIntValue;
    }
}
