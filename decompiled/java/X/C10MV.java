package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10MV, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10MV {
    public static final C10MV LIZ = new C10MV();

    public static boolean LIZ() {
        String storeRegionUpperCase;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (storeRegionUpperCase = iAccountService.getStoreRegionUpperCase()) == null) {
            storeRegionUpperCase = "";
        }
        if (!Intrinsics.LJFF(storeRegionUpperCase, "DE")) {
            return true;
        }
        C10MS.LIZ.getClass();
        return C10MS.LIZ();
    }
}
