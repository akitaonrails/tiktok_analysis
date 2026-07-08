package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectServiceUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModelRepo$deleteEffect$result$1$mobileEffectResponse$1", f = "FailedReviewViewModelRepo.kt", l = {74}, m = "invokeSuspend")
public final class C315850CZr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super MobileEffectResponse>, Object> {
    public int LL;
    public final /* synthetic */ C315860CZs LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315850CZr(C315860CZs c315860CZs, int i, InterfaceC1364105Vn<? super C315850CZr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c315860CZs;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315850CZr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FailedReviewViewModelRepo@7b24.deleteEffect$result$1$mobileEffectResponse$1");
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
            String str = this.LLILLJJLI.LIZ.effectId;
            int i2 = this.LLILLL;
            this.LL = 1;
            obj = TTEPEffectServiceUtilKt.deleteMobileEffect(str, i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FailedReviewViewModelRepo@7b24.deleteEffect$result$1$mobileEffectResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FailedReviewViewModelRepo@7b24.deleteEffect$result$1$mobileEffectResponse$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super MobileEffectResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
