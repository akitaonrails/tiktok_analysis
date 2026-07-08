package X;

import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.image.aicover.AICoverPluginService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0nkg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446760nkg {
    public static final C1446760nkg LIZ = new C1446760nkg();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_text_ai_cover_pending_progress_fix", true, true);
    }

    public static boolean LIZJ() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_text_ai_cover_enable", true, false) || !C0CHQ.LIZ().getAccountService().isLogin() || C0CHQ.LIZ().getAccountService().LJIIJJI() || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_photo_mode_ai_desc_user", true, false)) {
            return false;
        }
        C20191713zX c20191713zX = C20191713zX.LIZ;
        c20191713zX.getClass();
        boolean zLIZ = C20191713zX.LIZ();
        if (!zLIZ) {
            C1450070nq1.LIZJ("ai_cover_plugin", "Didn't installed plugin AppContextManager.isBundle() = true");
            AICoverPluginService.LIZ.getClass();
            LIZLLL("plugin_not_ready", false, C1446770nkh.LIZ() != null, false);
            C1450070nq1.LIZJ("ai_cover_plugin", "plugin run install");
            c20191713zX.LIZJ();
            return false;
        }
        AICoverPluginService.LIZ.getClass();
        if (C1446770nkh.LIZ() != null) {
            C1450070nq1.LIZJ("ai_cover_plugin", "plugin service != null");
            LIZLLL(null, zLIZ, true, true);
            return true;
        }
        C1450070nq1.LIZJ("ai_cover_plugin", "Didn't installed plugin service = null");
        LIZLLL("service_null", zLIZ, false, false);
        C1450070nq1.LIZJ("ai_cover_plugin", "plugin run install");
        c20191713zX.LIZJ();
        return false;
    }

    public static int LJI() {
        return C0C64.LJIILLIIL().LJIJ(31744, 3, "ai_gen_ai_task_count", true);
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        CopyOnWriteArrayList<CoverNewItem> newCoverList;
        CopyOnWriteArrayList<CoverNewItem> newCoverList2;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_text_ai_cover_draft_cover_fix", true, true)) {
            videoPublishEditModel.getVideoCoverPath();
            CoverPublishModel coverPublishModel = videoPublishEditModel.creativeModel.coverPublishModel;
            if (coverPublishModel != null && (newCoverList2 = coverPublishModel.getNewCoverList()) != null) {
                newCoverList2.size();
            }
            videoPublishEditModel.setVideoCoverPath(null);
            CoverPublishModel coverPublishModel2 = videoPublishEditModel.creativeModel.coverPublishModel;
            if (coverPublishModel2 != null && (newCoverList = coverPublishModel2.getNewCoverList()) != null) {
                newCoverList.clear();
            }
        }
    }

    public static String LJ(VideoPublishEditModel videoPublishEditModel) {
        int imageCurrentIndex;
        SingleImageData next;
        String strLJII = C0MH8.LIZ.LJII(videoPublishEditModel, -1);
        if (strLJII != null && C2286708xd.LIZJ(strLJII)) {
            return strLJII;
        }
        String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
        if (videoCoverPath != null && C2286708xd.LIZJ(videoCoverPath)) {
            return videoCoverPath;
        }
        String str = videoPublishEditModel.creativeModel.publishPreviewModel.firstFramePath;
        if (str.length() > 0 && C2286708xd.LIZJ(str)) {
            return str;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData == null) {
            return null;
        }
        CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
        if (coverPublishModel != null) {
            imageCurrentIndex = coverPublishModel.getImageCurrentIndex();
        } else {
            imageCurrentIndex = 0;
        }
        int size = imageAlbumData.getImageList().size() - 1;
        if (size < 0) {
            size = 0;
        }
        SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(C13LZ.LJ(imageCurrentIndex, 0, size), imageAlbumData.getImageList());
        if (singleImageData != null) {
            LIZ.getClass();
            String strLJFF = LJFF(singleImageData);
            if (strLJFF != null) {
                return strLJFF;
            }
        }
        Iterator<SingleImageData> it2 = imageAlbumData.getImageList().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.isAICover()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SingleImageData singleImageData2 = next;
        if (singleImageData2 != null) {
            LIZ.getClass();
            String strLJFF2 = LJFF(singleImageData2);
            if (strLJFF2 != null) {
                return strLJFF2;
            }
        }
        return null;
    }

    public static String LJFF(SingleImageData singleImageData) {
        String realImportPath;
        String path;
        String path2;
        ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
        if (synthesisData != null && (path2 = synthesisData.getPath()) != null && C2286708xd.LIZJ(path2)) {
            return path2;
        }
        SrcImageInfo srcImageInfo = singleImageData.getSrcImageInfo();
        if (srcImageInfo != null && (path = srcImageInfo.getPath()) != null && C2286708xd.LIZJ(path)) {
            return path;
        }
        ImportVideoInfo originAlbumImageData = singleImageData.getOriginAlbumImageData();
        if (originAlbumImageData == null || (realImportPath = originAlbumImageData.getRealImportPath()) == null || !C2286708xd.LIZJ(realImportPath)) {
            return null;
        }
        return realImportPath;
    }

    public static void LIZLLL(String str, boolean z, boolean z2, boolean z3) {
        if (!LIZIZ.compareAndSet(false, true)) {
            return;
        }
        C1454050nwR c1454050nwR = C1454050nwR.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("plugin_name", "df_ship");
        c0lab.LJ("function_type", "ai_photo_cover");
        c1454050nwR.getClass();
        C1454050nwR.LJ(c0lab, "fail_reason", str);
        c0lab.LIZ(1, "is_bundle");
        c0lab.LIZ(z ? 1 : 0, "is_plugin_ready");
        c0lab.LIZ(z2 ? 1 : 0, "is_service_ready");
        c0lab.LIZ(z3 ? 1 : 0, "is_runtime_ready");
        C20684815ws.LJIILLIIL("ttinter_photo_cover_plugin_ready_status", c0lab.LIZ);
    }
}
