package X;

import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0JcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495830JcT {
    public static void LIZ(int i, View view) {
        Map<Integer, List<View>> map = C495820JcS.LIZJ;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object arrayList = linkedHashMap.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(numValueOf, arrayList);
        }
        ((List) arrayList).add(view);
    }
}
