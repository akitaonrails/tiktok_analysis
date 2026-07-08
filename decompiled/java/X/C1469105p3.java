package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05p3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.impl.EcPdpInvokeActionMethodIDL$getPdpMethodCallback$1$onError$1", f = "EcPdpInvokeActionMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C1469105p3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC1469505p7> LL;
    public final /* synthetic */ C1470005pC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1469105p3(CompletionBlock<InterfaceC1469505p7> completionBlock, C1470005pC c1470005pC, InterfaceC1364105Vn<? super C1469105p3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = completionBlock;
        this.LLILLJJLI = c1470005pC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1469105p3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPdpInvokeActionMethodIDL@167c.getPdpMethodCallback$1$onError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2382909Vj.LIZ(this.LL, 0, this.LLILLJJLI.LIZIZ, null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPdpInvokeActionMethodIDL@167c.getPdpMethodCallback$1$onError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
