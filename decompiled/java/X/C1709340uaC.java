package X;

import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS348S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS303S0300000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: renamed from: X.0uaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709340uaC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1709140uZs LL;
    public final /* synthetic */ C1709570uaZ LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C1709880ub4 LLILZ;
    public final /* synthetic */ C1709620uae LLILZIL;
    public final /* synthetic */ PaymentOption LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ C995290c0V LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709340uaC(C1709140uZs c1709140uZs, C1709570uaZ c1709570uaZ, AwS570S0100000_26 awS570S0100000_26, C1709880ub4 c1709880ub4, C1709620uae c1709620uae, PaymentOption paymentOption, int i, boolean z, C995290c0V c995290c0V) {
        super(0);
        this.LL = c1709140uZs;
        this.LLILLJJLI = c1709570uaZ;
        this.LLILLL = awS570S0100000_26;
        this.LLILZ = c1709880ub4;
        this.LLILZIL = c1709620uae;
        this.LLILZLL = paymentOption;
        this.LLIZ = i;
        this.LLIZLLLIL = z;
        this.LLJ = c995290c0V;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1709140uZs c1709140uZs = this.LL;
        CashierKey cashierKey = c1709140uZs.LIZ;
        String str = cashierKey.payRequestId;
        C1709570uaZ c1709570uaZ = this.LLILLJJLI;
        CashierEnterParams cashierEnterParams = new CashierEnterParams(str, cashierKey, c1709570uaZ, null, new C1709070uZl(c1709570uaZ.LJIJ.LIZIZ, EnumC1709200uZy.CONTINUE, EnumC1709020uZg.OSP), c1709140uZs.LIZIZ, EnumC1708880uZS.LEGACY, new C1709220ua0(this.LLILLL, c1709140uZs.LIZLLL, c1709140uZs.LJ, null, null, null, 56));
        C1709920ub8 c1709920ub8 = new C1709920ub8(new AwS675S0100000_26(this.LL, 29), new AwS605S0100000_26(this.LL, 602), new AwS605S0100000_26(this.LL, 603), AFwS348S0000000_26.get$arr$(3), AFwS348S0000000_26.get$arr$(4));
        this.LLILZ.LJ(cashierEnterParams, null, new C1709690ual(new AwS303S0300000_26(this.LLILLJJLI, (C1709570uaZ) this.LLILLL, (Function0<Unit>) this.LLILZ, (C1709880ub4) 3), new AwS570S0100000_26(this.LL, 1394), new AwS392S0200000_26(this.LL, this.LLILLJJLI, 144), new AwS392S0200000_26(this.LL, this.LLILLJJLI, 145), new AwS154S0400000_26(this.LL, (C1709140uZs) this.LLJ, (C995290c0V) this.LLILLJJLI, (C1709570uaZ) this.LLILLL, (Function0<Unit>) 20), 32), c1709920ub8, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLILLJJLI.LJIJ.LIZJ);
        if (this.LLILZLL.LJIJ()) {
            C1709140uZs c1709140uZs2 = this.LL;
            if (c1709140uZs2.LJIIJJI == null) {
                c1709140uZs2.LJIIJJI = this.LLILZ;
            }
        }
        return Unit.LIZ;
    }
}
