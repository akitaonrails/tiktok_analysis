package Y;

import X.InterfaceC683010Qqh;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class ACListenerS82S1100000_10 implements View.OnClickListener {
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

    public static final void onClick$0(ACListenerS82S1100000_10 aCListenerS82S1100000_10, View view) {
        ((InterfaceC683010Qqh) aCListenerS82S1100000_10.l1).e0(aCListenerS82S1100000_10.s0);
    }

    public static final void onClick$1(ACListenerS82S1100000_10 aCListenerS82S1100000_10, View view) {
        ((Function1) aCListenerS82S1100000_10.l1).invoke(aCListenerS82S1100000_10.s0);
    }

    public ACListenerS82S1100000_10(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
