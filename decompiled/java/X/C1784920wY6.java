package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784920wY6 {
    public static void LIZ(C474500IjA c474500IjA, C1778320wNS c1778320wNS, boolean z, C1824210xZT c1824210xZT, int i) {
        User userLJIJJLI;
        if ((i & 2) != 0) {
            z = false;
        }
        Long lValueOf = null;
        if ((i & 4) != 0) {
            c1824210xZT = null;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
            lValueOf = Long.valueOf(userLJIJJLI.getId());
        }
        String strValueOf = String.valueOf(lValueOf);
        c474500IjA.LJIL();
        c474500IjA.LJJII(strValueOf, "anchor_id");
        c474500IjA.LJJII(c1778320wNS.LIZ, "action_type");
        c474500IjA.LJJII(c1778320wNS.LIZIZ, "show_entrance");
        c474500IjA.LJJII(Integer.valueOf(c1778320wNS.LIZJ), "smb_tag");
        c474500IjA.LJJII(c1778320wNS.LIZLLL, "verify_method");
        c474500IjA.LJJII(Integer.valueOf(c1778320wNS.LJFF), "existing_verification");
        if (!z) {
            c474500IjA.LJJII(Integer.valueOf(c1778320wNS.LJ), "region_support_kyb");
        }
        if (z) {
            c474500IjA.LJJII(Integer.valueOf(c1778320wNS.LJ), "is_support_kyb");
        }
        if (Intrinsics.LJFF(c1778320wNS.LIZ, "click")) {
            c474500IjA.LJJII(c1778320wNS.LJI, "click_position");
        }
        if (c1824210xZT != null) {
            c1824210xZT.invoke(c474500IjA);
        }
    }
}
