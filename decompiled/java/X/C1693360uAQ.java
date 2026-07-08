package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693360uAQ extends C09AY implements Function2<InterfaceC1567440qtK, C1694560uCM, Object> {
    public C1693360uAQ() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1567440qtK interfaceC1567440qtK, C1694560uCM c1694560uCM) {
        InterfaceC1567440qtK interfaceC1567440qtK2 = interfaceC1567440qtK;
        List<C1694530uCJ> list = c1694560uCM.LL;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(C1693270uAH.LIZ(ListProtector.get(list, i), C1693270uAH.LJIJJLI, interfaceC1567440qtK2));
        }
        return arrayList;
    }
}
