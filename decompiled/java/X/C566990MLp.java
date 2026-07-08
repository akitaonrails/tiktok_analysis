package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;

/* JADX INFO: renamed from: X.0MLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566990MLp {
    public static void LIZ(Bundle bundle) {
        if (bundle.getBoolean("is_aivatar")) {
            return;
        }
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        String string = bundle.getString("creation_id");
        if (string == null) {
            string = "";
        }
        String string2 = bundle.getString("shoot_way");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle.getString("enter_from");
        if (string3 == null) {
            string3 = "";
        }
        C1449410nox c1449410nox = new C1449410nox(string, string2, string3, null, null, null, null, null, 248);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("last_group_id", C1443560nfW.LIZIZ);
        c0lab.LJ("last_gid_from", C1443560nfW.LIZJ);
        c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        iRecordMobService.LIZIZ(c1449410nox, c0lab, null);
    }
}
