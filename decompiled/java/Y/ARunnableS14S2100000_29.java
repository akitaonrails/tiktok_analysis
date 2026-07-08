package Y;

import X.C036E;
import X.C0O0L;
import X.C11FW;
import X.C19371910qb;
import X.C19372010qc;
import X.C19389810tU;
import X.C1C7U;
import X.C786410Ut5;
import X.EnumC19385810sq;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.task.resaltas.WindowConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS14S2100000_29 implements Runnable {
    public final int $t;
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

    public final void LIZ$0() {
        if (Intrinsics.LJFF(((C19389810tU) this.l2).LLJJ, this.s0)) {
            ((C19389810tU) this.l2).LJIJI().LJIIIZ(this.s1);
            if (C036E.LIZ.LIZJ != C0O0L.AVAILABLE) {
                ((C19389810tU) this.l2).LJJ().vQ2(EnumC19385810sq.NET_ERROR);
            }
        }
    }

    public final void LIZ$1() {
        C19371910qb c19371910qb = (C19371910qb) this.l2;
        String str = this.s0;
        String str2 = this.s1;
        C19372010qc c19372010qc = c19371910qb.LIZLLL;
        if (c19372010qc != null) {
            WindowConfig windowConfig = c19372010qc.LIZ;
            String str3 = windowConfig.endScene;
            if (str3 == null || windowConfig.endState == null || !u.LJJIIJZLJL(str, str3, false) || !Intrinsics.LJFF(str2, windowConfig.endState)) {
                return;
            }
            c19371910qb.LIZ();
            return;
        }
        for (WindowConfig windowConfig2 : c19371910qb.LIZ.windows) {
            if (windowConfig2.startScene.length() > 0 && u.LJJIIJZLJL(str, windowConfig2.startScene, false) && Intrinsics.LJFF(str2, windowConfig2.startState)) {
                c19371910qb.LIZLLL = new C19372010qc(windowConfig2, str, SystemClock.elapsedRealtime());
                C786410Ut5.LJLIIL(c19371910qb.LJ, c19371910qb.LIZJ, c19371910qb.LJFF);
                long j = windowConfig2.timeoutMs;
                if (j > 0) {
                    C786410Ut5.LJLIIL(j, c19371910qb.LIZJ, c19371910qb.LJI);
                    return;
                }
                return;
            }
        }
    }

    public static final void run$0(ARunnableS14S2100000_29 aRunnableS14S2100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("OnboardingCardActionUtil@c222.realCopyGroupLinkAndGoToProfile$1$1$1");
        try {
            C11FW c11fw = C11FW.LIZ;
            Context context = (Context) aRunnableS14S2100000_29.l2;
            String str = aRunnableS14S2100000_29.s0;
            String str2 = aRunnableS14S2100000_29.s1;
            c11fw.getClass();
            C11FW.LIZ(context, str, str2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnboardingCardActionUtil@c222.realCopyGroupLinkAndGoToProfile$1$1$1");
    }

    public static final void run$1(ARunnableS14S2100000_29 aRunnableS14S2100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("PlayerViewComponent@ca10.postNetworkCheck$1");
        try {
            aRunnableS14S2100000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayerViewComponent@ca10.postNetworkCheck$1");
    }

    public static final void run$2(ARunnableS14S2100000_29 aRunnableS14S2100000_29) {
        boolean zLIZ;
        C1C7U.LIZ("PeriodicSamplingManager@95b9.onEvent$1");
        try {
            aRunnableS14S2100000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PeriodicSamplingManager@95b9.onEvent$1");
    }

    public ARunnableS14S2100000_29(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
