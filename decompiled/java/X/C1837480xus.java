package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: renamed from: X.0xus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.payment.course.PcsFetchCourseTemplateTask$requestApi$2", f = "PcsFetchCourseTemplateTask.kt", l = {37}, m = "invokeSuspend")
public final class C1837480xus extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<GetSMBCourseDetailResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ C1837470xur LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837480xus(C1837470xur c1837470xur, InterfaceC1364105Vn<? super C1837480xus> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1837470xur;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1837480xus(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<GetSMBCourseDetailResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        int i;
        C1C7U.LIZ("PcsFetchCourseTemplateTask@b144.requestApi$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C480460Ism.LIZ().getClass();
            PcsApi pcsApi = (PcsApi) C480460Ism.LIZLLL(PcsApi.class);
            C1837690xvD c1837690xvD = this.LLILLJJLI.LLILZLL;
            long j2 = 0;
            if (c1837690xvD != null) {
                j = c1837690xvD.LIZJ;
                j2 = c1837690xvD.LJI;
            } else {
                j = 0;
            }
            if (c1837690xvD != null) {
                i = c1837690xvD.LJII;
            } else {
                i = 0;
            }
            String strLIZ = C518500KVc.LIZ();
            this.LL = 1;
            obj = pcsApi.loadCourseDetailSuspend(j, j2, i, strLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PcsFetchCourseTemplateTask@b144.requestApi$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PcsFetchCourseTemplateTask@b144.requestApi$2");
        return obj;
    }
}
