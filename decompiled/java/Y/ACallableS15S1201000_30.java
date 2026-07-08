package Y;

import X.C19968913Bf;
import X.C20139913rB;
import X.C20140013rC;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes31.dex */
public class ACallableS15S1201000_30 implements Callable {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final Object call$0(ACallableS15S1201000_30 aCallableS15S1201000_30) {
        return C20139913rB.LIZ(aCallableS15S1201000_30.s0, (Context) aCallableS15S1201000_30.l1, (C19968913Bf) aCallableS15S1201000_30.l2, aCallableS15S1201000_30.i3);
    }

    public static final Object call$1(ACallableS15S1201000_30 aCallableS15S1201000_30) {
        try {
            return C20139913rB.LIZ(aCallableS15S1201000_30.s0, (Context) aCallableS15S1201000_30.l1, (C19968913Bf) aCallableS15S1201000_30.l2, aCallableS15S1201000_30.i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new C20140013rC(-3);
        }
    }

    public ACallableS15S1201000_30(String str, Context context, C19968913Bf c19968913Bf, int i, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.l1 = context;
        this.l2 = c19968913Bf;
        this.i3 = i;
    }
}
