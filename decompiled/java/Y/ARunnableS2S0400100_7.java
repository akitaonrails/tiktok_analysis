package Y;

import X.C0IQW;
import X.C1305440k4k;
import X.C1C7U;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS2S0400100_7 implements Runnable {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final void run$0(ARunnableS2S0400100_7 aRunnableS2S0400100_7) {
        boolean zLIZ;
        C1C7U.LIZ("FreshmanGuideStrategy@122b.startGuidanceForFreshMan$1");
        try {
            ((C0IQW) aRunnableS2S0400100_7.l0).getClass();
            long jLIZIZ = C0IQW.LIZIZ();
            ((C0IQW) aRunnableS2S0400100_7.l0).LIZ.LIZJ((LivePlayFragment) aRunnableS2S0400100_7.l1, (LivePlayFragment) aRunnableS2S0400100_7.l2);
            C0IQW c0iqw = (C0IQW) aRunnableS2S0400100_7.l0;
            C1305440k4k c1305440k4k = (C1305440k4k) aRunnableS2S0400100_7.l3;
            long j = aRunnableS2S0400100_7.j4;
            c0iqw.getClass();
            c1305440k4k.LJII(Long.valueOf(jLIZIZ), C0IQW.LIZJ(j));
            c1305440k4k.LJII(1, C0IQW.LIZ(j));
            c1305440k4k.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FreshmanGuideStrategy@122b.startGuidanceForFreshMan$1");
    }

    public static final void run$1(ARunnableS2S0400100_7 aRunnableS2S0400100_7) {
        boolean zLIZ;
        C1C7U.LIZ("FreshmanGuideStrategy@122b.startGuidanceForFreshMan$2");
        try {
            ((C0IQW) aRunnableS2S0400100_7.l0).getClass();
            long jLIZIZ = C0IQW.LIZIZ();
            ((C0IQW) aRunnableS2S0400100_7.l0).LIZ.LIZJ((LivePlayFragment) aRunnableS2S0400100_7.l1, (LivePlayFragment) aRunnableS2S0400100_7.l2);
            C0IQW c0iqw = (C0IQW) aRunnableS2S0400100_7.l0;
            C1305440k4k c1305440k4k = (C1305440k4k) aRunnableS2S0400100_7.l3;
            long j = aRunnableS2S0400100_7.j4;
            c0iqw.getClass();
            c1305440k4k.LJII(Long.valueOf(jLIZIZ), C0IQW.LIZJ(j));
            c1305440k4k.LJII(2, C0IQW.LIZ(j));
            c1305440k4k.LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FreshmanGuideStrategy@122b.startGuidanceForFreshMan$2");
    }

    public ARunnableS2S0400100_7(C0IQW c0iqw, LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2, C1305440k4k c1305440k4k, long j, int i) {
        this.$t = i;
        this.l0 = c0iqw;
        this.l1 = livePlayFragment;
        this.l2 = livePlayFragment2;
        this.l3 = c1305440k4k;
        this.j4 = j;
    }
}
