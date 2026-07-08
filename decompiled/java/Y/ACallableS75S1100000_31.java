package Y;

import X.C14ZW;
import X.C15OF;
import X.C1C7U;
import X.C20552315bV;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxTemplate;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurvey;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class ACallableS75S1100000_31 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS75S1100000_31 aCallableS75S1100000_31) {
        C1C7U.LIZ("StitchWithMovieHelper@c4b6.goStitchWithMovie$1");
        Aweme awemeLJIIJ = ((C15OF) aCallableS75S1100000_31.l1).LJIIJ.LJIIJ(aCallableS75S1100000_31.s0, "");
        C1C7U.LIZIZ("StitchWithMovieHelper@c4b6.goStitchWithMovie$1");
        return awemeLJIIJ;
    }

    public static final Object call$1(ACallableS75S1100000_31 aCallableS75S1100000_31) {
        String bizInfo;
        int iIsRealTime;
        String bizInfo2;
        int iIsRealTime2;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMob4Server$2");
        for (Aweme aweme : (List) aCallableS75S1100000_31.l1) {
            CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
            if (cardInsertInfo != null) {
                String str = aCallableS75S1100000_31.s0;
                int cardSource = cardInsertInfo.getCardSource();
                String showTiming = null;
                if (cardSource != 1) {
                    if (cardSource == 2) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", str);
                        c2344009Gk.LJIIIIZZ("card_id", "fyp_server");
                        c2344009Gk.LJIIIIZZ("aweme_id", aweme.getAid());
                        c2344009Gk.LJIIIIZZ("business_type", C20552315bV.LJI(2, "fyp_server"));
                        c2344009Gk.LJIIIIZZ("card_type", C20552315bV.LJIIIZ(aweme));
                        c2344009Gk.LJIIIIZZ("card_source", "fyp");
                        c2344009Gk.LIZJ(0, "is_uninsertion_card");
                        LynxTemplate lynxTemplate = cardInsertInfo.getLynxTemplate();
                        if (lynxTemplate != null) {
                            bizInfo = lynxTemplate.getBizInfo();
                        } else {
                            bizInfo = null;
                        }
                        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
                        CardInsertInfo cardInsertInfo2 = aweme.getCardInsertInfo();
                        if (cardInsertInfo2 != null) {
                            iIsRealTime = cardInsertInfo2.isRealTime();
                        } else {
                            iIsRealTime = 0;
                        }
                        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
                        CardInsertInfo cardInsertInfo3 = aweme.getCardInsertInfo();
                        if (cardInsertInfo3 != null) {
                            showTiming = cardInsertInfo3.getShowTiming();
                        }
                        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
                        C20684815ws.LJIILLIIL("special_shaped_card_server", c2344009Gk.LIZ);
                    }
                } else {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", str);
                    c2344009Gk2.LIZJ(cardInsertInfo.getCardType(), "card_id");
                    c2344009Gk2.LJIIIIZZ("aweme_id", aweme.getAid());
                    c2344009Gk2.LJIIIIZZ("business_type", C20552315bV.LJI(1, String.valueOf(cardInsertInfo.getCardType())));
                    c2344009Gk2.LJIIIIZZ("card_type", C20552315bV.LJIIIZ(aweme));
                    c2344009Gk2.LJIIIIZZ("card_source", "fcp");
                    c2344009Gk2.LIZJ(0, "is_uninsertion_card");
                    LynxTemplate lynxTemplate2 = cardInsertInfo.getLynxTemplate();
                    if (lynxTemplate2 != null) {
                        bizInfo2 = lynxTemplate2.getBizInfo();
                    } else {
                        bizInfo2 = null;
                    }
                    c2344009Gk2.LJIIIIZZ("biz_info", bizInfo2);
                    CardInsertInfo cardInsertInfo4 = aweme.getCardInsertInfo();
                    if (cardInsertInfo4 != null) {
                        iIsRealTime2 = cardInsertInfo4.isRealTime();
                    } else {
                        iIsRealTime2 = 0;
                    }
                    c2344009Gk2.LIZJ(iIsRealTime2, "is_realtime");
                    CardInsertInfo cardInsertInfo5 = aweme.getCardInsertInfo();
                    if (cardInsertInfo5 != null) {
                        showTiming = cardInsertInfo5.getShowTiming();
                    }
                    c2344009Gk2.LJIIIIZZ("show_timing", showTiming);
                    C20684815ws.LJIILLIIL("special_shaped_card_server", c2344009Gk2.LIZ);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMob4Server$2");
        return unit;
    }

    public static final Object call$2(ACallableS75S1100000_31 aCallableS75S1100000_31) {
        String aid;
        Integer numValueOf;
        String bizInfo;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        CardInsertInfo cardInsertInfo3;
        LynxTemplate lynxTemplate;
        CardInsertInfo cardInsertInfo4;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMobClick$3");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS75S1100000_31.s0);
        c2344009Gk.LJIIIIZZ("card_id", "survey_card");
        Aweme aweme = (Aweme) aCallableS75S1100000_31.l1;
        String showTiming = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("aweme_id", aid);
        Aweme aweme2 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme2 != null && (cardInsertInfo4 = aweme2.getCardInsertInfo()) != null) {
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
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LIZJ(1, "click_type");
        Aweme aweme3 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme3 != null && (cardInsertInfo3 = aweme3.getCardInsertInfo()) != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null) {
            bizInfo = lynxTemplate.getBizInfo();
        } else {
            bizInfo = null;
        }
        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
        Aweme aweme4 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme4 != null && (cardInsertInfo2 = aweme4.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme5 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme5 != null && (cardInsertInfo = aweme5.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20684815ws.LJIILLIIL("special_shaped_card", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMobClick$3");
        return unit;
    }

    public static final Object call$3(ACallableS75S1100000_31 aCallableS75S1100000_31) {
        String str;
        Integer numValueOf;
        String bizInfo;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        CardInsertInfo cardInsertInfo3;
        LynxTemplate lynxTemplate;
        CardInsertInfo cardInsertInfo4;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMobShow$2");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS75S1100000_31.s0);
        c2344009Gk.LJIIIIZZ("card_id", "survey_card");
        C14ZW c14zw = C14ZW.LIZ;
        Aweme aweme = (Aweme) aCallableS75S1100000_31.l1;
        c14zw.getClass();
        FeedSurvey feedSurveyLJ = C14ZW.LJ(aweme);
        String showTiming = null;
        if (feedSurveyLJ != null) {
            str = feedSurveyLJ.surveyKey;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("survey_id", str);
        c2344009Gk.LJIIIIZZ("aweme_id", ((Aweme) aCallableS75S1100000_31.l1).getAid());
        Aweme aweme2 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme2 != null && (cardInsertInfo4 = aweme2.getCardInsertInfo()) != null) {
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
        Aweme aweme3 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme3 != null && (cardInsertInfo3 = aweme3.getCardInsertInfo()) != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null) {
            bizInfo = lynxTemplate.getBizInfo();
        } else {
            bizInfo = null;
        }
        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
        Aweme aweme4 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme4 != null && (cardInsertInfo2 = aweme4.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme5 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme5 != null && (cardInsertInfo = aweme5.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20684815ws.LJIILLIIL("special_shaped_card", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMobShow$2");
        return unit;
    }

    public static final Object call$4(ACallableS75S1100000_31 aCallableS75S1100000_31) {
        String showTiming;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        C1C7U.LIZ("MutantCardMobHelper@6495.liveSurveyCardMobShow$1");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LJIIIIZZ("card_id", "survey_card_live");
        c2344009Gk.LJIIIIZZ("survey_id", aCallableS75S1100000_31.s0);
        c2344009Gk.LJIIIIZZ("aweme_id", ((Aweme) aCallableS75S1100000_31.l1).getAid());
        c2344009Gk.LJIIIIZZ("business_type", "live");
        c2344009Gk.LJIIIIZZ("card_type", "card");
        c2344009Gk.LJIIIIZZ("card_source", "client");
        c2344009Gk.LJIIIIZZ("is_video_play", CardStruct.IStatusCode.DEFAULT);
        int iIsRealTime = 0;
        c2344009Gk.LIZJ(0, "is_uninsertion_card");
        c2344009Gk.LJIIIIZZ("action_type", "show");
        Aweme aweme = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme != null && (cardInsertInfo2 = aweme.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme2 = (Aweme) aCallableS75S1100000_31.l1;
        if (aweme2 != null && (cardInsertInfo = aweme2.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        } else {
            showTiming = null;
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20684815ws.LJIILLIIL("special_shaped_card", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.liveSurveyCardMobShow$1");
        return unit;
    }

    public ACallableS75S1100000_31(Aweme aweme, int i) {
        this.$t = i;
        this.s0 = "homepage_hot";
        this.l1 = aweme;
    }

    public ACallableS75S1100000_31(List list, int i) {
        this.$t = i;
        this.l1 = list;
        this.s0 = "homepage_hot";
    }

    public ACallableS75S1100000_31(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
