package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824250xZX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingMultiSKUFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824250xZX(PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment) {
        super(0);
        this.LL = pcsOnboardingMultiSKUFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment = this.LL;
        pcsOnboardingMultiSKUFragment.xT();
        ArrayList arrayList = new ArrayList();
        if (pcsOnboardingMultiSKUFragment.LLLJ) {
            arrayList.add("dm");
        }
        if (pcsOnboardingMultiSKUFragment.LLLJIL) {
            arrayList.add("form");
        }
        if (pcsOnboardingMultiSKUFragment.LLLJL) {
            arrayList.add("booking");
        }
        if (pcsOnboardingMultiSKUFragment.LLLL) {
            arrayList.add("course");
        }
        boolean z = !pcsOnboardingMultiSKUFragment.JS().getState().LLILLL.isEmpty();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingMultiSKUSelectionPage click show_entrance=");
        String showEntrance = pcsOnboardingMultiSKUFragment.JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", has_switch_info_cache=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ.append(", selected_skus=");
        sbLIZ.append(arrayList);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.uT("choose_tool");
        if (this.LL.JS().wQ2(this.LL.LLLJ)) {
            this.LL.gT();
        } else {
            this.LL.hT();
            this.LL.vT();
        }
        return Unit.LIZ;
    }
}
