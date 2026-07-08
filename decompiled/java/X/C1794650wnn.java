package X;

import Y.ARunnableS17S0500000_27;
import Y.ARunnableS35S0400000_27;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0wnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794650wnn implements InterfaceC1794450wnT {
    public static boolean LIZLLL() {
        return C786410Ut5.u3() == Looper.getMainLooper().getThread();
    }

    public static void LIZ(C1792840wks c1792840wks, InterfaceC1794730wnv interfaceC1794730wnv, C1793950wmf c1793950wmf) {
        InterfaceC1795230woj interfaceC1795230wojLIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result is:");
        sbLIZ.append(c1792840wks.toString());
        sbLIZ.append(" payInfo is:");
        sbLIZ.append(c1793950wmf);
        C2188811AlT.LIZIZ(sbLIZ);
        interfaceC1795230wojLIZ.getClass();
        int i = C1794270wnB.LIZ[c1792840wks.LJIIL.ordinal()];
        if (i != 1 && i != 2) {
            if (interfaceC1794730wnv != null) {
                interfaceC1794730wnv.LJIIIZ(c1792840wks, c1793950wmf);
            }
        } else {
            if (interfaceC1794730wnv == null) {
                return;
            }
            interfaceC1794730wnv.LJI(c1792840wks, c1793950wmf);
        }
    }

    public static void LIZJ(C1792840wks c1792840wks, InterfaceC1794730wnv interfaceC1794730wnv, List list) {
        JSONArray jSONArray;
        String string;
        if (list != null) {
            jSONArray = new JSONArray();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(((AbstractC1791620wiu) it2.next()).LIZ);
            }
        } else {
            jSONArray = null;
        }
        InterfaceC1795230woj interfaceC1795230wojLIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query result  is:");
        if (jSONArray == null) {
            string = "null";
        } else {
            string = jSONArray.toString();
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        interfaceC1795230wojLIZ.getClass();
        if (interfaceC1794730wnv != null) {
            interfaceC1794730wnv.LJ(c1792840wks, list);
        }
    }

    public final void LJ(C1792840wks c1792840wks, InterfaceC1794730wnv interfaceC1794730wnv, C1793950wmf c1793950wmf) {
        C1794020wmm.LIZ(c1792840wks);
        if (LIZLLL()) {
            LIZ(c1792840wks, interfaceC1794730wnv, c1793950wmf);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS35S0400000_27(this, c1792840wks, c1793950wmf, interfaceC1794730wnv, 5));
        }
    }

    public final void LJII(C1792840wks c1792840wks, InterfaceC1794730wnv interfaceC1794730wnv, List list) {
        if (LIZLLL()) {
            LIZJ(c1792840wks, interfaceC1794730wnv, list);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS35S0400000_27(this, c1792840wks, list, interfaceC1794730wnv, 7));
        }
    }

    public static void LIZIZ(C1792840wks c1792840wks, InterfaceC1794730wnv interfaceC1794730wnv, EnumC1791830wjF enumC1791830wjF, List list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(((AbstractC1791620wiu) it2.next()).LIZ);
            }
        }
        InterfaceC1795230woj interfaceC1795230wojLIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("paymentMethod is ");
        sbLIZ.append(enumC1791830wjF.channelName);
        sbLIZ.append("query result  is:");
        sbLIZ.append(jSONArray.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        interfaceC1795230wojLIZ.getClass();
        if (interfaceC1794730wnv != null) {
            interfaceC1794730wnv.LJIIJ(enumC1791830wjF, c1792840wks, list);
        }
    }

    public final void LJFF(C1792840wks c1792840wks, InterfaceC1794730wnv interfaceC1794730wnv, EnumC1791830wjF enumC1791830wjF, List list) {
        if (LIZLLL()) {
            if (interfaceC1794730wnv != null) {
                interfaceC1794730wnv.LJIIIIZZ(c1792840wks, list);
                return;
            }
            return;
        }
        ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS35S0400000_27(this, enumC1791830wjF, c1792840wks, list, interfaceC1794730wnv, 6));
    }

    public final void LJI(C1792840wks c1792840wks, InterfaceC1794730wnv interfaceC1794730wnv, EnumC1791830wjF enumC1791830wjF, List list) {
        if (LIZLLL()) {
            LIZIZ(c1792840wks, interfaceC1794730wnv, enumC1791830wjF, list);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS17S0500000_27(this, enumC1791830wjF, c1792840wks, list, interfaceC1794730wnv, 3));
        }
    }
}
