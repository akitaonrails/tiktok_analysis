package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.model.GeckoLiveGroupOpt;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveHostOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20573515ev {
    public static volatile C19866712oD LIZIZ;
    public static long LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static C1551680qTu LJI;
    public static ArrayList<String> LJII;
    public static long LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static C1551680qTu LJIIL;
    public static final C20573515ev LIZ = new C20573515ev();
    public static int LIZJ = -1;
    public static int LJIIIIZZ = -1;

    public static void LJFF() {
        try {
            if (LIZIZ != null) {
                return;
            }
            C19866712oD c19866712oD = new C19866712oD(((ILiveHostOuterService) ServiceManager.get().getService(ILiveHostOuterService.class)).LIZIZ());
            C19866812oE c19866812oE = c19866712oD.LIZ;
            if (c19866812oE != null) {
                c19866812oE.LIZIZ = true;
            }
            c19866712oD.LIZIZ(C1152580g6C.LIZ());
            LIZIZ = c19866712oD;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
        }
    }

    public static void LJI() {
        String str;
        if (LJIIJJI || LJIIJ || LJIIL != null) {
            return;
        }
        if (LJIIIIZZ < 0) {
            GeckoLiveGroupOpt geckoLiveGroupOpt = (GeckoLiveGroupOpt) C0IRS.LIZIZ.getValue();
            LJIIIIZZ = geckoLiveGroupOpt != null ? geckoLiveGroupOpt.retryTime : 3;
        }
        if (LJIIIZ <= 0) {
            LJIIIZ = System.currentTimeMillis();
        }
        LJIIJJI = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gecko_resource_download_channels");
        c474500IjALIZ.LJJII("live_normal", "download_channels");
        c474500IjALIZ.LIZ();
        LJFF();
        C19866712oD c19866712oD = LIZIZ;
        if (c19866712oD == null || (str = c19866712oD.LIZJ) == null) {
            return;
        }
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(str);
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setFrom("live_normal");
        optionCheckUpdateParams.setEnableThrottle(false);
        optionCheckUpdateParams.setExpireCleanGroup(true);
        optionCheckUpdateParams.setListener(new C16H1(0));
        if (c1551950qULLIZ != null) {
            c1551950qULLIZ.LIZ("live_normal", null, optionCheckUpdateParams);
        }
    }

    public static void LJII() {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        String string;
        String str;
        if (LJ || LJFF || LJI != null) {
            return;
        }
        GeckoLiveGroupOpt geckoLiveGroupOpt = (GeckoLiveGroupOpt) C0IRS.LIZIZ.getValue();
        if (geckoLiveGroupOpt == null || (arrayList = geckoLiveGroupOpt.channelList) == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.isEmpty()) {
            if (LIZLLL <= 0) {
                LIZLLL = System.currentTimeMillis();
            }
            if (LIZJ < 0) {
                GeckoLiveGroupOpt geckoLiveGroupOpt2 = (GeckoLiveGroupOpt) C0IRS.LIZIZ.getValue();
                LIZJ = geckoLiveGroupOpt2 != null ? geckoLiveGroupOpt2.retryTime : 3;
            }
            ArrayList<String> arrayList3 = LJII;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                GeckoLiveGroupOpt geckoLiveGroupOpt3 = (GeckoLiveGroupOpt) C0IRS.LIZIZ.getValue();
                if (geckoLiveGroupOpt3 == null || (arrayList2 = geckoLiveGroupOpt3.channelList) == null) {
                    arrayList2 = new ArrayList<>();
                }
                LJII = arrayList2;
            }
            LJFF = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gecko_resource_download_channels");
            ArrayList<String> arrayList4 = LJII;
            if (arrayList4 == null || (string = arrayList4.toString()) == null) {
                string = "";
            }
            c474500IjALIZ.LJJII(string, "download_channels");
            c474500IjALIZ.LIZ();
            LJFF();
            C19866712oD c19866712oD = LIZIZ;
            if (c19866712oD == null || (str = c19866712oD.LIZJ) == null) {
                return;
            }
            C1537050q6J.LIZ.getClass();
            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(str);
            ArrayList arrayList5 = new ArrayList();
            ArrayList<String> arrayList6 = LJII;
            if (arrayList6 != null) {
                Iterator<String> it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new CheckRequestBodyModel.TargetChannel(it2.next()));
                }
            }
            Map<String, List<CheckRequestBodyModel.TargetChannel>> mapLIZJ = C2097908Jt.LIZJ(new Pair(str, arrayList5));
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setFrom("live_normal");
            optionCheckUpdateParams.setEnableThrottle(false);
            optionCheckUpdateParams.setExpireCleanGroup(true);
            optionCheckUpdateParams.setListener(new C16H1(1));
            if (c1551950qULLIZ != null) {
                c1551950qULLIZ.LIZ("default", mapLIZJ, optionCheckUpdateParams);
            }
        }
    }

    public static void LIZIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gecko_resource_download_status_change");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static String LIZLLL(String str) {
        String str2;
        LJFF();
        C19866712oD c19866712oD = LIZIZ;
        if (c19866712oD != null) {
            str2 = c19866712oD.LIZJ;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        return C1550600qSA.LIZJ(str2, null, true, str);
    }

    public static String LJ(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        LJFF();
        C19866712oD c19866712oD = LIZIZ;
        if (c19866712oD != null) {
            str2 = c19866712oD.LIZJ;
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        C1553670qX7.LIZ.getClass();
        C1553670qX7.LIZLLL();
        return C1550610qSB.LIZIZ(str2, str);
    }

    public static void LIZ(int i, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gecko_resource_download_failed");
        c474500IjALIZ.LJJII(str, "extra_info");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, long j, String str2, boolean z, boolean z2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gecko_resource_download_complete");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "downloaded");
        c474500IjALIZ.LJJII(Boolean.valueOf(z2), "is_complete");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - j), "download_duration");
        c474500IjALIZ.LJJII(str, "download_channels");
        c474500IjALIZ.LJJII(str2, "from");
        c474500IjALIZ.LIZ();
    }
}
