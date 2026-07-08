package Y;

import X.C0X9S;
import X.C1551680qTu;
import X.C1553130qWF;
import X.InterfaceC1495580p1Q;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AObjectS196S0300000_23 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS196S0300000_23 aObjectS196S0300000_23, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1553130qWF.LIZ("gecko-debug-tag", "on pause in downloadFile");
            ((boolean[]) aObjectS196S0300000_23.l0)[0] = true;
            ((C0X9S) aObjectS196S0300000_23.l1).cancel();
            ((C1551680qTu) aObjectS196S0300000_23.l2).LIZLLL(aObjectS196S0300000_23);
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS196S0300000_23 aObjectS196S0300000_23, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1553130qWF.LIZ("gecko-debug-tag", "on pause in downloadFile");
            ((boolean[]) aObjectS196S0300000_23.l0)[0] = true;
            ((InterfaceC1495580p1Q) aObjectS196S0300000_23.l1).cancel();
            ((C1551680qTu) aObjectS196S0300000_23.l2).LIZLLL(aObjectS196S0300000_23);
            return null;
        }
        return null;
    }

    public AObjectS196S0300000_23(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
