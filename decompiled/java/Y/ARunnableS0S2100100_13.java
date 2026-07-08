package Y;

import X.C0V8N;
import X.C1C7U;
import X.C802680VeE;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS0S2100100_13 implements Runnable {
    public final int $t;
    public long j3;
    public Object l2;
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
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S2100100_13 aRunnableS0S2100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("CrashListener@f412.<init>$1");
        try {
            ((C802680VeE) aRunnableS0S2100100_13.l2).LJIIL.LJII(aRunnableS0S2100100_13.s0);
            ((C802680VeE) aRunnableS0S2100100_13.l2).LJIIL.LJIIIIZZ(aRunnableS0S2100100_13.j3, 0L, 0L, aRunnableS0S2100100_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CrashListener@f412.<init>$1");
    }

    public static final void run$1(ARunnableS0S2100100_13 aRunnableS0S2100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("CrashListener@f412.<init>$2");
        try {
            ((C802680VeE) aRunnableS0S2100100_13.l2).LJIIL.LJII(aRunnableS0S2100100_13.s0);
            ((C802680VeE) aRunnableS0S2100100_13.l2).LJIIL.LJIIIIZZ(aRunnableS0S2100100_13.j3, 0L, 0L, aRunnableS0S2100100_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CrashListener@f412.<init>$2");
    }

    public static final void run$2(ARunnableS0S2100100_13 aRunnableS0S2100100_13) {
        boolean zLIZ;
        C1C7U.LIZ("MainProcessBizTrafficStats@ff25.trafficStats$1");
        try {
            ((C0V8N) aRunnableS0S2100100_13.l2).LJIILL(aRunnableS0S2100100_13.j3, aRunnableS0S2100100_13.s0, aRunnableS0S2100100_13.s1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainProcessBizTrafficStats@ff25.trafficStats$1");
    }

    public ARunnableS0S2100100_13(Object obj, String str, long j, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.j3 = j;
        this.s1 = str2;
    }
}
