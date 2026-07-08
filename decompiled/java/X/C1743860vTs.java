package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743860vTs {
    public static final C1743860vTs LIZ = new C1743860vTs();
    public static final LruCache<String, C05XL<Unit>> LIZIZ = new LruCache<>(20);

    public static void LIZ(String str) {
        String strLJFF = str;
        int iLJIJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJ();
        if (strLJFF == null) {
            strLJFF = "";
        }
        try {
            strLJFF = C1743690vTb.LJFF(iLJIJ, iLJIJ, strLJFF);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1334210kp9.LIZIZ(strLJFF, EnumC1769850w9n.VIDEO_MULTI_ANCHOR, null, null, false, false, null, null);
        LruCache<String, C05XL<Unit>> lruCache = LIZIZ;
        if (lruCache.get(strLJFF) == null) {
            C099F c099fLIZIZ = C090F.LIZIZ();
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C0DRZ(strLJFF, c099fLIZIZ, null), 3);
            lruCache.put(strLJFF, c099fLIZIZ);
        }
    }
}
