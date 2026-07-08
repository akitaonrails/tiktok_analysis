package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import webcast.api.smb.CreateSMBCourseOrderRequest;
import webcast.api.smb.CreateSMBCourseOrderResponse;

/* JADX INFO: renamed from: X.0K9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.payment.course.PcsCourseCreateContractTask$requestApi$2", f = "PcsCourseCreateContractTask.kt", l = {39}, m = "invokeSuspend")
public final class C512950K9t extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<CreateSMBCourseOrderResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ CreateSMBCourseOrderRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512950K9t(CreateSMBCourseOrderRequest createSMBCourseOrderRequest, InterfaceC1364105Vn<? super C512950K9t> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = createSMBCourseOrderRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C512950K9t(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<CreateSMBCourseOrderResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsCourseCreateContractTask@50f1.requestApi$2");
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
            C480460Ism.LIZ().getClass();
            PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
            CreateSMBCourseOrderRequest createSMBCourseOrderRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = pcsApi.createSMBCourseOrderSuspend(createSMBCourseOrderRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PcsCourseCreateContractTask@50f1.requestApi$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PcsCourseCreateContractTask@50f1.requestApi$2");
        return obj;
    }
}
