package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ngb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.content.sea.communication.jsb.SeaContentTriggerActionMethodIDL$getContentMethodCallback$1$onSuccess$1", f = "SeaContentTriggerActionMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C600310Ngb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC600400Ngk> LL;
    public final /* synthetic */ C600370Ngh LLILLJJLI;
    public final /* synthetic */ C599060Nea LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C600310Ngb(CompletionBlock<InterfaceC600400Ngk> completionBlock, C600370Ngh c600370Ngh, C599060Nea c599060Nea, InterfaceC1364105Vn<? super C600310Ngb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = completionBlock;
        this.LLILLJJLI = c600370Ngh;
        this.LLILLL = c599060Nea;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C600310Ngb(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        C1C7U.LIZ("SeaContentTriggerActionMethodIDL@82ee.getContentMethodCallback$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CompletionBlock<InterfaceC600400Ngk> completionBlock = this.LL;
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC600400Ngk.class, containerID);
        C599060Nea c599060Nea = this.LLILLL;
        InterfaceC600400Ngk interfaceC600400Ngk = (InterfaceC600400Ngk) xBaseModelLIZJ;
        interfaceC600400Ngk.setCode(C2286608xc.LJ(0));
        interfaceC600400Ngk.setMsg("success");
        interfaceC600400Ngk.setData(c599060Nea.LIZ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaContentTriggerActionMethodIDL@82ee.getContentMethodCallback$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
