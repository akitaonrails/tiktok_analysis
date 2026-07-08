package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.08VB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C08VB {
    public static /* synthetic */ List LIZ(Object obj, Object obj2, Object obj3) {
        int i = 0;
        Object[] objArr = {obj, obj2, obj3};
        ArrayList arrayList = new ArrayList(3);
        do {
            Object obj4 = objArr[i];
            Objects.requireNonNull(obj4);
            arrayList.add(obj4);
            i++;
        } while (i < 3);
        return Collections.unmodifiableList(arrayList);
    }
}
