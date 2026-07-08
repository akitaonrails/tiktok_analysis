package X;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0zpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910880zpG {
    public final C1910890zpH LIZ(EnumC1910860zpE enumC1910860zpE) {
        C1910890zpH c1910890zpH;
        C1910890zpH c1910890zpHPutIfAbsent;
        if (((Boolean) C138100fr.LIZ.getValue()).booleanValue()) {
            ConcurrentHashMap<EnumC1910860zpE, C1910890zpH> concurrentHashMap = C1910890zpH.LJFF;
            C1910890zpH c1910890zpH2 = concurrentHashMap.get(enumC1910860zpE);
            if (c1910890zpH2 == null && (c1910890zpHPutIfAbsent = concurrentHashMap.putIfAbsent(enumC1910860zpE, (c1910890zpH2 = new C1910890zpH(enumC1910860zpE)))) != null) {
                c1910890zpH2 = c1910890zpHPutIfAbsent;
            }
            return c1910890zpH2;
        }
        synchronized (this) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) C1910890zpH.LJ;
            Object c1910890zpH3 = linkedHashMap.get(enumC1910860zpE);
            if (c1910890zpH3 == null) {
                c1910890zpH3 = new C1910890zpH(enumC1910860zpE);
                linkedHashMap.put(enumC1910860zpE, c1910890zpH3);
            }
            c1910890zpH = (C1910890zpH) c1910890zpH3;
        }
        return c1910890zpH;
    }
}
