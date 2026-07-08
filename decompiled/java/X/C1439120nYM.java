package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.VEUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439120nYM {
    public static final boolean LIZ(AudioEnhanceParam audioEnhanceParam, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        List<EditVideoSegment> videoList;
        String str;
        List<String> list;
        if ((C297650Blb.LIZ() && ((CreativeToolsEntranceReversalConfig) C1439110nYL.LIZIZ.getValue()).hideNoiseReduceOnEditPage) || ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2() || C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData())) {
            return false;
        }
        if (!audioEnhanceParam.getSupportOriginEnhance() && !audioEnhanceParam.getSupportMusicEnhance()) {
            z = false;
        } else {
            z = true;
        }
        if (!C571480MbC.LIZIZ()) {
            return false;
        }
        if (!videoPublishEditModel.mIsFromDraft || videoPublishEditModel.mDraftToEditFrom != 0) {
            if (!videoPublishEditModel.realHasOriginalSound()) {
                if (C1444940nhk.LJIILLIIL(videoPublishEditModel.getCanvasVideoData())) {
                    CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
                    if (canvasVideoData == null || (list = canvasVideoData.sourceInfo) == null || (str = (String) C13LP.LJJJLL(list)) == null) {
                        str = "";
                    }
                    if (VEUtils.getAudioFileInfo(str) != null) {
                    }
                } else {
                    if (videoPublishEditModel.isCutSameVideoType()) {
                        return false;
                    }
                    EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                    if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null) {
                        Iterator<EditVideoSegment> it2 = videoList.iterator();
                        boolean z2 = z;
                        while (it2.hasNext()) {
                            if (VEUtils.getAudioFileInfo(it2.next().getVideoPath()) != null) {
                                if (C298100BmK.LIZ()) {
                                    return true;
                                }
                                z2 = true;
                            }
                        }
                        return z2;
                    }
                }
            }
            return true;
        }
        return z;
    }
}
