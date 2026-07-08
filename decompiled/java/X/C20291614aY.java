package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.pushsurvey.PushSurveyAssemTrigger;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14aY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20291614aY extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ PushSurveyAssemTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20291614aY(PushSurveyAssemTrigger pushSurveyAssemTrigger) {
        super(1);
        this.LL = pushSurveyAssemTrigger;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        String str;
        String str2;
        String str3;
        C786410Ut5.LJLLLLLL(0, this.LL.LJJIJL());
        C14ZW c14zw = C14ZW.LIZ;
        String str4 = C255660A0e.LIZ;
        c14zw.getClass();
        FeedSurvey feedSurveyLJFF = C14ZW.LJFF(str4);
        C20291314aV.LIZ.getClass();
        if (feedSurveyLJFF != null) {
            str = feedSurveyLJFF.surveyKey;
        } else {
            str = null;
        }
        C1488870oqb.LIZ.getClass();
        C1488870oqb.LIZIZ(C14ZW.LJII(str));
        C14ZG c14zgLJII = C14ZW.LJII(str);
        if (c14zgLJII != null) {
            long j = c14zgLJII.LJ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C20291914ab.LIZ.getClass();
            C20291914ab.LIZIZ();
            String str5 = "";
            if (feedSurveyLJFF == null || (str2 = feedSurveyLJFF.surveyKey) == null) {
                str2 = "";
            }
            ((Keva) C20291314aV.LIZJ.getValue()).storeLong(str2, System.currentTimeMillis());
            if (j != 0) {
                if (feedSurveyLJFF != null && (str3 = feedSurveyLJFF.surveyKey) != null) {
                    str5 = str3;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("short_internal_");
                sbLIZ.append("common");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C20293414aq c20293414aq = C20291314aV.LJII;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[setNextTime] longKey:");
                sbLIZ2.append(str5);
                sbLIZ2.append(", shortKey:");
                sbLIZ2.append(strLIZIZ);
                c20293414aq.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                C20291314aV.LJIILIIL((j * 1000) + jCurrentTimeMillis, str5);
                C20291314aV.LJIILIIL(jCurrentTimeMillis + 600000, strLIZIZ);
                C20291314aV.LJIILL(c14zgLJII.LJFF);
            }
        }
        return Unit.LIZ;
    }
}
