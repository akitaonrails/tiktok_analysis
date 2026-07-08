package Y;

import X.C14ZW;
import X.C1C7U;
import X.C20552315bV;
import X.C20649115r7;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxTemplate;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class ACallableS24S2100000_31 implements Callable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS24S2100000_31 aCallableS24S2100000_31) {
        String str;
        Integer numValueOf;
        String bizInfo;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        CardInsertInfo cardInsertInfo3;
        LynxTemplate lynxTemplate;
        CardInsertInfo cardInsertInfo4;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMobShow$1");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS24S2100000_31.s0);
        String strLJII = aCallableS24S2100000_31.s1;
        if (strLJII == null) {
            strLJII = C20552315bV.LJII((Aweme) aCallableS24S2100000_31.l2);
        }
        c2344009Gk.LJIIIIZZ("card_id", strLJII);
        C14ZW c14zw = C14ZW.LIZ;
        Aweme aweme = (Aweme) aCallableS24S2100000_31.l2;
        c14zw.getClass();
        FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme);
        String showTiming = null;
        if (feedSurveyLJ != null) {
            str = feedSurveyLJ.surveyKey;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("survey_id", str);
        c2344009Gk.LJIIIIZZ("aweme_id", ((Aweme) aCallableS24S2100000_31.l2).getAid());
        String strLJII2 = C20552315bV.LJII((Aweme) aCallableS24S2100000_31.l2);
        Aweme aweme2 = (Aweme) aCallableS24S2100000_31.l2;
        if (aweme2 != null && (cardInsertInfo4 = aweme2.getCardInsertInfo()) != null) {
            numValueOf = Integer.valueOf(cardInsertInfo4.getCardSource());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("business_type", C20552315bV.LJI(numValueOf, strLJII2));
        c2344009Gk.LJIIIIZZ("card_type", C20552315bV.LJIIIZ((Aweme) aCallableS24S2100000_31.l2));
        c2344009Gk.LJIIIIZZ("card_source", C20552315bV.LJIIIIZZ(((Aweme) aCallableS24S2100000_31.l2).getCardInsertInfo().getCardSource()));
        c2344009Gk.LIZJ(C20552315bV.LJIIJJI((Aweme) aCallableS24S2100000_31.l2), "is_video_play");
        int iIsRealTime = 0;
        c2344009Gk.LIZJ(0, "is_uninsertion_card");
        c2344009Gk.LJIIIIZZ("action_type", "show");
        Aweme aweme3 = (Aweme) aCallableS24S2100000_31.l2;
        if (aweme3 != null && (cardInsertInfo3 = aweme3.getCardInsertInfo()) != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null) {
            bizInfo = lynxTemplate.getBizInfo();
        } else {
            bizInfo = null;
        }
        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
        Aweme aweme4 = (Aweme) aCallableS24S2100000_31.l2;
        if (aweme4 != null && (cardInsertInfo2 = aweme4.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme5 = (Aweme) aCallableS24S2100000_31.l2;
        if (aweme5 != null && (cardInsertInfo = aweme5.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20649115r7.LIZ(c2344009Gk, ((Aweme) aCallableS24S2100000_31.l2).getAid(), ((Aweme) aCallableS24S2100000_31.l2).getRequestId());
        C20684815ws.LJIILLIIL("special_shaped_card", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMobShow$1");
        return unit;
    }

    public static final Object call$1(ACallableS24S2100000_31 aCallableS24S2100000_31) {
        Integer numValueOf;
        String bizInfo;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        CardInsertInfo cardInsertInfo3;
        LynxTemplate lynxTemplate;
        CardInsertInfo cardInsertInfo4;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMobShow$3");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS24S2100000_31.s0);
        c2344009Gk.LJIIIIZZ("card_id", "survey_card");
        c2344009Gk.LJIIIIZZ("survey_id", aCallableS24S2100000_31.s1);
        c2344009Gk.LJIIIIZZ("aweme_id", ((Aweme) aCallableS24S2100000_31.l2).getAid());
        Aweme aweme = (Aweme) aCallableS24S2100000_31.l2;
        String showTiming = null;
        if (aweme != null && (cardInsertInfo4 = aweme.getCardInsertInfo()) != null) {
            numValueOf = Integer.valueOf(cardInsertInfo4.getCardSource());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("business_type", C20552315bV.LJI(numValueOf, "survey_card"));
        c2344009Gk.LJIIIIZZ("card_type", "card");
        c2344009Gk.LJIIIIZZ("card_source", "client");
        int iIsRealTime = 0;
        c2344009Gk.LIZJ(0, "is_video_play");
        c2344009Gk.LIZJ(0, "is_uninsertion_card");
        c2344009Gk.LJIIIIZZ("action_type", "show");
        Aweme aweme2 = (Aweme) aCallableS24S2100000_31.l2;
        if (aweme2 != null && (cardInsertInfo3 = aweme2.getCardInsertInfo()) != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null) {
            bizInfo = lynxTemplate.getBizInfo();
        } else {
            bizInfo = null;
        }
        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
        Aweme aweme3 = (Aweme) aCallableS24S2100000_31.l2;
        if (aweme3 != null && (cardInsertInfo2 = aweme3.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme4 = (Aweme) aCallableS24S2100000_31.l2;
        if (aweme4 != null && (cardInsertInfo = aweme4.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20684815ws.LJIILLIIL("special_shaped_card", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMobShow$3");
        return unit;
    }

    public ACallableS24S2100000_31(String str, Aweme aweme, int i) {
        this.$t = i;
        this.s0 = "homepage_hot";
        this.s1 = str;
        this.l2 = aweme;
    }

    public ACallableS24S2100000_31(String str, String str2, Aweme aweme, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = aweme;
    }
}
