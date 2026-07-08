package X;

import android.util.LruCache;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339120DRe {
    public static final LruCache<String, C05XL<Unit>> LIZ = new LruCache<>(5);

    public static void LIZ(String str, Integer num, Integer num2, EnumC1769850w9n enumC1769850w9n) {
        if (num != null && num2 != null) {
            str = C19411510wz.LIZLLL(str, num.intValue(), num2.intValue(), enumC1769850w9n);
        }
        LruCache<String, C05XL<Unit>> lruCache = LIZ;
        if (lruCache.get(str) == null) {
            C099F c099fLIZIZ = C090F.LIZIZ();
            if (C292310Bcz.LIZ) {
                C1326790kdB.LIZ.getClass();
                C1326790kdB.LIZLLL(str).LJJII(new C339130DRf(str, c099fLIZIZ));
            } else {
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C339110DRd(str, c099fLIZIZ, null), 3);
            }
            lruCache.put(str, c099fLIZIZ);
        }
    }
}
