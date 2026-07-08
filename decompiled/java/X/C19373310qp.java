package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcOrderAppPayResultDeeplinkModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19373310qp {
    public static final EcOrderAppPayResultDeeplinkModel LIZ = new EcOrderAppPayResultDeeplinkModel(null, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(7));

    public static final boolean LIZ(String str) {
        C01GW c01gw = LIZIZ;
        if (!((EcOrderAppPayResultDeeplinkModel) c01gw.getValue()).enable) {
            return false;
        }
        List<String> list = ((EcOrderAppPayResultDeeplinkModel) c01gw.getValue()).blackPaymentMethods;
        if (str != null && str.length() != 0 && list != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, it2.next(), false)) {
                    return false;
                }
            }
        }
        return true;
    }
}
