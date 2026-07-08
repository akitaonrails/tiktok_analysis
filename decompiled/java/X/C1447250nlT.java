package X;

import com.ss.android.ugc.aweme.image.experiment.EditCoverCropAndPreviewConfig;
import com.ss.android.ugc.aweme.image.experiment.EditCoverOptPublishConfig;

/* JADX INFO: renamed from: X.0nlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447250nlT {
    public static final EditCoverOptPublishConfig LIZ = new EditCoverOptPublishConfig(false, false, false, false, false, false);

    public static boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EditCoverCropAndPreviewConfig editCoverCropAndPreviewConfig = C1447260nlU.LIZ;
        EditCoverCropAndPreviewConfig editCoverCropAndPreviewConfig2 = (EditCoverCropAndPreviewConfig) c0c64LJIILLIIL.LJJII(EditCoverCropAndPreviewConfig.class, editCoverCropAndPreviewConfig, "edit_cover_opt_2", true);
        if (editCoverCropAndPreviewConfig2 != null) {
            editCoverCropAndPreviewConfig = editCoverCropAndPreviewConfig2;
        }
        return editCoverCropAndPreviewConfig.enableCoverCrop2 && (C0CHQ.LIZ().getAccountService().LIZ() ^ true);
    }

    public static boolean LIZIZ() {
        return LJ().enableEditCoverInPreview && (C0CHQ.LIZ().getAccountService().LIZ() ^ true);
    }

    public static boolean LIZJ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EditCoverCropAndPreviewConfig editCoverCropAndPreviewConfig = C1447260nlU.LIZ;
        EditCoverCropAndPreviewConfig editCoverCropAndPreviewConfig2 = (EditCoverCropAndPreviewConfig) c0c64LJIILLIIL.LJJII(EditCoverCropAndPreviewConfig.class, editCoverCropAndPreviewConfig, "edit_cover_opt_2", true);
        if (editCoverCropAndPreviewConfig2 != null) {
            editCoverCropAndPreviewConfig = editCoverCropAndPreviewConfig2;
        }
        return editCoverCropAndPreviewConfig.enablePreviewCover2 && (C0CHQ.LIZ().getAccountService().LIZ() ^ true) && C0CHQ.LIZ().getAccountService().isLogin() && C0CHQ.LIZ().getAccountService().isLogin();
    }

    public static boolean LIZLLL() {
        return LJ().enableUploadCover && (C0CHQ.LIZ().getAccountService().LIZ() ^ true);
    }

    public static final EditCoverOptPublishConfig LJ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        EditCoverOptPublishConfig editCoverOptPublishConfig = LIZ;
        EditCoverOptPublishConfig editCoverOptPublishConfig2 = (EditCoverOptPublishConfig) c0c64LJIILLIIL.LJJII(EditCoverOptPublishConfig.class, editCoverOptPublishConfig, "edit_cover_opt", true);
        return editCoverOptPublishConfig2 != null ? editCoverOptPublishConfig2 : editCoverOptPublishConfig;
    }
}
