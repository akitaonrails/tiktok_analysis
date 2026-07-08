package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0k5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305710k5B {
    public static volatile ConcurrentHashMap<Integer, InterfaceC1305720k5C> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(long j, String str) {
        Iterator<InterfaceC1305720k5C> it2 = LIZ.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJI(j, str);
        }
    }

    public static void LIZIZ(String str, String str2) {
        Iterator<InterfaceC1305720k5C> it2 = LIZ.values().iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(str, str2);
        }
    }
}
