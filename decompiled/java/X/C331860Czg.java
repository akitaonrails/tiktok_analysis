package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Czg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331860Czg {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(int i, boolean z, List list) {
        int size;
        if (i < 0) {
            i = 0;
        }
        if (!z || (size = 6 - list.size()) < 0) {
            size = 0;
        }
        int iMin = Math.min(10, Math.max(i, size));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C0D0F c0d0f = (C0D0F) obj;
                arrayList.add(c0d0f.copy(c0d0f.LL, i2));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C331820Czc c331820Czc = AbstractC331870Czh.Companion;
        int size2 = list.size();
        c331820Czc.getClass();
        if (iMin < 0) {
            iMin = 0;
        }
        ArrayList arrayList2 = new ArrayList(iMin);
        for (int i4 = 0; i4 < iMin; i4++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tail_loading_");
            sbLIZ.append(i4);
            arrayList2.add(new C08LL(C2188811AlT.LIZIZ(sbLIZ), size2 + i4));
        }
        return C13LP.LJLIL(arrayList2, arrayList);
    }
}
