package X;

import Y.ARunnableS9S0001000_31;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.livesetting.clientai.LiveViewPagerSlideLogSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveOhrConfig;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.Map;

/* JADX INFO: renamed from: X.153n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204585153n implements InterfaceC484080Iyc {
    public static int LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final C204585153n LIZ = new C204585153n();
    public static final LiveOhrConfig LIZIZ = LiveClientAISettings.INSTANCE.aiServices().liveOhrConfig;
    public static final C20340814iU LJFF = new InterfaceC1513520pUM() { // from class: X.14iU
        @Override // X.InterfaceC1513520pUM
        public final void LIZ(int i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onOHRPredictStatus :: [");
            sbLIZ.append(i);
            sbLIZ.append(']');
            C20441214yg.LIZIZ("LiveOhrService", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC1513520pUM
        public final void LIZIZ(C1513530pUN c1513530pUN) {
            C204585153n c204585153n = C204585153n.LIZ;
            C204585153n.LIZJ = c1513530pUN.LIZIZ;
            Map<String, Object> map = C015G.LIZ;
            C015G.LIZ.put("livesdk_ohr_status", Integer.valueOf(C204585153n.LIZJ));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onOHRPredictChanged :: [");
            sbLIZ.append(c1513530pUN);
            sbLIZ.append(']');
            C20441214yg.LIZIZ("LiveOhrService", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    public static C157V LIZIZ() {
        return ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostClientAiService();
    }

    public static final boolean LIZLLL() {
        return LIZIZ.ohrPredictEnable || LiveViewPagerSlideLogSetting.INSTANCE.enable();
    }

    public static final void LJFF() {
        if (LIZLLL && !LJ) {
            C157V c157vLIZIZ = LIZIZ();
            if (c157vLIZIZ != null) {
                c157vLIZIZ.LJIILL();
            }
            LJ = true;
        }
    }

    public static final void LJI() {
        if (LIZLLL && LJ) {
            C157V c157vLIZIZ = LIZIZ();
            if (c157vLIZIZ != null) {
                c157vLIZIZ.LJIILIIL();
            }
            LJ = false;
        }
    }

    public final void LIZJ() {
        if (LIZLLL) {
            return;
        }
        C20441214yg.LIZIZ("LiveOhrService", "initSmartOhrPredict");
        LJ = true;
        LIZLLL = true;
        C157V c157vLIZIZ = LIZIZ();
        if (c157vLIZIZ != null) {
            c157vLIZIZ.LJII();
        }
        LJ(this, 0, 3);
    }

    @Override // X.InterfaceC484080Iyc
    public final void LIZ(MotionEvent motionEvent) {
        C157V c157vLIZIZ;
        if (LIZLLL && LIZLLL() && (c157vLIZIZ = LIZIZ()) != null) {
            c157vLIZIZ.LIZ(motionEvent);
        }
    }

    public static void LJ(C204585153n c204585153n, int i, int i2) {
        long j;
        if ((i2 & 1) != 0) {
            i = 5;
        }
        if ((i2 & 2) != 0) {
            j = 2000;
        } else {
            j = 0;
        }
        c204585153n.getClass();
        boolean zLJIIL = false;
        if (LIZLLL) {
            C157V c157vLIZIZ = LIZIZ();
            if (c157vLIZIZ != null) {
                zLJIIL = c157vLIZIZ.LJIIL(LJFF);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("registerOHRServiceObserver :: ");
            sbLIZ.append(zLJIIL);
            C20441214yg.LIZIZ("LiveOhrService", C2188811AlT.LIZIZ(sbLIZ));
            if (zLJIIL) {
                return;
            }
        }
        if (i > 0) {
            C786410Ut5.LJLIIL(j, C473410IhP.LIZ(), new ARunnableS9S0001000_31(i, 2));
        }
    }
}
