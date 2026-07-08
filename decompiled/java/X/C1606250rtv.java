package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0rtv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606250rtv {
    public static final ConcurrentHashMap<Object, InterfaceC1606260rtw> LIZ = new ConcurrentHashMap<>();
    public static volatile boolean LIZIZ;

    public static void LIZ(EnumC1606030rtZ enumC1606030rtZ) {
        LIZIZ = false;
        Iterator<T> it2 = LIZ.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1606260rtw) it2.next()).LJ();
        }
    }

    public static void LIZIZ(EnumC1606030rtZ enumC1606030rtZ) {
        LIZIZ = true;
        Iterator<T> it2 = LIZ.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1606260rtw) it2.next()).LIZ();
        }
    }
}
