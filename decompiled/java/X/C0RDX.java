package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS137S0201000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0RDX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RDX {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C692160RDa());

    public static final void LIZIZ(InterfaceC691660RBc interfaceC691660RBc) {
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            long jNanoTime = System.nanoTime();
            C0RUC.LJFF(interfaceC691660RBc, new AwS555S0100000_11(interfaceC691660RBc, 1532));
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            HashMap map = new HashMap();
            map.put("host", interfaceC691660RBc.getClass().getCanonicalName());
            map.put("lifecycle", "onHolderUnselected");
            map.put("duration", String.valueOf(jNanoTime2));
            C20684815ws.LJIILLIIL("infra_product_arch_lib_track", map);
            return;
        }
        C0RUC.LJFF(interfaceC691660RBc, new C0RDZ(interfaceC691660RBc));
    }

    public static final void LIZ(InterfaceC691660RBc interfaceC691660RBc, int i, Aweme aweme) {
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            long jNanoTime = System.nanoTime();
            C0RUC.LJFF(interfaceC691660RBc, new AwS137S0201000_11(interfaceC691660RBc, i, aweme, 1));
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            HashMap map = new HashMap();
            map.put("host", interfaceC691660RBc.getClass().getCanonicalName());
            map.put("lifecycle", "onHolderSelected");
            map.put("duration", String.valueOf(jNanoTime2));
            C20684815ws.LJIILLIIL("infra_product_arch_lib_track", map);
            return;
        }
        C0RUC.LJFF(interfaceC691660RBc, new C0RC5(interfaceC691660RBc, i, aweme));
    }

    public static final <T> void LIZJ(InterfaceC691660RBc interfaceC691660RBc, String str, final Function1<? super T, Unit> function1) {
        EventCenter eventCenter;
        C0RJN c0rjnLIZIZ = interfaceC691660RBc.jm().LIZIZ();
        if (c0rjnLIZIZ != null && (eventCenter = c0rjnLIZIZ.LIZIZ) != null) {
            eventCenter.yQ2(str, new Observer() { // from class: X.0RDY
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Object obj2;
                    C0RD4 c0rd4 = (C0RD4) obj;
                    Function1<T, Unit> function12 = function1;
                    if (c0rd4 == null || (obj2 = c0rd4.LIZIZ) == null) {
                        obj2 = null;
                    }
                    function12.invoke((T) obj2);
                }
            }, false);
        }
    }
}
