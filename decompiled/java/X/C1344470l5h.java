package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.IAccountUserService;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344470l5h {
    public static final C1344470l5h LIZ = new C1344470l5h();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(20));
    public static String LIZJ;

    public static LruCache LIZ() {
        return (LruCache) LIZIZ.getValue();
    }

    public static void LIZLLL() {
        String curUserId;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null || curUserId.length() == 0 || Intrinsics.LJFF(LIZJ, curUserId)) {
            return;
        }
        LIZJ = curUserId;
        LIZ().evictAll();
    }

    public static void LIZJ(C1344500l5k c1344500l5k) {
        LIZLLL();
        LIZ().put(c1344500l5k, Long.valueOf(System.currentTimeMillis()));
    }

    public static void LIZIZ(Integer num, Integer num2, String str) {
        boolean z;
        int iIntValue;
        if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!C123100dR.LIZ(str) && !z) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c2344009Gk.LIZJ(iIntValue, "load_type");
        c2344009Gk.LJFF("insert_cids", str);
        c2344009Gk.LJ(num2, "strategy_id");
        C20684815ws.LJIILLIIL("comment_preload_key_error", c2344009Gk.LIZ);
    }
}
