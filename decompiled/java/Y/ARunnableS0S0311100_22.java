package Y;

import X.C1435540nSa;
import X.C1435550nSb;
import X.C199555136b;
import X.C1C7U;
import X.InterfaceC2221271Bwj;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS0S0311100_22 implements Runnable {
    public final int $t;
    public int i4;
    public long j5;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final void run$0(ARunnableS0S0311100_22 aRunnableS0S0311100_22) {
        boolean zLIZ;
        C1C7U.LIZ("CompileTask@a3ca.onEncoderDataAvailable$task$1");
        try {
            ((C1435540nSa) aRunnableS0S0311100_22.l0).LJIJJLI((InterfaceC2221271Bwj) aRunnableS0S0311100_22.l1, aRunnableS0S0311100_22.j5, aRunnableS0S0311100_22.i4, aRunnableS0S0311100_22.z3, (SynthetiseResult) aRunnableS0S0311100_22.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CompileTask@a3ca.onEncoderDataAvailable$task$1");
    }

    public static final void run$1(ARunnableS0S0311100_22 aRunnableS0S0311100_22) {
        boolean zLIZ;
        C1C7U.LIZ("DMVideoCompileTask@c7d8.setupEncodedDataProducer$1$task$1");
        try {
            ((C1435550nSb) aRunnableS0S0311100_22.l0).LJIJ(new C199555136b((byte[]) aRunnableS0S0311100_22.l1), aRunnableS0S0311100_22.j5, aRunnableS0S0311100_22.i4, aRunnableS0S0311100_22.z3, (SynthetiseResult) aRunnableS0S0311100_22.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DMVideoCompileTask@c7d8.setupEncodedDataProducer$1$task$1");
    }

    public ARunnableS0S0311100_22(Object obj, Object obj2, long j, int i, boolean z, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.j5 = j;
        this.i4 = i;
        this.z3 = z;
        this.l2 = obj3;
    }
}
