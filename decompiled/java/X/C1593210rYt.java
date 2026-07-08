package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0rYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593210rYt {
    public static final C1593210rYt LIZ = new C1593210rYt();
    public static C1593250rYx LIZIZ;

    public static final void LIZ(TabChangeManager tabChangeManager, String str) {
        String strCQ2;
        if (LIZIZ == null) {
            if (tabChangeManager != null) {
                strCQ2 = tabChangeManager.CQ2();
            } else {
                strCQ2 = null;
            }
            if (!Intrinsics.LJFF(strCQ2, str) && C123100dR.LIZ(str)) {
                C1593310rZ3 c1593310rZ3 = new C1593310rZ3(strCQ2, new C1593240rYw(EnumC1593230rYv.START, System.currentTimeMillis()), EnumC1083510eIn.BOTTOM, EnumC1589910rTZ.DIRECT, str);
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    tabSwitchMetricServiceLIZ.LIZJ(c1593310rZ3);
                }
            }
        }
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ2 = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ2 != null) {
            tabSwitchMetricServiceLIZ2.LIZLLL(str, EnumC1593230rYv.FRAMEWORK);
        }
        LIZIZ = null;
    }

    public static final void LIZIZ(TabChangeManager tabChangeManager, String str) {
        C1593250rYx c1593250rYx;
        if (str != null) {
            Fragment fragmentKi = null;
            if (!(!a0.LJJJIL(str)) || (c1593250rYx = LIZIZ) == null) {
                return;
            }
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                String str2 = c1593250rYx.LIZ;
                C1593240rYw c1593240rYw = new C1593240rYw(EnumC1593230rYv.PRELOAD);
                if (tabChangeManager != null) {
                    fragmentKi = tabChangeManager.Ki(str);
                }
                tabSwitchMetricServiceLIZ.LJ(new C1593330rZ5(str2, str, c1593240rYw, fragmentKi));
            }
        }
    }

    public static final void LIZJ(String str, String str2) {
        if (!Intrinsics.LJFF(str2, "PUBLISH") && !Intrinsics.LJFF(str, str2) && str2 != null && str2.length() != 0) {
            C1593250rYx c1593250rYx = new C1593250rYx(str, new C1593240rYw(EnumC1593230rYv.START, System.currentTimeMillis()), EnumC1083510eIn.BOTTOM, EnumC1589910rTZ.CLICK_BOTTOM_ICON, str2);
            LIZIZ = c1593250rYx;
            TabSwitchMetricService.LIZ.getClass();
            TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
            if (tabSwitchMetricServiceLIZ != null) {
                tabSwitchMetricServiceLIZ.LIZJ(c1593250rYx);
            }
        }
    }
}
