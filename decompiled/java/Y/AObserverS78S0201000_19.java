package Y;

import X.AbstractC1225780i0G;
import X.C1224600hyM;
import X.C1226050i0h;
import X.C1440005kM;
import X.C2188811AlT;
import X.C443120HZe;
import X.C736500Sum;
import X.DialogInterfaceOnDismissListenerC1226010i0d;
import X.EnumC1227730i3P;
import X.InterfaceC1226510i1R;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* JADX INFO: loaded from: classes20.dex */
public class AObserverS78S0201000_19 implements Observer {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onChanged$0(AObserverS78S0201000_19 aObserverS78S0201000_19, Object obj) {
        C443120HZe c443120HZe = (C443120HZe) obj;
        int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
        ((Number) c443120HZe.getSecond()).floatValue();
        int iIntValue2 = ((Number) c443120HZe.getThird()).intValue();
        if (iIntValue == ((ScrollSwitchStateManager) aObserverS78S0201000_19.l1).EQ2("page_feed")) {
            DetailPageComponent detailPageComponent = (DetailPageComponent) aObserverS78S0201000_19.l0;
            if (!detailPageComponent.LLJLLIL) {
                detailPageComponent.LLJLLIL = true;
                C1440005kM.LIZ(new C736500Sum());
            }
            if (iIntValue2 > aObserverS78S0201000_19.i2) {
                DetailFragmentPanel detailFragmentPanel = ((DetailPageComponent) aObserverS78S0201000_19.l0).LLJL;
                if (detailFragmentPanel != null) {
                    detailFragmentPanel.h0(false);
                    return;
                }
                return;
            }
            DetailFragmentPanel detailFragmentPanel2 = ((DetailPageComponent) aObserverS78S0201000_19.l0).LLJL;
            if (detailFragmentPanel2 == null) {
                return;
            }
            detailFragmentPanel2.h0(true);
        }
    }

    public static final void onChanged$1(AObserverS78S0201000_19 aObserverS78S0201000_19, Object obj) {
        boolean z;
        String strLIZIZ;
        DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d;
        String str;
        DialogInterfaceOnDismissListenerC1226010i0d dialogInterfaceOnDismissListenerC1226010i0d2;
        Integer num = (Integer) obj;
        InterfaceC1226510i1R interfaceC1226510i1R = (InterfaceC1226510i1R) aObserverS78S0201000_19.l0;
        EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
        if (num.intValue() >= aObserverS78S0201000_19.i2) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1226050i0h c1226050i0h = (C1226050i0h) aObserverS78S0201000_19.l1;
        int iIntValue = num.intValue();
        String str2 = "Confirm";
        if (iIntValue <= 0) {
            AbstractC1225780i0G abstractC1225780i0GLJJJJLL = c1226050i0h.LLILLJJLI.LJJJJLL();
            if ((abstractC1225780i0GLJJJJLL instanceof DialogInterfaceOnDismissListenerC1226010i0d) && (dialogInterfaceOnDismissListenerC1226010i0d2 = (DialogInterfaceOnDismissListenerC1226010i0d) abstractC1225780i0GLJJJJLL) != null && (strLIZIZ = dialogInterfaceOnDismissListenerC1226010i0d2.LLILZLL) != null) {
            }
            interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P, boolValueOf, str2, Boolean.TRUE, (Boolean) null), false);
        }
        c1226050i0h.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        AbstractC1225780i0G abstractC1225780i0GLJJJJLL2 = c1226050i0h.LLILLJJLI.LJJJJLL();
        if ((abstractC1225780i0GLJJJJLL2 instanceof DialogInterfaceOnDismissListenerC1226010i0d) && (dialogInterfaceOnDismissListenerC1226010i0d = (DialogInterfaceOnDismissListenerC1226010i0d) abstractC1225780i0GLJJJJLL2) != null && (str = dialogInterfaceOnDismissListenerC1226010i0d.LLILZLL) != null) {
            str2 = str;
        }
        sbLIZ.append(str2);
        sbLIZ.append('(');
        sbLIZ.append(iIntValue);
        sbLIZ.append(')');
        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        str2 = strLIZIZ;
        interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P, boolValueOf, str2, Boolean.TRUE, (Boolean) null), false);
    }

    public static final void onChanged$2(AObserverS78S0201000_19 aObserverS78S0201000_19, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        InterfaceC1226510i1R interfaceC1226510i1R = (InterfaceC1226510i1R) aObserverS78S0201000_19.l0;
        EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
        if (num.intValue() >= aObserverS78S0201000_19.i2) {
            z = true;
        } else {
            z = false;
        }
        interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P, Boolean.valueOf(z), ((Fragment) aObserverS78S0201000_19.l1).getString(2131856072, num), Boolean.TRUE, (Boolean) null), false);
    }

    public AObserverS78S0201000_19(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
