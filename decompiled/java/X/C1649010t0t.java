package X;

import Y.AgS305S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0t0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.common.api.effect.IMRecordControlApiStub$1", f = "IMRecordControlApiStub.kt", l = {74}, m = "invokeSuspend")
public final class C1649010t0t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1650240t2s LLILLJJLI;
    public final /* synthetic */ C1649000t0s LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1649010t0t(InterfaceC1650240t2s interfaceC1650240t2s, C1649000t0s c1649000t0s, InterfaceC1364105Vn<? super C1649010t0t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1650240t2s;
        this.LLILLL = c1649000t0s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1649010t0t(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMRecordControlApiStub@661b.<init>$1");
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
            b bVarLIZ = C098C.LIZ(this.LLILLJJLI.LJFF());
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLL, 1);
            this.LL = 1;
            if (bVarLIZ.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("IMRecordControlApiStub@661b.<init>$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMRecordControlApiStub@661b.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
