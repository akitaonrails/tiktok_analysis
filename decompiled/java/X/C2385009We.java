package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09We, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.jsb.impl.PipoGetNonceMethod$handle$1$2$1", f = "PipoGetNonceMethod.kt", l = {}, m = "invokeSuspend")
public final class C2385009We extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC2384709Wb> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2385009We(CompletionBlock<InterfaceC2384709Wb> completionBlock, InterfaceC1364105Vn<? super C2385009We> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2385009We(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipoGetNonceMethod@ac4a.handle$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onFailure(0, "API Failed", null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoGetNonceMethod@ac4a.handle$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
