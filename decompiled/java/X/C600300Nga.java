package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.content.sea.communication.jsb.SeaContentTriggerActionMethodIDL$getContentMethodCallback$1$onError$1", f = "SeaContentTriggerActionMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C600300Nga extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC600400Ngk> LL;
    public final /* synthetic */ C599080Nec LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C600300Nga(CompletionBlock<InterfaceC600400Ngk> completionBlock, C599080Nec c599080Nec, InterfaceC1364105Vn<? super C600300Nga> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = completionBlock;
        this.LLILLJJLI = c599080Nec;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C600300Nga(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaContentTriggerActionMethodIDL@82ee.getContentMethodCallback$1$onError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CompletionBlock<InterfaceC600400Ngk> completionBlock = this.LL;
        C599080Nec c599080Nec = this.LLILLJJLI;
        C2382909Vj.LIZ(completionBlock, c599080Nec.LIZ, c599080Nec.LIZIZ, null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaContentTriggerActionMethodIDL@82ee.getContentMethodCallback$1$onError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
