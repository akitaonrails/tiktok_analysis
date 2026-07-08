package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.verify.pi.PiVerifyFragment;
import com.ss.android.ugc.aweme.verify.pi.VerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xte, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.pi.PiVerifyFragment$handleCloseVerificationPopupAndContinueVerification$1", f = "PiVerifyFragment.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C863200Xte extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PiVerifyFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863200Xte(PiVerifyFragment piVerifyFragment, InterfaceC1364105Vn<? super C863200Xte> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = piVerifyFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863200Xte(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PiVerifyFragment@d62b.handleCloseVerificationPopupAndContinueVerification$1");
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
                C1C7U.LIZIZ("PiVerifyFragment@d62b.handleCloseVerificationPopupAndContinueVerification$1");
                return objLJFF;
            }
        }
        VerifyViewModel verifyViewModelCS = this.LLILLJJLI.cS();
        C23250099c.LIZLLL(verifyViewModelCS.getAssemVMScope(), verifyViewModelCS.LLILZIL, null, new C863190Xtd(verifyViewModelCS, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PiVerifyFragment@d62b.handleCloseVerificationPopupAndContinueVerification$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
