package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ZvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915160ZvG {
    public static final C13BV LIZIZ = C13BV.INSTANCE;
    public List<Long> LIZ = LIZIZ;

    public final void LIZ(List<C954460awe> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C954460awe> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        this.LIZ = arrayList;
    }
}
