package X;

import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManagerExpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.arch.MixPowerListController$observeEvent$3$1", f = "MixPowerListController.kt", l = {435}, m = "invokeSuspend")
public final class C678170Qit extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C678140Qiq LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C678170Qit(C678140Qiq c678140Qiq, InterfaceC1364105Vn<? super C678170Qit> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c678140Qiq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C678170Qit(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixPowerListController@cd45.observeEvent$3$1");
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
            long jLongValue = ((Number) AnonymousClass0749.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("MixPowerListController@cd45.observeEvent$3$1");
                return objLJFF;
            }
        }
        EcomApiLifecycleManagerExpData ecomApiLifecycleManagerExpData = C679350Qkn.LIZ;
        if (C679350Qkn.LIZ.isEnabled && !this.LLILLJJLI.LJIIIZ) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MixPowerListController@cd45.observeEvent$3$1");
            return unit;
        }
        this.LLILLJJLI.LIZLLL();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixPowerListController@cd45.observeEvent$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
