package Y;

import X.C1389340mG4;
import X.C1C7U;
import X.C1ER1;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class ACallableS19S2100000_9 implements Callable {
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

    public static final Object call$0(ACallableS19S2100000_9 aCallableS19S2100000_9) {
        String str;
        C1C7U.LIZ("FeedSpeedMobUtils@fb5d.mobSpeedClickEvent$1");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", ((Aweme) aCallableS19S2100000_9.l2).getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid((Aweme) aCallableS19S2100000_9.l2));
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS19S2100000_9.s0);
        c2344009Gk.LJIIIIZZ("enter_method", aCallableS19S2100000_9.s1);
        String str2 = "1";
        if (!C1389340mG4.LIZIZ().LJFF) {
            str = "1";
        } else {
            str = "3";
        }
        c2344009Gk.LJIIIIZZ("pad_interface_orientation", str);
        c2344009Gk.LIZJ(0, "is_landscape_screen");
        if (!((Aweme) aCallableS19S2100000_9.l2).isPaidContent) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_collection_item", str2);
        c2344009Gk.LJII(C1ER1.LIZIZ.LLZ());
        C20684815ws.LJIILLIIL("click_video_speed", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedSpeedMobUtils@fb5d.mobSpeedClickEvent$1");
        return unit;
    }

    public static final Object call$1(ACallableS19S2100000_9 aCallableS19S2100000_9) {
        String str;
        C1C7U.LIZ("FeedSpeedMobUtils@fb5d.mobVideoSpeedShow$1");
        Aweme aweme = (Aweme) aCallableS19S2100000_9.l2;
        Object objValueOf = null;
        if (aweme != null) {
            String str2 = aCallableS19S2100000_9.s0;
            String str3 = aCallableS19S2100000_9.s1;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
            c2344009Gk.LJIIIIZZ("enter_method", str3);
            if (C1389340mG4.LIZIZ().LJFF) {
                str = "3";
            } else {
                str = "1";
            }
            c2344009Gk.LJIIIIZZ("pad_interface_orientation", str);
            Video video = aweme.getVideo();
            if (video != null) {
                objValueOf = Integer.valueOf(video.getDuration());
            }
            c2344009Gk.LJ(objValueOf, "item_duration");
            C20684815ws.LJIILLIIL("video_speed_show", c2344009Gk.LIZ);
            objValueOf = Unit.LIZ;
        }
        C1C7U.LIZIZ("FeedSpeedMobUtils@fb5d.mobVideoSpeedShow$1");
        return objValueOf;
    }

    public ACallableS19S2100000_9(Aweme aweme, String str, String str2, int i) {
        this.$t = i;
        this.l2 = aweme;
        this.s0 = str;
        this.s1 = str2;
    }
}
