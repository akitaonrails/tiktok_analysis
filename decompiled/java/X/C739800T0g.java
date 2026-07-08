package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739800T0g extends C09AY implements Function0<IResumePlayPanelComponent> {
    public final /* synthetic */ PlayerComponentTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C739800T0g(PlayerComponentTemp playerComponentTemp) {
        super(0);
        this.LL = playerComponentTemp;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent] */
    @Override // kotlin.jvm.functions.Function0
    public final IResumePlayPanelComponent invoke() {
        Fragment fragment;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        BaseListFragmentPanel baseListFragmentPanel = this.LL.LL;
        if (baseListFragmentPanel == null || (fragment = baseListFragmentPanel.getFragment()) == null || (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) == null) {
            return null;
        }
        return C1558520qew.LIZ(interfaceC665370Q7zLJ, IResumePlayPanelComponent.class, null);
    }
}
