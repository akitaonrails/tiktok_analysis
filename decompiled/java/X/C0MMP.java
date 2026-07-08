package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.story.StreaksData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MMP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MMP {
    public static void LIZJ(Intent intent, CreativeInfo creativeInfo, List list) {
        InfoStickerModel infoStickerModel = new InfoStickerModel(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.INFO_STICKER, null, false, 12));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            infoStickerModel.addSticker((StickerItemModel) it2.next());
        }
        C0MUK.LIZIZ(intent).infoStickerModel = infoStickerModel;
    }

    public static void LIZIZ(Intent intent, ForwardMedia forwardMedia, CreativeInfo creativeInfo, Pair pair) {
        VideoFileInfo videoFileInfo = new VideoFileInfo(forwardMedia.video.getSourceWidth(), forwardMedia.video.getSourceHeight(), forwardMedia.video.getSourceDuration(), 30, 0, 0, 0, 0, 0.0f, 496, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.CONCAT, null, false, 12));
        sbLIZ.append(C1449640npK.LIZ(".mp4"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C570490MZb.LJI(new C0VSJ(strLIZIZ));
        C0MUK.LIZIZ(intent).editModel.editPreviewInfo = new C538330L9j(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), 12).LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
    }

    public static void LIZ(Intent intent, C0MMS c0mms, long j, String str, String str2, String str3) {
        intent.putExtra("workspace", C14D2.LIZ(c0mms.LIZ()));
        intent.putExtra("origin", 0);
        if (c0mms.LIZIZ().enterMethod.length() > 0) {
            intent.putExtra("enter_edit_page_method", c0mms.LIZIZ().enterMethod);
        }
        C0MUK.LIZIZ(intent).creativeFlowData = new CreativeFlowData(null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 32767, null);
        C0MUK.LIZIZ(intent).eventData.shootEnterMethod = c0mms.LIZIZ().enterMethod;
        intent.putExtra("aweme_type", c0mms.LIZIZ().awemeType);
        intent.putExtra("shoot_way", str);
        intent.putExtra("content_type", str2);
        intent.putExtra("content_source", str3);
        C0MUK.LIZIZ(intent).eventData.enterFrom = c0mms.LIZIZ().eventType;
        intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
        intent.putExtra("extra_import_compile_cost_time", j);
    }

    public static Intent LIZLLL(ForwardMedia forwardMedia, C0MKE c0mke, List list, long j, CommentVideoModel commentVideoModel, String str, String str2, int i) {
        boolean zIsStreakShareToStory;
        boolean zBooleanValue;
        String str3 = str2;
        String str4 = str;
        long j2 = j;
        String str5 = null;
        if ((i & 1) != 0) {
            forwardMedia = null;
        }
        if ((i & 8) != 0) {
            j2 = 0;
        }
        if ((i & 16) != 0) {
            commentVideoModel = null;
        }
        if ((i & 32) != 0) {
            str4 = "share_to_story";
        }
        if ((i & 64) != 0) {
            str3 = "share";
        }
        if ((i & 128) != 0) {
            str5 = "upload";
        }
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        C537520L6g.LIZLLL(intent, c0mke.LIZ);
        LIZIZ(intent, c0mke.LIZIZ, c0mke.LIZ, c0mke.LJFF);
        if (!list.isEmpty()) {
            LIZJ(intent, c0mke.LIZ, list);
        }
        C0MUK.LIZIZ(intent).canvasVideoData = C0MMO.LIZJ(C0MMO.LIZ, c0mke, 14);
        StreaksData streaksData = C0MUK.LIZIZ(intent).streaksData;
        if (forwardMedia != null) {
            zIsStreakShareToStory = forwardMedia.isStreakShareToStory();
        } else {
            zIsStreakShareToStory = false;
        }
        streaksData.setStreaksShareToStory(zIsStreakShareToStory);
        LIZ(intent, c0mke, j2, str4, str3, str5);
        CommonMobParamModel commonMobParamModel = C0MUK.LIZIZ(intent).commonMobModel;
        Boolean boolIsIMShareMentionVideoToPost = c0mke.LIZIZ.isIMShareMentionVideoToPost();
        if (boolIsIMShareMentionVideoToPost != null) {
            zBooleanValue = boolIsIMShareMentionVideoToPost.booleanValue();
        } else {
            zBooleanValue = false;
        }
        commonMobParamModel.isIMShareVideoToPost = zBooleanValue;
        C19610311nx.LIZ(intent, commentVideoModel, str4);
        String str6 = c0mke.LIZLLL.LIZLLL;
        if (str6 != null && str6.length() > 0 && new C0VSJ(str6).exists()) {
            C0MUK.LIZIZ(intent).postPageModel.videoCoverPath = str6;
        }
        return intent;
    }
}
