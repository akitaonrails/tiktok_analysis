package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: renamed from: X.0uag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709640uag {
    public final CashierEnterParams LIZ;
    public final EnumC1709560uaY LIZIZ;
    public final PaymentOption LIZJ;
    public final EnumC1710710ucP LIZLLL;
    public final InterfaceC1708270uYT LJ;
    public final C1192680h8s LJFF;
    public final Function0<Unit> LJI;
    public final boolean LJII;
    public final C1709570uaZ LJIIIIZZ;

    public final EnumC1709020uZg LIZ() {
        C1709070uZl c1709070uZl = this.LIZ.LIZIZ;
        if (c1709070uZl != null) {
            return c1709070uZl.LIZJ;
        }
        return null;
    }

    public final EnumC1709240ua2 LIZIZ() {
        EnumC1709240ua2 enumC1709240ua2 = this.LJIIIIZZ.LJIJ.LIZIZ;
        return enumC1709240ua2 == null ? EnumC1709240ua2.DEFAULT : enumC1709240ua2;
    }

    public C1709640uag(CashierEnterParams cashierEnterParams, EnumC1709560uaY enumC1709560uaY, PaymentOption paymentOption, EnumC1710710ucP enumC1710710ucP, InterfaceC1708270uYT interfaceC1708270uYT, C1192680h8s c1192680h8s, AwS270S0300000_26 awS270S0300000_26, boolean z) {
        this.LIZ = cashierEnterParams;
        this.LIZIZ = enumC1709560uaY;
        this.LIZJ = paymentOption;
        this.LIZLLL = enumC1710710ucP;
        this.LJ = interfaceC1708270uYT;
        this.LJFF = c1192680h8s;
        this.LJI = awS270S0300000_26;
        this.LJII = z;
        C1709570uaZ c1709570uaZ = cashierEnterParams.paymentData;
        if (c1709570uaZ != null) {
            this.LJIIIIZZ = c1709570uaZ;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
