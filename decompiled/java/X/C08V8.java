package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.08V8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C08V8 {
    public static /* synthetic */ List LIZ(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 0;
        Object[] objArr = {obj, obj2, obj3, obj4};
        ArrayList arrayList = new ArrayList(4);
        do {
            Object obj5 = objArr[i];
            Objects.requireNonNull(obj5);
            arrayList.add(obj5);
            i++;
        } while (i < 4);
        return Collections.unmodifiableList(arrayList);
    }
}
