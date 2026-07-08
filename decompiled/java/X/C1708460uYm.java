package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS177S0400000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708460uYm implements InterfaceC835070WpN {
    public static final C1708460uYm LIZ = new C1708460uYm();

    @Override // X.InterfaceC835070WpN
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC835070WpN
    public final boolean LIZJ(PaymentOption paymentOption) {
        String strLJIL;
        if (paymentOption != null) {
            strLJIL = paymentOption.LJIL();
        } else {
            strLJIL = null;
        }
        return Intrinsics.LJFF(strLJIL, "pm_pi_ew_venmo_c_d");
    }

    @Override // X.InterfaceC835070WpN
    public final void LIZIZ(Context context, C1709570uaZ c1709570uaZ, PaymentOption paymentOption, InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        String strLJJ;
        if (Intrinsics.LJFF(paymentOption.LJIL(), "pm_pi_ew_venmo_c_d") && (strLJJ = paymentOption.LJJ()) != null && strLJJ.length() != 0) {
            c1709570uaZ.LJJIIJZLJL(paymentOption.LIZ).pmDeviceData = null;
            C1708470uYn c1708470uYn = C1708470uYn.LIZ;
            AwS177S0400000_26 awS177S0400000_26 = new AwS177S0400000_26(context, c1709570uaZ, paymentOption, interfaceC1631630sYr, 2);
            AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(context, (Context) interfaceC1631630sYr, (InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit>) 179);
            c1708470uYn.getClass();
            C1708470uYn.LIZ(context, "VENMO_ERROR_DF_OPEN_FAIL", awS177S0400000_26, awS392S0200000_26);
            return;
        }
        EnumC336190DFx enumC336190DFx = EnumC336190DFx.PAYMENT_ERROR;
        C1708470uYn.LIZ.getClass();
        interfaceC1631630sYr.invoke(enumC336190DFx, null, context.getString(2131857118), "VENMO_ERROR_UNSUPPORTED");
    }
}
