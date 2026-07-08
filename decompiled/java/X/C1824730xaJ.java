package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingShowcaseAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824730xaJ extends C09AY implements Function2<UIAssem, AbstractC1411370mpb, Unit> {
    public final /* synthetic */ PcsOnboardingShowcaseAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824730xaJ(PcsOnboardingShowcaseAssem pcsOnboardingShowcaseAssem) {
        super(2);
        this.LL = pcsOnboardingShowcaseAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, AbstractC1411370mpb abstractC1411370mpb) {
        if (abstractC1411370mpb instanceof C1410940mou) {
            C500260Jjc.LLFFF(this.LL.hp().LLJLILLLLZIIL);
        } else {
            C500260Jjc.LJIILLIIL(this.LL.hp().LLJLILLLLZIIL);
        }
        return Unit.LIZ;
    }
}
