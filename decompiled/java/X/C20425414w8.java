package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14w8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20425414w8 {
    public static final C20426214wG LIZ(C20426114wF c20426114wF) {
        long j = c20426114wF.LIZ;
        long j2 = c20426114wF.LIZIZ;
        List<C20426414wI> list = c20426114wF.LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C20426414wI c20426414wI : list) {
            arrayList.add(new C20426314wH(c20426414wI.LIZ, c20426414wI.LIZIZ, c20426414wI.LIZJ));
        }
        List<C20425114w5> list2 = c20426114wF.LIZLLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C20425114w5> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(C20424614w0.LIZ(it2.next()));
        }
        return new C20426214wG(arrayList, arrayList2, j, j2);
    }
}
