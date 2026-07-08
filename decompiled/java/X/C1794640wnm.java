package X;

import Y.ARunnableS30S1200000_27;
import Y.ARunnableS35S0400000_27;
import Y.ARunnableS60S0300000_27;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0wnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794640wnm implements InterfaceC1794460wnU {
    public InterfaceC1794730wnv LIZ;
    public Set<InterfaceC1794730wnv> LIZIZ;

    public static boolean LJII() {
        return C786410Ut5.u3() == Looper.getMainLooper().getThread();
    }

    public final void LIZLLL(C1793950wmf c1793950wmf) {
        InterfaceC1795230woj interfaceC1795230wojLIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("payInfo is:");
        sbLIZ.append(c1793950wmf);
        C2188811AlT.LIZIZ(sbLIZ);
        interfaceC1795230wojLIZ.getClass();
        Set<InterfaceC1794730wnv> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC1794730wnv> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        } else {
            InterfaceC1794730wnv interfaceC1794730wnv = this.LIZ;
            if (interfaceC1794730wnv != null) {
                interfaceC1794730wnv.LIZ();
            }
        }
    }

    public final void LIZ(EnumC1791830wjF enumC1791830wjF, String str) {
        InterfaceC1795230woj interfaceC1795230wojLIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on billing config callback , countryCode is:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        interfaceC1795230wojLIZ.getClass();
        Set<InterfaceC1794730wnv> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC1794730wnv> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(enumC1791830wjF, str);
            }
        } else {
            InterfaceC1794730wnv interfaceC1794730wnv = this.LIZ;
            if (interfaceC1794730wnv != null) {
                interfaceC1794730wnv.LIZJ(enumC1791830wjF, str);
            }
        }
    }

    public final void LIZIZ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks) {
        InterfaceC1795230woj interfaceC1795230wojLIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on init callback , init result is:");
        sbLIZ.append(c1792840wks.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        interfaceC1795230wojLIZ.getClass();
        Set<InterfaceC1794730wnv> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC1794730wnv> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LJII(enumC1791830wjF, c1792840wks);
            }
        } else {
            InterfaceC1794730wnv interfaceC1794730wnv = this.LIZ;
            if (interfaceC1794730wnv != null) {
                interfaceC1794730wnv.LJII(enumC1791830wjF, c1792840wks);
            }
        }
    }

    public final void LIZJ(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
        InterfaceC1795230woj interfaceC1795230wojLIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result is:");
        sbLIZ.append(c1792840wks.toString());
        sbLIZ.append(" payInfo is:");
        sbLIZ.append(c1793950wmf);
        C2188811AlT.LIZIZ(sbLIZ);
        interfaceC1795230wojLIZ.getClass();
        int i = C1794280wnC.LIZ[c1792840wks.LJIIL.ordinal()];
        if (i != 1 && i != 2) {
            Set<InterfaceC1794730wnv> set = this.LIZIZ;
            if (set != null) {
                Iterator<InterfaceC1794730wnv> it2 = set.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIIZ(c1792840wks, c1793950wmf);
                }
                return;
            } else {
                InterfaceC1794730wnv interfaceC1794730wnv = this.LIZ;
                if (interfaceC1794730wnv != null) {
                    interfaceC1794730wnv.LJIIIZ(c1792840wks, c1793950wmf);
                    return;
                }
                return;
            }
        }
        Set<InterfaceC1794730wnv> set2 = this.LIZIZ;
        if (set2 != null) {
            Iterator<InterfaceC1794730wnv> it3 = set2.iterator();
            while (it3.hasNext()) {
                it3.next().LJI(c1792840wks, c1793950wmf);
            }
        } else {
            InterfaceC1794730wnv interfaceC1794730wnv2 = this.LIZ;
            if (interfaceC1794730wnv2 != null) {
                interfaceC1794730wnv2.LJI(c1792840wks, c1793950wmf);
            }
        }
    }

    public final void LJI(C1792840wks c1792840wks, List<AbstractC1791620wiu> list) {
        JSONArray jSONArray;
        String string;
        if (list != null) {
            jSONArray = new JSONArray();
            Iterator<AbstractC1791620wiu> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().LIZ);
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
        Set<InterfaceC1794730wnv> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC1794730wnv> it3 = set.iterator();
            while (it3.hasNext()) {
                it3.next().LJ(c1792840wks, list);
            }
        } else {
            InterfaceC1794730wnv interfaceC1794730wnv = this.LIZ;
            if (interfaceC1794730wnv != null) {
                interfaceC1794730wnv.LJ(c1792840wks, list);
            }
        }
    }

    public final void LJIIIIZZ(EnumC1791830wjF enumC1791830wjF, String str) {
        if (LJII()) {
            LIZ(enumC1791830wjF, str);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS30S1200000_27(this, enumC1791830wjF, str, 5));
        }
    }

    public final void LJIIIZ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks) {
        if (LJII()) {
            LIZIZ(enumC1791830wjF, c1792840wks);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS60S0300000_27(this, enumC1791830wjF, c1792840wks, 13));
        }
    }

    public final void LJIIJ(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
        C1794020wmm.LIZ(c1792840wks);
        if (LJII()) {
            LIZJ(c1792840wks, c1793950wmf);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS60S0300000_27(this, c1792840wks, c1793950wmf, 12));
        }
    }

    public final void LJIILIIL(C1792840wks c1792840wks, List<AbstractC1791620wiu> list) {
        if (LJII()) {
            LJI(c1792840wks, list);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS60S0300000_27(this, c1792840wks, list, 14));
        }
    }

    public final void LJ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List<AbstractC1794600wni> list) {
        Set<InterfaceC1794730wnv> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC1794730wnv> it2 = set.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIIIZZ(c1792840wks, list);
            }
        } else {
            InterfaceC1794730wnv interfaceC1794730wnv = this.LIZ;
            if (interfaceC1794730wnv != null) {
                interfaceC1794730wnv.LJIIIIZZ(c1792840wks, list);
            }
        }
    }

    public final void LJFF(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List<AbstractC1791620wiu> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<AbstractC1791620wiu> it2 = list.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().LIZ);
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
        Set<InterfaceC1794730wnv> set = this.LIZIZ;
        if (set != null) {
            Iterator<InterfaceC1794730wnv> it3 = set.iterator();
            while (it3.hasNext()) {
                it3.next().LJIIJ(enumC1791830wjF, c1792840wks, list);
            }
        } else {
            InterfaceC1794730wnv interfaceC1794730wnv = this.LIZ;
            if (interfaceC1794730wnv != null) {
                interfaceC1794730wnv.LJIIJ(enumC1791830wjF, c1792840wks, list);
            }
        }
    }

    public final void LJIIJJI(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List<AbstractC1794600wni> list) {
        if (LJII()) {
            LJ(enumC1791830wjF, c1792840wks, list);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS35S0400000_27(this, enumC1791830wjF, c1792840wks, list, 9));
        }
    }

    public final void LJIIL(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List<AbstractC1791620wiu> list) {
        if (LJII()) {
            LJFF(enumC1791830wjF, c1792840wks, list);
        } else {
            ((C1794830wo5) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZJ()).LIZIZ.execute(new ARunnableS35S0400000_27(this, enumC1791830wjF, c1792840wks, list, 8));
        }
    }
}
