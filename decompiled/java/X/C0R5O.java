package X;

import com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R5O, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R5O extends C09AY implements Function0<ISurveyInteractAbility> {
    public final /* synthetic */ CellSurveyTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R5O(CellSurveyTemp cellSurveyTemp) {
        super(0);
        this.LL = cellSurveyTemp;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final ISurveyInteractAbility invoke() {
        return C1558520qew.LIZ(C1558420qem.LIZIZ(this.LL.LL), ISurveyInteractAbility.class, null);
    }
}
