package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.jsb.PipoProbeCollectMethodIDL$handle$1", f = "PipoProbeCollectMethodIDL.kt", l = {52}, m = "invokeSuspend")
public final class C601890Nj9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC601910NjB LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC601860Nj6> LLILLL;
    public final /* synthetic */ C601870Nj7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C601890Nj9(InterfaceC601910NjB interfaceC601910NjB, CompletionBlock<InterfaceC601860Nj6> completionBlock, C601870Nj7 c601870Nj7, InterfaceC1364105Vn<? super C601890Nj9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC601910NjB;
        this.LLILLL = completionBlock;
        this.LLILZ = c601870Nj7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C601890Nj9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        HashMap mapLJI;
        HashMap mapLJFF;
        C1C7U.LIZ("PipoProbeCollectMethodIDL@d750.handle$1");
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
            IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
            if (iProbeService != null && (mapLJFF = iProbeService.LJFF(new AnonymousClass1489(this.LLILLJJLI.getEntrance(), null, null, null, 248))) != null) {
                if (this.LLILLJJLI.getLegacy()) {
                    mapLJI = new HashMap(mapLJFF);
                    mapLJI.put("probe", mapLJFF);
                } else {
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("probe", mapLJFF);
                    Object obj2 = mapLJFF.get("probe_id");
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    pairArr[1] = new Pair("probe_id", obj2);
                    mapLJI = C2097608Jq.LJI(pairArr);
                }
            } else {
                mapLJI = null;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C601850Nj5 c601850Nj5 = new C601850Nj5(mapLJI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c601850Nj5) == objLJFF) {
                C1C7U.LIZIZ("PipoProbeCollectMethodIDL@d750.handle$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoProbeCollectMethodIDL@d750.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
