package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingContinueFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingContinueFragment$initObserver$1$1$1", f = "PcsOnboardingContinueFragment.kt", l = {199}, m = "invokeSuspend")
public final class C1354905Rz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingContinueFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354905Rz(PcsOnboardingContinueFragment pcsOnboardingContinueFragment, InterfaceC1364105Vn<? super C1354905Rz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingContinueFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354905Rz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingContinueFragment@88e4.initObserver$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.JS().LLILZIL;
            final PcsOnboardingContinueFragment pcsOnboardingContinueFragment = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0xZ0
                /* JADX WARN: Code restructure failed: missing block: B:123:0x02f2, code lost:
                
                    r6 = r3.size() - 1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x01d8  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x01e6  */
                @Override // X.InterfaceC346701Wf
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r14, X.InterfaceC1364105Vn r15) {
                    /*
                        Method dump skipped, instruction units count: 794
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1823920xZ0.emit(java.lang.Object, X.05Vn):java.lang.Object");
                }
            };
            this.LL = 1;
            if (anonymousClass0950.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingContinueFragment@88e4.initObserver$1$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
