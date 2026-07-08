package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.187x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212343187x {
    public static final LruCache<String, C212344187y> LIZ = new LruCache<>(2);

    public static boolean LIZ(String str, boolean z) {
        Boolean bool;
        C212344187y c212344187y = LIZ.get(str);
        if (c212344187y != null && (bool = c212344187y.LIZIZ) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public static boolean LIZIZ(String str, boolean z) {
        Boolean bool;
        C212344187y c212344187y = LIZ.get(str);
        if (c212344187y != null && (bool = c212344187y.LIZLLL) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public static boolean LIZJ(String str, boolean z) {
        Boolean bool;
        C212344187y c212344187y = LIZ.get(str);
        if (c212344187y != null && (bool = c212344187y.LJ) != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public static boolean LIZLLL(String str, boolean z) {
        Boolean bool;
        C212344187y c212344187y = LIZ.get(str);
        if (c212344187y != null && (bool = c212344187y.LIZJ) != null) {
            return bool.booleanValue();
        }
        return z;
    }
}
