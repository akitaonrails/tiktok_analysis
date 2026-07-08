package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0LBG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LBG {
    public static final C0LBG LIZ = new C0LBG();

    public static boolean LIZLLL() {
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        C0VSJ c0vsjLIZJ = LIZJ("create_tab_eoy_background.png");
        return c2137908Zd.LJFF(c0vsjLIZJ != null ? c0vsjLIZJ.getAbsolutePath() : null);
    }

    public static C0VSJ LIZ() {
        String appLanguage = ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eoy_lottie_");
        sbLIZ.append(appLanguage);
        sbLIZ.append(".json");
        return LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZIZ() {
        C0VSJ c0vsjLIZ = LIZ();
        if (c0vsjLIZ != null) {
            return c0vsjLIZ.getAbsolutePath();
        }
        return null;
    }

    public static boolean LJ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = C2137908Zd.LIZJ.LJFF(LIZIZ()) && LJFF(LIZ());
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEoyLottieFileExists: ");
        sbLIZ.append(jElapsedRealtime2);
        C201955140j.LIZLLL(c554890LpX, "EoyCreateTabResource", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static C0VSJ LIZJ(String str) {
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.EOY, "eoy_resources", true).getAbsolutePath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(absolutePath);
        sbLIZ.append('/');
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            return null;
        }
        return c0vsj;
    }

    public static boolean LJFF(C0VSJ c0vsj) throws Throwable {
        Object c098200Yq;
        boolean zM8isSuccessimpl = false;
        if (c0vsj == null) {
            return false;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String strLJI = C09BH.LJI(c0vsj, Charsets.UTF_8);
            try {
                new p();
                p.LIZJ(strLJI);
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("validateLocalLottieFile: ");
                sbLIZ.append(jElapsedRealtime2);
                C201955140j.LIZLLL(c554890LpX, "EoyCreateTabResource", C2188811AlT.LIZIZ(sbLIZ));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            zM8isSuccessimpl = C189200o6.m8isSuccessimpl(c098200Yq);
            return zM8isSuccessimpl;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Lottie] Failed to validate local file: ");
            sbLIZ2.append(e.getMessage());
            C201955140j.LIZLLL(c554890LpX2, "EoyCreateTabResource", C2188811AlT.LIZIZ(sbLIZ2));
            return zM8isSuccessimpl;
        }
    }
}
