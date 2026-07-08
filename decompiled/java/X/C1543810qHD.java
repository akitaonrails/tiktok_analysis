package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543810qHD {
    public static final ConcurrentHashMap<String, WeakReference<C1549460qQK>> LIZ = new ConcurrentHashMap<>();

    public static C1549460qQK LIZ(String str) {
        C1549460qQK c1549460qQK;
        if (str == null) {
            return C1543820qHE.LIZ;
        }
        WeakReference<C1549460qQK> weakReference = LIZ.get(str);
        if (weakReference != null && (c1549460qQK = weakReference.get()) != null) {
            return c1549460qQK;
        }
        return C1543820qHE.LIZ;
    }
}
