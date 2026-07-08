package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hQV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203610hQV implements InterfaceC588510N6j {
    public InterfaceC1203630hQX LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(680));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(679));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(681));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2484));

    public final ArrayList<InterfaceC1203630hQX> LJI() {
        return (ArrayList) this.LIZJ.getValue();
    }

    public final ArrayList<InterfaceC1203630hQX> LJII() {
        return (ArrayList) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC588510N6j
    public final void resume() {
        InterfaceC1203630hQX interfaceC1203630hQX = this.LIZ;
        if (interfaceC1203630hQX != null) {
            interfaceC1203630hQX.p1();
        } else if (!LJII().isEmpty()) {
            LIZJ(LJII());
            LJII().clear();
        }
    }

    @Override // X.InterfaceC588510N6j
    public final void LIZ(List<? extends InterfaceC1203630hQX> list) {
        LJII().clear();
        LJII().addAll(list);
        LJI().clear();
        this.LIZ = null;
    }

    @Override // X.InterfaceC588510N6j
    public final void LIZIZ(List<? extends InterfaceC1203630hQX> list) {
        LJIIIIZZ(list);
    }

    @Override // X.InterfaceC588510N6j
    public final void LIZJ(List<? extends InterfaceC1203630hQX> list) {
        LJFF(null);
        Iterator<? extends InterfaceC1203630hQX> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().u1((C1203620hQW) this.LJ.getValue());
        }
        if (list.isEmpty()) {
            LJIIIIZZ(null);
        } else {
            LJI().addAll(list);
            LJIIIZ((InterfaceC1203630hQX) ListProtector.get(list, 0));
        }
    }

    @Override // X.InterfaceC588510N6j
    public final void LIZLLL(List<? extends InterfaceC1203630hQX> list) {
        LJFF(list);
        LJ(LJII(), list, null);
        if (list != null && C13LP.LJJJJ(this.LIZ, list)) {
            return;
        }
        this.LIZ = null;
    }

    public final void LJFF(List<? extends InterfaceC1203630hQX> list) {
        LJ(LJI(), list, new AwS597S0100000_18(this, 737));
    }

    public final void LJIIIIZZ(List<? extends InterfaceC1203630hQX> list) {
        InterfaceC1203630hQX interfaceC1203630hQX;
        if ((list == null || !C13LP.LJJJJ(this.LIZ, list)) && (interfaceC1203630hQX = this.LIZ) != null) {
            interfaceC1203630hQX.LJJJLIIL();
        }
    }

    public final void LJIIIZ(InterfaceC1203630hQX interfaceC1203630hQX) {
        InterfaceC1203630hQX interfaceC1203630hQX2 = this.LIZ;
        if (interfaceC1203630hQX2 != null && !Intrinsics.LJFF(interfaceC1203630hQX, interfaceC1203630hQX2)) {
            InterfaceC1203630hQX interfaceC1203630hQX3 = this.LIZ;
            if (interfaceC1203630hQX3 != null) {
                interfaceC1203630hQX3.LJJJLIIL();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LIZ = interfaceC1203630hQX;
        interfaceC1203630hQX.p1();
        System.currentTimeMillis();
    }

    public static void LJ(List list, List list2, Function1 function1) {
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (list2 == null || !list2.contains(next)) {
                if (function1 != null) {
                    function1.invoke(next);
                }
                it2.remove();
            }
        }
    }
}
