package Y;

import X.C1C7U;
import X.C20684815ws;
import X.C2189821An6;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.DetailLynxCardStruct;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class ACallableS82S0201000_10 implements Callable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object call$0(ACallableS82S0201000_10 aCallableS82S0201000_10) {
        C1C7U.LIZ("SearchAwemeCardViewHolder@d521.onShowAweme$1");
        ((SearchAwemeCardViewHolder) aCallableS82S0201000_10.l0).LJIJ((Aweme) aCallableS82S0201000_10.l1, Integer.valueOf(aCallableS82S0201000_10.i2)).LJIILJJIL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAwemeCardViewHolder@d521.onShowAweme$1");
        return unit;
    }

    public static final Object call$1(ACallableS82S0201000_10 aCallableS82S0201000_10) {
        int awemeType;
        String aid;
        String str;
        DetailLynxCardStruct lynxCardStruct;
        DynamicPatch dynamicPatch;
        C1C7U.LIZ("DetailLynxCardMobUtils@9ceb.mobCardContainerAppear$1");
        Aweme aweme = (Aweme) aCallableS82S0201000_10.l0;
        if (aweme != null) {
            awemeType = aweme.getAwemeType();
        } else {
            awemeType = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(awemeType, "card_type");
        Aweme aweme2 = (Aweme) aCallableS82S0201000_10.l0;
        String str2 = "";
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("aweme_id", aid);
        String eventType = ((C2189821An6) aCallableS82S0201000_10.l1).getEventType();
        if (eventType == null) {
            eventType = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", eventType);
        String enterMethodValue = ((C2189821An6) aCallableS82S0201000_10.l1).getEnterMethodValue();
        if (enterMethodValue != null) {
            str2 = enterMethodValue;
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LIZJ(aCallableS82S0201000_10.i2, "show_type");
        Aweme aweme3 = (Aweme) aCallableS82S0201000_10.l0;
        if (aweme3 == null || (lynxCardStruct = aweme3.getLynxCardStruct()) == null || (dynamicPatch = lynxCardStruct.dynamicPatch) == null || (str = dynamicPatch.schema) == null) {
            str = "no schema";
        }
        c2344009Gk.LJIIIIZZ("schema", str);
        C20684815ws.LJIILLIIL("rd_feed_detail_lynx_card_container_appear", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DetailLynxCardMobUtils@9ceb.mobCardContainerAppear$1");
        return unit;
    }

    public ACallableS82S0201000_10(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
