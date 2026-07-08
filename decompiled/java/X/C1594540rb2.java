package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.pause.PausePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: renamed from: X.0rb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594540rb2 implements InterfaceC1594590rb7 {
    public final /* synthetic */ PausePanelComponent LIZ;

    @Override // X.InterfaceC1594590rb7
    public final InterfaceC1594580rb6 LIZ() {
        return (InterfaceC1594580rb6) this.LIZ.LLJIJIL.getValue();
    }

    public final C676750Qgb LIZIZ() {
        String previousPage;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        Aweme awemeLJIIIIZZ = this.LIZ.LJIIIIZZ();
        String eventType = this.LIZ.getEventType();
        C2189821An6 c2189821An6 = this.LIZ.getPanelContext().LIZJ;
        if (c2189821An6 == null || (previousPage = c2189821An6.getPreviousPage()) == null) {
            previousPage = "";
        }
        IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) this.LIZ.LLILZ.getValue();
        return new C676750Qgb(awemeLJIIIIZZ, eventType, previousPage, (iFeedFragmentAbility == null || (iViewPagerComponentAbilityMb = iFeedFragmentAbility.Mb()) == null) ? null : iViewPagerComponentAbilityMb.LJLIL());
    }

    public C1594540rb2(PausePanelComponent pausePanelComponent) {
        this.LIZ = pausePanelComponent;
    }
}
