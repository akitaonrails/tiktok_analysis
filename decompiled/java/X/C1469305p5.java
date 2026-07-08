package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05p5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.impl.EcPdpInvokeActionMethodIDL$getPdpMethodCallback$1$onSuccess$1", f = "EcPdpInvokeActionMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C1469305p5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC1469505p7> LL;
    public final /* synthetic */ C1470105pD LLILLJJLI;
    public final /* synthetic */ C1470305pF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1469305p5(CompletionBlock<InterfaceC1469505p7> completionBlock, C1470105pD c1470105pD, C1470305pF c1470305pF, InterfaceC1364105Vn<? super C1469305p5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = completionBlock;
        this.LLILLJJLI = c1470105pD;
        this.LLILLL = c1470305pF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1469305p5(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        C1C7U.LIZ("EcPdpInvokeActionMethodIDL@167c.getPdpMethodCallback$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CompletionBlock<InterfaceC1469505p7> completionBlock = this.LL;
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1469505p7.class, containerID);
        C1470305pF c1470305pF = this.LLILLL;
        InterfaceC1469505p7 interfaceC1469505p7 = (InterfaceC1469505p7) xBaseModelLIZJ;
        interfaceC1469505p7.setCode(C2286608xc.LJ(1));
        interfaceC1469505p7.setMsg("success");
        interfaceC1469505p7.setData(c1470305pF.LIZ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPdpInvokeActionMethodIDL@167c.getPdpMethodCallback$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
