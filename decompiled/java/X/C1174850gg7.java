package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import com.ss.android.ugc.aweme.slash.data.Node;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0gg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174850gg7 {
    public static <T extends BaseComponentData> InterfaceC1181010gq3 LIZ(InterfaceC1173990gej<T> interfaceC1173990gej) {
        C128Y c128yLJI = C724240Sb0.LJI(interfaceC1173990gej);
        if (c128yLJI instanceof InterfaceC1181010gq3) {
            return (InterfaceC1181010gq3) c128yLJI;
        }
        return null;
    }

    public static <T extends BaseComponentData> String LIZIZ(InterfaceC1173990gej<T> interfaceC1173990gej) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = interfaceC1173990gej.BK2();
        Integer numValueOf2 = null;
        if (interfaceC1181010gq3BK2 != null) {
            numValueOf = Integer.valueOf(C1175120ggY.LIZJ(Integer.valueOf(interfaceC1181010gq3BK2.Lg())));
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('_');
        String strS2 = interfaceC1173990gej.S2();
        if (strS2 == null) {
            strS2 = "";
        }
        sbLIZ.append(strS2);
        sbLIZ.append('_');
        InterfaceC1181010gq3 interfaceC1181010gq3BK22 = interfaceC1173990gej.BK2();
        if (interfaceC1181010gq3BK22 != null) {
            numValueOf2 = Integer.valueOf(C1175120ggY.LIZJ(Integer.valueOf(interfaceC1181010gq3BK22.hi(interfaceC1173990gej.S2()))));
        }
        sbLIZ.append(numValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static <T extends BaseComponentData> T LIZJ(InterfaceC1173990gej<T> interfaceC1173990gej) {
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = interfaceC1173990gej.BK2();
        if (interfaceC1181010gq3BK2 != null) {
            String strS2 = interfaceC1173990gej.S2();
            if (strS2 == null) {
                strS2 = "";
            }
            return (T) interfaceC1181010gq3BK2.qw(strS2);
        }
        return null;
    }

    public static <T extends BaseComponentData> Map<String, EventModel> LIZLLL(InterfaceC1173990gej<T> interfaceC1173990gej) {
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = interfaceC1173990gej.BK2();
        if (interfaceC1181010gq3BK2 != null) {
            String strS2 = interfaceC1173990gej.S2();
            if (strS2 == null) {
                strS2 = "";
            }
            return interfaceC1181010gq3BK2.Hm(strS2);
        }
        return null;
    }

    public static <T extends BaseComponentData, CONTEXT> C1173300gdc<CONTEXT> LJ(InterfaceC1173990gej<T> interfaceC1173990gej) {
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = interfaceC1173990gej.BK2();
        if (interfaceC1181010gq3BK2 != null) {
            return interfaceC1181010gq3BK2.qr0();
        }
        return null;
    }

    public static <T extends BaseComponentData> String LJFF(InterfaceC1173990gej<T> interfaceC1173990gej) {
        Node.Config config;
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = interfaceC1173990gej.BK2();
        if (interfaceC1181010gq3BK2 != null) {
            String strS2 = interfaceC1173990gej.S2();
            if (strS2 == null) {
                strS2 = "";
            }
            C1180920gpu c1180920gpuGd0 = interfaceC1181010gq3BK2.Gd0(strS2);
            if (c1180920gpuGd0 != null && (config = c1180920gpuGd0.LJII) != null) {
                return config.bizName;
            }
            return null;
        }
        return null;
    }

    public static <T extends BaseComponentData> void LJII(InterfaceC1173990gej<T> interfaceC1173990gej) {
        C1174000gek c1174000gekBr;
        InterfaceC1181010gq3 interfaceC1181010gq3BK2 = interfaceC1173990gej.BK2();
        if (interfaceC1181010gq3BK2 != null && (c1174000gekBr = interfaceC1181010gq3BK2.Br()) != null) {
            c1174000gekBr.LJJI(interfaceC1173990gej, interfaceC1173990gej.B());
        }
    }

    public static <T extends BaseComponentData> void LJI(InterfaceC1173990gej<T> interfaceC1173990gej, View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        for (View view2 : (ArrayList) C1174860gg8.LIZ(view, AFwS256S0000000_18.get$arr$(751))) {
            if (view2 instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                C1196320hEk.LIZIZ((RecyclerView) view2, interfaceC665370Q7z);
            }
        }
        C1554960qZC.LIZ(interfaceC665370Q7z, new AnonymousClass0161(interfaceC1173990gej.S2()), AnonymousClass0161.class, "source_default_key");
    }
}
