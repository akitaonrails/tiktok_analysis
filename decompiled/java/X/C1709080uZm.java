package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0uZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel$refreshPage$2", f = "CashierViewModel.kt", l = {330}, m = "invokeSuspend")
public final class C1709080uZm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CashierViewModel LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709080uZm(CashierViewModel cashierViewModel, Context context, InterfaceC1364105Vn<? super C1709080uZm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cashierViewModel;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1709080uZm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1707990uY1 c1707990uY1;
        C1707820uXk c1707820uXk;
        C1C7U.LIZ("CashierViewModel@ddc8.refreshPage$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            CashierViewModel cashierViewModel = this.LLILLJJLI;
            C1709570uaZ c1709570uaZ = cashierViewModel.LLILLJJLI;
            EnumC1709240ua2 enumC1709240ua2 = null;
            if (c1709570uaZ != null) {
                c1707990uY1 = c1709570uaZ.LIZIZ;
            } else {
                c1707990uY1 = null;
            }
            CashierEnterParams cashierEnterParams = cashierViewModel.LL;
            if (cashierEnterParams != null) {
                c1707820uXk = cashierEnterParams.payStartParams;
            } else {
                c1707820uXk = null;
            }
            if (c1707990uY1 != null && c1707820uXk != null) {
                C1708930uZX c1708930uZX = new C1708930uZX(new AwS605S0100000_26(cashierViewModel, 356), new AwS675S0100000_26(this.LLILLJJLI, 6));
                CashierViewModel cashierViewModel2 = this.LLILLJJLI;
                CashierEnterParams cashierEnterParams2 = cashierViewModel2.LL;
                if (cashierEnterParams2 != null) {
                    Context context = this.LLILLL;
                    InterfaceC1708850uZP interfaceC1708850uZP = (InterfaceC1708850uZP) cashierViewModel2.LLJI.getValue().getOperator();
                    C1709070uZl c1709070uZl = cashierEnterParams2.LIZIZ;
                    if (c1709070uZl != null) {
                        enumC1709240ua2 = c1709070uZl.LIZ;
                    }
                    C1709570uaZ c1709570uaZ2 = cashierEnterParams2.paymentData;
                    CashierKey cashierKey = cashierEnterParams2.LIZ;
                    C1708990uZd c1708990uZd = cashierEnterParams2.LIZJ;
                    EnumC1708880uZS enumC1708880uZS = cashierEnterParams2.LIZLLL;
                    C1710930ucl.LIZ.getClass();
                    String strLIZIZ = C1710930ucl.LIZIZ("cashier", "payment");
                    this.LL = 1;
                    if (interfaceC1708850uZP.y0(context, c1709570uaZ2, enumC1709240ua2, c1707990uY1, c1707820uXk, cashierKey, c1708990uZd, enumC1708880uZS, strLIZIZ, c1708930uZX, this) == objLJFF) {
                        C1C7U.LIZIZ("CashierViewModel@ddc8.refreshPage$2");
                        return objLJFF;
                    }
                }
            } else {
                C1AF0.LIZJ("refresh page in cashier page error: reqParams or payParams null");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CashierViewModel@ddc8.refreshPage$2");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CashierViewModel@ddc8.refreshPage$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
