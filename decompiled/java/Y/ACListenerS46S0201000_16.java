package Y;

import X.C1057370dcd;
import X.C1944607jY;
import X.C20684815ws;
import X.C2344009Gk;
import X.C259800zU;
import X.InterfaceC1036110d4L;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public class ACListenerS46S0201000_16 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final void onClick$0(ACListenerS46S0201000_16 aCListenerS46S0201000_16, View view) {
        ((TuxSheet) aCListenerS46S0201000_16.l0).dismissAllowingStateLoss();
        InterfaceC1036110d4L interfaceC1036110d4L = (InterfaceC1036110d4L) aCListenerS46S0201000_16.l1;
        if (interfaceC1036110d4L != null) {
            interfaceC1036110d4L.LJJJJJL(aCListenerS46S0201000_16.i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS46S0201000_16 aCListenerS46S0201000_16, View view) {
        C1057370dcd.LIZ();
        ((C1944607jY) ((C259800zU) aCListenerS46S0201000_16.l0).element).LIZ("use_spark", "1");
        SmartRouter.buildRoute(view.getContext(), ((C1944607jY) ((C259800zU) aCListenerS46S0201000_16.l0).element).LIZIZ().toString()).open();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("item_id", ((Aweme) aCListenerS46S0201000_16.l1).getAid());
        c2344009Gk.LIZLLL(((Aweme) aCListenerS46S0201000_16.l1).getStarAtlasOrderId(), "order_id");
        c2344009Gk.LIZJ(aCListenerS46S0201000_16.i2, "bar_status");
        C20684815ws.LJIILLIIL("tcm_video_bar_click", c2344009Gk.LIZ);
    }

    public ACListenerS46S0201000_16(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
