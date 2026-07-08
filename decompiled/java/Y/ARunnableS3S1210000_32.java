package Y;

import X.C01GW;
import X.C18PZ;
import X.C1C7U;
import X.C21278818Pa;
import X.C21278918Pb;
import X.C21279318Pf;
import X.C823050WQl;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS3S1210000_32 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
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

    public final void LIZ$0() {
        C18PZ c18pz = C18PZ.LIZ;
        String str = this.s0;
        Aweme aweme = (Aweme) this.l1;
        c18pz.getClass();
        Aweme awemeLIZ = C18PZ.LIZ(aweme, str);
        if (awemeLIZ != null) {
            String str2 = this.s0;
            C01GW c01gw = C21278818Pa.LIZ;
            if (Intrinsics.LJFF(str2, C21278818Pa.LIZLLL)) {
                C18PZ.LIZLLL = this.z3;
                if (!this.z3) {
                    Context context = (Context) this.l2;
                    String str3 = this.s0;
                    c18pz.getClass();
                    C18PZ.LJIIIZ(context, awemeLIZ, str3);
                    return;
                }
                C21278918Pb c21278918Pb = C21278918Pb.LIZ;
                Context context2 = (Context) this.l2;
                String str4 = this.s0;
                c21278918Pb.getClass();
                C21278918Pb.LIZIZ(context2, awemeLIZ, str4, false, false);
            }
        }
    }

    public final void LIZ$1() {
        VSACardsResponse.VSACardData vSACardData;
        Integer num;
        C18PZ c18pz = C18PZ.LIZ;
        String str = this.s0;
        Aweme aweme = (Aweme) this.l1;
        c18pz.getClass();
        Aweme awemeLIZ = C18PZ.LIZ(aweme, str);
        if (awemeLIZ != null) {
            if (this.z3) {
                C21278918Pb c21278918Pb = C21278918Pb.LIZ;
                Context context = (Context) this.l2;
                String str2 = this.s0;
                c21278918Pb.getClass();
                C21278918Pb.LIZIZ(context, awemeLIZ, str2, false, false);
                return;
            }
            C01GW c01gw = C21278818Pa.LIZ;
            C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(awemeLIZ, this.s0);
            ScheduledFuture<?> scheduledFutureSchedule = null;
            try {
                scheduledFutureSchedule = C823050WQl.LJ().schedule(new ARunnableS20S1200000_16((Context) this.l2, awemeLIZ, this.s0, 10), ((long) ((c21279318PfLIZJ == null || (vSACardData = c21279318PfLIZJ.LJFF) == null || (num = vSACardData.delayCloseTime) == null || num.intValue() < 0) ? 5 : num.intValue())) * 1000, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C18PZ.LJIIIIZZ = scheduledFutureSchedule;
        }
    }

    public static final void run$0(ARunnableS3S1210000_32 aRunnableS3S1210000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.handleMutualExclusionWithVideoPopup$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS3S1210000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.handleMutualExclusionWithVideoPopup$$inlined$runOnWorkerThread$1");
    }

    public static final void run$1(ARunnableS3S1210000_32 aRunnableS3S1210000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAManager@aafd.onVideoPlayCompleted$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS3S1210000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAManager@aafd.onVideoPlayCompleted$$inlined$runOnWorkerThread$1");
    }

    public ARunnableS3S1210000_32(Context context, Aweme aweme, String str, boolean z, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
        this.z3 = z;
        this.l2 = context;
    }
}
