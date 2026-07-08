package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582210rH9 {
    public static final C1582210rH9 LIZ = new C1582210rH9();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(603));

    public static String LIZ() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUserId();
    }

    public static void LIZIZ(Long l) {
        String strLIZ;
        if (l != null && l.longValue() > 0 && (strLIZ = LIZ()) != null && strLIZ.length() != 0) {
            Keva keva = (Keva) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_refresh_time");
            sbLIZ.append(strLIZ);
            keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), l.longValue());
        }
    }
}
