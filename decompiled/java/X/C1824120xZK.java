package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.step.PcsOnboardingIdentityFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xZK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824120xZK extends C09AY implements Function1<C1783010wV1, Unit> {
    public final /* synthetic */ PcsOnboardingIdentityFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824120xZK(PcsOnboardingIdentityFragment pcsOnboardingIdentityFragment) {
        super(1);
        this.LL = pcsOnboardingIdentityFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1783010wV1 c1783010wV1) {
        C1783010wV1 c1783010wV12 = c1783010wV1;
        int i = c1783010wV12.LJFF;
        AbstractC21673619ry adapter = this.LL.wS().LLJJJIL.getAdapter();
        if (this.LL.JS().LLILZLL == i) {
            boolean z = !c1783010wV12.LJ;
            c1783010wV12.LJ = z;
            if (!z) {
                this.LL.JS().LLILZLL = -1;
            }
            if (adapter != null) {
                adapter.notifyItemChanged(i, "PAYLOAD_SELECT");
            }
        } else {
            if (this.LL.JS().LLILZLL != -1) {
                PcsOnboardingIdentityFragment pcsOnboardingIdentityFragment = this.LL;
                ((C1783010wV1) ListProtector.get(pcsOnboardingIdentityFragment.LLLIILIL, pcsOnboardingIdentityFragment.JS().LLILZLL)).LJ = false;
                if (adapter != null) {
                    adapter.notifyItemChanged(this.LL.JS().LLILZLL, "PAYLOAD_SELECT");
                }
            }
            c1783010wV12.LJ = true;
            this.LL.JS().LLILZLL = i;
            if (adapter != null) {
                adapter.notifyItemChanged(i, "PAYLOAD_SELECT");
            }
        }
        this.LL.iR();
        return Unit.LIZ;
    }
}
