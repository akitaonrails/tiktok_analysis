package Y;

import X.C1590906Kt;
import X.C1C7U;
import X.C2188811AlT;
import X.C805380Via;
import X.ViewOnClickListenerC1576306Fd;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class ARunnableS8S1200000_2 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public final void LIZ$0() {
        if (Intrinsics.LJFF(((ViewOnClickListenerC1576306Fd) this.l1).LLILZ, this.s0)) {
            boolean z = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakHandler: onUpdate: bondId=");
            sbLIZ.append(((ViewOnClickListenerC1576306Fd) this.l1).LLILZ);
            sbLIZ.append(", scene=");
            sbLIZ.append(((ViewOnClickListenerC1576306Fd) this.l1).LLILLJJLI);
            sbLIZ.append(", this=");
            sbLIZ.append(((ViewOnClickListenerC1576306Fd) this.l1).hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            ((ViewOnClickListenerC1576306Fd) this.l1).LJIIIZ((StreakData) this.l2, true);
        }
    }

    public static final void run$0(ARunnableS8S1200000_2 aRunnableS8S1200000_2) {
        boolean zLIZ;
        C1C7U.LIZ("RavenFragment@d0e1.scheduleBodyVisibilityRestoreAfterNextPreDraw$2");
        try {
            Function0 function0 = (Function0) aRunnableS8S1200000_2.l1;
            if (function0 != null) {
                function0.invoke();
            }
            RavenFragment ravenFragment = (RavenFragment) aRunnableS8S1200000_2.l2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aRunnableS8S1200000_2.s0);
            sbLIZ.append(" viewTreeObserver dead");
            ravenFragment.hT(C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.scheduleBodyVisibilityRestoreAfterNextPreDraw$2");
    }

    public static final void run$1(ARunnableS8S1200000_2 aRunnableS8S1200000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ReportServiceImpl@4933.reportCustomerThrowable$1");
        try {
            C805380Via.LIZLLL((Throwable) aRunnableS8S1200000_2.l1, aRunnableS8S1200000_2.s0, (Map) aRunnableS8S1200000_2.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReportServiceImpl@4933.reportCustomerThrowable$1");
    }

    public static final void run$2(ARunnableS8S1200000_2 aRunnableS8S1200000_2) {
        boolean zLIZ;
        C1C7U.LIZ("StreakHandler@b517.onUpdate$1");
        try {
            aRunnableS8S1200000_2.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StreakHandler@b517.onUpdate$1");
    }

    public ARunnableS8S1200000_2(String str, Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
