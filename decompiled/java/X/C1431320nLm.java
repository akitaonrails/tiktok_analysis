package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0nLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431320nLm {
    public final C543670LTx LIZ;
    public String LIZIZ;
    public VideoPublishEditModel LIZJ;
    public EnumC1434810nRP LIZLLL;
    public EnumC1404580mee LJ = EnumC1404580mee.VIDEO;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r3 = this;
            X.0LTx r2 = r3.LIZ
            android.app.Application r0 = X.C0CHQ.LIZ
            X.0VhM r0 = X.C786410Ut5.e3(r0)
            if (r0 == 0) goto L2a
            int[] r1 = X.C804560VhG.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case -1: goto L2a;
                case 0: goto L15;
                case 1: goto L2a;
                case 2: goto L2a;
                case 3: goto L1b;
                case 4: goto L1e;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                case 8: goto L24;
                case 9: goto L27;
                case 10: goto L2d;
                case 11: goto L2d;
                case 12: goto L2d;
                default: goto L15;
            }
        L15:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L1b:
            java.lang.String r1 = "mobile"
            goto L2f
        L1e:
            java.lang.String r1 = "2G"
            goto L2f
        L21:
            java.lang.String r1 = "3G"
            goto L2f
        L24:
            java.lang.String r1 = "4G"
            goto L2f
        L27:
            java.lang.String r1 = "5G"
            goto L2f
        L2a:
            java.lang.String r1 = "unknown"
            goto L2f
        L2d:
            java.lang.String r1 = "wifi"
        L2f:
            java.lang.String r0 = "network_type"
            r2.LIZLLL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431320nLm.LIZ():void");
    }

    public final void LIZIZ() {
        List<SingleImageData> imageList;
        String str;
        C543670LTx c543670LTx = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        c543670LTx.LIZLLL("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        VideoPublishEditModel videoPublishEditModel2 = this.LIZJ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        c543670LTx.LIZLLL("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel2));
        VideoPublishEditModel videoPublishEditModel3 = this.LIZJ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        c543670LTx.LIZLLL("shoot_way", videoPublishEditModel3.mShootWay);
        c543670LTx.LIZ(Boolean.valueOf(C523660KgG.LIZ()), "is_long_video_allowed");
        c543670LTx.LIZJ(Long.valueOf(C530010KqV.LIZ()), "long_video_threshold");
        VideoPublishEditModel videoPublishEditModel4 = this.LIZJ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        c543670LTx.LIZIZ(Integer.valueOf(videoPublishEditModel4.getVideoLength()), "videoLength");
        VideoPublishEditModel videoPublishEditModel5 = this.LIZJ;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        c543670LTx.LIZJ(Long.valueOf(C1403950mdd.LIZ(videoPublishEditModel5.getPreviewInfo())), "duration");
        VideoPublishEditModel videoPublishEditModel6 = this.LIZJ;
        if (videoPublishEditModel6 == null) {
            videoPublishEditModel6 = null;
        }
        if (videoPublishEditModel6.isMvThemeVideoType()) {
            VideoPublishEditModel videoPublishEditModel7 = this.LIZJ;
            if (videoPublishEditModel7 == null) {
                videoPublishEditModel7 = null;
            }
            if (videoPublishEditModel7.getUploadMiscInfoStruct() != null) {
                VideoPublishEditModel videoPublishEditModel8 = this.LIZJ;
                if (videoPublishEditModel8 == null) {
                    videoPublishEditModel8 = null;
                }
                AVUploadMiscInfoStruct uploadMiscInfoStruct = videoPublishEditModel8.getUploadMiscInfoStruct();
                if (uploadMiscInfoStruct == null || (str = uploadMiscInfoStruct.mvThemeId) == null) {
                    str = "";
                }
                c543670LTx.LIZLLL("mv_id", str);
            }
        }
        VideoPublishEditModel videoPublishEditModel9 = this.LIZJ;
        if (videoPublishEditModel9 == null) {
            videoPublishEditModel9 = null;
        }
        c543670LTx.LIZ(Boolean.valueOf(C1428470nHB.LJJLIIIJ(videoPublishEditModel9)), "is_fast_import");
        VideoPublishEditModel videoPublishEditModel10 = this.LIZJ;
        if (videoPublishEditModel10 == null) {
            videoPublishEditModel10 = null;
        }
        c543670LTx.LIZ(Boolean.valueOf(videoPublishEditModel10.getEditorProModel().isAdvancedEdit()), "is_advance_edit");
        VideoPublishEditModel videoPublishEditModel11 = this.LIZJ;
        if (videoPublishEditModel11 == null) {
            videoPublishEditModel11 = null;
        }
        c543670LTx.LIZ(Boolean.valueOf(videoPublishEditModel11.getEditorProModel().isAdvancedEditDraft()), "is_advance_edit_draft");
        VideoPublishEditModel videoPublishEditModel12 = this.LIZJ;
        if (videoPublishEditModel12 == null) {
            videoPublishEditModel12 = null;
        }
        c543670LTx.LIZ(Boolean.valueOf(videoPublishEditModel12.hasSubtitle()), "has_subtitle");
        VideoPublishEditModel videoPublishEditModel13 = this.LIZJ;
        if (videoPublishEditModel13 == null) {
            videoPublishEditModel13 = null;
        }
        c543670LTx.LIZIZ(Integer.valueOf(videoPublishEditModel13.segmentCounts()), "segment_count");
        VideoPublishEditModel videoPublishEditModel14 = this.LIZJ;
        if (videoPublishEditModel14 == null) {
            videoPublishEditModel14 = null;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel14)) {
            VideoPublishEditModel videoPublishEditModel15 = this.LIZJ;
            ImageAlbumData imageAlbumData = (videoPublishEditModel15 != null ? videoPublishEditModel15 : null).getImageAlbumData();
            c543670LTx.LIZIZ(Integer.valueOf((imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) ? 0 : imageList.size()), "image_count");
        }
    }

    public final void LJ() {
        C543670LTx c543670LTx = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        c543670LTx.LIZIZ(Integer.valueOf(videoPublishEditModel.getTtStoryUploadModel() != null ? 1 : 0), "is_story");
        VideoPublishEditModel videoPublishEditModel2 = this.LIZJ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        c543670LTx.LIZLLL("shoot_page", videoPublishEditModel2.isStoryEditMode() ? "story_shoot_page" : "video_shoot_page");
        VideoPublishEditModel videoPublishEditModel3 = this.LIZJ;
        TTStoryUploadModel ttStoryUploadModel = (videoPublishEditModel3 != null ? videoPublishEditModel3 : null).getTtStoryUploadModel();
        if (ttStoryUploadModel != null) {
            c543670LTx.LIZIZ(Integer.valueOf(ttStoryUploadModel.getIndex()), "clip_index");
            c543670LTx.LIZIZ(Integer.valueOf(ttStoryUploadModel.getTotalCount()), "clips_cnt");
        }
    }

    public C1431320nLm(C543670LTx c543670LTx) {
        this.LIZ = c543670LTx;
    }

    public final void LIZJ(AbstractC1431370nLr abstractC1431370nLr) {
        C543670LTx c543670LTx = this.LIZ;
        c543670LTx.LIZIZ(Integer.valueOf(abstractC1431370nLr.LIZJ()), "error_code");
        c543670LTx.LIZLLL("error_source", abstractC1431370nLr.LJ().getDesc());
        c543670LTx.LIZLLL("exception", C1331420kke.LIZ(abstractC1431370nLr.LIZ));
        String strLJ = C1431420nLw.LJ(abstractC1431370nLr.LIZ());
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publish node: ");
        EnumC1434810nRP enumC1434810nRP = this.LIZLLL;
        if (enumC1434810nRP == null) {
            enumC1434810nRP = null;
        }
        sbLIZ.append(enumC1434810nRP.getDesc());
        sbLIZ.append(", log_id: ");
        sbLIZ.append(strLJ);
        c1437510nVlLJJLIIIJ.LIZ("publish_failed_log_id", C2188811AlT.LIZIZ(sbLIZ));
        c543670LTx.LIZLLL("server_log_id", strLJ);
        String strLIZIZ = abstractC1431370nLr.LIZIZ();
        if (strLIZIZ.length() > 0) {
            c543670LTx.LIZLLL("error_cause", strLIZIZ);
        }
        String strLIZLLL = abstractC1431370nLr.LIZLLL();
        if (strLIZLLL != null && strLIZLLL.length() != 0) {
            c543670LTx.LIZLLL("error_desc", strLIZLLL);
        }
    }

    public final void LIZLLL(boolean z) {
        C543670LTx c543670LTx = this.LIZ;
        String str = this.LIZIZ;
        EnumC1434810nRP enumC1434810nRP = null;
        if (str == null) {
            str = null;
        }
        c543670LTx.LIZLLL("publish_id", str);
        c543670LTx.LIZLLL("publish_scene", this.LJ.getDesc());
        EnumC1434810nRP enumC1434810nRP2 = this.LIZLLL;
        if (enumC1434810nRP2 != null) {
            enumC1434810nRP = enumC1434810nRP2;
        }
        c543670LTx.LIZLLL("publish_node", enumC1434810nRP.getDesc());
        c543670LTx.LIZ(Boolean.valueOf(z), "retry_publish");
    }

    public final C543670LTx LJFF(EnumC1405140mfY enumC1405140mfY) {
        C543670LTx c543670LTx = this.LIZ;
        c543670LTx.LIZLLL("event_type", enumC1405140mfY.getDesc());
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Publish Node: ");
        EnumC1434810nRP enumC1434810nRP = this.LIZLLL;
        if (enumC1434810nRP == null) {
            enumC1434810nRP = null;
        }
        sbLIZ.append(enumC1434810nRP.getDesc());
        sbLIZ.append(", event: ");
        sbLIZ.append(enumC1405140mfY.getDesc());
        c1437510nVlLJJLIIIJ.LIZJ("build_publish_monitor_metrics", C2188811AlT.LIZIZ(sbLIZ));
        return c543670LTx;
    }
}
