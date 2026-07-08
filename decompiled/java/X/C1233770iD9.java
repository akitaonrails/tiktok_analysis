package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel$updateMethod$1$1", f = "TwoStepVerificationActivityViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1233770iD9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1233770iD9(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, InterfaceC1364105Vn<? super C1233770iD9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = twoStepVerificationActivityViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1233770iD9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TwoStepVerificationActivityViewModel.xQ2(this.LL, C2286608xc.LJ(0), null, 6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TwoStepVerificationActivityViewModel@3f.updateMethod$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
