package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ILx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465150ILx {
    public static final ConcurrentHashMap<String, Boolean> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<InterfaceC465170ILz> LIZJ = new CopyOnWriteArrayList<>();

    public static void LIZ(String str, boolean z, boolean z2) {
        if (str != null && str.length() != 0) {
            if (z2) {
                LIZ.remove(str);
            } else {
                LIZIZ.remove(str);
            }
            Iterator<InterfaceC465170ILz> it2 = LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(str, false, z, z2);
            }
        }
    }
}
