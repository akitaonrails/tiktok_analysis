package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0N6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588600N6s {
    public InterfaceC588610N6t LIZIZ;
    public C587090N0x LIZ = new C587090N0x(0);
    public final C0N70 LIZJ = new C0H62() { // from class: X.0N70
        @Override // X.C0H62
        public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
            if (C0N71.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE) {
                C1524805y2.LIZIZ(0L, new AwS553S0100000_9(this.LL, 1832));
            }
        }
    };

    public final boolean LIZIZ() {
        C587090N0x c587090N0x = this.LIZ;
        if (c587090N0x.LIZ) {
            List<InterfaceC588620N6u> list = c587090N0x.LIZIZ;
            if (list == null || list.isEmpty()) {
                return true;
            }
            Iterator<InterfaceC588620N6u> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().isEnable()) {
                }
            }
            return true;
        }
        return false;
    }

    public final void LIZ(AbstractC588570N6p abstractC588570N6p) {
        InterfaceC588610N6t interfaceC588610N6t;
        List<InterfaceC588620N6u> list;
        boolean z = false;
        if (abstractC588570N6p instanceof C588560N6o) {
            C588560N6o c588560N6o = (C588560N6o) abstractC588570N6p;
            InterfaceC588620N6u interfaceC588620N6u = null;
            if (!c588560N6o.LIZIZ && (list = this.LIZ.LIZIZ) != null) {
                Iterator<InterfaceC588620N6u> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InterfaceC588620N6u next = it2.next();
                    if (!next.isEnable()) {
                        interfaceC588620N6u = next;
                        break;
                    }
                }
            }
            List<InterfaceC648350Pbt> list2 = c588560N6o.LIZ;
            if (interfaceC588620N6u != null) {
                if (((Number) C18117077r.LIZ.getValue()).intValue() == 1 && (interfaceC588610N6t = this.LIZIZ) != null) {
                    interfaceC588610N6t.pause();
                }
                InterfaceC588610N6t interfaceC588610N6t2 = this.LIZIZ;
                if (interfaceC588610N6t2 != null) {
                    interfaceC588610N6t2.LIZ(list2);
                    return;
                }
                return;
            }
            if (list2.isEmpty()) {
                InterfaceC588610N6t interfaceC588610N6t3 = this.LIZIZ;
                if (interfaceC588610N6t3 != null) {
                    interfaceC588610N6t3.pause();
                }
                InterfaceC588610N6t interfaceC588610N6t4 = this.LIZIZ;
                if (interfaceC588610N6t4 == null) {
                    return;
                }
                interfaceC588610N6t4.LJ();
                return;
            }
            InterfaceC588610N6t interfaceC588610N6t5 = this.LIZIZ;
            if (interfaceC588610N6t5 == null) {
                return;
            }
            interfaceC588610N6t5.LJII(list2, c588560N6o.LIZJ);
            return;
        }
        if (abstractC588570N6p instanceof C588580N6q) {
            InterfaceC588610N6t interfaceC588610N6t6 = this.LIZIZ;
            if (interfaceC588610N6t6 == null) {
                return;
            }
            interfaceC588610N6t6.LIZJ(((C588580N6q) abstractC588570N6p).LIZ);
            return;
        }
        if (abstractC588570N6p instanceof C588590N6r) {
            InterfaceC588610N6t interfaceC588610N6t7 = this.LIZIZ;
            if (interfaceC588610N6t7 == null) {
                return;
            }
            interfaceC588610N6t7.LJI(((C588590N6r) abstractC588570N6p).LIZ);
            return;
        }
        if (abstractC588570N6p instanceof C588550N6n) {
            C587090N0x c587090N0x = this.LIZ;
            C588550N6n c588550N6n = (C588550N6n) abstractC588570N6p;
            if (c588550N6n.LIZ == 1) {
                z = true;
            }
            List<InterfaceC588620N6u> list3 = c588550N6n.LIZIZ;
            if (list3 == null) {
                list3 = c587090N0x.LIZIZ;
            }
            c587090N0x.getClass();
            this.LIZ = new C587090N0x(z, list3);
            if (!z) {
                InterfaceC588610N6t interfaceC588610N6t8 = this.LIZIZ;
                if (interfaceC588610N6t8 == null) {
                    return;
                }
                interfaceC588610N6t8.pause();
                return;
            }
            if (list3 != null) {
                Iterator<InterfaceC588620N6u> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (!it3.next().isEnable()) {
                        InterfaceC588610N6t interfaceC588610N6t9 = this.LIZIZ;
                        if (interfaceC588610N6t9 == null) {
                            return;
                        }
                        interfaceC588610N6t9.pause();
                        return;
                    }
                }
            }
            InterfaceC588610N6t interfaceC588610N6t10 = this.LIZIZ;
            if (interfaceC588610N6t10 == null) {
                return;
            }
            interfaceC588610N6t10.resume();
            return;
        }
        if (abstractC588570N6p instanceof C588540N6m) {
            C588540N6m c588540N6m = (C588540N6m) abstractC588570N6p;
            if (c588540N6m.LIZ == 0) {
                InterfaceC588610N6t interfaceC588610N6t11 = this.LIZIZ;
                if (interfaceC588610N6t11 != null) {
                    interfaceC588610N6t11.pause();
                }
                InterfaceC588610N6t interfaceC588610N6t12 = this.LIZIZ;
                if (interfaceC588610N6t12 == null) {
                    return;
                }
                interfaceC588610N6t12.LIZLLL();
                return;
            }
            List<InterfaceC588620N6u> list4 = c588540N6m.LIZIZ;
            if (list4 != null) {
                Iterator<InterfaceC588620N6u> it4 = list4.iterator();
                while (it4.hasNext()) {
                    if (!it4.next().isEnable()) {
                        InterfaceC588610N6t interfaceC588610N6t13 = this.LIZIZ;
                        if (interfaceC588610N6t13 == null) {
                            return;
                        }
                        interfaceC588610N6t13.pause();
                        return;
                    }
                }
            }
            InterfaceC588610N6t interfaceC588610N6t14 = this.LIZIZ;
            if (interfaceC588610N6t14 == null) {
                return;
            }
            interfaceC588610N6t14.resume();
            return;
        }
        throw new C1954807lC();
    }
}
