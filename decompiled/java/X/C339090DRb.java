package X;

import android.util.LruCache;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339090DRb {
    public static final LruCache<String, C05XL<Unit>> LIZ = new LruCache<>(5);

    public static void LIZ(Integer num, Integer num2, String str) {
        if (num != null && num2 != null) {
            str = C1743690vTb.LJI(str, num.intValue(), num2.intValue(), EnumC1769850w9n.LIVE_POP_CARD);
        }
        LruCache<String, C05XL<Unit>> lruCache = LIZ;
        if (lruCache.get(str) == null) {
            C099F c099fLIZIZ = C090F.LIZIZ();
            if (C292310Bcz.LIZ) {
                C1326790kdB.LIZ.getClass();
                C1326790kdB.LIZLLL(str).LJJII(new C339100DRc(str, c099fLIZIZ));
            } else {
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C339080DRa(str, c099fLIZIZ, null), 3);
            }
            lruCache.put(str, c099fLIZIZ);
        }
    }
}
