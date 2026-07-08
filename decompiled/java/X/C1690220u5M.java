package X;

import Y.AComparatorS44S0000000_25;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0u5M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690220u5M {
    public static final AComparatorS44S0000000_25 LIZ = new AComparatorS44S0000000_25(9);

    public static final <T extends InterfaceC1689980u4y> List<T> LIZ(int i, int i2, List<? extends T> list, List<? extends T> list2) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(list2);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC1689980u4y interfaceC1689980u4y = (InterfaceC1689980u4y) ListProtector.get(list, i3);
            int index = interfaceC1689980u4y.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(interfaceC1689980u4y);
            }
        }
        C08XD.LJJ(arrayList2, LIZ);
        return arrayList2;
    }
}
