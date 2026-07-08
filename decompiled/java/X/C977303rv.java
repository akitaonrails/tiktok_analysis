package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.cache.data.AddressCacheModel;

/* JADX INFO: renamed from: X.03rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C977303rv {
    public static final C977303rv LIZ = new C977303rv();

    public static void LIZ(C977303rv c977303rv, int i, String str, String str2, AddressCacheModel addressCacheModel, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            addressCacheModel = null;
        }
        c977303rv.getClass();
        C04CK c04ck = new C04CK() { // from class: X.048S
            @Override // X.AbstractC1748790vbp
            public final C1748850vbv LIZ() {
                return new C1748850vbv(new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("has_cache", new C1747940vaS[0]), new C1748840vbu("cache_invalid_reason", new C1747940vaS[0]));
            }
        };
        c04ck.LJIIIIZZ(new C977403rw(i, addressCacheModel, str, str2));
        c04ck.LIZJ(false);
    }
}
