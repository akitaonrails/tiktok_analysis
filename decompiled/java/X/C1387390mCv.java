package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;

/* JADX INFO: renamed from: X.0mCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387390mCv {
    public static final IPipAbility LIZ(IBaseListFragmentPanel iBaseListFragmentPanel) {
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityAk2 = iBaseListFragmentPanel.Ak2();
        if (iFeedPanelPlatformAbilityAk2 == null || (interfaceC665370Q7zLLIIJLIL = iFeedPanelPlatformAbilityAk2.LLIIJLIL()) == null) {
            return null;
        }
        return (IPipAbility) C1558520qew.LIZ(interfaceC665370Q7zLLIIJLIL, IPipAbility.class, null);
    }
}
