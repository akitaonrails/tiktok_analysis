package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoPollRedirectSchemaModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00s8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C214200s8 {
    public static final EcPipoPollRedirectSchemaModel LIZ = new EcPipoPollRedirectSchemaModel(null, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(6));

    public static final boolean LIZ(String str) {
        List<String> list;
        C01GW c01gw = LIZIZ;
        if (((EcPipoPollRedirectSchemaModel) c01gw.getValue()).enable && str != null && str.length() != 0 && (list = ((EcPipoPollRedirectSchemaModel) c01gw.getValue()).paymentMethods) != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
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
