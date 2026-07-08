package Y;

import X.C13BV;
import X.C1443205ks;
import X.C1446305lN;
import X.C1446505lP;
import X.C1447705lb;
import X.InterfaceC1448605lk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AObjectS281S0200000_2 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS281S0200000_2 aObjectS281S0200000_2) {
        C1446505lP c1446505lP = (C1446505lP) aObjectS281S0200000_2.l0;
        List list = (List) aObjectS281S0200000_2.l1;
        c1446505lP.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (c1446505lP.LIZJ.LJI.invoke((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        c1446505lP.LIZIZ.LIZIZ(new C1447705lb(list));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!c1446505lP.LIZIZ.getState().LIZLLL.contains(obj2)) {
                arrayList2.add(obj2);
            }
        }
        if ((!arrayList2.isEmpty()) && c1446505lP.LJII) {
            c1446505lP.LJIJJLI(C13BV.INSTANCE, new C1443205ks(arrayList2), null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS281S0200000_2 aObjectS281S0200000_2) {
        C1446305lN c1446305lN = (C1446305lN) aObjectS281S0200000_2.l0;
        ((ArrayList) c1446305lN.LJ).remove((InterfaceC1448605lk) aObjectS281S0200000_2.l1);
        return Unit.LIZ;
    }

    public AObjectS281S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
