package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0moa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410740moa extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ PcsOnboardingVM LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410740moa(PcsOnboardingVM pcsOnboardingVM, C1824310xZd c1824310xZd) {
        super(1);
        this.LL = pcsOnboardingVM;
        this.LLILLJJLI = c1824310xZd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getServiceSwitchInfo cache_miss fallback_to_network reason=");
        sbLIZ.append(th.getMessage());
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL), null, null, new C1410530moF(this.LL, this.LLILLJJLI, null), 3);
        return Unit.LIZ;
    }
}
