package Y;

import X.C0E1U;
import X.C0E48;
import X.C0E5S;
import X.C0E75;
import X.C0ELJ;
import X.C0EQI;
import X.C0EQN;
import X.C0EQO;
import X.C0ES2;
import X.C1462920oAk;
import X.C23250099c;
import X.C350440DoY;
import X.C352390Drh;
import X.C366700EZg;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1441305kZ;
import X.InterfaceC358840E5a;
import X.InterfaceC366450EYh;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: loaded from: classes6.dex */
public class AObjectS184S0300000_5 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObjectS184S0300000_5 aObjectS184S0300000_5, Object obj) {
        LiveData<C0E75> liveDataDQ;
        LiveData<C0E75> liveDataDQ2;
        InterfaceC358840E5a interfaceC358840E5aBo;
        InterfaceC358840E5a interfaceC358840E5aBo2;
        InterfaceC366450EYh interfaceC366450EYhM3 = ((C0EQI) aObjectS184S0300000_5.l0).m3();
        if (interfaceC366450EYhM3 != null) {
            interfaceC366450EYhM3.l71(((C0EQI) aObjectS184S0300000_5.l0).i4());
        }
        C350440DoY.LIZIZ((C0EQO) aObjectS184S0300000_5.l1);
        C0E48 c0e48W1 = ((C0EQI) aObjectS184S0300000_5.l0).W1();
        if (c0e48W1 != null && (interfaceC358840E5aBo2 = c0e48W1.Bo()) != null) {
            interfaceC358840E5aBo2.LIZJ((C0EQN) aObjectS184S0300000_5.l2);
        }
        C350440DoY.LIZ((C0EQO) aObjectS184S0300000_5.l1);
        C0E48 c0e48W12 = ((C0EQI) aObjectS184S0300000_5.l0).W1();
        if (c0e48W12 != null && (interfaceC358840E5aBo = c0e48W12.Bo()) != null) {
            interfaceC358840E5aBo.LIZLLL((C0EQN) aObjectS184S0300000_5.l2);
        }
        C0E5S c0e5sH3 = ((C0EQI) aObjectS184S0300000_5.l0).H3();
        if (c0e5sH3 != null && (liveDataDQ2 = c0e5sH3.dQ()) != null) {
            liveDataDQ2.removeObservers((C0EQI) aObjectS184S0300000_5.l0);
        }
        C0E5S c0e5sH32 = ((C0EQI) aObjectS184S0300000_5.l0).H3();
        if (c0e5sH32 != null && (liveDataDQ = c0e5sH32.dQ()) != null) {
            C0EQI c0eqi = (C0EQI) aObjectS184S0300000_5.l0;
            liveDataDQ.observe(c0eqi, new AObjectS240S0100000_5(c0eqi, 94));
        }
    }

    public static final void onChanged$1(AObjectS184S0300000_5 aObjectS184S0300000_5, Object obj) {
        LiveData<C0E75> liveDataDQ;
        InterfaceC358840E5a interfaceC358840E5aBo;
        InterfaceC366450EYh interfaceC366450EYhM3 = ((C0EQI) aObjectS184S0300000_5.l0).m3();
        if (interfaceC366450EYhM3 != null) {
            interfaceC366450EYhM3.MT1();
        }
        C350440DoY.LIZIZ((C0EQO) aObjectS184S0300000_5.l1);
        C0E48 c0e48W1 = ((C0EQI) aObjectS184S0300000_5.l0).W1();
        if (c0e48W1 != null && (interfaceC358840E5aBo = c0e48W1.Bo()) != null) {
            interfaceC358840E5aBo.LIZJ((C0EQN) aObjectS184S0300000_5.l2);
        }
        C0E5S c0e5sH3 = ((C0EQI) aObjectS184S0300000_5.l0).H3();
        if (c0e5sH3 != null && (liveDataDQ = c0e5sH3.dQ()) != null) {
            liveDataDQ.removeObservers((C0EQI) aObjectS184S0300000_5.l0);
        }
    }

    public static final void onChanged$2(AObjectS184S0300000_5 aObjectS184S0300000_5, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = ((View) aObjectS184S0300000_5.l0).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && !C1462920oAk.LIZJ((View) aObjectS184S0300000_5.l1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), marginLayoutParams.topMargin)) {
            marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(((C0ES2) aObjectS184S0300000_5.l2).requireActivity()) + C366700EZg.LIZ(24.0d);
            C786410Ut5.W5((View) aObjectS184S0300000_5.l0, marginLayoutParams);
        }
    }

    public static final void onChanged$3(AObjectS184S0300000_5 aObjectS184S0300000_5, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) aObjectS184S0300000_5.l0), null, null, new C352390Drh((C0ELJ) aObjectS184S0300000_5.l1, (C0E1U) aObjectS184S0300000_5.l2, null), 3);
    }

    public AObjectS184S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
