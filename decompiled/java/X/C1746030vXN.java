package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0vXN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746030vXN {
    public static final boolean LIZ(AddressEditViewModel addressEditViewModel, String str) {
        String str2;
        ClientConfig clientConfig = addressEditViewModel.LLL;
        if (clientConfig != null && Intrinsics.LJFF(clientConfig.disableRegionCodeChange, Boolean.TRUE)) {
            Region region = addressEditViewModel.LLILZLL;
            if (region != null) {
                str2 = region.code;
            } else {
                str2 = null;
            }
            if (!Intrinsics.LJFF(str, str2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final C1745340vWG LIZIZ(String str, String str2, String str3, String str4) {
        try {
            if (!new Regex(new String(Base64.decode(str, 0), Charsets.UTF_8)).containsMatchIn(str2)) {
                return null;
            }
            return new C1745340vWG(str3, null, true, str4, null, 18);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR60, e, null);
            return null;
        }
    }
}
