package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T13, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T13 extends C09AY implements Function0<IAutoAScrollAbility> {
    public final /* synthetic */ PlayerComponentTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T13(PlayerComponentTemp playerComponentTemp) {
        super(0);
        this.LL = playerComponentTemp;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IAutoAScrollAbility invoke() {
        Fragment fragment;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        BaseListFragmentPanel baseListFragmentPanel = this.LL.LL;
        if (baseListFragmentPanel == null || (fragment = baseListFragmentPanel.getFragment()) == null || (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) == null) {
            return null;
        }
        return C1558520qew.LIZ(interfaceC665370Q7zLJ, IAutoAScrollAbility.class, null);
    }
}
