package X;

import Y.AObserverS222S0100000_18;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173980gei {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends BaseComponentData> String LIZ(InterfaceC1173970geh<T> interfaceC1173970geh) {
        AbstractC738140SxQ abstractC738140SxQ;
        if (!(interfaceC1173970geh instanceof AbstractC738140SxQ) || (abstractC738140SxQ = (AbstractC738140SxQ) interfaceC1173970geh) == null) {
            return null;
        }
        return abstractC738140SxQ.assemTagInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends BaseComponentData> boolean LIZIZ(InterfaceC1173970geh<T> interfaceC1173970geh) {
        AbstractC738140SxQ abstractC738140SxQ;
        if (!(interfaceC1173970geh instanceof ReusedAssem)) {
            LifecycleOwner parent = null;
            if ((interfaceC1173970geh instanceof UIAssem) && (abstractC738140SxQ = (AbstractC738140SxQ) interfaceC1173970geh) != null) {
                parent = abstractC738140SxQ.getParent();
            }
            if (!(parent instanceof ReusedAssem)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(InterfaceC1173970geh interfaceC1173970geh) {
        AbstractC738140SxQ abstractC738140SxQ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        Map<String, EventModel> mapFN2 = interfaceC1173970geh.FN2();
        if (mapFN2 != null && (interfaceC1173970geh instanceof AbstractC738140SxQ) && (abstractC738140SxQ = (AbstractC738140SxQ) interfaceC1173970geh) != null && (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(abstractC738140SxQ)) != null) {
            C1554960qZC.LIZ(interfaceC665370Q7zLJIIL, new C07ZK(mapFN2), C07ZK.class, "source_default_key");
        }
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(interfaceC1173970geh, 2240));
    }

    public static <T extends BaseComponentData> void LIZJ(InterfaceC1173970geh<T> interfaceC1173970geh, View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        interfaceC1173970geh.La(view, interfaceC665370Q7z);
        if (!interfaceC1173970geh.yK1() || interfaceC1173970geh.nJ()) {
            InterfaceC1181010gq3 interfaceC1181010gq3BK2 = interfaceC1173970geh.BK2();
            String str = "";
            if (interfaceC1181010gq3BK2 != null) {
                String strS2 = interfaceC1173970geh.S2();
                if (strS2 == null) {
                    strS2 = "";
                }
                interfaceC1181010gq3BK2.Ts(strS2, interfaceC1173970geh, new AObserverS222S0100000_18(interfaceC1173970geh, 15));
            }
            InterfaceC1181010gq3 interfaceC1181010gq3BK22 = interfaceC1173970geh.BK2();
            if (interfaceC1181010gq3BK22 != null) {
                String strS22 = interfaceC1173970geh.S2();
                if (strS22 != null) {
                    str = strS22;
                }
                interfaceC1181010gq3BK22.qv(str, interfaceC1173970geh, new AObserverS222S0100000_18(interfaceC1173970geh, 16));
            }
        }
        if (!interfaceC1173970geh.yK1()) {
            C2211631BhB.LJ(view, new AwS597S0100000_18((InterfaceC1173970geh) interfaceC1173970geh, 565));
        }
        C1180170goh.LIZLLL().LIZ(new AwS562S0100000_18(interfaceC1173970geh, 2238));
    }
}
