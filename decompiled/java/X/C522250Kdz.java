package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.EnablePrivateAlbumWithoutPermissionExperiment;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.experiments.PrivateAlbumPartialAuthorizationBottomCTAExperiment;

/* JADX INFO: renamed from: X.0Kdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522250Kdz {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        C0LGY.LIZ.getClass();
        return C0LGY.LJFF() ? "1" : C0LGY.LJI() ? "2" : CardStruct.IStatusCode.DEFAULT;
    }

    public static boolean LIZIZ() {
        if (!EnablePrivateAlbumWithoutPermissionExperiment.isEnabled()) {
            return false;
        }
        C0LGY.LIZ.getClass();
        return (C0LGY.LJI() || C0LGY.LJFF() || C0CHQ.LIZ().getAccountService().LIZ()) ? false : true;
    }

    public static boolean LIZJ() {
        if (!EnablePrivateAlbumWithoutPermissionExperiment.isEnabled() || C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        C0LGY.LIZ.getClass();
        return C0LGY.LJI() && PrivateAlbumPartialAuthorizationBottomCTAExperiment.isEnabled();
    }
}
