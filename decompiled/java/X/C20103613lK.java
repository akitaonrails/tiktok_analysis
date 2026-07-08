package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.13lK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20103613lK {
    public static final CopyOnWriteArraySet<InterfaceC20103813lM> LIZ = new CopyOnWriteArraySet<>();
    public static final Map<String, InterfaceC20103813lM> LIZIZ = new ConcurrentHashMap();

    public static void LIZ(C20103113lF c20103113lF) {
        if (c20103113lF == null) {
            return;
        }
        CopyOnWriteArraySet<InterfaceC20103813lM> copyOnWriteArraySet = LIZ;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        Iterator<InterfaceC20103813lM> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c20103113lF);
        }
    }
}
