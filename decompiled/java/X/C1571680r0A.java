package X;

import com.ss.android.ugc.aweme.experiment.TabRecreateConfig;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0r0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571680r0A {
    public static final C01GW LIZ;
    public static final boolean LIZIZ;

    static {
        TabRecreateConfig tabRecreateConfig;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(131));
        LIZ = c01gwLIZIZ;
        TabRecreateConfig tabRecreateConfig2 = (TabRecreateConfig) c01gwLIZIZ.getValue();
        boolean z = true;
        if ((tabRecreateConfig2 == null || !tabRecreateConfig2.enableTopTab) && ((tabRecreateConfig = (TabRecreateConfig) c01gwLIZIZ.getValue()) == null || !tabRecreateConfig.enableBottomTab)) {
            z = false;
        }
        LIZIZ = z;
    }
}
