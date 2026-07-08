package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0XVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849820XVk {
    public static Boolean LIZ(Bundle bundle) {
        boolean z;
        if (!bundle.getBoolean("need_skip_restart") && !C0XQ5.LIZ().isNewUser() && C0XVM.LIZ(bundle) != 0) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static void LIZIZ(boolean z) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C849840XVm.LIZ.getClass();
        if (C849840XVm.LIZIZ == null) {
            return;
        }
        C849850XVn c849850XVn = C849850XVn.LIZIZ;
        if (c849850XVn.LIZJ().LIZJ()) {
            c849850XVn.LIZJ().LJJIJIIJIL();
            c849850XVn.LIZJ().LJ();
        }
        if (z) {
            str = "switch_account";
        } else {
            str = "login";
        }
        C0XVC.LIZ(Long.valueOf(jCurrentTimeMillis), "SocialAuthKevaUpdateHook", str);
    }
}
