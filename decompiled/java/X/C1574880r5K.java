package X;

import Y.ARunnableS93S0200000_24;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.scope.MainActivityScope;

/* JADX INFO: renamed from: X.0r5K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574880r5K extends AbstractC1584410rKh {
    public boolean LL;

    @Override // X.AbstractC1584410rKh
    public final void LIZIZ(View view, Fragment fragment) {
        MainActivityScope mainActivityScopeLIZ;
        TopTabAbility topTabAbilityLIZ;
        if (!this.LL && (mainActivityScopeLIZ = C0S4U.LIZ(view)) != null && (topTabAbilityLIZ = C0S4T.LIZ(mainActivityScopeLIZ)) != null) {
            this.LL = true;
            topTabAbilityLIZ.ao(StateOwner.LL);
        }
    }

    @Override // X.AbstractC1584410rKh
    public final void LJII(View view, C1584440rKk c1584440rKk) {
        HandlerHook.viewPost(view, new ARunnableS93S0200000_24(this, view, 58));
    }
}
