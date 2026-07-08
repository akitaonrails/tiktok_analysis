package X;

import android.content.Context;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyTemp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R5R, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R5R extends C09AY implements Function0<Context> {
    public final /* synthetic */ CellSurveyTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R5R(CellSurveyTemp cellSurveyTemp) {
        super(0);
        this.LL = cellSurveyTemp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        return this.LL.LLILLJJLI.getContext();
    }
}
