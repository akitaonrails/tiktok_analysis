package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionLogicComponent;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionVM;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350720lFm extends C09AY implements Function0<C1350680lFi> {
    public final /* synthetic */ QuickMentionLogicComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350720lFm(QuickMentionLogicComponent quickMentionLogicComponent) {
        super(0);
        this.LL = quickMentionLogicComponent;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0lFi] */
    @Override // kotlin.jvm.functions.Function0
    public final C1350680lFi invoke() {
        final QuickMentionLogicComponent quickMentionLogicComponent = this.LL;
        return new InterfaceC1616070s9l() { // from class: X.0lFi
            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onBeforePageChange() {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageScrolledEnd(int i, float f, int i2) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageSelected(int i, boolean z) {
            }

            @Override // X.InterfaceC1616070s9l
            public final void onPageUnSelected(C0SZ8 c0sz8) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
            }

            @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                boolean z;
                Aweme awemeLJIIIIZZ;
                Aweme awemeLJIIIIZZ2;
                if (((C1347810lB5) ((AssemViewModel) quickMentionLogicComponent.LL.getValue()).getState()).LL == EnumC1347820lB6.SHOW) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = quickMentionLogicComponent.bo();
                    if (iFeedPanelPlatformAbilityBo != null) {
                        awemeLJIIIIZZ2 = iFeedPanelPlatformAbilityBo.LJIIIIZZ();
                    } else {
                        awemeLJIIIIZZ2 = null;
                    }
                    if (C1351410lGt.LIZLLL(awemeLJIIIIZZ2) == null) {
                        C0DK7.LIZ().LIZIZ();
                    }
                }
                ((QuickMentionVM) quickMentionLogicComponent.LL.getValue()).vQ2(EnumC1347820lB6.INIT);
                IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo2 = quickMentionLogicComponent.bo();
                if (iFeedPanelPlatformAbilityBo2 != null) {
                    awemeLJIIIIZZ = iFeedPanelPlatformAbilityBo2.LJIIIIZZ();
                } else {
                    awemeLJIIIIZZ = null;
                }
                User userLIZJ = C1351410lGt.LIZJ(awemeLJIIIIZZ);
                if (userLIZJ != null) {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(quickMentionLogicComponent), C0PEM.LIZJ, null, new C1480005qo(userLIZJ, null), 2);
                }
            }
        };
    }
}
