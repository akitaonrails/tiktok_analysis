package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tools.common.quota.AiChatFeatureResponse;
import com.ss.android.ugc.tools.common.quota.AiChatQuotaNetApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06pW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tools.common.quota.AiChatQuotaManager$getQuota$2", f = "AiChatQuotaManager.kt", l = {128}, m = "invokeSuspend")
public final class C1726806pW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AiChatFeatureResponse>, Object> {
    public int LL;

    public C1726806pW(InterfaceC1364105Vn<? super C1726806pW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1726806pW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatQuotaManager@cf9d.getQuota$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1727006pY.LIZ.getClass();
                AiChatQuotaNetApi aiChatQuotaNetApi = (AiChatQuotaNetApi) C1727006pY.LIZJ.getValue();
                this.LL = 1;
                obj = aiChatQuotaNetApi.getAiChatQuota(7, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AiChatQuotaManager@cf9d.getQuota$2");
                    return objLJFF;
                }
            }
            AiChatFeatureResponse aiChatFeatureResponse = (AiChatFeatureResponse) obj;
            C1C7U.LIZIZ("AiChatQuotaManager@cf9d.getQuota$2");
            return aiChatFeatureResponse;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1C7U.LIZIZ("AiChatQuotaManager@cf9d.getQuota$2");
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AiChatFeatureResponse> interfaceC1364105Vn) {
        return new C1726806pW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
