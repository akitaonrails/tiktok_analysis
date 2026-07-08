package Y;

import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class ACallableS16S2100000_2 implements Callable {
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

    public static final Object call$0(ACallableS16S2100000_2 aCallableS16S2100000_2) {
        Long lValueOf;
        C1C7U.LIZ("ChooseReasonMobUtils@9af7.mobShowDislikeReason$1");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", ((Aweme) aCallableS16S2100000_2.l2).getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid((Aweme) aCallableS16S2100000_2.l2));
        Music music = ((Aweme) aCallableS16S2100000_2.l2).getMusic();
        if (music != null) {
            lValueOf = Long.valueOf(music.getId());
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "music_id");
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS16S2100000_2.s0);
        c2344009Gk.LJIIIIZZ("enter_method", aCallableS16S2100000_2.s1);
        C20684815ws.LJIILLIIL("show_choose_dislike_reason", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseReasonMobUtils@9af7.mobShowDislikeReason$1");
        return unit;
    }

    public static final Object call$1(ACallableS16S2100000_2 aCallableS16S2100000_2) {
        Long lValueOf;
        C1C7U.LIZ("ChooseReasonMobUtils@9af7.mobShowReasonToast$1");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", ((Aweme) aCallableS16S2100000_2.l2).getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid((Aweme) aCallableS16S2100000_2.l2));
        Music music = ((Aweme) aCallableS16S2100000_2.l2).getMusic();
        if (music != null) {
            lValueOf = Long.valueOf(music.getId());
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "music_id");
        c2344009Gk.LJIIIIZZ("enter_from", aCallableS16S2100000_2.s0);
        c2344009Gk.LJIIIIZZ("enter_method", aCallableS16S2100000_2.s1);
        C20684815ws.LJIILLIIL("show_choose_dislike_reason_toast", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseReasonMobUtils@9af7.mobShowReasonToast$1");
        return unit;
    }

    public ACallableS16S2100000_2(Aweme aweme, String str, String str2, int i) {
        this.$t = i;
        this.l2 = aweme;
        this.s0 = str;
        this.s1 = str2;
    }
}
