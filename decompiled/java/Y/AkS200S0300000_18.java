package Y;

import X.C1161000gJm;
import X.C1161040gJq;
import X.C11NZ;
import X.InterfaceC1160790gJR;
import X.InterfaceC1487280oo2;
import com.bytedance.hybrid.spark.raven.data.RavenVm;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS419S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AkS200S0300000_18 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS200S0300000_18 akS200S0300000_18, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) akS200S0300000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.onError(th);
        }
        RavenVm ravenVm = (RavenVm) akS200S0300000_18.l1;
        C1161040gJq c1161040gJqWQ2 = ravenVm.wQ2(null, th, (InterfaceC1160790gJR) akS200S0300000_18.l0, new AwS419S0200000_18((Function0) akS200S0300000_18.l2, (Function0<C1161000gJm>) ravenVm, (RavenVm) 132));
        if (c1161040gJqWQ2 != null) {
            return C11NZ.LJJJJZ(c1161040gJqWQ2);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$1(AkS200S0300000_18 akS200S0300000_18, Object obj) {
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) akS200S0300000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.LIZLLL(c1161040gJq);
        }
        RavenVm ravenVm = (RavenVm) akS200S0300000_18.l1;
        return ravenVm.wQ2(c1161040gJq, null, (InterfaceC1160790gJR) akS200S0300000_18.l0, new AwS419S0200000_18((Function0) akS200S0300000_18.l2, (Function0<C1161000gJm>) ravenVm, (RavenVm) 129));
    }

    public static final Object apply$2(AkS200S0300000_18 akS200S0300000_18, Object obj) {
        Throwable th = (Throwable) obj;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) akS200S0300000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.onError(th);
        }
        RavenVm ravenVm = (RavenVm) akS200S0300000_18.l1;
        C1161040gJq c1161040gJqWQ2 = ravenVm.wQ2(null, th, (InterfaceC1160790gJR) akS200S0300000_18.l0, new AwS419S0200000_18((Function0) akS200S0300000_18.l2, (Function0<C1161000gJm>) ravenVm, (RavenVm) 130));
        if (c1161040gJqWQ2 != null) {
            return C11NZ.LJJJJZ(c1161040gJqWQ2);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    public static final Object apply$3(AkS200S0300000_18 akS200S0300000_18, Object obj) {
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        InterfaceC1160790gJR interfaceC1160790gJR = (InterfaceC1160790gJR) akS200S0300000_18.l0;
        if (interfaceC1160790gJR != null) {
            interfaceC1160790gJR.LIZLLL(c1161040gJq);
        }
        RavenVm ravenVm = (RavenVm) akS200S0300000_18.l1;
        return ravenVm.wQ2(c1161040gJq, null, (InterfaceC1160790gJR) akS200S0300000_18.l0, new AwS419S0200000_18((Function0) akS200S0300000_18.l2, (Function0<C1161000gJm>) ravenVm, (RavenVm) 131));
    }

    public AkS200S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
