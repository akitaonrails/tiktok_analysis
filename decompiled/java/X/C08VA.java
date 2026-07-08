package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.08VA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C08VA {
    public static /* synthetic */ List LIZ(Object obj, Object obj2) {
        int i = 0;
        Object[] objArr = {obj, obj2};
        ArrayList arrayList = new ArrayList(2);
        do {
            Object obj3 = objArr[i];
            Objects.requireNonNull(obj3);
            arrayList.add(obj3);
            i++;
        } while (i < 2);
        return Collections.unmodifiableList(arrayList);
    }
}
