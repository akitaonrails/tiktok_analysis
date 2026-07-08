package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434530nQx {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0nQv] */
    public static final List LIZ() {
        EnumC1404600meg enumC1404600meg = EnumC1404600meg.DEFAULT;
        return Collections.singletonList(new C1434540nQy(Collections.singletonList(enumC1404600meg), new AbstractC1446660nkW() { // from class: X.0nQv
            public InterfaceC1434170nQN LJ;
            public C1931707hT LJFF;
            public C1434550nQz LJI;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Object obj2;
                Object next;
                Object next2;
                Object next3;
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    obj2 = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next == null || (next instanceof InterfaceC1434170nQN)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                this.LJ = (InterfaceC1434170nQN) next;
                Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (next2 == null || (next2 instanceof C1931707hT)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (!(next2 instanceof C1931707hT)) {
                    next2 = null;
                }
                this.LJFF = (C1931707hT) next2;
                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next3 = it4.next();
                        if (next3 == null || (next3 instanceof C1434550nQz)) {
                            break;
                        }
                    } else {
                        next3 = null;
                        break;
                    }
                }
                if (next3 instanceof C1434550nQz) {
                    obj2 = next3;
                }
                this.LJI = (C1434550nQz) obj2;
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
                if (obj2 instanceof C1434420nQm) {
                    if (((C1434420nQm) obj2).LIZ) {
                        C1931707hT c1931707hT = this.LJFF;
                        if (c1931707hT == null) {
                            C1931607hS.LIZ.getClass();
                            c1931707hT = new C1931707hT(0);
                        }
                        C1434520nQw c1434520nQw = new C1434520nQw(c1931707hT, null);
                        InterfaceC1434170nQN interfaceC1434170nQN = this.LJ;
                        if (interfaceC1434170nQN != null) {
                            interfaceC1434170nQN.LIZ(c1434520nQw);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(obj2 instanceof C1430840nL0) || !((C1430840nL0) obj2).LIZ) {
                    return;
                }
                int iIntValue = ((Number) C0BYW.LIZ.getValue()).intValue();
                C1434550nQz c1434550nQz = this.LJI;
                if (c1434550nQz == null) {
                    c1434550nQz = new C1434550nQz(0);
                }
                if (c1434550nQz.LIZ >= iIntValue) {
                    return;
                }
                C1931707hT c1931707hT2 = this.LJFF;
                if (c1931707hT2 == null) {
                    C1931607hS.LIZ.getClass();
                    c1931707hT2 = new C1931707hT(0);
                }
                C1434520nQw c1434520nQw2 = new C1434520nQw(c1931707hT2, c1434550nQz);
                c1434550nQz.LIZ++;
                InterfaceC1434170nQN interfaceC1434170nQN2 = this.LJ;
                if (interfaceC1434170nQN2 == null) {
                    return;
                }
                interfaceC1434170nQN2.LIZ(c1434520nQw2);
            }
        }));
    }
}
