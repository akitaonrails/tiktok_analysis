package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1BeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2209791BeD extends AbstractC20103413lI {
    public static final C2192191Aqv LIZLLL = new C08UT<InterfaceC2209561Bdq>() { // from class: X.1Aqv
        @Override // X.C08UT
        public final Object LIZ() {
            return new C2209791BeD() { // from class: X.13lJ
                @Override // X.AbstractC20103413lI
                public final void LJIJI(int i, int i2, List<String> list, Throwable th, String str, Object... objArr) {
                    List<String> list2;
                    if (C20103613lK.LIZ.isEmpty() && ((ConcurrentHashMap) C20103613lK.LIZIZ).isEmpty()) {
                        return;
                    }
                    C20103313lH c20103313lH = new C20103313lH();
                    C20103113lF c20103113lF = c20103313lH.LIZ;
                    c20103113lF.LIZLLL = i;
                    c20103113lF.LIZJ = i2;
                    String name = C786410Ut5.u3().getName();
                    C20103113lF c20103113lF2 = c20103313lH.LIZ;
                    c20103113lF2.LIZIZ = name;
                    c20103113lF2.LJII = th;
                    if (list != null && list.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(this.LIZIZ);
                        arrayList.addAll(list);
                        list2 = arrayList;
                    } else {
                        list2 = this.LIZIZ;
                    }
                    c20103313lH.LIZ.LJ = list2;
                    String strLJIJ = AbstractC20103413lI.LJIJ(str, objArr);
                    C20103113lF c20103113lF3 = c20103313lH.LIZ;
                    c20103113lF3.LJFF = strLJIJ;
                    C20103613lK.LIZ(c20103113lF3);
                    Iterator it2 = ((ConcurrentHashMap) C20103613lK.LIZIZ).values().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC20103813lM) it2.next()).LIZ(c20103113lF3);
                    }
                }
            };
        }
    };

    public static InterfaceC2209561Bdq LJIJJ() {
        return LIZLLL.LIZIZ(new Object[0]);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LIZ(String str, Object... objArr) {
        LJIIZILJ(null, str, null, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJII(String str, Object... objArr) {
        LJ(0, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIIIIZZ(String str, Object... objArr) {
        LJIIIZ(0, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIIJ(String str, Object... objArr) {
        LJFF(0, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIIL(List list, Object... objArr) {
        LJIIZILJ(list, "can't find ET, should compile with ET", null, objArr);
    }

    public final void LJIJJLI(String str, Object... objArr) {
        LJFF(1, null, str, objArr);
    }

    public final void LJIL(String str, Object... objArr) {
        LJIJI(1, 0, null, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LIZIZ(int i, String str, Object... objArr) {
        LJIIIZ(i, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LIZJ(List<String> list, String str, Object... objArr) {
        LJ(0, list, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LIZLLL(List<String> list, String str, Object... objArr) {
        LJFF(0, list, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJI(List<String> list, String str, Object... objArr) {
        LJIIIZ(0, list, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIIJJI(int i, String str, Object... objArr) {
        LJ(i, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIILL(String str, Throwable th, Object... objArr) {
        LJIIZILJ(null, str, th, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJ(int i, List<String> list, String str, Object... objArr) {
        LJIJI(i, 3, list, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJFF(int i, List<String> list, String str, Object... objArr) {
        LJIJI(i, 2, list, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIIIZ(int i, List<String> list, String str, Object... objArr) {
        LJIJI(i, 1, list, null, str, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIILIIL(int i, String str, Throwable th, Object... objArr) {
        LJIILLIIL(i, null, str, th, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIILJJIL(int i, List<String> list, String str, Object... objArr) {
        LJIILLIIL(i, list, str, null, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIIZILJ(List<String> list, String str, Throwable th, Object... objArr) {
        LJIILLIIL(0, list, str, th, objArr);
    }

    @Override // X.InterfaceC2209561Bdq
    public final void LJIILLIIL(int i, List<String> list, String str, Throwable th, Object... objArr) {
        LJIJI(i, 4, list, th, str, objArr);
    }
}
