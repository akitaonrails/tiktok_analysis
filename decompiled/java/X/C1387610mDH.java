package X;

import Y.ARunnableS121S0100000_21;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mDH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387610mDH {
    public static final C1387610mDH LIZ = new C1387610mDH();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0CGQ());
    public static boolean LIZJ;
    public static double LIZLLL;
    public static boolean LJ;
    public static long LJFF;
    public static boolean LJI;

    public static float LIZJ() {
        return ((Number) LIZIZ.getValue()).floatValue();
    }

    public static void LJ() {
        Keva.getRepo("repo_auto_volume").storeBoolean("auto_volume_state", !C10EU.LJIILIIL());
    }

    public static boolean LIZIZ() {
        return C638290P1v.LIZ() && Keva.getRepo("repo_auto_volume").getBoolean("auto_volume_state", C10EU.LJIILIIL() ^ true);
    }

    public static boolean LIZLLL() {
        if (Math.abs(System.currentTimeMillis() - LJFF) > Mp4ScreenVideoLoadTimeout.CONTROL) {
            LJFF = System.currentTimeMillis();
            C844470XAv.LIZ.getClass();
            int iLJI = C2179771ASp.LJI(C844470XAv.LIZ());
            boolean z = true;
            if (iLJI != 1 && iLJI != 2) {
                z = false;
            }
            LJI = z;
        }
        return LJI;
    }

    public static void LIZ(double d) {
        if (LIZJ() >= 0.0f && LIZJ() <= 1.0f) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            C2206741BYi.LIZ.getClass();
            if (C2206741BYi.LIZIZ()) {
                ((ExecutorService) C2206741BYi.LJFF.getValue()).execute(new ARunnableS121S0100000_21(contextLIZ, 132));
                LJFF(true);
                LIZJ = true;
                return;
            }
            if (d <= LIZJ()) {
                return;
            }
            int iLIZJ = (int) (LIZJ() * C2179771ASp.LJFF(contextLIZ));
            if (!C2179771ASp.LJIIJJI(contextLIZ)) {
                try {
                    C2179771ASp.LIZ.setStreamVolume(3, iLIZJ, 8);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    CrashlyticsWrapperService.LIZLLL().logException(e);
                }
            }
            Unit unit = Unit.LIZ;
            LJFF(true);
            LIZJ = true;
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("auto volume adjustment result: ");
            sbLIZ.append(unit);
            c2276411E8h.LIZJ("common_feed", 4, "AutoVolumeAdjustmentHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C2276411E8h.LIZIZ.LIZJ("common_feed", 4, "AutoVolumeAdjustmentHelper", "auto volume threshold is invalid. ");
    }

    public static void LJFF(boolean z) {
        Keva repo;
        LJ = z;
        if (!z && (repo = Keva.getRepo("repo_auto_volume")) != null) {
            repo.storeBoolean("need_show_auto_volume_toast", false);
        }
    }
}
