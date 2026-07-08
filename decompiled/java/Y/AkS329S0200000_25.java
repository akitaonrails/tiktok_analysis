package Y;

import X.AbstractC1635300sem;
import X.C013C;
import X.C11NZ;
import X.C11PQ;
import X.C1628000sT0;
import X.C1689650u4R;
import X.C1689710u4X;
import X.C1910890zpH;
import X.C2188811AlT;
import X.C259800zU;
import X.C517301zv;
import X.EnumC1910860zpE;
import X.InterfaceC1487280oo2;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nearby.INearbyBleConnector;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class AkS329S0200000_25 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS329S0200000_25 akS329S0200000_25, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C1628000sT0) akS329S0200000_25.l0).bh().LJII(Boolean.TRUE);
            C013C c013c = new C013C();
            c013c.element = true;
            return ((C11PQ) akS329S0200000_25.l1).LJJJJZI(new C517301zv(c013c, 8));
        }
        boolean zLJFF = Intrinsics.LJFF(((C11PQ) akS329S0200000_25.l1).LJLZ(), Boolean.TRUE);
        if (!zLJFF) {
            ((C1628000sT0) akS329S0200000_25.l0).bh().LJII(Boolean.FALSE);
        }
        return C11NZ.LJJJJZ(new Pair(Boolean.FALSE, Boolean.valueOf(zLJFF)));
    }

    public static final Object apply$1(AkS329S0200000_25 akS329S0200000_25, Object obj) {
        C1689710u4X c1689710u4X = (C1689710u4X) obj;
        C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Connect] connecting to ");
        sbLIZ.append(c1689710u4X);
        c1910890zpHLIZ.LIZ("NearbyBleManager", C2188811AlT.LIZIZ(sbLIZ));
        C1689650u4R c1689650u4R = (C1689650u4R) akS329S0200000_25.l0;
        return ((INearbyBleConnector) c1689650u4R.LJIILIIL.getValue()).LIZ((Context) akS329S0200000_25.l1, c1689710u4X, c1689650u4R.LIZIZ);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object apply$2(AkS329S0200000_25 akS329S0200000_25, Object obj) {
        Pair pair = (Pair) obj;
        AbstractC1635300sem abstractC1635300sem = (AbstractC1635300sem) akS329S0200000_25.l0;
        Object obj2 = abstractC1635300sem.LIZIZ;
        C259800zU c259800zU = (C259800zU) akS329S0200000_25.l1;
        synchronized (obj2) {
            try {
                if (abstractC1635300sem.LJ(c259800zU.element, abstractC1635300sem.LIZ.get())) {
                    abstractC1635300sem.LIZ.set((CURSOR) pair.getFirst());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return pair.getSecond();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS329S0200000_25(Object obj, C1628000sT0 c1628000sT0, C11PQ<Boolean> c11pq) {
        this.$t = c11pq;
        this.l0 = obj;
        this.l1 = c1628000sT0;
    }
}
