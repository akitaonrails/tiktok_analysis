package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.07i9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1935907i9 extends C09AY implements Function2<List<? extends C1692220u8a>, List<? extends C1692220u8a>, List<? extends C1692220u8a>> {
    public C1935907i9() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends C1692220u8a> invoke(List<? extends C1692220u8a> list, List<? extends C1692220u8a> list2) {
        List<? extends C1692220u8a> list3 = list;
        List<? extends C1692220u8a> list4 = list2;
        if (list3 != null) {
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
        return list4;
    }
}
