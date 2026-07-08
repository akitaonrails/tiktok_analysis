package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel$showPageAfterPageLoadSuccess$3", f = "TwoStepVerificationActivityViewModel.kt", l = {1275}, m = "invokeSuspend")
public final class C1233760iD8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TwoStepVerificationActivityViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233760iD8(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, InterfaceC1364105Vn<? super C1233760iD8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = twoStepVerificationActivityViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1233760iD8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.showPageAfterPageLoadSuccess$3");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.showPageAfterPageLoadSuccess$3");
                return objLJFF;
            }
        }
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = this.LLILLJJLI;
        twoStepVerificationActivityViewModel.listSetItems(twoStepVerificationActivityViewModel.DQ2());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.showPageAfterPageLoadSuccess$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
