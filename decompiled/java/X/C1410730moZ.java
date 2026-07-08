package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0moZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410730moZ extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ PcsOnboardingVM LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1410730moZ(PcsOnboardingVM pcsOnboardingVM, Function1<? super Throwable, Unit> function1) {
        super(1);
        this.LL = pcsOnboardingVM;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestOptinQualification onFailed reason=");
        sbLIZ.append(th.getMessage());
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL), null, null, new C1410600moM(this.LL, this.LLILLJJLI, null), 3);
        return Unit.LIZ;
    }
}
