package Y;

import X.AbstractC1387200mCc;
import X.C09JN;
import X.C1C7U;
import X.C2188811AlT;
import X.C606810Nr5;
import X.C727950Sgz;
import X.InterfaceC1711206n0;
import X.RunnableC715210S3r;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor;
import com.ss.android.ugc.feed.platform.monitor.infra.FeedInfraTimingSensor$timingHandler$1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class AfS134S0000000_11 implements C09JN {
    public final int $t;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS134S0000000_11(int r2) {
        /*
            r1 = this;
            r1.$t = r2
            if (r2 == 0) goto L9
            r0 = r1
        L5:
            r0.<init>()
            return
        L9:
            r0 = r1
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS134S0000000_11.<init>(int):void");
    }

    public static final void accept$0(AfS134S0000000_11 afS134S0000000_11, Object obj) {
        int iHashCode;
        int i;
        C1C7U.LIZ("FeedInfraTimingSensor@a0a1.initTab$2");
        AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) obj;
        if (abstractC1387200mCc.LIZLLL() instanceof InterfaceC1711206n0) {
            Fragment fragmentLIZLLL = abstractC1387200mCc.LIZLLL();
            if (fragmentLIZLLL != null) {
                iHashCode = fragmentLIZLLL.hashCode();
            } else {
                iHashCode = 0;
            }
            if (FeedInfraTimingSensor.LLILZLL && ((i = FeedInfraTimingSensor.LLIZLLLIL) == -1 || i == iHashCode)) {
                FeedInfraTimingSensor feedInfraTimingSensor = FeedInfraTimingSensor.LL;
                RunnableC715210S3r runnableC715210S3r = new Runnable() { // from class: X.0S3r
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("FeedInfraTimingSensor@a0a1.initTab$notifyOnMainPageResumed$1");
                        try {
                            FeedInfraTimingSensor.LL.getClass();
                            FeedInfraTimingSensor.LIZ();
                            Iterator it2 = ((ArrayList) FeedInfraTimingSensor.LLJ).iterator();
                            while (it2.hasNext()) {
                                InterfaceC715180S3o interfaceC715180S3o = (InterfaceC715180S3o) ((WeakReference) it2.next()).get();
                                if (interfaceC715180S3o != null) {
                                    interfaceC715180S3o.LJI(C0S48.ENTRY_MAINPAGE_RESUMED);
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("FeedInfraTimingSensor@a0a1.initTab$notifyOnMainPageResumed$1");
                    }
                };
                feedInfraTimingSensor.getClass();
                FeedInfraTimingSensor$timingHandler$1 feedInfraTimingSensor$timingHandler$1 = FeedInfraTimingSensor.LLJIJIL;
                feedInfraTimingSensor$timingHandler$1.removeCallbacks(runnableC715210S3r);
                feedInfraTimingSensor$timingHandler$1.postDelayed(runnableC715210S3r, 16L);
            }
            FeedInfraTimingSensor.LLIZLLLIL = iHashCode;
            FeedInfraTimingSensor.LLILZLL = false;
        } else {
            FeedInfraTimingSensor.LLILZLL = true;
        }
        C1C7U.LIZIZ("FeedInfraTimingSensor@a0a1.initTab$2");
    }

    public static final void accept$1(AfS134S0000000_11 afS134S0000000_11, Object obj) {
        C1C7U.LIZ("StoryRevealActiveManager@1b2d.backgroundListener$1");
        if (((C606810Nr5) obj).LIZIZ) {
            boolean z = C727950Sgz.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Will reportInactive: ");
            sbLIZ.append(!C727950Sgz.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C727950Sgz.LIZIZ = false;
        }
        C1C7U.LIZIZ("StoryRevealActiveManager@1b2d.backgroundListener$1");
    }
}
