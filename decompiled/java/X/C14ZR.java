package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.SurveyInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14ZR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZR extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14ZR(Aweme aweme) {
        super(0);
        this.LL = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        List<SurveyInfo> surveyInfos = this.LL.getSurveyInfos();
        c2344009Gk.LJIIIIZZ("surveyIds", surveyInfos != null ? C13LP.LJJLIIIJ(surveyInfos, null, null, null, 0, null, new C14ZS(), 31) : null);
        c2344009Gk.LIZJ(C14ZW.LIZLLL(this.LL), "style_group");
        C14ZW c14zw = C14ZW.LIZ;
        Aweme aweme = this.LL;
        c14zw.getClass();
        c2344009Gk.LJIIIIZZ("content_scopes", C14ZW.LIZ(aweme));
        C20684815ws.LJIILLIIL("survey_prepare_to_show", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
