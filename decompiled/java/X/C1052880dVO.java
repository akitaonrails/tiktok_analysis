package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import com.ss.android.ugc.aweme.commercialize.util.network.ICommerceCommonApi;
import com.ss.android.ugc.aweme.commercialize.util.network.model.TranslationResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dVO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel$translateReview$1", f = "ReviewViewModel.kt", l = {277}, m = "invokeSuspend")
public final class C1052880dVO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReviewViewModel LLILLJJLI;
    public final /* synthetic */ Review LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052880dVO(Review review, ReviewViewModel reviewViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = reviewViewModel;
        this.LLILLL = review;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1052880dVO(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ReviewViewModel@4ba4.translateReview$1");
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
                this.LLILLJJLI.LLIZLLLIL.setValue(new C1052890dVP(this.LLILLL, C1052920dVS.LIZ));
                Review review = this.LLILLL;
                ICommerceCommonApi.LIZ.getClass();
                ICommerceCommonApi iCommerceCommonApi = C1407305f5.LIZIZ;
                String str = review.text;
                String strLLIIZ = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIZ();
                this.LL = 1;
                obj = iCommerceCommonApi.getSingleTranslation(str, strLLIIZ, 2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ReviewViewModel@4ba4.translateReview$1");
                    return objLJFF;
                }
            }
            c098200Yq = (TranslationResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        ReviewViewModel reviewViewModel = this.LLILLJJLI;
        Review review2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            reviewViewModel.LLIZLLLIL.setValue(new C1052890dVP(review2, new C1052900dVQ(((TranslationResponse) c098200Yq).translatedContent)));
        }
        ReviewViewModel reviewViewModel2 = this.LLILLJJLI;
        Review review3 = this.LLILLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            reviewViewModel2.LLIZLLLIL.setValue(new C1052890dVP(review3, C1052930dVT.LIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReviewViewModel@4ba4.translateReview$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
