package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC767130U7j implements Runnable {
    public DataChannel LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public C767140U7k LLILZ;

    public final void LIZ() {
        C767120U7i.LJ = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_take_filter_effective_use");
        DataChannel dataChannel = this.LL;
        if (dataChannel == null) {
            c474500IjALIZ.LJIL();
        } else {
            c474500IjALIZ.LJIJJLI(dataChannel);
        }
        c474500IjALIZ.LJ(this.LLILLL ? "click" : "draw");
        C767140U7k c767140U7k = this.LLILZ;
        c474500IjALIZ.LJJII(c767140U7k != null ? c767140U7k.LIZ : null, "filter_id");
        C767140U7k c767140U7k2 = this.LLILZ;
        c474500IjALIZ.LJJII(c767140U7k2 != null ? c767140U7k2.LIZIZ : null, "resource_id");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLJJLI ? 1 : 0), "is_live_take_default");
        C767140U7k c767140U7k3 = this.LLILZ;
        c474500IjALIZ.LJJII(c767140U7k3 != null ? Integer.valueOf(c767140U7k3.LJFF) : null, "impr_position");
        C767140U7k c767140U7k4 = this.LLILZ;
        c474500IjALIZ.LJJIFFI(c767140U7k4 != null ? Float.valueOf(c767140U7k4.LIZJ) : null, "filter_value");
        C767140U7k c767140U7k5 = this.LLILZ;
        Integer numValueOf = c767140U7k5 != null ? Integer.valueOf(c767140U7k5.LIZLLL) : null;
        C767140U7k c767140U7k6 = this.LLILZ;
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(numValueOf, c767140U7k6 != null ? Integer.valueOf(c767140U7k6.LJ) : null) ? 1 : 0), "is_default_value");
        c474500IjALIZ.LJJIJL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveFilterLogManager$ReportFilterEffectiveUseRunnable@766.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveFilterLogManager$ReportFilterEffectiveUseRunnable@766.run");
    }
}
