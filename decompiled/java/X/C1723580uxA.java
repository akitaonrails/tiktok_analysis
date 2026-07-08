package X;

import Y.AgS209S0200000_26;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.hybrid.PipoRetrievePIListDataMethodIDL$handle$1", f = "PipoRetrievePIListDataMethodIDL.kt", l = {40}, m = "invokeSuspend")
public final class C1723580uxA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1723610uxD LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC1723590uxB> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1723580uxA(C1723610uxD c1723610uxD, CompletionBlock<InterfaceC1723590uxB> completionBlock, InterfaceC1364105Vn<? super C1723580uxA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1723610uxD;
        this.LLILLL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1723580uxA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipoRetrievePIListDataMethodIDL@6142.handle$1");
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
            ((C1723640uxG) this.LLILLJJLI.LLILZIL.getValue()).LLILLJJLI.getClass();
            InterfaceC332260D0u<AbstractC1623806Xk<C1722950uw9>> value = C1723640uxG.LLILLL.getValue();
            AgS209S0200000_26 agS209S0200000_26 = new AgS209S0200000_26(this.LLILLJJLI, this.LLILLL, 1);
            this.LL = 1;
            if (value.collect(agS209S0200000_26, this) == objLJFF) {
                C1C7U.LIZIZ("PipoRetrievePIListDataMethodIDL@6142.handle$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoRetrievePIListDataMethodIDL@6142.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
