package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0N6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588480N6g {
    public C587100N0y LIZ = new C587100N0y(0);
    public C0N10 LIZIZ = new C0N10(null, null);
    public InterfaceC588510N6j LIZJ;

    public final void LIZ(AbstractC588520N6k abstractC588520N6k) {
        boolean z;
        AbstractC587110N0z c587100N0y;
        if (abstractC588520N6k instanceof C588500N6i) {
            C0N10 c0n10 = this.LIZIZ;
            C588500N6i c588500N6i = (C588500N6i) abstractC588520N6k;
            List<InterfaceC1203630hQX> list = c588500N6i.LIZ;
            List<InterfaceC1203630hQX> list2 = c588500N6i.LIZIZ;
            c0n10.getClass();
            c587100N0y = new C0N10(list, list2);
        } else if (abstractC588520N6k instanceof C588490N6h) {
            C587100N0y c587100N0y2 = this.LIZ;
            C588490N6h c588490N6h = (C588490N6h) abstractC588520N6k;
            if (c588490N6h.LIZ == 1) {
                z = true;
            } else {
                z = false;
            }
            List<InterfaceC588530N6l> list3 = c588490N6h.LIZIZ;
            if (list3 == null) {
                list3 = c587100N0y2.LIZIZ;
            }
            c587100N0y2.getClass();
            c587100N0y = new C587100N0y(z, list3);
        } else {
            throw new C1954807lC();
        }
        InterfaceC588530N6l interfaceC588530N6l = null;
        if (c587100N0y instanceof C587100N0y) {
            C587100N0y c587100N0y3 = (C587100N0y) c587100N0y;
            this.LIZ = c587100N0y3;
            if (!c587100N0y3.LIZ) {
                InterfaceC588510N6j interfaceC588510N6j = this.LIZJ;
                if (interfaceC588510N6j != null) {
                    interfaceC588510N6j.LIZIZ(null);
                    return;
                }
                return;
            }
            List<InterfaceC588530N6l> list4 = c587100N0y3.LIZIZ;
            if (list4 != null) {
                Iterator<InterfaceC588530N6l> it2 = list4.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().isEnable()) {
                        InterfaceC588510N6j interfaceC588510N6j2 = this.LIZJ;
                        if (interfaceC588510N6j2 == null) {
                            return;
                        }
                        interfaceC588510N6j2.LIZIZ(null);
                        return;
                    }
                }
            }
            InterfaceC588510N6j interfaceC588510N6j3 = this.LIZJ;
            if (interfaceC588510N6j3 == null) {
                return;
            }
            interfaceC588510N6j3.resume();
            return;
        }
        if (c587100N0y instanceof C0N10) {
            C0N10 c0n102 = (C0N10) c587100N0y;
            List<InterfaceC588530N6l> list5 = this.LIZ.LIZIZ;
            if (list5 != null) {
                Iterator<InterfaceC588530N6l> it3 = list5.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    InterfaceC588530N6l next = it3.next();
                    if (!next.isEnable()) {
                        interfaceC588530N6l = next;
                        break;
                    }
                }
            }
            this.LIZIZ = c0n102;
            List<InterfaceC1203630hQX> list6 = c0n102.LIZ;
            if (interfaceC588530N6l != null) {
                if (list6 != null) {
                    InterfaceC588510N6j interfaceC588510N6j4 = this.LIZJ;
                    if (interfaceC588510N6j4 == null) {
                        return;
                    }
                    interfaceC588510N6j4.LIZ(list6);
                    return;
                }
            } else if (list6 != null && !list6.isEmpty()) {
                InterfaceC588510N6j interfaceC588510N6j5 = this.LIZJ;
                if (interfaceC588510N6j5 == null) {
                    return;
                }
                interfaceC588510N6j5.LIZJ(list6);
                return;
            }
            List<InterfaceC1203630hQX> list7 = c0n102.LIZIZ;
            InterfaceC588510N6j interfaceC588510N6j6 = this.LIZJ;
            if (interfaceC588510N6j6 != null) {
                interfaceC588510N6j6.LIZIZ(list7);
            }
            InterfaceC588510N6j interfaceC588510N6j7 = this.LIZJ;
            if (interfaceC588510N6j7 == null) {
                return;
            }
            interfaceC588510N6j7.LIZLLL(list7);
            return;
        }
        throw new C1954807lC();
    }
}
