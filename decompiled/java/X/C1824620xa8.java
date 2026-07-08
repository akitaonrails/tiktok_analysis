package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingChatBuilderFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xa8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824620xa8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingChatBuilderFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824620xa8(PcsOnboardingChatBuilderFragment pcsOnboardingChatBuilderFragment) {
        super(0);
        this.LL = pcsOnboardingChatBuilderFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.AT("click_write_manually");
        C1824200xZS.LIZ("click", this.LL.JS().DQ2().getShowEntrance(), "write_manually");
        this.LL.JS().LLJJIII = false;
        this.LL.ET();
        return Unit.LIZ;
    }
}
