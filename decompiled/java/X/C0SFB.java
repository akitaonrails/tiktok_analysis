package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS660S0100000_11;

/* JADX INFO: renamed from: X.0SFB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFB {
    public static final Iterable<C0SJL<C719000SIg>> LIZ(C0SJF c0sjf) {
        ArrayList arrayList = new ArrayList();
        AwS660S0100000_11 awS660S0100000_11 = new AwS660S0100000_11(arrayList, (List<C0SJL<C719000SIg>>) 4);
        List listLLIIII = C13LP.LLIIII(c0sjf.LLILLJJLI);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        int i = 0;
        for (Object obj : listLLIIII) {
            int i2 = i + 1;
            if (i >= 0) {
                C0SJL c0sjl = (C0SJL) obj;
                awS660S0100000_11.invoke(C13LP.LJJJLZIJ(i - 1, listLLIIII), c0sjl, C13LP.LJJJLZIJ(i2, listLLIIII));
                arrayList2.add(c0sjl);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        c0sjf.LLILLJJLI = arrayList2;
        return arrayList;
    }
}
