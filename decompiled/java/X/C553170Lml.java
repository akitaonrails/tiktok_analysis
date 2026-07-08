package X;

import com.ss.android.ugc.aweme.aigc.graph.net.QuotaStruct;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.artifact.AIGCWorkflowArtifactFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitQuotaServiceImpl$updateQuotaCache$1", f = "AIPortraitQuotaServiceImpl.kt", l = {65}, m = "invokeSuspend")
public final class C553170Lml extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2217908mX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553170Lml(C2217908mX c2217908mX, InterfaceC1364105Vn<? super C553170Lml> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2217908mX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553170Lml(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitQuotaServiceImpl@dfc7.updateQuotaCache$1");
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
            Map<String, InterfaceC1406105et> mapInvoke = this.LLILLJJLI.LIZ.LIZJ.invoke();
            C552500Llg.INSTANCE.getClass();
            InterfaceC1406105et interfaceC1406105et = mapInvoke.get("server_remain_quotas");
            if (interfaceC1406105et != null) {
                AIGCWorkflowArtifactFactory aIGCWorkflowArtifactFactory = (AIGCWorkflowArtifactFactory) ServiceManager.get().getService(AIGCWorkflowArtifactFactory.class, false, false);
                Type type = new AbstractC554720LpG<List<? extends QuotaStruct>>() { // from class: X.0Lmm
                }.LIZ;
                this.LL = 1;
                obj = aIGCWorkflowArtifactFactory.LIZIZ(interfaceC1406105et, type, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AIPortraitQuotaServiceImpl@dfc7.updateQuotaCache$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIPortraitQuotaServiceImpl@dfc7.updateQuotaCache$1");
            return unit;
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            QuotaStruct quotaStruct = (QuotaStruct) C13LP.LJJJLL(list);
            if (quotaStruct == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("AIPortraitQuotaServiceImpl@dfc7.updateQuotaCache$1");
                return unit2;
            }
            C547580Ldk.LIZJ(quotaStruct.quota, quotaStruct.quotaRemain);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitQuotaServiceImpl@dfc7.updateQuotaCache$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
