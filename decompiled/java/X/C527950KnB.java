package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;

/* JADX INFO: renamed from: X.0KnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527950KnB {
    public static final C527950KnB LIZ = new C527950KnB();

    public static final boolean LJFF() {
        C1403010mc7.LIZ.LJI().getClass();
        return C527960KnC.LIZ() && !((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ() && LIZIZ();
    }

    public static final int LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "autocut_anchor_album_style", true);
    }

    public static final boolean LIZIZ() {
        return !C0CHQ.LIZ().getAccountService().LIZ();
    }

    public static final boolean LIZJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_album_pre_extract_feature_for_autocut", true, false);
    }

    public static boolean LIZLLL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_pre_init_in_album", true, false);
    }

    public static boolean LJ() {
        UploadSingleSelectData uploadSingleSelectDataLIZ = C527940KnA.LIZ();
        return uploadSingleSelectDataLIZ != null && C527940KnA.LIZJ() && uploadSingleSelectDataLIZ.getUploadSingleSelect() && uploadSingleSelectDataLIZ.getUpload3Columns() && uploadSingleSelectDataLIZ.getUploadRememberLastChoice();
    }

    public static final String LJI() {
        return C0C64.LJIILLIIL().LJJ(31744, "autocut_frame_upload_type", "png", true);
    }
}
