package Y;

import X.AbstractC1336950ktZ;
import X.C1337050ktj;
import X.C19U0;
import X.C259800zU;
import X.InterfaceC1336940ktY;
import android.view.View;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;

/* JADX INFO: loaded from: classes21.dex */
public class ACListenerS123S0200000_20 implements View.OnClickListener {
    public final int $t;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS123S0200000_20 aCListenerS123S0200000_20, View view) {
        LynxTabBarView lynxTabBarView = (LynxTabBarView) aCListenerS123S0200000_20.l0;
        C259800zU c259800zU = (C259800zU) aCListenerS123S0200000_20.l1;
        C1337050ktj c1337050ktj = lynxTabBarView.LLILZ;
        if (c1337050ktj != null) {
            c1337050ktj.LIZ.LLILZIL = (C19U0) c259800zU.element;
        }
    }

    public static final void onClick$1(ACListenerS123S0200000_20 aCListenerS123S0200000_20, View view) {
        AbstractC1336950ktZ abstractC1336950ktZ = (AbstractC1336950ktZ) aCListenerS123S0200000_20.l0;
        C19U0 c19u0 = (C19U0) aCListenerS123S0200000_20.l1;
        InterfaceC1336940ktY interfaceC1336940ktY = abstractC1336950ktZ.LLJJIJIIJIL;
        if (interfaceC1336940ktY != null) {
            interfaceC1336940ktY.LIZ(c19u0);
        }
    }

    public ACListenerS123S0200000_20(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
