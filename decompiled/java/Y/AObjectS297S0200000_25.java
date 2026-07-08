package Y;

import X.C1674970tgl;
import X.C1677750tlF;
import X.C1688680u2s;
import X.C1766560w4U;
import X.C19EG;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS297S0200000_25 implements Function0 {
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
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS297S0200000_25 aObjectS297S0200000_25) {
        C1688680u2s.LJIILLIIL((Activity) aObjectS297S0200000_25.l0, (Intent) aObjectS297S0200000_25.l1);
        return null;
    }

    public static final Object invoke$1(AObjectS297S0200000_25 aObjectS297S0200000_25) {
        C1766560w4U.LIZIZ((C19EG) aObjectS297S0200000_25.l0, (Window) aObjectS297S0200000_25.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS297S0200000_25 aObjectS297S0200000_25) {
        C1677750tlF c1677750tlF = (C1677750tlF) aObjectS297S0200000_25.l0;
        CoroutineContext coroutineContext = ((InterfaceC497601wk) aObjectS297S0200000_25.l1).getCoroutineContext();
        c1677750tlF.getClass();
        return Float.valueOf(C1677750tlF.LIZJ(coroutineContext));
    }

    public static final Object invoke$3(AObjectS297S0200000_25 aObjectS297S0200000_25) {
        Function2 function2 = (Function2) aObjectS297S0200000_25.l0;
        C1674970tgl c1674970tgl = (C1674970tgl) aObjectS297S0200000_25.l1;
        function2.invoke(c1674970tgl.LJFF, Integer.valueOf(c1674970tgl.LJI));
        return Unit.LIZ;
    }

    public AObjectS297S0200000_25(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
