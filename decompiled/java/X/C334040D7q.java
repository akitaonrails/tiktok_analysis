package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334040D7q {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"requires_buyer_input", "requires_buyer_review", "unrecoverable"});

    public static final String LIZ(CheckoutSession checkoutSession) {
        Map map;
        Object obj;
        String string;
        Object obj2 = checkoutSession.ucp;
        if (!(obj2 instanceof Map) || (map = (Map) obj2) == null || (obj = map.get(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) == null || (string = obj.toString()) == null) {
            return null;
        }
        return LIZJ(string);
    }

    public static final boolean LIZIZ(CheckoutSession checkoutSession) {
        String str;
        if (!Intrinsics.LJFF(LIZ(checkoutSession), "success") || (str = checkoutSession.id) == null || a0.LJJJIL(str)) {
            return false;
        }
        return true;
    }

    public static String LIZJ(String str) {
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0) {
            return null;
        }
        return string.toLowerCase(Locale.ROOT);
    }
}
