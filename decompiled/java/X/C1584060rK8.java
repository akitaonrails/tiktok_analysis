package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3RefreshAbility;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584060rK8 extends AbstractViewOnClickListenerC1584070rK9 {
    public final Context LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1830));

    public C1584060rK8(Context context) {
        this.LL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragmentVu = C1599640rjG.LIZIZ.Vu();
        if (fragmentVu != null) {
            AbstractC1591090rVT abstractC1591090rVT = (AbstractC1591090rVT) this.LLILLJJLI.getValue();
            if (abstractC1591090rVT != null) {
                abstractC1591090rVT.LJJIJIIJIL("FRIENDS_TAB");
            }
            IFriendsV3RefreshAbility iFriendsV3RefreshAbility = (IFriendsV3RefreshAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentVu, null), IFriendsV3RefreshAbility.class, null);
            if (iFriendsV3RefreshAbility != null) {
                iFriendsV3RefreshAbility.lv1(3, false, null, null, 0);
            }
        }
    }
}
