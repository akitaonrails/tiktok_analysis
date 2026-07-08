package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import webcast.api.sub.SMBServiceOptFormRequest;

/* JADX INFO: renamed from: X.0moQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$requestServiceOptForm$1$result$1$1", f = "PcsOnboardingVM.kt", l = {928}, m = "invokeSuspend")
public final class C1410640moQ extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<Unit>>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingVM LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ List<Integer> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410640moQ(PcsOnboardingVM pcsOnboardingVM, long j, List<Integer> list, InterfaceC1364105Vn<? super C1410640moQ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingVM;
        this.LLILLL = j;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410640moQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.requestServiceOptForm$1$result$1$1");
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
            InterfaceC518660KVs interfaceC518660KVs = this.LLILLJJLI.LL;
            SMBServiceOptFormRequest sMBServiceOptFormRequest = new SMBServiceOptFormRequest();
            long j = this.LLILLL;
            List<Integer> list = this.LLILZ;
            sMBServiceOptFormRequest.scene = 2;
            sMBServiceOptFormRequest.serviceId = j;
            sMBServiceOptFormRequest.fieldTypes = list;
            sMBServiceOptFormRequest.editedComponents = C1697810uHb.LJIILJJIL(C2286608xc.LJ(1));
            this.LL = 1;
            obj = interfaceC518660KVs.requestServiceOptForm(sMBServiceOptFormRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestServiceOptForm$1$result$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestServiceOptForm$1$result$1$1");
        return obj;
    }
}
