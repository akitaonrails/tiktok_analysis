package Y;

import X.C0OPQ;
import X.C19EG;
import X.C2097608Jq;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class ACListenerS13S2200000_9 implements View.OnClickListener {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS13S2200000_9 aCListenerS13S2200000_9, View view) {
        String str;
        if (Intrinsics.LJFF(((BaseSharePackage) aCListenerS13S2200000_9.l2).itemType, "live_event")) {
            str = "live_event_page";
        } else {
            str = aCListenerS13S2200000_9.s0;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) aCListenerS13S2200000_9.l3, "aweme://inbox/bulletin_board");
        smartRouteBuildRoute.withParam("bulletin_board_id", aCListenerS13S2200000_9.s1);
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("previous_page", str);
        smartRouteBuildRoute.open();
        String string = ((BaseSharePackage) aCListenerS13S2200000_9.l2).extras.getString("live_id");
        String str2 = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((BaseSharePackage) aCListenerS13S2200000_9.l2).extras.getString("live_event_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((BaseSharePackage) aCListenerS13S2200000_9.l2).extras.getString("live_event_status");
        if (string3 == null) {
            string3 = "";
        }
        boolean z = ((BaseSharePackage) aCListenerS13S2200000_9.l2).extras.getBoolean("live_event_type");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("click_type", "enter_cell");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        C0OPQ c0opq = C0OPQ.LIZ;
        String str3 = aCListenerS13S2200000_9.s1;
        c0opq.getClass();
        C0OPQ.LJ(null, str3, linkedHashMap);
        String str4 = aCListenerS13S2200000_9.s0;
        if (str4 != null) {
            str2 = str4;
        }
        C0OPQ.LJJIJIIJIL(string, str2, str2, "succeed", "click", C2097608Jq.LJIIIIZZ(new Pair("live_event_id", string2), new Pair("live_event_status", string3), new Pair("live_event_type", String.valueOf(z))));
    }

    public static final void onClick$1(ACListenerS13S2200000_9 aCListenerS13S2200000_9, View view) {
        String str;
        if (Intrinsics.LJFF(((BaseSharePackage) aCListenerS13S2200000_9.l2).itemType, "live_event")) {
            str = "live_event_page";
        } else {
            str = aCListenerS13S2200000_9.s0;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) aCListenerS13S2200000_9.l3, "aweme://inbox/bulletin_board");
        smartRouteBuildRoute.withParam("bulletin_board_id", aCListenerS13S2200000_9.s1);
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("previous_page", str);
        smartRouteBuildRoute.open();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("click_type", "enter_cell");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        C0OPQ c0opq = C0OPQ.LIZ;
        String str3 = aCListenerS13S2200000_9.s1;
        c0opq.getClass();
        C0OPQ.LJ(null, str3, linkedHashMap);
        if (Intrinsics.LJFF(((BaseSharePackage) aCListenerS13S2200000_9.l2).itemType, "live") || Intrinsics.LJFF(((BaseSharePackage) aCListenerS13S2200000_9.l2).itemType, "live_event")) {
            String string = ((BaseSharePackage) aCListenerS13S2200000_9.l2).extras.getString("live_id");
            if (string == null) {
                string = "";
            }
            String string2 = ((BaseSharePackage) aCListenerS13S2200000_9.l2).extras.getString("live_event_id");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = ((BaseSharePackage) aCListenerS13S2200000_9.l2).extras.getString("live_event_status");
            if (string3 == null) {
                string3 = "";
            }
            boolean z = ((BaseSharePackage) aCListenerS13S2200000_9.l2).extras.getBoolean("live_event_type");
            String str4 = aCListenerS13S2200000_9.s0;
            if (str4 != null) {
                str2 = str4;
            }
            C0OPQ.LJJIJIIJIL(string, str2, str2, "succeed", "click", C2097608Jq.LJIIIIZZ(new Pair("live_event_id", string2), new Pair("live_event_status", string3), new Pair("live_event_type", String.valueOf(z))));
        }
    }

    public ACListenerS13S2200000_9(BaseSharePackage baseSharePackage, String str, C19EG c19eg, String str2, int i) {
        this.$t = i;
        this.l2 = baseSharePackage;
        this.s0 = str;
        this.l3 = c19eg;
        this.s1 = str2;
    }
}
