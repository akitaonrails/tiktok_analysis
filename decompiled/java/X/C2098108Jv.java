package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08Jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2098108Jv {
    public static <T> String LIZ(InterfaceC2098308Jx<T> interfaceC2098308Jx) {
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC2098308Jx.getPath());
        sb.append('?');
        SortedMap sortedMapLIZLLL = C2097908Jt.LIZLLL(new Comparator() { // from class: X.08Jw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((String) obj).compareTo((String) obj2);
            }
        }, interfaceC2098308Jx.getParams());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((TreeMap) sortedMapLIZLLL).entrySet()) {
            if (!a0.LJJJIL((CharSequence) entry.getKey()) && !a0.LJJJIL((CharSequence) entry.getValue()) && !Intrinsics.LJFF(entry.getValue(), "null")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry2.getKey());
            sbLIZ.append('=');
            sbLIZ.append((String) entry2.getValue());
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        sb.append(C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62));
        return sb.toString();
    }
}
