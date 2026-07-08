package X;

import Y.AgS294S0100000_13;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XG5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment$observeTokenState$1$1", f = "SOTLFragment.kt", l = {860}, m = "invokeSuspend")
public final class C0XG5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SOTLFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XG5(SOTLFragment sOTLFragment, InterfaceC1364105Vn<? super C0XG5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sOTLFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XG5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SOTLFragment@9567.observeTokenState$1$1");
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
            C414301jJ c414301jJ = new C414301jJ(this.LLILLJJLI.ZR().LLILZ, this.LLILLJJLI.ZR().LLIZ, new C2211408lU(null));
            AgS294S0100000_13 agS294S0100000_13 = new AgS294S0100000_13(this.LLILLJJLI, 1);
            this.LL = 1;
            if (c414301jJ.collect(agS294S0100000_13, this) == objLJFF) {
                C1C7U.LIZIZ("SOTLFragment@9567.observeTokenState$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SOTLFragment@9567.observeTokenState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
