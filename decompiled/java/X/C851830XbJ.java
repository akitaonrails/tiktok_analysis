package X;

import Y.AfS46S1100000_13;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ICoinEmailAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851830XbJ {
    public static void LIZ(Fragment fragment, C0XYD c0xyd, String str, String str2, Function0 function0) {
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        ICoinEmailAccountService iCoinEmailAccountService = (ICoinEmailAccountService) PluggableExtentionKt.pluggableSpi$default(ICoinEmailAccountService.class, false, false, false, 14, null);
        if (iCoinEmailAccountService != null) {
            iCoinEmailAccountService.LIZ();
        }
        ICoinEmailAccountService iCoinEmailAccountService2 = (ICoinEmailAccountService) PluggableExtentionKt.pluggableSpi$default(ICoinEmailAccountService.class, false, false, false, 14, null);
        if (iCoinEmailAccountService2 != null) {
            iCoinEmailAccountService2.LIZIZ();
        }
        C0XZ4.LJJIII(c0xz4, fragment, c0xyd, str, 27, str2, null, null, null, null, null, 864).LJIIIIZZ(new AfS46S1100000_13(function0, str, 5)).LJIILL();
    }
}
