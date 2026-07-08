package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel$confirmDeleteClick$1$deleteDraftDeferred$1", f = "FailedReviewViewModel.kt", l = {163}, m = "invokeSuspend")
public final class C315780CZk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public final /* synthetic */ FailedReviewViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315780CZk(FailedReviewViewModel failedReviewViewModel, InterfaceC1364105Vn<? super C315780CZk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = failedReviewViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315780CZk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String draftId;
        Object objLIZ;
        CKEDraftInfo cKEDraftInfo;
        C1C7U.LIZ("FailedReviewViewModel@9b63.confirmDeleteClick$1$deleteDraftDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            FailedReviewViewModel failedReviewViewModel = this.LLILLJJLI;
            C315860CZs c315860CZs = failedReviewViewModel.LLILLJJLI;
            C315940Ca0 c315940Ca0 = (C315940Ca0) failedReviewViewModel.LLJILJIL.getValue();
            if (c315940Ca0 != null && (cKEDraftInfo = c315940Ca0.LIZ) != null) {
                draftId = cKEDraftInfo.getDraftId();
            } else {
                draftId = null;
            }
            C315790CZl c315790CZl = new C315790CZl(draftId);
            this.LL = 1;
            objLIZ = c315860CZs.LIZ(c315790CZl, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("FailedReviewViewModel@9b63.confirmDeleteClick$1$deleteDraftDeferred$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("FailedReviewViewModel@9b63.confirmDeleteClick$1$deleteDraftDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
