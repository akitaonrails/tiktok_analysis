package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.EnablePrivateAlbumWithoutPermissionExperiment;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.PrivateAlbumPartialAuthorizationBottomCTAExperiment;
import java.util.UUID;

/* JADX INFO: renamed from: X.0Kfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523280Kfe {
    public static final C523280Kfe LIZ = new C523280Kfe();

    public static String LIZIZ() {
        C0LGY.LIZ.getClass();
        return C0LGY.LJFF() ? "1" : C0LGY.LJI() ? "2" : CardStruct.IStatusCode.DEFAULT;
    }

    public static void LIZ(C0LAB c0lab) {
        c0lab.LJ("has_upload_permission", LIZIZ());
    }

    public static boolean LIZJ(boolean z) {
        if (!z) {
            return false;
        }
        if ((EnablePrivateAlbumWithoutPermissionExperiment.isEnabled() && !C0CHQ.LIZ().getAccountService().LIZ() && PrivateAlbumPartialAuthorizationBottomCTAExperiment.isEnabled()) || !EnablePrivateAlbumWithoutPermissionExperiment.isEnabled() || C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        C0LGY.LIZ.getClass();
        if (C0LGY.LJI() || C0LGY.LJFF()) {
            return false;
        }
        return true;
    }

    public static void LJ(C523280Kfe c523280Kfe, String str, String str2) {
        c523280Kfe.getClass();
        String string = UUID.randomUUID().toString();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", string);
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("from_page", "shoot_page");
        c0lab.LJ("type", "photo");
        C20684815ws.LJIILLIIL("second_permission_show", c0lab.LIZ);
    }

    public static void LIZLLL(C523280Kfe c523280Kfe, String str, String str2, String str3) {
        c523280Kfe.getClass();
        String string = UUID.randomUUID().toString();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", string);
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("from_page", "shoot_page");
        c0lab.LJ("type", "photo");
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        C20684815ws.LJIILLIIL("second_permission_action", c0lab.LIZ);
    }
}
