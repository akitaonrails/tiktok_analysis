package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0tEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657630tEn {
    public static final /* synthetic */ int LIZ = 0;

    public static final List<C1650980t44> LIZ(InterfaceC1657610tEl interfaceC1657610tEl) {
        int i;
        ArrayList arrayList = new ArrayList();
        List<C1650980t44> items = interfaceC1657610tEl.getItems();
        int iQp = interfaceC1657610tEl.Qp();
        if (items.size() > iQp) {
            if (interfaceC1657610tEl.LIZ() != null) {
                i = 1;
            } else {
                i = 0;
            }
            arrayList.addAll(items.subList(iQp - i, items.size()));
        }
        return arrayList;
    }
}
