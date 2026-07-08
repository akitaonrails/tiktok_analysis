package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.04wK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259404wK {
    public static void LIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC1254204vU abstractC1254204vU = (AbstractC1254204vU) it2.next();
            if (abstractC1254204vU instanceof C1254404vW) {
                C1254404vW c1254404vW = (C1254404vW) abstractC1254204vU;
                Map<String, Object> map = c1254404vW.LIZ;
                Map<String, Object> map2 = c1254404vW.LIZIZ;
                CopyOnWriteArrayList<InterfaceC839880Wx8> copyOnWriteArrayList = C839870Wx7.LIZ;
                C839870Wx7.LIZ(new LinkedHashMap(map), new LinkedHashMap(map2));
            }
        }
    }
}
