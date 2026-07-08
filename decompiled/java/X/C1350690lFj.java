package X;

import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionLogicComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0lFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350690lFj extends C09AY implements Function2<C03H5, EnumC1347820lB6, Unit> {
    public final /* synthetic */ QuickMentionLogicComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350690lFj(QuickMentionLogicComponent quickMentionLogicComponent) {
        super(2);
        this.LL = quickMentionLogicComponent;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, EnumC1347820lB6 enumC1347820lB6) {
        Aweme awemeLJIIIIZZ;
        if (enumC1347820lB6 == EnumC1347820lB6.SHOW) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = this.LL.bo();
            if (iFeedPanelPlatformAbilityBo != null) {
                awemeLJIIIIZZ = iFeedPanelPlatformAbilityBo.LJIIIIZZ();
            } else {
                awemeLJIIIIZZ = null;
            }
            if (C1351410lGt.LIZLLL(awemeLJIIIIZZ) == null) {
                C1351410lGt.LIZIZ(new C1351430lGv("show", CardStruct.IStatusCode.DEFAULT, null, null));
            }
        }
        return Unit.LIZ;
    }
}
