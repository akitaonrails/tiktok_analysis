package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewParams;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0nln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447450nln {
    public static final C1447450nln LIZ = new C1447450nln();

    public static Pair LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int iVideoWidth;
        int iVideoHeight;
        IVideoConfigService iVideoConfigService;
        IVideoConfigService iVideoConfigService2;
        if (videoPublishEditModel.getVideoCanvasWidth() > 0 && videoPublishEditModel.getVideoCanvasHeight() > 0) {
            iVideoWidth = videoPublishEditModel.getVideoCanvasWidth();
            iVideoHeight = videoPublishEditModel.getVideoCanvasHeight();
        } else {
            iVideoWidth = videoPublishEditModel.videoWidth();
            iVideoHeight = videoPublishEditModel.videoHeight();
            if (iVideoHeight == 0 || iVideoWidth == 0) {
                if (videoPublishEditModel.getOriginal() == 0) {
                    iVideoConfigService = o.LJIIL;
                } else {
                    iVideoConfigService = o.LJIIJJI;
                }
                iVideoWidth = iVideoConfigService.getVideoWidth();
                if (videoPublishEditModel.getOriginal() == 0) {
                    iVideoConfigService2 = o.LJIIL;
                } else {
                    iVideoConfigService2 = o.LJIIJJI;
                }
                iVideoHeight = iVideoConfigService2.getVideoHeight();
            }
        }
        return new Pair(Integer.valueOf(iVideoWidth), Integer.valueOf(iVideoHeight));
    }

    public static void LIZ(Context context, LifecycleOwner lifecycleOwner, C1291180jhk c1291180jhk, C1441840nck c1441840nck, VideoPublishEditModel videoPublishEditModel, String str) {
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter;
        VEPreviewParams vEPreviewParamsLJII = C571500MbE.LJII(videoPublishEditModel, 2, 30, 4);
        vEPreviewParamsLJII.mPageMode = 101;
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(vEPreviewParamsLJII);
        MutableLiveData<InfoStickerModel> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(videoPublishEditModel.getInfoStickerModel());
        c1441840nck.LIZLLL = mutableLiveData;
        c1441840nck.LJFF = mutableLiveData2;
        c1441840nck.LIZIZ(context, lifecycleOwner, c1291180jhk, videoPublishEditModel);
        if (!Intrinsics.LJFF(str, "kids_preview") && (vEEditorAutoStartStopArbiter = c1441840nck.LJIIIIZZ) != null) {
            vEEditorAutoStartStopArbiter.LLIZ = false;
        }
    }
}
