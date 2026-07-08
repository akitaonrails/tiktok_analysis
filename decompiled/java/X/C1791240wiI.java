package X;

import Y.AgS309S0100000_31;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wiI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2$subscribeSmartTriggerStrategy$1", f = "CLACaptionAssemV2.kt", l = {390}, m = "invokeSuspend")
public final class C1791240wiI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CLACaptionAssemV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1791240wiI(CLACaptionAssemV2 cLACaptionAssemV2, InterfaceC1364105Vn<? super C1791240wiI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cLACaptionAssemV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1791240wiI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CLACaptionAssemV2@7287.subscribeSmartTriggerStrategy$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01S9<C207042160a> c01s9Dh = C162B.LIZIZ.dh();
            AgS309S0100000_31 agS309S0100000_31 = new AgS309S0100000_31(this.LLILLJJLI, 0);
            this.LL = 1;
            if (c01s9Dh.collect(agS309S0100000_31, this) == objLJFF) {
                C1C7U.LIZIZ("CLACaptionAssemV2@7287.subscribeSmartTriggerStrategy$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
