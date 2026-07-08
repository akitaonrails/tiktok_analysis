package Y;

import X.C15O7;
import X.C1619720sFe;
import X.C1C7U;
import X.InterfaceC1897260zTI;
import X.InterfaceC2385309Wh;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public class ACallableS3S0002000_11 implements Callable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f273i0;
    public int i1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS3S0002000_11 aCallableS3S0002000_11) {
        INetworkApi iNetworkApiLIZJ;
        C15O7<String> c15o7RequestTouchPointClick;
        C1C7U.LIZ("RequestUtil@64a0.requestTouchPointClick$1");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        Object objLJ = null;
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null && (c15o7RequestTouchPointClick = iNetworkApiLIZJ.requestTouchPointClick(aCallableS3S0002000_11.f273i0, 2, aCallableS3S0002000_11.i1)) != null) {
            objLJ = c15o7RequestTouchPointClick.LJ(new InterfaceC2385309Wh() { // from class: X.09SA
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("RequestUtil@64a0.requestTouchPointClick$1$1");
                    C1C7U.LIZIZ("RequestUtil@64a0.requestTouchPointClick$1$1");
                    return c15o7;
                }
            }, C15O7.LJI, null);
        }
        C1C7U.LIZIZ("RequestUtil@64a0.requestTouchPointClick$1");
        return objLJ;
    }

    public static final Object call$1(ACallableS3S0002000_11 aCallableS3S0002000_11) {
        INetworkApi iNetworkApiLIZJ;
        C15O7<String> c15o7RequestTouchPointShow;
        C1C7U.LIZ("RequestUtil@64a0.requestTouchPointShow$1");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        Object objLJ = null;
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null && (c15o7RequestTouchPointShow = iNetworkApiLIZJ.requestTouchPointShow(aCallableS3S0002000_11.f273i0, aCallableS3S0002000_11.i1)) != null) {
            objLJ = c15o7RequestTouchPointShow.LJ(new InterfaceC2385309Wh() { // from class: X.09SB
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("RequestUtil@64a0.requestTouchPointShow$1$1");
                    C1C7U.LIZIZ("RequestUtil@64a0.requestTouchPointShow$1$1");
                    return c15o7;
                }
            }, C15O7.LJI, null);
        }
        C1C7U.LIZIZ("RequestUtil@64a0.requestTouchPointShow$1");
        return objLJ;
    }

    public ACallableS3S0002000_11(int i, int i2, int i3) {
        this.$t = i3;
        this.f273i0 = i;
        this.i1 = i2;
    }
}
