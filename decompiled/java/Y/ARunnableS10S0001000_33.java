package Y;

import X.C0VC7;
import X.C1492110ovp;
import X.C1505630pHd;
import X.C157U;
import X.C157W;
import X.C1ATJ;
import X.C1C7U;
import X.C20302814cM;
import X.C204585153n;
import X.C21406218pw;
import X.C2184511AeX;
import X.C2187451AjH;
import X.C2187801Ajq;
import X.C2187891Ajz;
import X.C256140A2a;
import X.C303880Bve;
import X.C823020WQi;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.applog.util.BlockHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS10S0001000_33 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f279i0;

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
        boolean z = LivePitayaEnv.LIZ;
        int i = this.f279i0;
        LivePitayaEnv.LJII.clear();
        LivePitayaEnv.LJIIIIZZ.clear();
        LivePitayaEnv.LJFF.clear();
        LivePitayaEnv.LJI.clear();
        ((C1ATJ) LivePitayaEnv.LJIIL()).LJI(i);
        C157W.LIZIZ();
        C204585153n c204585153n = C204585153n.LIZ;
        if (C204585153n.LIZLLL()) {
            C157W.LIZIZ();
            C204585153n.LJI();
        }
        C157W.LIZ();
        C157U c157u = C157U.LIZ;
        if (C157U.LIZLLL.enable) {
            C157W.LIZ();
            if (C157U.LJIIIIZZ()) {
                C157W.LIZ();
                c157u.LJIIJJI();
            }
        }
        if (LiveClientAISettings.INSTANCE.frequentControlSettings().enableFrequentControl) {
            C21406218pw.LIZJ.destroy();
        }
    }

    public final void LIZ$1() {
        BlockHelper.endBlock();
        C1492110ovp.LIZIZ("applogslidebatch", new C20302814cM(), ((Boolean) C256140A2a.LIZJ.getValue()).booleanValue());
        C823020WQi.LIZIZ = false;
        C2187451AjH.LIZJ();
        if (C2187891Ajz.LIZIZ()) {
            Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
            C2187801Ajq.LJIIIZ(this.f279i0);
        }
        if (((Boolean) C303880Bve.LJIIIIZZ.getValue()).booleanValue()) {
            C2184511AeX.LJ.LIZJ();
        }
        C0VC7.LIZ();
    }

    public static final void run$0(ARunnableS10S0001000_33 aRunnableS10S0001000_33) {
        boolean zLIZ;
        C1C7U.LIZ("LivePitayaEnv@cdad.exitLive$1");
        try {
            aRunnableS10S0001000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePitayaEnv@cdad.exitLive$1");
    }

    public static final void run$1(ARunnableS10S0001000_33 aRunnableS10S0001000_33) {
        boolean zLIZ;
        C1C7U.LIZ("OptimizerHelper@3f44.stopLogBlock$1");
        try {
            aRunnableS10S0001000_33.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.stopLogBlock$1");
    }

    public ARunnableS10S0001000_33(int i, int i2) {
        this.$t = i2;
        this.f279i0 = i;
    }
}
