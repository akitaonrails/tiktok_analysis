package X;

import Y.AgS300S0100000_19;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource$init$2", f = "UserCardDataSource.kt", l = {178}, m = "invokeSuspend")
public final class C1263440iz0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1263080iyQ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263440iz0(C1263080iyQ c1263080iyQ, InterfaceC1364105Vn<? super C1263440iz0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1263080iyQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1263440iz0(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardDataSource@8e56.init$2");
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
            C1629806Zs c1629806Zs = new C1629806Zs(this.LLILLJJLI.LIZJ());
            AgS300S0100000_19 agS300S0100000_19 = new AgS300S0100000_19(this.LLILLJJLI, 7);
            this.LL = 1;
            if (c1629806Zs.collect(agS300S0100000_19, this) == objLJFF) {
                C1C7U.LIZIZ("UserCardDataSource@8e56.init$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardDataSource@8e56.init$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
