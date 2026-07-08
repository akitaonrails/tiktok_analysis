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
public class ACallableS10S1101000_31 implements Callable {
    public final int $t;
    public int i2;
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

    public static final Object call$0(ACallableS10S1101000_31 aCallableS10S1101000_31) {
        Integer numValueOf;
        String bizInfo;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        CardInsertInfo cardInsertInfo3;
        LynxTemplate lynxTemplate;
        CardInsertInfo cardInsertInfo4;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMobClick$1");
        String strLJII = C20552315bV.LJII((Aweme) aCallableS10S1101000_31.l1);
        String strLJIIIZ = C20552315bV.LJIIIZ((Aweme) aCallableS10S1101000_31.l1);
        String strLJIIIIZZ = C20552315bV.LJIIIIZZ(((Aweme) aCallableS10S1101000_31.l1).getCardInsertInfo().getCardSource());
        int iLJIIJJI = C20552315bV.LJIIJJI((Aweme) aCallableS10S1101000_31.l1);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS10S1101000_31.s0);
        c2344009Gk.LJIIIIZZ("card_id", strLJII);
        c2344009Gk.LJIIIIZZ("aweme_id", ((Aweme) aCallableS10S1101000_31.l1).getAid());
        Aweme aweme = (Aweme) aCallableS10S1101000_31.l1;
        String showTiming = null;
        if (aweme != null && (cardInsertInfo4 = aweme.getCardInsertInfo()) != null) {
            numValueOf = Integer.valueOf(cardInsertInfo4.getCardSource());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("business_type", C20552315bV.LJI(numValueOf, strLJII));
        c2344009Gk.LJIIIIZZ("card_type", strLJIIIZ);
        c2344009Gk.LJIIIIZZ("card_source", strLJIIIIZZ);
        c2344009Gk.LIZJ(iLJIIJJI, "is_video_play");
        int iIsRealTime = 0;
        c2344009Gk.LIZJ(0, "is_uninsertion_card");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LIZJ(aCallableS10S1101000_31.i2, "click_type");
        Aweme aweme2 = (Aweme) aCallableS10S1101000_31.l1;
        if (aweme2 != null && (cardInsertInfo3 = aweme2.getCardInsertInfo()) != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null) {
            bizInfo = lynxTemplate.getBizInfo();
        } else {
            bizInfo = null;
        }
        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
        Aweme aweme3 = (Aweme) aCallableS10S1101000_31.l1;
        if (aweme3 != null && (cardInsertInfo2 = aweme3.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme4 = (Aweme) aCallableS10S1101000_31.l1;
        if (aweme4 != null && (cardInsertInfo = aweme4.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20684815ws.LJIILLIIL("special_shaped_card", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMobClick$1");
        return unit;
    }

    public static final Object call$1(ACallableS10S1101000_31 aCallableS10S1101000_31) {
        Integer numValueOf;
        String bizInfo;
        CardInsertInfo cardInsertInfo;
        CardInsertInfo cardInsertInfo2;
        CardInsertInfo cardInsertInfo3;
        LynxTemplate lynxTemplate;
        CardInsertInfo cardInsertInfo4;
        C1C7U.LIZ("MutantCardMobHelper@6495.cardMobClick$2");
        String strLJII = C20552315bV.LJII((Aweme) aCallableS10S1101000_31.l1);
        String strLJIIIZ = C20552315bV.LJIIIZ((Aweme) aCallableS10S1101000_31.l1);
        String strLJIIIIZZ = C20552315bV.LJIIIIZZ(((Aweme) aCallableS10S1101000_31.l1).getCardInsertInfo().getCardSource());
        int iLJIIJJI = C20552315bV.LJIIJJI((Aweme) aCallableS10S1101000_31.l1);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS10S1101000_31.s0);
        c2344009Gk.LJIIIIZZ("card_id", strLJII);
        c2344009Gk.LJIIIIZZ("aweme_id", ((Aweme) aCallableS10S1101000_31.l1).getAid());
        Aweme aweme = (Aweme) aCallableS10S1101000_31.l1;
        String showTiming = null;
        if (aweme != null && (cardInsertInfo4 = aweme.getCardInsertInfo()) != null) {
            numValueOf = Integer.valueOf(cardInsertInfo4.getCardSource());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("business_type", C20552315bV.LJI(numValueOf, strLJII));
        c2344009Gk.LJIIIIZZ("card_type", strLJIIIZ);
        c2344009Gk.LJIIIIZZ("card_source", strLJIIIIZZ);
        c2344009Gk.LIZJ(iLJIIJJI, "is_video_play");
        int iIsRealTime = 0;
        c2344009Gk.LIZJ(0, "is_uninsertion_card");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LIZJ(aCallableS10S1101000_31.i2, "click_type");
        Aweme aweme2 = (Aweme) aCallableS10S1101000_31.l1;
        if (aweme2 != null && (cardInsertInfo3 = aweme2.getCardInsertInfo()) != null && (lynxTemplate = cardInsertInfo3.getLynxTemplate()) != null) {
            bizInfo = lynxTemplate.getBizInfo();
        } else {
            bizInfo = null;
        }
        c2344009Gk.LJIIIIZZ("biz_info", bizInfo);
        Aweme aweme3 = (Aweme) aCallableS10S1101000_31.l1;
        if (aweme3 != null && (cardInsertInfo2 = aweme3.getCardInsertInfo()) != null) {
            iIsRealTime = cardInsertInfo2.isRealTime();
        }
        c2344009Gk.LIZJ(iIsRealTime, "is_realtime");
        Aweme aweme4 = (Aweme) aCallableS10S1101000_31.l1;
        if (aweme4 != null && (cardInsertInfo = aweme4.getCardInsertInfo()) != null) {
            showTiming = cardInsertInfo.getShowTiming();
        }
        c2344009Gk.LJIIIIZZ("show_timing", showTiming);
        C20684815ws.LJIILLIIL("special_shaped_card", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MutantCardMobHelper@6495.cardMobClick$2");
        return unit;
    }

    public ACallableS10S1101000_31(int i, Aweme aweme, String str, int i2) {
        this.$t = i2;
        this.l1 = aweme;
        this.s0 = str;
        this.i2 = i;
    }
}
