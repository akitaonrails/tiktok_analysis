package Y;

import X.C11XD;
import X.C11XG;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2344009Gk;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes30.dex */
public class ACListenerS63S1200000_29 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
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
        }
    }

    public static final void onClick$0(ACListenerS63S1200000_29 aCListenerS63S1200000_29, View view) {
        SmartRouter.buildRoute(((C11XD) aCListenerS63S1200000_29.l1).LL, aCListenerS63S1200000_29.s0).open();
        Keva keva = ((C11XD) aCListenerS63S1200000_29.l1).LLILZ;
        keva.storeInt("traffic_incentives_learn_more", keva.getInt("traffic_incentives_learn_more", 0) + 1);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("current_page", "profile_page");
        C20684815ws.LJIILLIIL("traffic_incentive_activity_notice_click", c2344009Gk.LIZ);
        ((C20515215Pi) aCListenerS63S1200000_29.l2).LIZIZ();
    }

    public static final void onClick$1(ACListenerS63S1200000_29 aCListenerS63S1200000_29, View view) {
        SmartRouter.buildRoute(((C11XG) aCListenerS63S1200000_29.l1).LL, aCListenerS63S1200000_29.s0).open();
        Keva keva = ((C11XG) aCListenerS63S1200000_29.l1).LLILZ;
        keva.storeInt("weekly_report_learn_more", keva.getInt("weekly_report_learn_more", 0) + 1);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("current_page", "profile_page");
        C20684815ws.LJIILLIIL("traffic_incentive_strategy_notice_click", c2344009Gk.LIZ);
        ((C20515215Pi) aCListenerS63S1200000_29.l2).LIZIZ();
    }

    public ACListenerS63S1200000_29(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
