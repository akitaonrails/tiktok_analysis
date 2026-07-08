package Y;

import X.C0J7N;
import X.C1C7U;
import X.C486390J5p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS0S2200200_7 implements Runnable {
    public final int $t;
    public long j4;
    public long j5;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final void run$0(ARunnableS0S2200200_7 aRunnableS0S2200200_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCheckStateService@a608.preloadRoom$1");
        try {
            ((C486390J5p) aRunnableS0S2200200_7.l2).LJIJJLI(aRunnableS0S2200200_7.j4, aRunnableS0S2200200_7.j5, aRunnableS0S2200200_7.s0, aRunnableS0S2200200_7.s1, (Function1) aRunnableS0S2200200_7.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCheckStateService@a608.preloadRoom$1");
    }

    public static final void run$1(ARunnableS0S2200200_7 aRunnableS0S2200200_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCheckStateService@a608.preloadSlimRoom$1");
        try {
            ((C486390J5p) aRunnableS0S2200200_7.l2).LJIL(aRunnableS0S2200200_7.j4, aRunnableS0S2200200_7.j5, aRunnableS0S2200200_7.s0, aRunnableS0S2200200_7.s1, (Function1) aRunnableS0S2200200_7.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCheckStateService@a608.preloadSlimRoom$1");
    }

    public ARunnableS0S2200200_7(C486390J5p c486390J5p, long j, long j2, C0J7N c0j7n, int i) {
        this.$t = i;
        this.l2 = c486390J5p;
        this.s0 = "inbox_dm_head";
        this.j4 = j;
        this.j5 = j2;
        this.s1 = "inbox_dm_head";
        this.l3 = c0j7n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0009: IPUT (r6 I:long), (r0 I:Y.ARunnableS0S2200200_7) (LINE:117440521) Y.ARunnableS0S2200200_7.j5 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x000b: IPUT (r8 I:java.lang.String), (r0 I:Y.ARunnableS0S2200200_7) (LINE:117440523) Y.ARunnableS0S2200200_7.s1 java.lang.String, block:B:2:0x0000 */
    public ARunnableS0S2200200_7(C486390J5p c486390J5p, C486390J5p c486390J5p2, String str, long j, long j2, String str2, Function1<? super String, Unit> function1) {
        long j3;
        String str3;
        this.$t = function1;
        this.l2 = c486390J5p;
        this.s0 = c486390J5p2;
        this.j4 = str;
        this.j5 = j3;
        this.s1 = str3;
        this.l3 = str2;
    }
}
