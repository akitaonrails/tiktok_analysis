package X;

import com.ss.android.ugc.aweme.experiment.SkylightFullSceneDiskCacheConfig;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596340NaC {
    public static final SkylightFullSceneDiskCacheConfig LIZ = new SkylightFullSceneDiskCacheConfig(false, 900, 86400, false, false, 100, 150, 5, 8, 4, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(89));

    public static SkylightFullSceneDiskCacheConfig LIZIZ() {
        return (SkylightFullSceneDiskCacheConfig) LIZIZ.getValue();
    }

    public static boolean LIZJ() {
        return LIZIZ().isEnabled && LIZIZ().enableInbox;
    }

    public static int LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0;
                    }
                    return LIZIZ().nonFypCacheCount;
                }
                return LIZIZ().nonFypCacheCount;
            }
            return LIZIZ().fypCacheCount;
        }
        return LIZIZ().nonFypCacheCount;
    }

    public static void LIZLLL(String str, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callSite=");
        sbLIZ.append(str);
        sbLIZ.append(", tookLayered=");
        sbLIZ.append(z);
        sbLIZ.append(", globalEnabled=");
        sbLIZ.append(LIZIZ().isEnabled);
        sbLIZ.append(", enableInbox=");
        sbLIZ.append(LIZIZ().enableInbox);
        C1720106oR.LJI("InboxLayeredCacheProbe", C2188811AlT.LIZIZ(sbLIZ));
    }
}
