package X;

import Y.AgS307S0100000_27;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.CommentReviewTabFragment;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.vm.ReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.comment.reviewtab.CommentReviewTabFragment$observeReviewDiggState$1", f = "CommentReviewTabFragment.kt", l = {298}, m = "invokeSuspend")
public final class C1843800y54 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommentReviewTabFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1843800y54(CommentReviewTabFragment commentReviewTabFragment, InterfaceC1364105Vn<? super C1843800y54> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentReviewTabFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1843800y54(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDq;
        C1C7U.LIZ("CommentReviewTabFragment@781e.observeReviewDiggState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            CommentReviewTabFragment commentReviewTabFragment = this.LLILLJJLI;
            ReviewViewModel reviewViewModel = commentReviewTabFragment.LL;
            if (reviewViewModel != null && (c2252321DDq = reviewViewModel.LLILZLL) != null) {
                AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(commentReviewTabFragment, 46);
                this.LL = 1;
                if (c2252321DDq.collect(agS307S0100000_27, this) == objLJFF) {
                    C1C7U.LIZIZ("CommentReviewTabFragment@781e.observeReviewDiggState$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CommentReviewTabFragment@781e.observeReviewDiggState$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
