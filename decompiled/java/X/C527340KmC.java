package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527340KmC {
    public static final C527340KmC LIZ = new C527340KmC();

    public static boolean LIZ(int i, boolean z) {
        if (C338630DPh.LIZ() && i == 0 && !z) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(int i, boolean z) {
        if (!((Boolean) C272860Ami.LIZ.getValue()).booleanValue()) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "add_ep_more_than_custom_fans", true) > 0) {
                InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
                if (accountService.isLogin()) {
                    String currentUserID = accountService.getCurrentUserID();
                    int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "add_ep_more_than_custom_fans", true);
                    C0E12 c0e12 = C363750ENx.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(currentUserID);
                    sbLIZ.append("_HAS_REACHED_");
                    sbLIZ.append(iLJIJ);
                    sbLIZ.append("_FANS");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0E12 c0e122 = C363750ENx.LIZ;
                    if (!c0e122.LIZ(strLIZIZ, false)) {
                        C19292410dm currentUser = accountService.getCurrentUser();
                        if (currentUser != null && currentUser.getFollowerCount() >= iLJIJ) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(currentUserID);
                            sbLIZ2.append("_HAS_REACHED_");
                            sbLIZ2.append(iLJIJ);
                            sbLIZ2.append("_FANS");
                            c0e122.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), true);
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (LIZ(i, z)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(String str, boolean z) {
        if (!z && !Intrinsics.LJFF(str, "filter_anchor")) {
            return false;
        }
        return true;
    }

    public static final void LIZLLL(String str, String str2, String str3) {
        C527340KmC c527340KmC = LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", str3);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("content_source", "upload");
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(1, "is_editor_pro");
        Map<String, String> map = c0lab.LIZ;
        c527340KmC.getClass();
        C20684815ws.LJIILLIIL("show_edit", map);
    }
}
