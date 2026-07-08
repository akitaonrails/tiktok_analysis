package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489090oqx {
    public static final C1489090oqx LIZ = new C1489090oqx();

    public static String LIZ(String str, String str2) {
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static boolean LIZIZ(String str, List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (str != null && a0.LJJIIZI(str, str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
