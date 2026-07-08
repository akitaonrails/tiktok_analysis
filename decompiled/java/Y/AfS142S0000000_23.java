package Y;

import X.C09JN;
import X.C1487220onw;
import X.C1488870oqb;
import X.C1C7U;
import X.C2214201BlK;
import X.C7740030o;
import X.C799890VZj;
import X.C799900VZk;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.video.PlayerPluginInstallTask;
import kotlin.Pair;

/* JADX INFO: loaded from: classes24.dex */
public class AfS142S0000000_23 implements C09JN {
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
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public AfS142S0000000_23(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS142S0000000_23 afS142S0000000_23, Object obj) {
        C1C7U.LIZ("PlayerKitInitHelper@d98f.init$4L");
        if (C2214201BlK.LJIIJJI) {
            PlayerPluginInstallTask playerPluginInstallTask = new PlayerPluginInstallTask();
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(playerPluginInstallTask);
            c799890VZj.LIZIZ();
            C799900VZk.LIZJ(playerPluginInstallTask);
            C1487220onw.LIZ.dispose();
        }
        C1C7U.LIZIZ("PlayerKitInitHelper@d98f.init$4L");
    }

    public static final void accept$1(AfS142S0000000_23 afS142S0000000_23, Object obj) {
        C1C7U.LIZ("PlayerKitInitHelper@d98f.initForPushInitPlayerOpt$1L");
        if (C2214201BlK.LJIIJJI) {
            PlayerPluginInstallTask playerPluginInstallTask = new PlayerPluginInstallTask();
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(playerPluginInstallTask);
            c799890VZj.LIZIZ();
            C799900VZk.LIZJ(playerPluginInstallTask);
            C1487220onw.LIZ.dispose();
        }
        C1C7U.LIZIZ("PlayerKitInitHelper@d98f.initForPushInitPlayerOpt$1L");
    }

    public static final void accept$2(AfS142S0000000_23 afS142S0000000_23, Object obj) {
        C1C7U.LIZ("SurveyFrequencyGroup@f8de.setNextTime$2");
        Pair pair = (Pair) obj;
        C1488870oqb.LIZJ.storeString((String) pair.getFirst(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), pair.getSecond()));
        C1C7U.LIZIZ("SurveyFrequencyGroup@f8de.setNextTime$2");
    }
}
