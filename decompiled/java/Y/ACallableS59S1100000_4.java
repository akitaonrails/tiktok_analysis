package Y;

import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public class ACallableS59S1100000_4 implements Callable {
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
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS59S1100000_4 aCallableS59S1100000_4) {
        int cardType;
        CardInsertInfo cardInsertInfo;
        C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerAppear$1");
        Aweme aweme = (Aweme) aCallableS59S1100000_4.l1;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
            cardType = cardInsertInfo.getCardType();
        } else {
            cardType = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(cardType, "card_type");
        c2344009Gk.LJIIIIZZ("show_type", aCallableS59S1100000_4.s0);
        C20684815ws.LJIILLIIL("rd_feed_lynx_card_container_appear", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerAppear$1");
        return unit;
    }

    public static final Object call$1(ACallableS59S1100000_4 aCallableS59S1100000_4) {
        int cardType;
        CardInsertInfo cardInsertInfo;
        C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerIgnoreErrorCode$1");
        Aweme aweme = (Aweme) aCallableS59S1100000_4.l1;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
            cardType = cardInsertInfo.getCardType();
        } else {
            cardType = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(cardType, "card_type");
        c2344009Gk.LJIIIIZZ("code", aCallableS59S1100000_4.s0);
        C20684815ws.LJIILLIIL("rd_feed_lynx_card_error_ignore", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerIgnoreErrorCode$1");
        return unit;
    }

    public static final Object call$2(ACallableS59S1100000_4 aCallableS59S1100000_4) {
        int cardType;
        CardInsertInfo cardInsertInfo;
        C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerRuntimeError$1");
        Aweme aweme = (Aweme) aCallableS59S1100000_4.l1;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
            cardType = cardInsertInfo.getCardType();
        } else {
            cardType = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(cardType, "card_type");
        c2344009Gk.LJIIIIZZ("msg", aCallableS59S1100000_4.s0);
        C20684815ws.LJIILLIIL("rd_feed_lynx_card_runtime_error", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerRuntimeError$1");
        return unit;
    }

    public ACallableS59S1100000_4(Aweme aweme, String str, int i) {
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
    }
}
