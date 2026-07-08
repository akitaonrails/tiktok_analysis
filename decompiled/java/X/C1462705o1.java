package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05o1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.impl.EcPdpInvokeActionMethodIDL$seaHandleAction$1$2", f = "EcPdpInvokeActionMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C1462705o1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC1469505p7> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1462705o1(CompletionBlock<InterfaceC1469505p7> completionBlock, String str, InterfaceC1364105Vn<? super C1462705o1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = completionBlock;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1462705o1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPdpInvokeActionMethodIDL@167c.seaHandleAction$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CompletionBlock<InterfaceC1469505p7> completionBlock = this.LL;
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPdpInvokeActionMethodIDL@167c.seaHandleAction$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
