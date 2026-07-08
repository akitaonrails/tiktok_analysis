package X;

import com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoModeBoostedFeedbackResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoBoostFeedbackManager$requestView$1$1", f = "PhotoBoostFeedbackManager.kt", l = {}, m = "invokeSuspend")
public final class C565990MHt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<PhotoModeBoostedFeedbackResponse, Unit> LL;
    public final /* synthetic */ PhotoModeBoostedFeedbackResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C565990MHt(Function1<? super PhotoModeBoostedFeedbackResponse, Unit> function1, PhotoModeBoostedFeedbackResponse photoModeBoostedFeedbackResponse, InterfaceC1364105Vn<? super C565990MHt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = photoModeBoostedFeedbackResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C565990MHt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoBoostFeedbackManager@3864.requestView$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoBoostFeedbackManager@3864.requestView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
