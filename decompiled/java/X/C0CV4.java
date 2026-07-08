package X;

import com.ss.android.ugc.profile.business.ur.creative.GuideCreateVideoWithEffectAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CV4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.creative.GuideCreateVideoWithEffectRepo$requestData$response$1", f = "GuideCreateVideoWithEffectRepo.kt", l = {170}, m = "invokeSuspend")
public final class C0CV4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GuideCreateVideoWithEffectAPI.CardListResponse>, Object> {
    public int LL;

    public C0CV4(InterfaceC1364105Vn<? super C0CV4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CV4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GuideCreateVideoWithEffectRepo@1a2.requestData$response$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C0CV3 c0cv3 = new C0CV3(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c0cv3);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GuideCreateVideoWithEffectRepo@1a2.requestData$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GuideCreateVideoWithEffectRepo@1a2.requestData$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GuideCreateVideoWithEffectAPI.CardListResponse> interfaceC1364105Vn) {
        return new C0CV4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
