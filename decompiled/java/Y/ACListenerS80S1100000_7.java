package Y;

import X.C1161920gLG;
import X.C2089008Gi;
import X.C2273271DyP;
import X.C784600UqA;
import X.C784610UqB;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS80S1100000_7 implements View.OnClickListener {
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
        }
    }

    public static final void onClick$0(ACListenerS80S1100000_7 aCListenerS80S1100000_7, View view) {
        ((IBrowserService) C1161920gLG.LIZJ(IBrowserService.class)).Zz1();
        Context context = ((View) aCListenerS80S1100000_7.l1).getContext();
        C784600UqA c784600UqA = new C784600UqA(aCListenerS80S1100000_7.s0);
        c784600UqA.LIZJ = true;
        C784610UqB.LIZIZ(context, c784600UqA);
    }

    public static final void onClick$1(ACListenerS80S1100000_7 aCListenerS80S1100000_7, View view) {
        ((IBrowserService) C1161920gLG.LIZJ(IBrowserService.class)).Zz1();
        Context context = ((View) aCListenerS80S1100000_7.l1).getContext();
        C784600UqA c784600UqA = new C784600UqA(aCListenerS80S1100000_7.s0);
        c784600UqA.LIZJ = true;
        C784610UqB.LIZIZ(context, c784600UqA);
    }

    public static final void onClick$2(ACListenerS80S1100000_7 aCListenerS80S1100000_7, View view) {
        C2089008Gi c2089008Gi = new C2089008Gi(C2273271DyP.LIZ());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) aCListenerS80S1100000_7.l1, "aweme://webview");
        smartRouteBuildRoute.withParam("url", c2089008Gi.LJ());
        smartRouteBuildRoute.withParam("title", aCListenerS80S1100000_7.s0);
        smartRouteBuildRoute.withParam("show_separate_line", true);
        smartRouteBuildRoute.open();
    }

    public ACListenerS80S1100000_7(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
