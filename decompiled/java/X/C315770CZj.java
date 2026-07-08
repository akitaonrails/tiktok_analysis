package X;

import com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModel$confirmDeleteClick$1$deleteEffectDeferred$1", f = "FailedReviewViewModel.kt", l = {161}, m = "invokeSuspend")
public final class C315770CZj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends MobileEffectResponse>>, Object> {
    public int LL;
    public final /* synthetic */ FailedReviewViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315770CZj(FailedReviewViewModel failedReviewViewModel, InterfaceC1364105Vn<? super C315770CZj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = failedReviewViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315770CZj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C1C7U.LIZ("FailedReviewViewModel@9b63.confirmDeleteClick$1$deleteEffectDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C315860CZs c315860CZs = this.LLILLJJLI.LLILLJJLI;
            this.LL = 1;
            objLIZIZ = c315860CZs.LIZIZ(this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("FailedReviewViewModel@9b63.confirmDeleteClick$1$deleteEffectDeferred$1");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("FailedReviewViewModel@9b63.confirmDeleteClick$1$deleteEffectDeferred$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends MobileEffectResponse>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
