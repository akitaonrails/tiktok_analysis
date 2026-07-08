package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.jsb.PipoProbeCollectMethodIDL$handle$1$1", f = "PipoProbeCollectMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C601850Nj5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ CompletionBlock<InterfaceC601860Nj6> LLILLJJLI;
    public final /* synthetic */ C601870Nj7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C601850Nj5(Map<String, ? extends Object> map, CompletionBlock<InterfaceC601860Nj6> completionBlock, C601870Nj7 c601870Nj7, InterfaceC1364105Vn<? super C601850Nj5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = c601870Nj7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C601850Nj5(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PipoProbeCollectMethodIDL@d750.handle$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String containerID = null;
        if (this.LL != null) {
            CompletionBlock<InterfaceC601860Nj6> completionBlock = this.LLILLJJLI;
            InterfaceC634840OvC interfaceC634840OvC = this.LLILLL.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC601860Nj6.class, containerID);
            InterfaceC601860Nj6 interfaceC601860Nj6 = (InterfaceC601860Nj6) xBaseModelLIZJ;
            interfaceC601860Nj6.setRiskInfo(this.LL);
            interfaceC601860Nj6.setSupported(true);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            C2382909Vj.LIZ(this.LLILLJJLI, -3, "collect failed", null, 4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoProbeCollectMethodIDL@d750.handle$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
