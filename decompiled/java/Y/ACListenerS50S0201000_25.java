package Y;

import X.C1628270sTR;
import X.C1629110sUn;
import X.C1630500sX2;
import X.C1643070srJ;
import X.C1643080srK;
import X.C1643220srY;
import X.C2188811AlT;
import X.InterfaceC1626470sQX;
import android.view.View;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class ACListenerS50S0201000_25 implements View.OnClickListener {
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

    public static final void onClick$0(ACListenerS50S0201000_25 aCListenerS50S0201000_25, View view) {
        Function1<C1643220srY, Unit> function1 = ((C1643070srJ) aCListenerS50S0201000_25.l0).LLILZ;
        String str = ((C1643080srK) aCListenerS50S0201000_25.l1).LIZ;
        function1.invoke(new C1643220srY(str, aCListenerS50S0201000_25.i2, str, -1, null));
    }

    public static final void onClick$1(ACListenerS50S0201000_25 aCListenerS50S0201000_25, View view) {
        if (aCListenerS50S0201000_25.i2 >= ((ArrayList) ((C1630500sX2) aCListenerS50S0201000_25.l0).LLILZIL).size()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on item click: position=");
        sbLIZ.append(aCListenerS50S0201000_25.i2);
        sbLIZ.append(" effect=");
        sbLIZ.append(C1629110sUn.LIZ((InterfaceC1626470sQX) aCListenerS50S0201000_25.l1).getName());
        C1628270sTR.LIZIZ("CarouselRecyclerViewAdapter", C2188811AlT.LIZIZ(sbLIZ));
        ((C1630500sX2) aCListenerS50S0201000_25.l0).LL.invoke(Integer.valueOf(aCListenerS50S0201000_25.i2), (InterfaceC1626470sQX) aCListenerS50S0201000_25.l1);
    }

    public ACListenerS50S0201000_25(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
