package Y;

import X.C1C7U;
import X.C2354709Kn;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes31.dex */
public class ACallableS31S1000000_30 implements Callable {
    public final int $t;
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

    public static final Object call$0(ACallableS31S1000000_30 aCallableS31S1000000_30) {
        C1C7U.LIZ("LocalVideoCache@1ed3.deleteCacheFile$2");
        Boolean boolValueOf = Boolean.valueOf(C2354709Kn.LJIJJLI(aCallableS31S1000000_30.s0));
        C1C7U.LIZIZ("LocalVideoCache@1ed3.deleteCacheFile$2");
        return boolValueOf;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(4:75|3|(2:5|7)(1:6)|8)|(4:10|(6:86|12|(2:14|65)(1:15)|58|63|64)|66|67)(1:16)|78|17|76|18|(7:20|81|21|(1:(1:27)(1:26))(1:28)|29|(1:31)(3:32|(4:83|34|(1:36)|64)|48)|(1:38)(3:(1:40)|(1:42)|43))(1:48)|66|67|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(4:10|(6:86|12|(2:14|65)(1:15)|58|63|64)|66|67)(1:16)|78|17|76|18|(7:20|81|21|(1:(1:27)(1:26))(1:28)|29|(1:31)(3:32|(4:83|34|(1:36)|64)|48)|(1:38)(3:(1:40)|(1:42)|43))(1:48)|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e1: MOVE (r10 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777441), block:B:69:0x00e1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS31S1000000_30 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS31S1000000_30.call$1(Y.ACallableS31S1000000_30):java.lang.Object");
    }

    public ACallableS31S1000000_30(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
