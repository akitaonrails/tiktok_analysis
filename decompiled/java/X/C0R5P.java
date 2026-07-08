package X;

import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R5P, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R5P extends C09AY implements Function0<CellSurveyComponentAbility> {
    public final /* synthetic */ CellSurveyTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R5P(CellSurveyTemp cellSurveyTemp) {
        super(0);
        this.LL = cellSurveyTemp;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final CellSurveyComponentAbility invoke() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LL.b;
        if (interfaceC665370Q7z != null) {
            return C1558520qew.LIZ(interfaceC665370Q7z, CellSurveyComponentAbility.class, null);
        }
        return null;
    }
}
