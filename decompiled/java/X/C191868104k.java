package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.104k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191868104k {
    public static final ConcurrentHashMap<EnumC191875104r, Long> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<EnumC191875104r, Long> LIZIZ = new ConcurrentHashMap<>();

    public static final void LIZ(EnumC191875104r enumC191875104r) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (enumC191875104r == EnumC191875104r.ALL) {
            Iterator<EnumC191875104r> it2 = EnumC191875104r.getEntries().iterator();
            while (it2.hasNext()) {
                LIZ.put(it2.next(), Long.valueOf(jCurrentTimeMillis));
            }
            return;
        }
        LIZ.put(enumC191875104r, Long.valueOf(jCurrentTimeMillis));
    }

    public static final boolean LIZIZ(EnumC191875104r enumC191875104r, boolean z) {
        if (z || enumC191875104r != EnumC191875104r.SETTING) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = LIZ.get(enumC191875104r);
        if (l != null && jCurrentTimeMillis - l.longValue() < 300000) {
            return false;
        }
        ConcurrentHashMap<EnumC191875104r, Long> concurrentHashMap = LIZIZ;
        Long l2 = concurrentHashMap.get(enumC191875104r);
        if (l2 != null && jCurrentTimeMillis - l2.longValue() < 1000) {
            return false;
        }
        concurrentHashMap.put(enumC191875104r, Long.valueOf(jCurrentTimeMillis));
        return true;
    }
}
