package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R8R, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R8R extends C09AY implements Function0<IFeedPanelPlatformAbility> {
    public final /* synthetic */ CellSurveyComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R8R(CellSurveyComponent cellSurveyComponent) {
        super(0);
        this.LL = cellSurveyComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedPanelPlatformAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFeedPanelPlatformAbility.class, null);
    }
}
