package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pE8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.jsb.PipoProbeCollectAppListMethodIDL$handle$2$1", f = "PipoProbeCollectAppListMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C1503460pE8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CompletionBlock<InterfaceC1503470pE9> LL;
    public final /* synthetic */ C1503490pEB LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503460pE8(CompletionBlock<InterfaceC1503470pE9> completionBlock, C1503490pEB c1503490pEB, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C1503460pE8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = completionBlock;
        this.LLILLJJLI = c1503490pEB;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1503460pE8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String containerID;
        Map<String, ? extends Object> mapLJ;
        C1C7U.LIZ("PipoProbeCollectAppListMethodIDL@3f51.handle$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CompletionBlock<InterfaceC1503470pE9> completionBlock = this.LL;
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
        Object obj2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1503470pE9.class, containerID);
        Map<String, Object> map = this.LLILLL;
        InterfaceC1503470pE9 interfaceC1503470pE9 = (InterfaceC1503470pE9) xBaseModelLIZJ;
        if (map != null) {
            obj2 = map.get("applist");
        }
        if (!(obj2 instanceof Map) || (mapLJ = (Map) obj2) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        interfaceC1503470pE9.setApplist(mapLJ);
        interfaceC1503470pE9.setSupported(true);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoProbeCollectAppListMethodIDL@3f51.handle$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
