package Y;

import X.AbstractC1443905kz;
import X.C12840050s;
import X.C1443805ky;
import X.C1446505lP;
import X.C1451205mA;
import X.C15438062q;
import X.C259800zU;
import X.EnumC1450305m1;
import X.InterfaceC1444105l1;
import X.InterfaceC1444205l2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class AObjectS97S0400000_2 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS97S0400000_2 aObjectS97S0400000_2) {
        ((C1446505lP) aObjectS97S0400000_2.l0).LJIJJLI((List) aObjectS97S0400000_2.l1, (AbstractC1443905kz) aObjectS97S0400000_2.l2, (Function0) aObjectS97S0400000_2.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS97S0400000_2 aObjectS97S0400000_2) {
        ((C1446505lP) aObjectS97S0400000_2.l0).LJIILL((List) aObjectS97S0400000_2.l1, (List) aObjectS97S0400000_2.l2, C1443805ky.LIZ, (Function0) aObjectS97S0400000_2.l3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS97S0400000_2 aObjectS97S0400000_2) {
        C1446505lP c1446505lP = (C1446505lP) aObjectS97S0400000_2.l0;
        Pair pair = (Pair) aObjectS97S0400000_2.l1;
        List list = (List) aObjectS97S0400000_2.l2;
        Function0 function0 = (Function0) aObjectS97S0400000_2.l3;
        c1446505lP.LIZ.LIZJ(new C12840050s(Collections.singletonList(pair)));
        Collection<InterfaceC1444205l2> collectionValues = c1446505lP.LIZ.getState().LIZJ.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            InterfaceC1444205l2 interfaceC1444205l2 = (InterfaceC1444205l2) obj;
            if (Intrinsics.LJFF(interfaceC1444205l2.LJ().LJ("signal"), Boolean.TRUE) && interfaceC1444205l2.getNodeType() != EnumC1450305m1.BY_PASS) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((InterfaceC1444105l1) it2.next()).getIdentifier());
        }
        c1446505lP.LJIILL(arrayList2, list, C1443805ky.LIZ, function0);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.util.ArrayList] */
    public static final Object invoke$3(AObjectS97S0400000_2 aObjectS97S0400000_2) {
        C1451205mA c1451205mA = (C1451205mA) aObjectS97S0400000_2.l0;
        C259800zU c259800zU = (C259800zU) aObjectS97S0400000_2.l1;
        Function1 function1 = (Function1) aObjectS97S0400000_2.l2;
        C259800zU c259800zU2 = (C259800zU) aObjectS97S0400000_2.l3;
        synchronized (c1451205mA.LIZ) {
            try {
                T t = c259800zU.element;
                T t2 = c259800zU2.element;
                if (t == t2) {
                    c259800zU.element = new ArrayList((Collection) t2);
                }
                int iIndexOf = ((List) c259800zU.element).indexOf(function1);
                if (iIndexOf != -1) {
                    ((List) c259800zU.element).remove(iIndexOf);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public AObjectS97S0400000_2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
