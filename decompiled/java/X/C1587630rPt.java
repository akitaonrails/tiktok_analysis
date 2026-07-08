package X;

import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587630rPt {
    public static Pair LIZ() {
        return C1589640rT8.LIZIZ.F2() ? new Pair("FRIENDS_FEED", EnumC1593290rZ1.VIDEO) : C319860CgK.LIZ() ? new Pair("FRIENDS_TAB", EnumC1593290rZ1.VIEW) : new Pair("FRIENDS_TAB", EnumC1593290rZ1.VIDEO);
    }

    public static void LIZIZ(boolean z) {
        Pair pairLIZ = LIZ();
        String str = (String) pairLIZ.getFirst();
        EnumC1593290rZ1 enumC1593290rZ1 = (EnumC1593290rZ1) pairLIZ.getSecond();
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            tabSwitchMetricServiceLIZ.LIZIZ(str, enumC1593290rZ1, z);
        }
    }
}
