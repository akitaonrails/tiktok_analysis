package Y;

import X.C1571180qzM;
import X.C1584320rKY;
import X.EnumC1589910rTZ;
import X.InterfaceC1570900qyu;
import android.view.View;

/* JADX INFO: loaded from: classes25.dex */
public class ACListenerS57S0101000_24 implements View.OnClickListener {
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
        }
    }

    public static final void onClick$0(ACListenerS57S0101000_24 aCListenerS57S0101000_24, View view) {
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        String value = EnumC1589910rTZ.CLICK_TOP_ICON.getValue();
        c1584320rKY.getClass();
        C1584320rKY.LJ = value;
        ((InterfaceC1570900qyu) aCListenerS57S0101000_24.l0).U1(view);
        String tag = ((InterfaceC1570900qyu) aCListenerS57S0101000_24.l0).getTag();
        if (tag == null) {
            tag = "";
        }
        C1571180qzM.LIZ(aCListenerS57S0101000_24.i1, tag);
    }

    public static final void onClick$1(ACListenerS57S0101000_24 aCListenerS57S0101000_24, View view) {
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        String value = EnumC1589910rTZ.CLICK_TOP_ICON.getValue();
        c1584320rKY.getClass();
        C1584320rKY.LJ = value;
        ((InterfaceC1570900qyu) aCListenerS57S0101000_24.l0).U1(view);
        String tag = ((InterfaceC1570900qyu) aCListenerS57S0101000_24.l0).getTag();
        if (tag == null) {
            tag = "";
        }
        C1571180qzM.LIZ(aCListenerS57S0101000_24.i1, tag);
    }

    public ACListenerS57S0101000_24(InterfaceC1570900qyu interfaceC1570900qyu, int i, int i2) {
        this.$t = i2;
        this.l0 = interfaceC1570900qyu;
        this.i1 = i;
    }
}
