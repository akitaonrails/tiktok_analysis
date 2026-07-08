package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.screenshot.ScreenshotShareFragment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0leu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366300leu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static boolean LIZ(final C19EG c19eg, String str, final String str2, final InterfaceC1366350lez interfaceC1366350lez) {
        final C259800zU c259800zU = new C259800zU();
        InterfaceC1366340ley interfaceC1366340leyLIZLLL = interfaceC1366350lez.LIZLLL();
        C1366560lfK.LL.getClass();
        if (C1366560lfK.LLILLJJLI) {
            return false;
        }
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        if (supportFragmentManager.LJJJJZI("screenshot_share_fragment") != null) {
            if (interfaceC1366340leyLIZLLL == null) {
                return false;
            }
            interfaceC1366340leyLIZLLL.LIZJ();
        }
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("SKELETON_SHARE_FRAGMENT");
        if (fragmentLJJJJZI instanceof DialogFragment) {
            ((DialogFragment) fragmentLJJJJZI).dismissAllowingStateLoss();
        }
        ScreenshotShareFragment screenshotShareFragment = new ScreenshotShareFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("screenshot_path", str, bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        screenshotShareFragment.setArguments(bundle);
        screenshotShareFragment.LLJILLL = interfaceC1366350lez;
        screenshotShareFragment.LLJILJILJ = interfaceC1366350lez.LIZLLL();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = screenshotShareFragment;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0let
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SharePackage sharePackageLIZ;
                SharePackage sharePackageLIZ2;
                String str3 = TuxSheet._pnsPageId;
                if (!Intrinsics.LJFF(C1391190mJ3.LJIIJJI(dialogInterface), C1366400lf4.LIZ)) {
                    if (C1366580lfM.LIZLLL()) {
                        C1366570lfL.LL.LIZJ();
                    }
                    C1366320lew c1366320lew = C1366320lew.LIZ;
                    String str4 = str2;
                    if (str4 == null) {
                        str4 = "other_page";
                    }
                    C1366320lew.LIZJ(c1366320lew, str4, "dismiss", null, null, 28);
                }
                String str5 = ScreenshotShareFragment._pnsPageId;
                InterfaceC1366350lez interfaceC1366350lez2 = interfaceC1366350lez;
                if (interfaceC1366350lez2 != null) {
                    sharePackageLIZ = interfaceC1366350lez2.LIZ();
                } else {
                    sharePackageLIZ = null;
                }
                if (sharePackageLIZ != null && interfaceC1366350lez2 != null && interfaceC1366350lez2.LIZIZ() && (sharePackageLIZ2 = interfaceC1366350lez.LIZ()) != null) {
                    C19EG c19eg2 = c19eg;
                    C259800zU<TuxSheet> c259800zU2 = c259800zU;
                    C1371590lnR c1371590lnRLJIIIZ = C621180OYa.LIZ.LJIIIZ(sharePackageLIZ2, c19eg2, new C1371970lo3(C13LE.LIZ(sharePackageLIZ2.getClass())));
                    ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
                    C1369870lkf.LJ(c259800zU2.element, c1371590lnRLJIIIZ);
                    InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnRLJIIIZ.LJJIFFI;
                    if (interfaceC1366490lfD != null) {
                        interfaceC1366490lfD.LJI(c19eg2, sharePackageLIZ2);
                    }
                }
                C1440005kM.LIZ(new C453940Hr6(false, false, 6));
            }
        };
        ?? r1 = c1390920mIc.LIZ;
        r1.LLILLJJLI = onDismissListener;
        c259800zU.element = r1;
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIJI(r1);
        TuxSheet tuxSheet2 = (TuxSheet) c259800zU.element;
        if (interfaceC1366340leyLIZLLL != null) {
            interfaceC1366340leyLIZLLL.LIZIZ(tuxSheet2);
        }
        tuxSheet2.show(supportFragmentManager, "screenshot_share_fragment");
        C1440005kM.LIZ(new C453940Hr6(true, false, 6));
        return true;
    }
}
