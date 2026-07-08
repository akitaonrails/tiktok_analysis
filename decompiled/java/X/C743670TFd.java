package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingSuggestedQuestionsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743670TFd extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PcsOnboardingSuggestedQuestionsFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C743670TFd(PcsOnboardingSuggestedQuestionsFragment pcsOnboardingSuggestedQuestionsFragment) {
        super(1);
        this.LL = pcsOnboardingSuggestedQuestionsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.LL.LLLLIIIILLL = String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zBooleanValue)) ? 1 : 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openSuggestedQuestionsEditPanel configPagePreloadHit=");
        sbLIZ.append(this.LL.LLLLIIIILLL);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
