package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.failreview.FailedReviewViewModelRepo$deleteDraft$result$1$1", f = "FailedReviewViewModelRepo.kt", l = {}, m = "invokeSuspend")
public final class C315830CZp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public final /* synthetic */ InterfaceC318260Cdk LL;
    public final /* synthetic */ C315860CZs LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315830CZp(InterfaceC318260Cdk interfaceC318260Cdk, C315860CZs c315860CZs, String str, InterfaceC1364105Vn<? super C315830CZp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC318260Cdk;
        this.LLILLJJLI = c315860CZs;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315830CZp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FailedReviewViewModelRepo@7b24.deleteDraft$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC318260Cdk interfaceC318260Cdk = this.LL;
        this.LLILLJJLI.getClass();
        interfaceC318260Cdk.LJIIIIZZ(C0CHQ.LIZ, this.LLILLL);
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(unit);
        C1C7U.LIZIZ("FailedReviewViewModelRepo@7b24.deleteDraft$result$1$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
