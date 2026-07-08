package Y;

import X.C1643220srY;
import X.C1643290srf;
import X.C1643300srg;
import X.C1643310srh;
import X.C1643640ssE;
import X.C1643650ssF;
import X.C1643670ssH;
import X.C1643690ssJ;
import X.C786410Ut5;
import X.EnumC1154660g9Y;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class ACListenerS24S0301000_25 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onClick$0(ACListenerS24S0301000_25 aCListenerS24S0301000_25, View view) {
        boolean z;
        C1643290srf c1643290srf = (C1643290srf) aCListenerS24S0301000_25.l0;
        C1643300srg c1643300srg = (C1643300srg) aCListenerS24S0301000_25.l1;
        C1643310srh c1643310srh = (C1643310srh) aCListenerS24S0301000_25.l2;
        c1643290srf.getClass();
        if (c1643300srg.LJFF != null && c1643300srg.LJIIIZ == EnumC1154660g9Y.REMOTE) {
            C786410Ut5.H1(c1643310srh.LLILLJJLI, 0);
        } else {
            C786410Ut5.H1(c1643310srh.LLILLJJLI, 8);
        }
        C1643290srf c1643290srf2 = (C1643290srf) aCListenerS24S0301000_25.l0;
        Function1<C1643220srY, Unit> function1 = c1643290srf2.LLILZIL;
        String str = c1643290srf2.LLILLJJLI;
        int i = c1643290srf2.LL;
        int i2 = aCListenerS24S0301000_25.i3;
        C1643300srg c1643300srg2 = (C1643300srg) aCListenerS24S0301000_25.l1;
        if ((!c1643290srf2.LLILZ.isEmpty()) && !((C1643300srg) aCListenerS24S0301000_25.l1).LJIIJ) {
            z = true;
        } else {
            z = false;
        }
        function1.invoke(new C1643220srY(str, i, str, i2, c1643300srg2, z));
    }

    public static final void onClick$1(ACListenerS24S0301000_25 aCListenerS24S0301000_25, View view) {
        int i;
        boolean z;
        int i2 = ((C1643640ssE) aCListenerS24S0301000_25.l0).LLILLL;
        int bindingAdapterPosition = ((C1643650ssF) aCListenerS24S0301000_25.l1).getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        C1643640ssE c1643640ssE = (C1643640ssE) aCListenerS24S0301000_25.l0;
        if (bindingAdapterPosition == i2) {
            i = -1;
        } else {
            i = bindingAdapterPosition;
        }
        c1643640ssE.LLILLL = i;
        if (i2 != -1) {
            c1643640ssE.notifyItemChanged(i2, "sel");
        }
        if (bindingAdapterPosition != i2) {
            ((C1643640ssE) aCListenerS24S0301000_25.l0).notifyItemChanged(bindingAdapterPosition, "sel");
        }
        C1643640ssE c1643640ssE2 = (C1643640ssE) aCListenerS24S0301000_25.l0;
        if (c1643640ssE2.LLILLL == bindingAdapterPosition) {
            z = true;
        } else {
            z = false;
        }
        c1643640ssE2.LLILLJJLI.invoke((AIPlaygroundChipsModel) aCListenerS24S0301000_25.l2, Integer.valueOf(aCListenerS24S0301000_25.i3), Boolean.valueOf(z));
    }

    public static final void onClick$2(ACListenerS24S0301000_25 aCListenerS24S0301000_25, View view) {
        int i;
        boolean z;
        int i2 = ((C1643670ssH) aCListenerS24S0301000_25.l0).LLILLL;
        int bindingAdapterPosition = ((C1643690ssJ) aCListenerS24S0301000_25.l1).getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        C1643670ssH c1643670ssH = (C1643670ssH) aCListenerS24S0301000_25.l0;
        if (bindingAdapterPosition == i2) {
            i = -1;
        } else {
            i = bindingAdapterPosition;
        }
        c1643670ssH.LLILLL = i;
        if (i2 != -1) {
            c1643670ssH.notifyItemChanged(i2, "sel");
        }
        if (bindingAdapterPosition != i2) {
            ((C1643670ssH) aCListenerS24S0301000_25.l0).notifyItemChanged(bindingAdapterPosition, "sel");
        }
        C1643670ssH c1643670ssH2 = (C1643670ssH) aCListenerS24S0301000_25.l0;
        if (c1643670ssH2.LLILLL == bindingAdapterPosition) {
            z = true;
        } else {
            z = false;
        }
        c1643670ssH2.LLILLJJLI.invoke((AIPlaygroundChipsModel) aCListenerS24S0301000_25.l2, Integer.valueOf(aCListenerS24S0301000_25.i3), Boolean.valueOf(z));
    }

    public ACListenerS24S0301000_25(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
