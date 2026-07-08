package X;

import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0nUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437000nUw {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(SingleImageData singleImageData, VideoPublishEditModel videoPublishEditModel) {
        AIGCInfo aigcInfo;
        AIGCInfo aigcInfo2;
        ImageVideoSharedModel imageVideoSharedModel;
        List<AlbumAigc> albumAigc = null;
        if (C2283608x8.LIZ("tiktok_creation_ai_chat") && singleImageData != null && (imageVideoSharedModel = singleImageData.getImageVideoSharedModel()) != null && imageVideoSharedModel.getAiChatGenNodeId() != null) {
            return true;
        }
        Set setLJLIIL = C13LQ.LJLIIL(new String[]{"tiktok_prop", "tiktok_effect", "tiktok_ai_self", "tiktok_ai_live_photo"});
        Iterator<String> it2 = C1446930nkx.LIZ(videoPublishEditModel, AFwS261S0000000_22.get$arr$(380)).getSecond().iterator();
        while (it2.hasNext()) {
            if (setLJLIIL.contains(it2.next())) {
                return true;
            }
        }
        if (singleImageData != null && (aigcInfo2 = singleImageData.getAigcInfo()) != null) {
            albumAigc = aigcInfo2.getAlbumAigc();
        }
        if (!C1436990nUv.LIZIZ(albumAigc).isEmpty()) {
            return true;
        }
        if (singleImageData == null || (aigcInfo = singleImageData.getAigcInfo()) == null) {
            return false;
        }
        String aiGeneratedSource = aigcInfo.getAiGeneratedSource();
        if (aiGeneratedSource == null) {
            aiGeneratedSource = "";
        }
        return C2283608x8.LIZ(aiGeneratedSource);
    }
}
