package Y;

import X.C1C7U;
import X.C2188811AlT;
import com.lynx.tasm.LynxView;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS0S0114000_3 implements Callable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public boolean z1;

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

    public static final Object call$0(ACallableS0S0114000_3 aCallableS0S0114000_3) {
        C1C7U.LIZ("LynxView@80d.onLayout$1");
        HashMap map = new HashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(aCallableS0S0114000_3.z1);
        sbLIZ.append(" ");
        sbLIZ.append(aCallableS0S0114000_3.i2);
        sbLIZ.append(" ");
        sbLIZ.append(aCallableS0S0114000_3.i3);
        sbLIZ.append(" ");
        sbLIZ.append(aCallableS0S0114000_3.i4);
        sbLIZ.append(" ");
        sbLIZ.append(aCallableS0S0114000_3.i5);
        map.put("params", C2188811AlT.LIZIZ(sbLIZ));
        ((LynxView) aCallableS0S0114000_3.l0).putPendingPipelineIdsToMap(map);
        C1C7U.LIZIZ("LynxView@80d.onLayout$1");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS0S0114000_3 r24) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS0S0114000_3.call$1(Y.ACallableS0S0114000_3):java.lang.Object");
    }

    public ACallableS0S0114000_3(Object obj, boolean z, int i, int i2, int i3, int i4, int i5) {
        this.$t = i5;
        this.l0 = obj;
        this.z1 = z;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
        this.i5 = i4;
    }
}
