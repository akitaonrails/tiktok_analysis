package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.model.Review;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.DiggReviewRequest;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ICommerceAppReviewsApi;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y5T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel$diggReview$1", f = "ReviewViewModel.kt", l = {211}, m = "invokeSuspend")
public final class C1844050y5T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Review LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ ReviewViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844050y5T(Review review, boolean z, ReviewViewModel reviewViewModel, InterfaceC1364105Vn<? super C1844050y5T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = review;
        this.LLILLL = z;
        this.LLILZ = reviewViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1844050y5T(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int i;
        boolean z;
        EnumC1154000g8U enumC1154000g8U;
        Object objDiggReview = obj;
        C1C7U.LIZ("ReviewViewModel@4ba4.diggReview$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objDiggReview);
            } else {
                C155000ia.LIZIZ(objDiggReview);
                Review review = this.LLILLJJLI;
                boolean z2 = this.LLILLL;
                ReviewViewModel reviewViewModel = this.LLILZ;
                long j = review.diggCount;
                if (z2) {
                    i = 1;
                } else {
                    i = -1;
                }
                long j2 = j + ((long) i);
                C2252321DDq c2252321DDq = reviewViewModel.LLILZLL;
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                c2252321DDq.setValue(new C1844200y5i(review.copy(review.identityID, review.isDeleted, review.id, review.groupId, review.userId, review.nickname, review.text, review.rating, review.country, review.createTime, j2, z)));
                ICommerceAppReviewsApi.LIZ.getClass();
                ICommerceAppReviewsApi iCommerceAppReviewsApi = C1844070y5V.LIZIZ;
                long j3 = review.id;
                long j4 = review.groupId;
                long jWQ2 = ReviewViewModel.wQ2();
                if (z2) {
                    enumC1154000g8U = EnumC1154000g8U.LIKE;
                } else {
                    enumC1154000g8U = EnumC1154000g8U.LIKE_CANCEL;
                }
                DiggReviewRequest diggReviewRequest = new DiggReviewRequest(j3, j4, jWQ2, enumC1154000g8U.getValue());
                this.LL = 1;
                objDiggReview = iCommerceAppReviewsApi.diggReview(diggReviewRequest, this);
                if (objDiggReview == objLJFF) {
                    C1C7U.LIZIZ("ReviewViewModel@4ba4.diggReview$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C1844150y5d) objDiggReview;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C1022620cia.LIZ("ReviewVM", "diggReview: success");
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1022620cia.LIZ("ReviewVM", "diggReview: failure, msg -> " + thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReviewViewModel@4ba4.diggReview$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
