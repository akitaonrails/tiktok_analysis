package X;

import com.ss.android.ugc.aweme.verify.pi.VerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Xtd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.pi.VerifyViewModel$handleCloseVerificationPopupAndContinueVerification$1", f = "PiVerifyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C863190Xtd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VerifyViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863190Xtd(VerifyViewModel verifyViewModel, InterfaceC1364105Vn<? super C863190Xtd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = verifyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863190Xtd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VerifyViewModel@4e16.handleCloseVerificationPopupAndContinueVerification$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(AFwS248S0000000_14.get$arr$(507));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VerifyViewModel@4e16.handleCloseVerificationPopupAndContinueVerification$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
