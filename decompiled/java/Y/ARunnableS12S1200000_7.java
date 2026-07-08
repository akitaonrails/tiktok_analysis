package Y;

import X.AbstractC484600IzS;
import X.C0J7Y;
import X.C1C7U;
import X.C20441214yg;
import X.C480540Isu;
import X.C480710ItB;
import X.C482800IwY;
import X.C484660IzY;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.android.livesdk.increase.IncreaseSDKTriggerEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS12S1200000_7 implements Runnable {
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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS12S1200000_7 aRunnableS12S1200000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStateManager@a4a7.updateStatusOrDeleteCardForFeed$1");
        try {
            ((C0J7Y) aRunnableS12S1200000_7.l2).LJ((Runnable) aRunnableS12S1200000_7.l1, aRunnableS12S1200000_7.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStateManager@a4a7.updateStatusOrDeleteCardForFeed$1");
    }

    public static final void run$1(ARunnableS12S1200000_7 aRunnableS12S1200000_7) {
        boolean zLIZ;
        C1C7U.LIZ("TopLiveBubbleManager@e3c2.showBubbleFromFollow$1");
        try {
            ((C482800IwY) aRunnableS12S1200000_7.l1).LJJII(aRunnableS12S1200000_7.s0, (Pair) aRunnableS12S1200000_7.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopLiveBubbleManager@e3c2.showBubbleFromFollow$1");
    }

    public static final void run$2(ARunnableS12S1200000_7 aRunnableS12S1200000_7) {
        int iQ4;
        C480540Isu c480540Isu = (C480540Isu) aRunnableS12S1200000_7.l1;
        Context context = (Context) aRunnableS12S1200000_7.l2;
        String str = aRunnableS12S1200000_7.s0;
        c480540Isu.getClass();
        C1C7U.LIZ("AudioFocusController@6126.start$1L");
        c480540Isu.LJI = context;
        c480540Isu.LJII = str;
        ((HashSet) C480710ItB.LIZJ).add(c480540Isu.LIZIZ);
        boolean z = false;
        try {
            iQ4 = C786410Ut5.q4(C480710ItB.LIZ, C480710ItB.LIZIZ, 3, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIL("AudioFocusUtil", "gainFocus error");
            iQ4 = 0;
        }
        if (iQ4 != 1) {
            if (c480540Isu.LIZLLL) {
                c480540Isu.LJ = System.currentTimeMillis();
                z = true;
            } else {
                c480540Isu.LJ = -1L;
            }
        } else {
            c480540Isu.LIZ = 1;
            c480540Isu.LJ = -1L;
        }
        c480540Isu.LIZIZ(context, str, z);
        C1C7U.LIZIZ("AudioFocusController@6126.start$1L");
    }

    public static final void run$3(ARunnableS12S1200000_7 aRunnableS12S1200000_7) {
        boolean zLIZ;
        C1C7U.LIZ("AbstractIncreaseSDK@e206.onTriggerEvent$countRunnable$1");
        try {
            ((DataChannel) aRunnableS12S1200000_7.l1).LC0(IncreaseSDKTriggerEvent.class, new C484660IzY(((AbstractC484600IzS) aRunnableS12S1200000_7.l2).LIZIZ(), aRunnableS12S1200000_7.s0));
            C786410Ut5.LJLIIL(1000L, ((AbstractC484600IzS) aRunnableS12S1200000_7.l2).LIZ, aRunnableS12S1200000_7);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbstractIncreaseSDK@e206.onTriggerEvent$countRunnable$1");
    }

    public ARunnableS12S1200000_7(C482800IwY c482800IwY, Pair pair, int i) {
        this.$t = i;
        this.l1 = c482800IwY;
        this.s0 = "newfollow";
        this.l2 = pair;
    }

    public ARunnableS12S1200000_7(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
