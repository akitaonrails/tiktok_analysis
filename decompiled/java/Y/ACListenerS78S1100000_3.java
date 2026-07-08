package Y;

import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class ACListenerS78S1100000_3 implements View.OnClickListener {
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
        }
    }

    public static final void onClick$0(ACListenerS78S1100000_3 aCListenerS78S1100000_3, View view) {
        String str = aCListenerS78S1100000_3.s0;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        c2344009Gk.LJIIIIZZ("music_id", str);
        C20684815ws.LJIILLIIL("music_detail_link_click", c2344009Gk.LIZ);
        String string = UUID.randomUUID().toString();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) aCListenerS78S1100000_3.l1, "aweme://music/detail/");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, aCListenerS78S1100000_3.s0);
        smartRouteBuildRoute.withParam("process_id", string);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(ACListenerS78S1100000_3 aCListenerS78S1100000_3, View view) {
        SmartRouter.buildRoute((Context) aCListenerS78S1100000_3.l1, aCListenerS78S1100000_3.s0).open();
    }

    public ACListenerS78S1100000_3(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
