package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.performance.core.utils.image.SearchRequestResolutionConfigExperiment;
import java.util.Locale;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661140PwW {
    public static volatile C661130PwV LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static final C661140PwW LIZ = new C661140PwW();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(350));
    public static final C661130PwV LJFF = new C661130PwV(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 480);
    public static final C661130PwV LJI = new C661130PwV(400, 600);
    public static final C661130PwV LJII = new C661130PwV(500, 800);

    public static final String LIZIZ() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "search_request_resolution_multiplier", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!zLJIIIZ) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        int iLIZJ = LIZJ(C844470XAv.LIZ().getResources().getDisplayMetrics().density);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"multiplier\":");
        sbLIZ.append(iLIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZLLL() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "search_request_resolution", true, false);
            return zLJIIIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return zLJIIIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ() {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C661140PwW.LIZ():java.lang.String");
    }

    public static int LIZJ(float f) {
        String lowerCase;
        String str;
        Boolean bool;
        if (f <= 0.0f) {
            return 2;
        }
        if (C0Q51.LIZ() != 0 && (bool = SearchRequestResolutionConfigExperiment.LIZ().forceLowResolutionOnWeakNetwork) != null && bool.booleanValue()) {
            return 2;
        }
        String str2 = SearchRequestResolutionConfigExperiment.LIZ().multiplierBucketMode;
        if (str2 != null) {
            lowerCase = str2.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if (Intrinsics.LJFF(lowerCase, "floor")) {
            str = "floor";
        } else {
            str = "default";
        }
        if (Intrinsics.LJFF(str, "floor")) {
            if (f < 3.0f) {
                return 2;
            }
            if (f >= 4.0f) {
                return 4;
            }
        } else {
            if (f <= 2.0f) {
                return 2;
            }
            if (f > 3.0f) {
                return 4;
            }
        }
        return 3;
    }
}
