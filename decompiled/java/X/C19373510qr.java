package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPayCodeFinishSchemaModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19373510qr {
    public static final EcPayCodeFinishSchemaModel LIZ = new EcPayCodeFinishSchemaModel(null, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(8));

    public static final boolean LIZ(String str) {
        List<String> list;
        C01GW c01gw = LIZIZ;
        if (((EcPayCodeFinishSchemaModel) c01gw.getValue()).enable && str != null && str.length() != 0 && (list = ((EcPayCodeFinishSchemaModel) c01gw.getValue()).paymentMethods) != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
