package Y;

import X.C1C7U;
import X.C20552315bV;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxTemplate;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes32.dex */
public class ACallableS7S1100100_31 implements Callable {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

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

    public static final Object call$0(ACallableS7S1100100_31 aCallableS7S1100100_31) {
        String bizInfo;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        LynxTemplate lynxTemplate;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMobTime$1");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS7S1100100_31.s0);
        c2344009Gk.LJIIIIZZ("card_id", C20552315bV.LJII((Aweme) aCallableS7S1100100_31.l1));
        c2344009Gk.LJIIIIZZ("aweme_id", ((Aweme) aCallableS7S1100100_31.l1).getAid());
        c2344009Gk.LJIIIIZZ("business_type", C20552315bV.LJI(Integer.valueOf(((Aweme) aCallableS7S1100100_31.l1).getCardInsertInfo().getCardSource()), C20552315bV.LJII((Aweme) aCallableS7S1100100_31.l1)));
        c2344009Gk.LJIIIIZZ("card_type", C20552315bV.LJIIIZ((Aweme) aCallableS7S1100100_31.l1));
        c2344009Gk.LJIIIIZZ("card_source", C20552315bV.LJIIIIZZ(((Aweme) aCallableS7S1100100_31.l1).getCardInsertInfo().getCardSource()));
        int iIsRealTime = 0;
        c2344009Gk.LIZJ(0, "is_uninsertion_card");
        c2344009Gk.LIZLLL(aCallableS7S1100100_31.j2, "duration");
        CardInsertInfo cardInsertInfo3 = ((Aweme) aCallableS7S1100100_31.l1).getCardInsertInfo();
        String showTiming = null;
        if (cardInsertInfo3 != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null) {
            bizInfo = lynxTemplate.getBizInfo();
        } else {
            bizInfo = null;
        }
        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
        Aweme aweme = (Aweme) aCallableS7S1100100_31.l1;
        if (aweme != null && (cardInsertInfo2 = aweme.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme2 = (Aweme) aCallableS7S1100100_31.l1;
        if (aweme2 != null && (cardInsertInfo = aweme2.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20684815ws.LJIILLIIL("special_shaped_card_time", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMobTime$1");
        return unit;
    }

    public static final Object call$1(ACallableS7S1100100_31 aCallableS7S1100100_31) {
        Integer numValueOf;
        String bizInfo;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        CardInsertInfo cardInsertInfo3;
        LynxTemplate lynxTemplate;
        CardInsertInfo cardInsertInfo4;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMobTime$2");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS7S1100100_31.s0);
        c2344009Gk.LJIIIIZZ("card_id", "survey_card");
        c2344009Gk.LJIIIIZZ("aweme_id", ((Aweme) aCallableS7S1100100_31.l1).getAid());
        Aweme aweme = (Aweme) aCallableS7S1100100_31.l1;
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
        c2344009Gk.LIZJ(0, "is_uninsertion_card");
        c2344009Gk.LIZLLL(aCallableS7S1100100_31.j2, "duration");
        Aweme aweme2 = (Aweme) aCallableS7S1100100_31.l1;
        if (aweme2 != null && (cardInsertInfo3 = aweme2.getCardInsertInfo()) != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null) {
            bizInfo = lynxTemplate.getBizInfo();
        } else {
            bizInfo = null;
        }
        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
        Aweme aweme3 = (Aweme) aCallableS7S1100100_31.l1;
        if (aweme3 != null && (cardInsertInfo2 = aweme3.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme4 = (Aweme) aCallableS7S1100100_31.l1;
        if (aweme4 != null && (cardInsertInfo = aweme4.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20684815ws.LJIILLIIL("special_shaped_card_time", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMobTime$2");
        return unit;
    }

    public ACallableS7S1100100_31(long j, Aweme aweme, int i) {
        this.$t = i;
        this.s0 = "homepage_hot";
        this.l1 = aweme;
        this.j2 = j;
    }

    public ACallableS7S1100100_31(String str, Aweme aweme, long j, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
        this.j2 = j;
    }
}
