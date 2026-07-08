package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0opu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488440opu<E> {
    public static final Object LIZ(Object obj, E e) {
        if (obj == null) {
            return e;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return arrayList;
    }
}
