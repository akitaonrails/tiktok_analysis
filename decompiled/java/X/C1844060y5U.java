package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.ConvertInfo;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ICommerceAppReviewsApi;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.PublishReviewRequest;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.PublishReviewResponse;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS2S0001100_27;
import njp.a;

/* JADX INFO: renamed from: X.0y5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel$publishReview$1", f = "ReviewViewModel.kt", l = {177}, m = "invokeSuspend")
public final class C1844060y5U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReviewViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Review LLILZ;
    public final /* synthetic */ ConvertInfo LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844060y5U(ReviewViewModel reviewViewModel, boolean z, Review review, ConvertInfo convertInfo, String str, InterfaceC1364105Vn<? super C1844060y5U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = reviewViewModel;
        this.LLILLL = z;
        this.LLILZ = review;
        this.LLILZIL = convertInfo;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1844060y5U(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        AbstractC1844080y5W abstractC1844080y5W;
        Object objPublishReview = obj;
        C1C7U.LIZ("ReviewViewModel@4ba4.publishReview$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objPublishReview);
            } else {
                C155000ia.LIZIZ(objPublishReview);
                this.LLILLJJLI.LLJIJIL.setValue(false);
                C2252321DDq c2252321DDq = this.LLILLJJLI.LLILZIL;
                if (this.LLILLL) {
                    final Review review = this.LLILZ;
                    abstractC1844080y5W = new AbstractC1844080y5W(review) { // from class: X.0y5a
                    };
                } else {
                    final Review review2 = this.LLILZ;
                    abstractC1844080y5W = new AbstractC1844080y5W(review2) { // from class: X.0y5b
                    };
                }
                c2252321DDq.setValue(abstractC1844080y5W);
                Review review3 = this.LLILZ;
                ReviewViewModel reviewViewModel = this.LLILLJJLI;
                ConvertInfo convertInfo = this.LLILZIL;
                String str = this.LLILZLL;
                ICommerceAppReviewsApi.LIZ.getClass();
                ICommerceAppReviewsApi iCommerceAppReviewsApi = C1844070y5V.LIZIZ;
                long j = review3.userId;
                String strZQ2 = reviewViewModel.zQ2();
                String str2 = review3.text;
                if (str2 == null) {
                    str2 = "";
                }
                PublishReviewRequest publishReviewRequest = new PublishReviewRequest(convertInfo.getAdId(), convertInfo.getCreativeId(), convertInfo.getAppId(), convertInfo.getExternalUrl(), str, convertInfo.getItemId(), j, strZQ2, str2);
                this.LL = 1;
                objPublishReview = iCommerceAppReviewsApi.publishReview(publishReviewRequest, this);
                if (objPublishReview == objLJFF) {
                    C1C7U.LIZIZ("ReviewViewModel@4ba4.publishReview$1");
                    return objLJFF;
                }
            }
            c098200Yq = (PublishReviewResponse) objPublishReview;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Review review4 = this.LLILZ;
        ReviewViewModel reviewViewModel2 = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            PublishReviewResponse publishReviewResponse = (PublishReviewResponse) c098200Yq;
            C1022620cia.LIZ("ReviewVM", "publishReview: success");
            final Review reviewCopy = review4.copy(review4.identityID, review4.isDeleted, publishReviewResponse.getId(), publishReviewResponse.getGroupId(), review4.userId, review4.nickname, review4.text, review4.rating, publishReviewResponse.getCountry(), review4.createTime, review4.diggCount, review4.userDiggStatus);
            reviewViewModel2.LLILZIL.setValue(new AbstractC1844080y5W(reviewCopy) { // from class: X.0y5c
            });
            reviewViewModel2.BQ2(false);
            C1002170cBb c1002170cBbXQ2 = reviewViewModel2.xQ2();
            if (c1002170cBbXQ2 != null) {
                c1002170cBbXQ2.logAd(C1850410yFj.LIZ, new AwS2S0001100_27(reviewViewModel2.yQ2(), publishReviewResponse.getId(), 2));
            }
        }
        ReviewViewModel reviewViewModel3 = this.LLILLJJLI;
        final Review review5 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1022620cia.LIZ("ReviewVM", "publishReview: failure, msg -> " + thM5exceptionOrNullimpl);
            reviewViewModel3.LLILZIL.setValue(new AbstractC1844080y5W(review5) { // from class: X.0y5Z
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReviewViewModel@4ba4.publishReview$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
