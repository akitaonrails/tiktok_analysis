package Y;

import X.C2188811AlT;
import X.EnumC1779550wPR;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AObjectS282S0200000_3 implements Function0 {
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

    public static final Object invoke$0(AObjectS282S0200000_3 aObjectS282S0200000_3) {
        EnumC1779550wPR enumC1779550wPR = (EnumC1779550wPR) aObjectS282S0200000_3.l0;
        List list = (List) aObjectS282S0200000_3.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterFrom(");
        sbLIZ.append(enumC1779550wPR);
        sbLIZ.append(") get record list, size: ");
        sbLIZ.append(list.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AObjectS282S0200000_3 aObjectS282S0200000_3) {
        ((Lifecycle) aObjectS282S0200000_3.l0).removeObserver((LifecycleEventObserver) aObjectS282S0200000_3.l1);
        return Unit.LIZ;
    }

    public AObjectS282S0200000_3(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
