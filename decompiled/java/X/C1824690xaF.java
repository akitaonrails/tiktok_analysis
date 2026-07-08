package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingKYBFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824690xaF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingKYBFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824690xaF(PcsOnboardingKYBFragment pcsOnboardingKYBFragment) {
        super(0);
        this.LL = pcsOnboardingKYBFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.AT("click_skip");
        this.LL.vT("skip");
        PcsOnboardingKYBFragment pcsOnboardingKYBFragment = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance = this.LL.JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        pcsOnboardingKYBFragment.QS(R.id.pl4, R.id.a3u, null, null, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
