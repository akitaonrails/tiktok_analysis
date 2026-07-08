package Y;

import X.C446060HeO;
import X.C446080HeQ;
import X.InterfaceC1631620sYq;
import android.view.View;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class ACListenerS5S0220000_6 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

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

    public static final void onClick$0(ACListenerS5S0220000_6 aCListenerS5S0220000_6, View view) {
        InterfaceC1631620sYq<? super C446060HeO, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq = ((C446080HeQ) aCListenerS5S0220000_6.l0).LLILZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke((C446060HeO) aCListenerS5S0220000_6.l1, Boolean.valueOf(aCListenerS5S0220000_6.z2), Boolean.valueOf(aCListenerS5S0220000_6.z3));
        }
    }

    public static final void onClick$1(ACListenerS5S0220000_6 aCListenerS5S0220000_6, View view) {
        InterfaceC1631620sYq<? super C446060HeO, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq = ((C446080HeQ) aCListenerS5S0220000_6.l0).LLILZ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke((C446060HeO) aCListenerS5S0220000_6.l1, Boolean.valueOf(aCListenerS5S0220000_6.z2), Boolean.valueOf(aCListenerS5S0220000_6.z3));
        }
    }

    public ACListenerS5S0220000_6(C446080HeQ c446080HeQ, C446060HeO c446060HeO, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l0 = c446080HeQ;
        this.l1 = c446060HeO;
        this.z2 = z;
        this.z3 = z2;
    }
}
