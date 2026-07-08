package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.089x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20723089x {
    public static final String LIZIZ(String str) {
        Uri uriLJ = C1946007jm.LJ(str);
        String strLIZJ = C1946007jm.LIZJ(uriLJ, "url");
        if (strLIZJ == null && (strLIZJ = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "surl")) == null) {
            return str;
        }
        return strLIZJ;
    }

    public static final boolean LIZ(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        return Intrinsics.LJFF(LIZIZ(str), LIZIZ(str2));
    }

    public static final <T> boolean LIZJ(List<? extends T> list, List<? extends T> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list2.size() != list.size()) {
            return false;
        }
        return list.containsAll(list2);
    }
}
