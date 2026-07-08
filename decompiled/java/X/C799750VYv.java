package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799750VYv {
    public static EnumC799870VZh LIZ(C0CCZ c0ccz) {
        ConcurrentHashMap<String, EnumC799870VZh> concurrentHashMap = C799880VZi.LIZLLL;
        EnumC799870VZh enumC799870VZh = concurrentHashMap.get(c0ccz.key());
        if (enumC799870VZh != null) {
            return enumC799870VZh;
        }
        C799900VZk.LIZ.getClass();
        EnumC799870VZh enumC799870VZhLJII = C799900VZk.LJFF().LJII(c0ccz);
        concurrentHashMap.put(c0ccz.key(), enumC799870VZhLJII);
        return enumC799870VZhLJII;
    }
}
