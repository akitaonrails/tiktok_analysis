package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomOspCallbackOptModel;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.03S2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03S2 {
    public static final C03S2 LIZ = new C03S2();
    public static final EcomOspCallbackOptModel LIZIZ = new EcomOspCallbackOptModel(0, 0);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(354));

    public static boolean LIZ() {
        Integer num;
        Integer num2;
        C01GW c01gw = LIZJ;
        EcomOspCallbackOptModel ecomOspCallbackOptModel = (EcomOspCallbackOptModel) c01gw.getValue();
        if (ecomOspCallbackOptModel != null && (num2 = ecomOspCallbackOptModel.optApiCallback) != null && num2.intValue() == 1) {
            return true;
        }
        EcomOspCallbackOptModel ecomOspCallbackOptModel2 = (EcomOspCallbackOptModel) c01gw.getValue();
        return (ecomOspCallbackOptModel2 == null || (num = ecomOspCallbackOptModel2.optApiCallback) == null || num.intValue() != 2) ? false : true;
    }
}
