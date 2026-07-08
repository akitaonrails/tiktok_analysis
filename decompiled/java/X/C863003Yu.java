package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcOspPaymentBlockModel;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.03Yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C863003Yu {
    public static final EcOspPaymentBlockModel LIZ = new EcOspPaymentBlockModel(null, null, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(2));

    public static boolean LIZ(String str) {
        List<String> list;
        if (!C123100dR.LIZ(str) || (list = ((EcOspPaymentBlockModel) LIZIZ.getValue()).blockPIList) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }
}
