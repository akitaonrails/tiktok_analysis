package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.settings.EnhanceSharePanelUIConfig;
import com.ss.android.ugc.aweme.share.settings.ImSectionConfig;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369770lkV {
    public static final void LIZ(BaseSharePackage baseSharePackage) {
        if (!C1371040lmY.LIZ()) {
            return;
        }
        baseSharePackage.extras.putBoolean("key_share_panel_action_adjust", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C1371600lnS r18) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369770lkV.LIZIZ(X.0lnS):void");
    }

    public static final void LIZJ(BaseSharePackage baseSharePackage) {
        boolean zLJFF;
        if (!C1371040lmY.LIZLLL()) {
            return;
        }
        ImSectionConfig imSectionConfigLIZJ = C1371040lmY.LIZJ();
        if (imSectionConfigLIZJ != null) {
            zLJFF = Intrinsics.LJFF(imSectionConfigLIZJ.useVerticalIms, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        baseSharePackage.extras.putBoolean("share_panel_new_nav_bar", zLJFF);
    }

    public static final void LIZLLL(BaseSharePackage baseSharePackage) {
        if (!C1371040lmY.LIZ()) {
            return;
        }
        baseSharePackage.extras.putBoolean("key_filter_enabled_actions", true);
    }

    public static final boolean LJ(C1371600lnS c1371600lnS) {
        if (c1371600lnS.LJJJJLL && c1371600lnS.LJJJJZ != null) {
            return true;
        }
        return false;
    }

    public static final void LJFF(C1371600lnS c1371600lnS) {
        Bundle bundle;
        Bundle bundle2;
        List<ShareItemOrderBean> list;
        if (LJ(c1371600lnS)) {
            return;
        }
        BaseSharePackage baseSharePackage = c1371600lnS.LJJIIJ;
        if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null && bundle2.getBoolean("key_share_panel_action_adjust", false)) {
            EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ = C1371040lmY.LIZIZ();
            if (enhanceSharePanelUIConfigLIZIZ != null) {
                list = enhanceSharePanelUIConfigLIZIZ.shareActions;
            } else {
                list = null;
            }
            if (C695930RRn.LIZLLL(list)) {
                c1371600lnS.LIZ(new C789210Uxb());
            }
        }
        BaseSharePackage baseSharePackage2 = c1371600lnS.LJJIIJ;
        if (baseSharePackage2 != null && (bundle = baseSharePackage2.extras) != null && bundle.getBoolean("key_filter_enabled_actions", false)) {
            c1371600lnS.LJJ = new AwS600S0100000_21(c1371600lnS.LJJ, (Function1<? super IDanmakuData, Integer>) 374);
        }
    }

    public static final void LJI(C1371600lnS c1371600lnS) {
        if (!LJ(c1371600lnS)) {
            C1369610lkF c1369610lkF = c1371600lnS.LJJLIIIJJIZ;
            if (c1369610lkF == null) {
                c1369610lkF = new C1369610lkF();
            }
            C1366030leT.LIZ.getClass();
            if (C1366030leT.LJI()) {
                c1371600lnS.LJJIIZI = 44;
                c1369610lkF.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                c1369610lkF.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            } else {
                c1369610lkF.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                C1362230lYL c1362230lYL = c1371600lnS.LJJLIIIJL;
                if (c1362230lYL != null && c1362230lYL.LJIIL >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) {
                    c1371600lnS.LJJIIZI = 56;
                    c1369610lkF.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
            }
            c1371600lnS.LJJLIIIJJIZ = c1369610lkF;
        }
        if (!LJ(c1371600lnS)) {
            C1370200llC c1370200llC = c1371600lnS.LJJLIIIJJI;
            if (c1370200llC == null) {
                c1370200llC = new C1370200llC();
            }
            C1366030leT.LIZ.getClass();
            if (C1366030leT.LJI()) {
                c1371600lnS.LJJIJ = 44;
                c1370200llC.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                c1370200llC.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            } else {
                c1370200llC.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                C1362230lYL c1362230lYL2 = c1371600lnS.LJJLIIIJL;
                if (c1362230lYL2 != null && c1362230lYL2.LJIIL >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) {
                    c1371600lnS.LJJIJ = 56;
                    c1370200llC.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
            }
            c1371600lnS.LJJLIIIJJI = c1370200llC;
        }
    }

    public static final void LJII(BaseSharePackage baseSharePackage) {
        boolean zLJFF;
        if (!C1371040lmY.LIZLLL()) {
            return;
        }
        ImSectionConfig imSectionConfigLIZJ = C1371040lmY.LIZJ();
        if (imSectionConfigLIZJ != null) {
            zLJFF = Intrinsics.LJFF(imSectionConfigLIZJ.useVerticalIms, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        baseSharePackage.extras.putBoolean("share_panel_use_vertical_im", zLJFF);
        C1366030leT.LIZ.getClass();
        baseSharePackage.extras.putBoolean("drag_to_expand_handle_visible", C1366030leT.LJFF(null));
        if (baseSharePackage.LJIILL()) {
            baseSharePackage.extras.putBoolean("key_force_operation_layout_divider", true);
        }
    }

    public static final void LJIIIIZZ(BaseSharePackage baseSharePackage) {
        EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ = C1371040lmY.LIZIZ();
        if (enhanceSharePanelUIConfigLIZIZ != null && Intrinsics.LJFF(enhanceSharePanelUIConfigLIZIZ.useSquareIcon, Boolean.TRUE)) {
            baseSharePackage.extras.putBoolean("use_enhance_share_panel_use_square_icon", true);
        }
    }
}
