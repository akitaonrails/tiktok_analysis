package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierFragmentStarter$openCashierFragmentFromSchema$2", f = "CashierFragmentStarter.kt", l = {200}, m = "invokeSuspend")
public final class C1708900uZU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1709050uZj LLILLJJLI;
    public final /* synthetic */ C1708910uZV LLILLL;
    public final /* synthetic */ CashierKey LLILZ;
    public final /* synthetic */ C1708930uZX LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708900uZU(C1709050uZj c1709050uZj, C1708910uZV c1708910uZV, CashierKey cashierKey, C1708930uZX c1708930uZX, InterfaceC1364105Vn<? super C1708900uZU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1709050uZj;
        this.LLILLL = c1708910uZV;
        this.LLILZ = cashierKey;
        this.LLILZIL = c1708930uZX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1708900uZU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CashierFragmentStarter@5926.openCashierFragmentFromSchema$2");
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
            C1708830uZN c1708830uZN = new C1708920uZW().LL;
            Context context = this.LLILLJJLI.LIZ;
            C1708910uZV c1708910uZV = this.LLILLL;
            EnumC1709240ua2 enumC1709240ua2 = c1708910uZV.LJFF.LIZ;
            C1707990uY1 c1707990uY1 = c1708910uZV.LIZ;
            C1707820uXk c1707820uXk = c1708910uZV.LIZIZ;
            CashierKey cashierKey = this.LLILZ;
            C1708990uZd c1708990uZd = c1708910uZV.LIZLLL;
            EnumC1708880uZS enumC1708880uZS = c1708910uZV.LJ;
            C1710930ucl.LIZ.getClass();
            String strLIZIZ = C1710930ucl.LIZIZ("cashier", "payment");
            C1708930uZX c1708930uZX = this.LLILZIL;
            this.LL = 1;
            if (c1708830uZN.y0(context, null, enumC1709240ua2, c1707990uY1, c1707820uXk, cashierKey, c1708990uZd, enumC1708880uZS, strLIZIZ, c1708930uZX, this) == objLJFF) {
                C1C7U.LIZIZ("CashierFragmentStarter@5926.openCashierFragmentFromSchema$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CashierFragmentStarter@5926.openCashierFragmentFromSchema$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
