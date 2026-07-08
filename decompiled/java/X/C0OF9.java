package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.component.LandscapeInnerSyncComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OF9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OF9 extends C09AY implements InterfaceC1631620sYq<C03H5, C291001Au<? extends List<Aweme>>, C291001Au<? extends Aweme>, Unit> {
    public final /* synthetic */ LandscapeInnerSyncComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OF9(LandscapeInnerSyncComponent landscapeInnerSyncComponent) {
        super(3);
        this.LL = landscapeInnerSyncComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends List<Aweme>> c291001Au, C291001Au<? extends Aweme> c291001Au2) {
        C291001Au<? extends List<Aweme>> c291001Au3 = c291001Au;
        C291001Au<? extends Aweme> c291001Au4 = c291001Au2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            iFeedPanelPlatformAbility.tJ2(iFeedPanelPlatformAbility.LJLJJL() + 1, "landscape_inner", (List) c291001Au3.LIZ);
            IViewPagerComponentAbility iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb();
            if (iViewPagerComponentAbilityMb != null) {
                Aweme aweme = (Aweme) c291001Au4.LIZ;
                int iLJIL = iViewPagerComponentAbilityMb.LJIL();
                List<Aweme> awemeList = iFeedPanelPlatformAbility.getAwemeList();
                if (awemeList != null) {
                    int i = 0;
                    for (Aweme aweme2 : awemeList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            if (Intrinsics.LJFF(aweme2.getAid(), aweme.getAid())) {
                                iLJIL = i;
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                iViewPagerComponentAbilityMb.LLFFF(iLJIL, false);
            }
        }
        return Unit.LIZ;
    }
}
