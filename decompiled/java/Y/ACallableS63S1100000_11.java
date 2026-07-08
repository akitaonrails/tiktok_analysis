package Y;

import X.C0S11;
import X.C1697810uHb;
import X.C1C7U;
import X.C20684815ws;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Arrays;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ACallableS63S1100000_11 implements Callable {
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

    public static final Object call$0(ACallableS63S1100000_11 aCallableS63S1100000_11) {
        String aid;
        String authorUid;
        C1C7U.LIZ("StoryViewerListCompliancePopupTask@eb8b.mobStoryPopup$1");
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("story_view_list", "account_type");
        pairArr[1] = new Pair(aCallableS63S1100000_11.s0, "action_type");
        pairArr[2] = new Pair(((C0S11) aCallableS63S1100000_11.l1).LLILLJJLI, "enter_from");
        Aweme aweme = ((C0S11) aCallableS63S1100000_11.l1).LL;
        String str = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        pairArr[3] = new Pair(aid, "group_id");
        Aweme aweme2 = ((C0S11) aCallableS63S1100000_11.l1).LL;
        if (aweme2 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme2)) != null) {
            str = authorUid;
        }
        pairArr[4] = new Pair(str, "author_id");
        pairArr[5] = new Pair(((C0S11) aCallableS63S1100000_11.l1).LLILZLL, "view_list_popup_type");
        Pair[] pairArr2 = (Pair[]) C1697810uHb.LJIILJJIL(pairArr).toArray(new Pair[0]);
        C20684815ws.LJIJI("story_popup", (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryViewerListCompliancePopupTask@eb8b.mobStoryPopup$1");
        return unit;
    }

    public static final Object call$1(ACallableS63S1100000_11 aCallableS63S1100000_11) {
        C1C7U.LIZ("MentionEventTrackingExtKt@bd7d.sendEventTrackingAsync$2");
        C20684815ws.LJIJ(aCallableS63S1100000_11.s0, (JSONObject) aCallableS63S1100000_11.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionEventTrackingExtKt@bd7d.sendEventTrackingAsync$2");
        return unit;
    }

    public static final Object call$2(ACallableS63S1100000_11 aCallableS63S1100000_11) {
        C1C7U.LIZ("StoryGuideCardTracker@8f5a.sendEventTrackingAsync$3$1");
        C20684815ws.LJIJ(aCallableS63S1100000_11.s0, (JSONObject) aCallableS63S1100000_11.l1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryGuideCardTracker@8f5a.sendEventTrackingAsync$3$1");
        return unit;
    }

    public ACallableS63S1100000_11(String str, Object obj, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
