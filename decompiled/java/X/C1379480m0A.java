package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0m0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379480m0A {
    public static List LIZ() {
        InterfaceC2044707zh<EnumC1379590m0L> entries = EnumC1379590m0L.getEntries();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(entries, 10));
        Iterator<EnumC1379590m0L> it2 = entries.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().getValue()));
        }
        return arrayList;
    }
}
