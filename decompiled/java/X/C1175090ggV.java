package X;

import X.InterfaceC1175110ggX;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashClickConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0ggV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175090ggV<T extends InterfaceC1175110ggX> {
    public static void LIZIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        C1176020gi0.LIZ("poi_common_card", viewOnAttachStateChangeListenerC20604515jv);
        C1176020gi0.LIZ("poi_hotel_card", viewOnAttachStateChangeListenerC20604515jv);
        C1176020gi0.LIZ("poi_regional_card", viewOnAttachStateChangeListenerC20604515jv);
    }

    public static List LIZ(List list, Function1 function1, int i, Function1 function12, Function1 function13) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                InterfaceC1175110ggX interfaceC1175110ggX = (InterfaceC1175110ggX) obj;
                String strCellId = interfaceC1175110ggX.cellId();
                Object objInvoke = function1.invoke(interfaceC1175110ggX);
                SlashClickConfig slashClickConfig = (SlashClickConfig) function12.invoke(Integer.valueOf(i2));
                arrayList.add(new C1175980ghw(new SlashCellModel("cell", strCellId, null, null, null, (List) function13.invoke(Integer.valueOf(i2)), slashClickConfig, null, i + i2, objInvoke, AFwS256S0000000_18.get$arr$(749)), null, null, 14));
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
