package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility;
import com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment;
import com.ss.android.ugc.aweme.explore.ui.container.Explore2TabFeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rL3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class ViewOnClickListenerC1584630rL3 implements View.OnClickListener, InterfaceC20660615sy {
    public final C19EG LL;

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "explore";
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        C19EG c19eg = this.LL;
        if (c19eg == null || (lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false)) == null || (lifecycle = lifecycleOwnerRequireMainSAFLifecycle.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null) {
            return false;
        }
        return currentState.isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            return new C688120Qyw(c19eg, IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false), null);
        }
        return null;
    }

    public ViewOnClickListenerC1584630rL3(Context context) {
        this.LL = C1388190mED.LIZIZ(context);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseExploreFeedFragment baseExploreFeedFragment;
        C19EG c19eg = this.LL;
        if (c19eg == null) {
            return;
        }
        if (Intrinsics.LJFF(C343710Ddh.LIZ(c19eg).CQ2(), "homepage_explore")) {
            Fragment fragmentKi = C343710Ddh.LIZ(this.LL).Ki("homepage_explore");
            if ((fragmentKi instanceof Explore2TabFeedFragment) && (baseExploreFeedFragment = (BaseExploreFeedFragment) fragmentKi) != null) {
                MiddleBridgeCellAbility middleBridgeCellAbilityDS = baseExploreFeedFragment.dS();
                if (middleBridgeCellAbilityDS != null && middleBridgeCellAbilityDS.LJJIIJZLJL()) {
                    return;
                }
                AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(c19eg).y01();
                if (abstractC1591090rVTY01 != null) {
                    abstractC1591090rVTY01.LJJIJIIJIL("homepage_explore");
                }
                baseExploreFeedFragment.Oi(true);
                return;
            }
            return;
        }
        C15TA.LJIIJJI(C15TA.LIZ, "click_button_icon", ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI(), null, 8);
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(this.LL);
        if (!Intrinsics.LJFF("homepage_explore", tabChangeManagerLIZ.CQ2())) {
            TabChangeManager.xQ2(tabChangeManagerLIZ, "homepage_explore", false, null, 30);
        }
        C19EG c19eg2 = this.LL;
        if (c19eg2 != null) {
            C486860J7k.LIZIZ(c19eg2).KQ2(false);
        }
    }
}
