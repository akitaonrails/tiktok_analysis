package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.07i6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1935607i6 extends C09AY implements Function2<List<? extends String>, List<? extends String>, List<? extends String>> {
    public C1935607i6() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
        List<? extends String> list3 = list;
        List<? extends String> list4 = list2;
        if (list3 != null) {
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
        return list4;
    }
}
