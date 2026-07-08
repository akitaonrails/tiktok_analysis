package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feedback.IScreenShotFeedbackService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.api.model.ScreenShotShareContent;
import com.ss.android.ugc.aweme.im.sharepanel.api.model.ScreenShotShareMobEventParam;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.screenshot.ScreenshotShareFragment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS16S2300000_21;
import kotlin.jvm.internal.AwS71S1000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366560lfK extends AbstractC2361009My {
    public static final C1366560lfK LL = new C1366560lfK();
    public static boolean LLILLJJLI;

    @Override // X.AbstractC2361009My
    public final boolean getNeedDispatchIfHandledAlready() {
        ArrayList arrayListLJ = C1697810uHb.LJ("poi_detail_page");
        C1366320lew.LIZ.getClass();
        return !arrayListLJ.contains(C1366320lew.LIZLLL());
    }

    public static boolean LIZ(ScreenShotShareContent screenShotShareContent) {
        C19EG c19egLIZIZ;
        String str;
        String str2;
        Context contextLJIIL = C1383370m6R.LJIIL();
        if (contextLJIIL == null || (c19egLIZIZ = C1388190mED.LIZIZ(contextLJIIL)) == null || (str = screenShotShareContent.imagePath) == null || str.length() == 0) {
            return false;
        }
        if (screenShotShareContent.shareModel instanceof C1372470lor) {
            ScreenShotShareMobEventParam screenShotShareMobEventParam = screenShotShareContent.mobParam;
            if (screenShotShareMobEventParam != null) {
                str2 = screenShotShareMobEventParam.enterFrom;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, "poi_detail") && ((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin() && C1865360ydq.LIZ() && LIZIZ(c19egLIZIZ) && !C1336205Ku.LIZJ().LIZJ() && !C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
                return LIZJ(c19egLIZIZ, screenShotShareContent, new C1366440lf8(true));
            }
        }
        if (!C1366580lfM.LIZIZ() || !((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin() || !C1865360ydq.LIZ() || !LIZIZ(c19egLIZIZ) || C1336205Ku.LIZJ().LIZJ() || C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
            return false;
        }
        C1366570lfL c1366570lfL = C1366570lfL.LL;
        Keva kevaLIZIZ = C1366570lfL.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("display_count_no_action_");
        sbLIZ.append(C1366570lfL.LLILLL);
        int i = kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva kevaLIZIZ2 = C1366570lfL.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update_time_");
        sbLIZ2.append(C1366570lfL.LLILLL);
        if (System.currentTimeMillis() >= kevaLIZIZ2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L) + TimeUnit.DAYS.toMillis(C1366580lfM.LIZ().dismissDays)) {
            c1366570lfL.LIZLLL();
        } else if (i >= C1366580lfM.LIZ().displayWithoutClickCount) {
            return false;
        }
        return LIZJ(c19egLIZIZ, screenShotShareContent, new C1366440lf8(false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[PHI: r1
      0x002c: PHI (r1v11 X.15ms) = (r1v15 X.15ms), (r1v16 X.15ms) binds: [B:24:0x0050, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.C19EG r11) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366560lfK.LIZIZ(X.19EG):boolean");
    }

    @Override // X.AbstractC2361009My
    public final boolean onShot(String str) {
        if (C673080Qag.LIZ() && C1255704vj.LIZ().LJJIIJZLJL(str)) {
            return true;
        }
        return LIZ(new ScreenShotShareContent(str, null, null, new ScreenShotShareMobEventParam("", "", "")));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0lez, X.0lf7] */
    public static boolean LIZJ(C19EG c19eg, final ScreenShotShareContent screenShotShareContent, final C1366440lf8 c1366440lf8) {
        boolean z;
        C1366320lew.LIZ.getClass();
        String strLIZLLL = C1366320lew.LIZLLL();
        String str = screenShotShareContent.imagePath;
        ?? r1 = new InterfaceC1366350lez() { // from class: X.0lf7
            @Override // X.InterfaceC1366350lez
            public final InterfaceC1366340ley LIZLLL() {
                return null;
            }

            @Override // X.InterfaceC1366350lez
            public final SharePackage LIZ() {
                return screenShotShareContent.sharePackage;
            }

            @Override // X.InterfaceC1366350lez
            public final boolean LIZIZ() {
                return c1366440lf8.LIZIZ;
            }

            @Override // X.InterfaceC1366350lez
            public final boolean LIZJ() {
                return c1366440lf8.LIZ;
            }
        };
        if (C1366580lfM.LIZJ()) {
            IScreenShotFeedbackService iScreenShotFeedbackService = (IScreenShotFeedbackService) ServiceManager.get().getService(IScreenShotFeedbackService.class);
            C1684090tvT<?> c1684090tvT = new C1684090tvT<>(C1669660tYC.LJJII, 0, c19eg.getResources().getString(R.string.t_b), null, new AwS71S1000000_21(strLIZLLL, 4), new AwS16S2300000_21(c19eg, str, strLIZLLL, (C1366430lf7) r1, c1366440lf8, 0), 2);
            boolean z2 = C2518409tu.LIZ;
            C0I0B c0i0b = C0I0B.LJFF;
            c0i0b.LIZJ();
            if (C894660Z7w.LIZLLL() && C2518409tu.LIZ) {
                z = true;
            } else {
                z = false;
            }
            if (iScreenShotFeedbackService.tryShowScreenShotFloatingView(c19eg, str, strLIZLLL, c1684090tvT, z)) {
                c0i0b.LIZIZ();
                C830490Whz c830490Whz = new C830490Whz();
                c830490Whz.put("enter_from", strLIZLLL);
                if (Intrinsics.LJFF(strLIZLLL, "video_detail_page")) {
                    c830490Whz.put("enter_dm", "video_detail_page");
                }
                C20684815ws.LJIILLIIL("show_screenshot_floating_layer", c830490Whz);
                if (c1366440lf8.LIZIZ) {
                    C733920Sqc.LIZ.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("action_type", "show");
                    c2344009Gk.LJIIIIZZ("enter_method", "screenshot_popup");
                    C20684815ws.LJIILLIIL("float_window_popup_external_share", c2344009Gk.LIZ);
                }
                return true;
            }
        } else {
            if (C1366580lfM.LIZLLL()) {
                String str2 = ScreenshotShareFragment._pnsPageId;
                return C1366300leu.LIZ(c19eg, str, strLIZLLL, r1);
            }
            if (c1366440lf8.LIZIZ) {
                String str3 = ScreenshotShareFragment._pnsPageId;
                return C1366300leu.LIZ(c19eg, str, strLIZLLL, r1);
            }
        }
        return false;
    }
}
