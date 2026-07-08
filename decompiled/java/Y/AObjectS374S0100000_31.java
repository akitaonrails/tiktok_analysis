package Y;

import X.C0FNV;
import X.C1233040iBy;
import X.C15IO;
import X.C15Q0;
import X.C20516815Py;
import X.C2344009Gk;
import X.C444960Hcc;
import X.DialogC1389620mGW;
import android.view.View;
import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AObjectS374S0100000_31 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public AObjectS374S0100000_31(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS374S0100000_31 aObjectS374S0100000_31, Object obj) {
        C15IO c15io = (C15IO) aObjectS374S0100000_31.l0;
        View view = (View) obj;
        c15io.getClass();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        boolean zLIZJ = C444960Hcc.LIZJ(c15io.LLJJIII.getContext());
        if (zLIZJ) {
            layoutParams.addRule(7, c15io.LL.getId());
        } else {
            layoutParams.addRule(5, c15io.LL.getId());
        }
        layoutParams.addRule(6, c15io.LL.getId());
        c15io.LLJJIII.addView(view, layoutParams);
        return Integer.valueOf(zLIZJ ? 1 : 0);
    }

    public static final Object invoke$1(AObjectS374S0100000_31 aObjectS374S0100000_31, Object obj) {
        ((C2344009Gk) aObjectS374S0100000_31.l0).LJFF("is_ecommerce", (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS374S0100000_31 aObjectS374S0100000_31, Object obj) {
        ((C2344009Gk) aObjectS374S0100000_31.l0).LJFF("is_ecommerce", (String) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS374S0100000_31 aObjectS374S0100000_31, Object obj) {
        C20516815Py c20516815Py = (C20516815Py) aObjectS374S0100000_31.l0;
        Integer num = (Integer) obj;
        c20516815Py.getClass();
        if (num.intValue() != 2004 && num.intValue() != 2002) {
            if (num.intValue() == 2003) {
                C1233040iBy c1233040iBy = new C1233040iBy(c20516815Py.LJFF.LIZIZ);
                c1233040iBy.LIZJ(c20516815Py.LJFF.LIZIZ.getResources().getString(2131837863));
                c1233040iBy.LIZLLL();
            } else if (num.intValue() == 2006) {
                C1233040iBy c1233040iBy2 = new C1233040iBy(c20516815Py.LJFF.LIZIZ);
                c1233040iBy2.LIZJ(c20516815Py.LJFF.LIZIZ.getResources().getString(2131834349));
                c1233040iBy2.LIZLLL();
            } else {
                C1233040iBy c1233040iBy3 = new C1233040iBy(c20516815Py.LJFF.LIZIZ);
                c1233040iBy3.LIZJ(c20516815Py.LJFF.LIZIZ.getResources().getString(2131837862));
                c1233040iBy3.LIZLLL();
            }
        } else {
            C1233040iBy c1233040iBy4 = new C1233040iBy(c20516815Py.LJFF.LIZIZ);
            c1233040iBy4.LIZJ(c20516815Py.LJFF.LIZIZ.getResources().getString(2131837864));
            c1233040iBy4.LIZLLL();
        }
        DialogC1389620mGW dialogC1389620mGW = c20516815Py.LJFF.LIZ;
        if (dialogC1389620mGW != null) {
            C0FNV.LIZ(dialogC1389620mGW);
        }
        C15Q0 c15q0 = c20516815Py.LJFF.LJIIIIZZ;
        if (c15q0 != null) {
            c15q0.LIZ(num.intValue(), null);
        }
        return null;
    }
}
