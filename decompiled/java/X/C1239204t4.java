package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04t4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1239204t4 {
    public static final Map<String, ArrayList<Runnable>> LIZ;
    public static final Map<String, Boolean> LIZIZ;

    static {
        new ArrayList();
        LIZ = new LinkedHashMap();
        LIZIZ = new LinkedHashMap();
    }

    public static void LIZIZ(String str) {
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) LIZ).get(str);
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }
        ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) LIZ).get(str);
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        LIZIZ.put(str, Boolean.TRUE);
    }

    public static void LIZ(Runnable runnable, String str, boolean z) {
        if (z && !Intrinsics.LJFF(((LinkedHashMap) LIZIZ).get(str), Boolean.TRUE)) {
            Map<String, ArrayList<Runnable>> map = LIZ;
            if (!map.containsKey(str)) {
                ArrayList<Runnable> arrayList = new ArrayList<>();
                arrayList.add(runnable);
                map.put(str, arrayList);
                return;
            } else {
                ArrayList<Runnable> arrayList2 = (ArrayList) ((LinkedHashMap) map).get(str);
                if (arrayList2 == null) {
                    return;
                }
                arrayList2.add(runnable);
                map.put(str, arrayList2);
                return;
            }
        }
        runnable.run();
    }
}
