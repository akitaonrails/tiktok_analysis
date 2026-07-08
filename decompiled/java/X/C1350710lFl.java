package X;

import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionLogicComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350710lFl extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ QuickMentionLogicComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350710lFl(QuickMentionLogicComponent quickMentionLogicComponent) {
        super(0);
        this.LL = quickMentionLogicComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = this.LL.bo();
        if (iFeedPanelPlatformAbilityBo != null) {
            return iFeedPanelPlatformAbilityBo.Mb();
        }
        return null;
    }
}
