package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739750T0b extends C09AY implements Function0<IFeedPanelPlatformAbility> {
    public final /* synthetic */ PlayButtonComponentTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C739750T0b(PlayButtonComponentTemp playButtonComponentTemp) {
        super(0);
        this.LL = playButtonComponentTemp;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedPanelPlatformAbility invoke() {
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        Fragment fragment = this.LL.LL.getFragment();
        if (fragment == null || (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) == null) {
            return null;
        }
        return C1558520qew.LIZ(interfaceC665370Q7zLJ, IFeedPanelPlatformAbility.class, null);
    }
}
