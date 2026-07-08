package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Maw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571320Maw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity, VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3) {
        ImageSurfaceData surfaceData;
        ImageSurfaceData surfaceData2;
        ImageSurfaceData surfaceData3;
        ImageSurfaceData surfaceData4;
        int surfaceViewWidth = i;
        if (videoPublishEditModel != null && (activity instanceof EditPostedVideoPublishActivity) && activity != null) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            ImageEditModel imageEditModel = creativeModel.imageEditModel;
            int iLIZIZ = 0;
            imageEditModel.enterFromImagePublishPreview = false;
            imageEditModel.selectedImageIndex = i3;
            creativeModel.editSaveLocalModel.isClickQuickPublishToNext = false;
            creativeModel.postPageModel.fromPublishPageEditBtn = true;
            ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
            if (imageAlbumData != null && (surfaceData3 = imageAlbumData.getSurfaceData()) != null && surfaceData3.getSurfaceViewWidth() > 0) {
                ImageAlbumData imageAlbumData2 = videoPublishEditModel.creativeModel.imageAlbumModel;
                surfaceViewWidth = (imageAlbumData2 == null || (surfaceData4 = imageAlbumData2.getSurfaceData()) == null) ? 0 : surfaceData4.getSurfaceViewWidth();
            }
            ImageAlbumData imageAlbumData3 = videoPublishEditModel.creativeModel.imageAlbumModel;
            if (imageAlbumData3 != null && (surfaceData = imageAlbumData3.getSurfaceData()) != null && surfaceData.getSurfaceViewHeight() > 0) {
                ImageAlbumData imageAlbumData4 = videoPublishEditModel.creativeModel.imageAlbumModel;
                if (imageAlbumData4 != null && (surfaceData2 = imageAlbumData4.getSurfaceData()) != null) {
                    iLIZIZ = surfaceData2.getSurfaceViewHeight();
                }
            } else {
                iLIZIZ = i2 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(62));
            }
            videoPublishEditModel.creativeModel.editModel.editPreviewInfo = new C538330L9j(surfaceViewWidth, iLIZIZ, 12).LIZ(new EditVideoSegment(C570490MZb.LIZJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIIZI(videoPublishEditModel.getCreativeInfo(), "")) + C1017903yT.LIZ() + ".mp4", null, new VideoFileInfo(surfaceViewWidth, iLIZIZ, 0L, 30, 0, 0, 0, 0, 0.0f, 496, null), 2, null));
            C570750Ma1 c570750Ma1 = C570750Ma1.LIZ;
            int i4 = videoPublishEditModel.creativeModel.transientPostPageModel.LJJJJJL;
            c570750Ma1.getClass();
            Intent intentLIZJ = C570750Ma1.LIZJ(i4, videoPublishEditModel);
            intentLIZJ.putExtra("draft_to_edit_start_time", System.currentTimeMillis());
            intentLIZJ.putExtra("fromDraft", 1);
            intentLIZJ.putExtra("extra_publish_preview_image_index", i3);
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZJ = new AnonymousClass1951(R.anim.fv, activity, R.anim.bj);
            Context baseContext = activity.getBaseContext();
            if (baseContext != null) {
                try {
                    Bundle extras = intentLIZJ.getExtras();
                    if (extras != null) {
                        C0MWH.LJIIL(baseContext, extras, "ImageEditRootScene", null, null, c569760MWg, false, 88);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
