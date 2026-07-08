package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0moe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410780moe extends C09AY implements Function1<SMBOptInQualificationResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsOnboardingVM LL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1410780moe(PcsOnboardingVM pcsOnboardingVM, Function1<? super Throwable, Unit> function1) {
        super(1);
        this.LL = pcsOnboardingVM;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SMBOptInQualificationResponse.ResponseData responseData) {
        C1121890fIh.LIZ("requestOptinQualification onSuccess");
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL), null, null, new C1410700moW(this.LL, responseData, this.LLILLJJLI, null), 3);
        return Unit.LIZ;
    }
}
