package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687800u1S extends C09AY implements Function2<InterfaceC1567440qtK, List<? extends C1692270u8f<? extends Object>>, Object> {
    public C1687800u1S() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1567440qtK interfaceC1567440qtK, List<? extends C1692270u8f<? extends Object>> list) {
        InterfaceC1567440qtK interfaceC1567440qtK2 = interfaceC1567440qtK;
        List<? extends C1692270u8f<? extends Object>> list2 = list;
        ArrayList arrayList = new ArrayList(list2.size());
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C1693270uAH.LIZ(ListProtector.get(list2, i), C1693270uAH.LIZJ, interfaceC1567440qtK2));
        }
        return arrayList;
    }
}
