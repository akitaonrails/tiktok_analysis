package Y;

import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.performance.PerformanceController;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS7S0300100_20 implements Runnable {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void run$0(ARunnableS7S0300100_20 aRunnableS7S0300100_20) {
        PerformanceController.LJII((PerformanceController) aRunnableS7S0300100_20.l0, aRunnableS7S0300100_20.j3, (JavaOnlyMap) aRunnableS7S0300100_20.l1, (JavaOnlyArray) aRunnableS7S0300100_20.l2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$1(Y.ARunnableS7S0300100_20 r19) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS7S0300100_20.run$1(Y.ARunnableS7S0300100_20):void");
    }

    public ARunnableS7S0300100_20(Object obj, long j, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j3 = j;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
