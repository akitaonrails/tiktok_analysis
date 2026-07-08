package Y;

import X.AbstractC383190F0r;
import X.C0EJX;
import X.C0F63;
import X.C0FNI;
import X.C1662060tLw;
import X.C378370EsV;
import X.C378700Et2;
import X.C380070EvF;
import X.C383200F0s;
import X.C383220F0u;
import X.C383610F2h;
import X.C384570F5z;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public class ACListenerS49S0101000_5 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS49S0101000_5 aCListenerS49S0101000_5, View view) {
        ((C0FNI) aCListenerS49S0101000_5.l0).LL.invoke(Integer.valueOf(aCListenerS49S0101000_5.i1));
    }

    public static final void onClick$1(ACListenerS49S0101000_5 aCListenerS49S0101000_5, View view) {
        ((C384570F5z) aCListenerS49S0101000_5.l0).LLLI(aCListenerS49S0101000_5.i1);
        C0F63 c0f63 = ((C384570F5z) aCListenerS49S0101000_5.l0).LLIZLLLIL;
        if (c0f63 != null) {
            c0f63.LIZIZ(aCListenerS49S0101000_5.i1, -1, false);
        }
    }

    public static final void onClick$2(ACListenerS49S0101000_5 aCListenerS49S0101000_5, View view) {
        ((C384570F5z) aCListenerS49S0101000_5.l0).LLLI(aCListenerS49S0101000_5.i1);
        C0F63 c0f63 = ((C384570F5z) aCListenerS49S0101000_5.l0).LLIZLLLIL;
        if (c0f63 != null) {
            c0f63.LIZIZ(aCListenerS49S0101000_5.i1, -1, false);
        }
    }

    public static final void onClick$3(ACListenerS49S0101000_5 aCListenerS49S0101000_5, View view) {
        C383200F0s c383200F0s = (C383200F0s) aCListenerS49S0101000_5.l0;
        if (c383200F0s.LLILZ) {
            return;
        }
        C378370EsV c378370EsV = C378370EsV.LIZ;
        C383220F0u c383220F0u = new AbstractC383190F0r() { // from class: X.0F0u
        };
        int i = c383200F0s.LLILLL;
        c378370EsV.getClass();
        C378370EsV.LIZLLL(c383220F0u, i);
        C383200F0s c383200F0s2 = (C383200F0s) aCListenerS49S0101000_5.l0;
        Function1<String, Unit> function1 = c383200F0s2.LL;
        String str = ((C378700Et2) ListProtector.get(c383200F0s2.LLILLJJLI, aCListenerS49S0101000_5.i1)).LIZIZ;
        if (str == null) {
            str = "";
        }
        function1.invoke(str);
    }

    public static final void onClick$4(ACListenerS49S0101000_5 aCListenerS49S0101000_5, View view) {
        if (C1662060tLw.LIZIZ(view)) {
            return;
        }
        ((C383610F2h) aCListenerS49S0101000_5.l0).LLILLJJLI.invoke(Integer.valueOf(aCListenerS49S0101000_5.i1));
    }

    public static final void onClick$5(ACListenerS49S0101000_5 aCListenerS49S0101000_5, View view) {
        ((C383610F2h) aCListenerS49S0101000_5.l0).LL.invoke(Integer.valueOf(aCListenerS49S0101000_5.i1));
    }

    public static final void onClick$6(ACListenerS49S0101000_5 aCListenerS49S0101000_5, View view) {
        ((C380070EvF) aCListenerS49S0101000_5.l0).LLLFZ(aCListenerS49S0101000_5.i1, true);
    }

    public static final void onClick$7(ACListenerS49S0101000_5 aCListenerS49S0101000_5, View view) {
        AwS584S0100000_5 awS584S0100000_5 = ((C0EJX) aCListenerS49S0101000_5.l0).LL;
        if (awS584S0100000_5 != null) {
            awS584S0100000_5.invoke(Integer.valueOf(aCListenerS49S0101000_5.i1));
        }
    }

    public ACListenerS49S0101000_5(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
