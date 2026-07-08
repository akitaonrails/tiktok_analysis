package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0m4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1382140m4S {
    public static final <R> List<R> LIZ(LinkedHashMap<AbstractC328380Cu4<R>, List<R>> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            arrayList.addAll((Collection) it2.next());
        }
        return arrayList;
    }
}
