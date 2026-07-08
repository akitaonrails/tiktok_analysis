package Y;

import X.C0OPQ;
import X.C2097608Jq;
import X.C635220Ovo;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.inbox.workbench.ability.WorkbenchCardAbility;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public class ACListenerS81S1100000_9 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS81S1100000_9 aCListenerS81S1100000_9, View view) {
        SmartRouter.buildRoute(view.getContext(), aCListenerS81S1100000_9.s0).open();
        WorkbenchCardAbility ability = ((C635220Ovo) aCListenerS81S1100000_9.l1).getAbility();
        if (ability != null) {
            ability.cQ2(aCListenerS81S1100000_9.s0, "button");
        }
    }

    public static final void onClick$1(ACListenerS81S1100000_9 aCListenerS81S1100000_9, View view) {
        String string = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_status");
        if (string3 == null) {
            string3 = "";
        }
        boolean z = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getBoolean("live_event_type");
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = aCListenerS81S1100000_9.s0;
        if (str2 != null) {
            str = str2;
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("live_event_id", string2), new Pair("live_event_status", string3), new Pair("live_event_type", String.valueOf(z)));
        c0opq.getClass();
        C0OPQ.LJJIJIIJIL(string, str, str, "fail", "click", mapLJIIIIZZ);
    }

    public static final void onClick$2(ACListenerS81S1100000_9 aCListenerS81S1100000_9, View view) {
        String string = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_status");
        if (string3 == null) {
            string3 = "";
        }
        boolean z = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getBoolean("live_event_type");
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = aCListenerS81S1100000_9.s0;
        if (str2 != null) {
            str = str2;
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("live_event_id", string2), new Pair("live_event_status", string3), new Pair("live_event_type", String.valueOf(z)));
        c0opq.getClass();
        C0OPQ.LJJIJIIJIL(string, str, str, "fail", "click", mapLJIIIIZZ);
    }

    public static final void onClick$3(ACListenerS81S1100000_9 aCListenerS81S1100000_9, View view) {
        String string = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_status");
        if (string3 == null) {
            string3 = "";
        }
        boolean z = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getBoolean("live_event_type");
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = aCListenerS81S1100000_9.s0;
        if (str2 != null) {
            str = str2;
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("live_event_id", string2), new Pair("live_event_status", string3), new Pair("live_event_type", String.valueOf(z)));
        c0opq.getClass();
        C0OPQ.LJJIJIIJIL(string, str, str, "fail", "click", mapLJIIIIZZ);
    }

    public static final void onClick$4(ACListenerS81S1100000_9 aCListenerS81S1100000_9, View view) {
        String string = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_status");
        if (string3 == null) {
            string3 = "";
        }
        boolean z = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getBoolean("live_event_type");
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = aCListenerS81S1100000_9.s0;
        if (str2 != null) {
            str = str2;
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("live_event_id", string2), new Pair("live_event_status", string3), new Pair("live_event_type", String.valueOf(z)));
        c0opq.getClass();
        C0OPQ.LJJIJIIJIL(string, str, str, "fail", "click", mapLJIIIIZZ);
    }

    public static final void onClick$5(ACListenerS81S1100000_9 aCListenerS81S1100000_9, View view) {
        String string = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_status");
        if (string3 == null) {
            string3 = "";
        }
        boolean z = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getBoolean("live_event_type");
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = aCListenerS81S1100000_9.s0;
        if (str2 != null) {
            str = str2;
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("live_event_id", string2), new Pair("live_event_status", string3), new Pair("live_event_type", String.valueOf(z)));
        c0opq.getClass();
        C0OPQ.LJJIJIIJIL(string, str, str, "fail", "click", mapLJIIIIZZ);
    }

    public static final void onClick$6(ACListenerS81S1100000_9 aCListenerS81S1100000_9, View view) {
        String string = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_id");
        String str = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_id");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getString("live_event_status");
        if (string3 == null) {
            string3 = "";
        }
        boolean z = ((BaseSharePackage) aCListenerS81S1100000_9.l1).extras.getBoolean("live_event_type");
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = aCListenerS81S1100000_9.s0;
        if (str2 != null) {
            str = str2;
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("live_event_id", string2), new Pair("live_event_status", string3), new Pair("live_event_type", String.valueOf(z)));
        c0opq.getClass();
        C0OPQ.LJJIJIIJIL(string, str, str, "fail", "click", mapLJIIIIZZ);
    }

    public ACListenerS81S1100000_9(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
