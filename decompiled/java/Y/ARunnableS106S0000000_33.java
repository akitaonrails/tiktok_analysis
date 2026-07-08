package Y;

import X.C15438062q;
import X.C1713400ugk;
import X.C1713420ugm;
import X.C1BCA;
import X.C1C7U;
import X.C2183341Ace;
import X.C2184791Aez;
import X.C2184901AfA;
import X.C2184911AfB;
import X.C2187431AjF;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C797990VSb;
import X.EnumC2184861Af6;
import X.InterfaceC2185021AfM;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.requesttask.idle.experment.GeckoHighGroupBackgroundSettings;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS106S0000000_33 implements Runnable {
    public final int $t;

    public static final void run$0(ARunnableS106S0000000_33 aRunnableS106S0000000_33) {
        C1C7U.LIZ("AdjustPercentBar@3327.<field>$2");
        C1C7U.LIZIZ("AdjustPercentBar@3327.<field>$2");
    }

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
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS106S0000000_33(int i) {
        this.$t = i;
    }

    public static final void run$1(ARunnableS106S0000000_33 aRunnableS106S0000000_33) {
        b0 b0Var = b0.INSTANCE;
        C1C7U.LIZ("TECameraServer@d252.createHandler$2L");
        int iMyTid = Process.myTid();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cameraThreadOptimization default thread priority:");
        sbLIZ.append(Process.getThreadPriority(iMyTid));
        C2183341Ace.LIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        Process.setThreadPriority(iMyTid, -19);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cameraThreadOptimization changed thread priority:");
        sbLIZ2.append(Process.getThreadPriority(iMyTid));
        C2183341Ace.LIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
        C1C7U.LIZIZ("TECameraServer@d252.createHandler$2L");
    }

    public static final void run$2(ARunnableS106S0000000_33 aRunnableS106S0000000_33) {
        b0 b0Var = b0.INSTANCE;
        C1C7U.LIZ("TECameraServer@d252.createHandler$1L");
        int iMyTid = Process.myTid();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cameraThreadOptimization default thread priority:");
        sbLIZ.append(Process.getThreadPriority(iMyTid));
        C2183341Ace.LIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        Process.setThreadPriority(iMyTid, -19);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("cameraThreadOptimization changed thread priority:");
        sbLIZ2.append(Process.getThreadPriority(iMyTid));
        C2183341Ace.LIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
        C1C7U.LIZIZ("TECameraServer@d252.createHandler$1L");
    }

    public static final void run$3(ARunnableS106S0000000_33 aRunnableS106S0000000_33) {
        C1C7U.LIZ("OptimizerHelper@3f44.updateSubpageJitOptions$1L");
        JatoXL.setJitOptions(C2187431AjF.LIZ().compileThreshold, C2187431AjF.LIZ().warmupThreshold, C2187431AjF.LIZ().osrThreshold, C2187431AjF.LIZ().priorityThreadWeight, C2187431AjF.LIZ().invokeTransitionWeight);
        C1C7U.LIZIZ("OptimizerHelper@3f44.updateSubpageJitOptions$1L");
    }

    public static final void run$4(ARunnableS106S0000000_33 aRunnableS106S0000000_33) {
        C1C7U.LIZ("StartupJankOptEntry@3e83.onStartupJankEnd$1L");
        if (((Boolean) C2184791Aez.LIZLLL.getValue()).booleanValue()) {
            C1BCA.LJJIIZI((C2184901AfA) C2184791Aez.LJFF.getValue());
        }
        C1C7U.LIZIZ("StartupJankOptEntry@3e83.onStartupJankEnd$1L");
    }

    public static final void run$5(ARunnableS106S0000000_33 aRunnableS106S0000000_33) {
        C1C7U.LIZ("StartupJankOptEntry@3e83.onStartupJankStart$2L");
        if (((Boolean) C2184791Aez.LIZLLL.getValue()).booleanValue()) {
            C1BCA.LIZ((C2184901AfA) C2184791Aez.LJFF.getValue());
        }
        C1C7U.LIZIZ("StartupJankOptEntry@3e83.onStartupJankStart$2L");
    }

    public static final void run$6(ARunnableS106S0000000_33 aRunnableS106S0000000_33) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoCustomRequest@b294.handleHighPriorityGroup$3");
        try {
            if (!C2214201BlK.LJIIJJI && GeckoHighGroupBackgroundSettings.LIZ().triggerForegroundDownload) {
                C797990VSb.LIZ.LJIILLIIL("occasion_high_priority");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoCustomRequest@b294.handleHighPriorityGroup$3");
    }

    public static final void run$7(ARunnableS106S0000000_33 aRunnableS106S0000000_33) {
        C1C7U.LIZ("MiloBlockManager@be13.onDestroy$1L");
        ArrayDeque<C2184901AfA> arrayDeque = C2184911AfB.LJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayDeque, 10));
        Iterator<C2184901AfA> it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJFF);
        }
        C2184911AfB c2184911AfB = C2184911AfB.LIZ;
        EnumC2184861Af6 enumC2184861Af6 = EnumC2184861Af6.NORMAL;
        c2184911AfB.getClass();
        C2184911AfB.LJI(enumC2184861Af6);
        Iterator<Map.Entry<C2184901AfA, Boolean>> it3 = C2184911AfB.LJFF.entrySet().iterator();
        while (it3.hasNext()) {
            C2184901AfA key = it3.next().getKey();
            for (InterfaceC2185021AfM interfaceC2185021AfM : (ArrayList) C1713420ugm.LIZ) {
                if (interfaceC2185021AfM instanceof C1713400ugk) {
                    interfaceC2185021AfM.LIZJ(key);
                }
            }
        }
        C2184911AfB.LJFF.clear();
        C2184911AfB.LJI.clear();
        C1C7U.LIZIZ("MiloBlockManager@be13.onDestroy$1L");
    }
}
