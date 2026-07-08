package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0vui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760500vui {
    public static void LIZ(String str) {
        C1760620vuu c1760620vuuRemove = C1760620vuu.LJIILL.remove(str);
        if (c1760620vuuRemove != null) {
            c1760620vuuRemove.LJI.LJI();
            c1760620vuuRemove.LJIIIZ.LJI();
            c1760620vuuRemove.LJIIJ.LJI();
            c1760620vuuRemove.LJII.LJI();
            c1760620vuuRemove.LJIIIIZZ.LIZ.clear();
        }
    }

    public static C1760620vuu LIZIZ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1760620vuu.LJIILL;
        Object c1760620vuu = linkedHashMap.get(str);
        if (c1760620vuu == null) {
            c1760620vuu = new C1760620vuu();
            linkedHashMap.put(str, c1760620vuu);
        }
        return (C1760620vuu) c1760620vuu;
    }
}
