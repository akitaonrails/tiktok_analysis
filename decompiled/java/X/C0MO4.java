package X;

import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.comment.model.CommentPostStickerStruct;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardComment;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MO4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MO4 {
    public static final C0MO4 LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C01GW LIZJ;
    public static final List<String> LIZLLL;
    public static final C572340Mca LJ;
    public static final C01GW LJFF;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C0MO4.class, "draftCache", "getDraftCache()[Ljava/lang/String;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new C0MO4();
        LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(8));
        LIZLLL = new ArrayList();
        LJ = new C572340Mca(AFwS194S0000000_8.get$arr$(10), new String[0]);
        LJFF = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(9));
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        C0CHQ.LIZ().LJJIZ();
        C1463670oBx c1463670oBxLIZLLL = C1449720npS.LIZLLL(videoPublishEditModel, null, 6);
        videoPublishEditModel.getPreviewInfo().setPreviewVideoLength(c1463670oBxLIZLLL.getDuration());
        videoPublishEditModel.setVideoLength(c1463670oBxLIZLLL.getDuration());
        videoPublishEditModel.setNleData(c1463670oBxLIZLLL.Zf());
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, VESize vESize, C567500MNo c567500MNo, C567500MNo c567500MNo2) {
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        ForwardComment forwardComment;
        List<CanvasFilterParam> transformList;
        ArrayList arrayList = new ArrayList();
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && (forwardComment = forwardCanvasExtra.forwardComment) != null) {
            CommentPostStickerStruct commentPostStickerStruct = new CommentPostStickerStruct(forwardComment.getOriginAwemeId(), forwardComment.getCommentId());
            C0MSQ c0msq = C1453390nvN.LJIIZILJ;
            RectF rectF = c567500MNo2.LIZIZ;
            c0msq.getClass();
            Pair pairLIZIZ = C0MSQ.LIZIZ(vESize, rectF);
            CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
            if (canvasVideoData2 != null && (transformList = canvasVideoData2.getTransformList()) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(transformList, 10));
                for (CanvasFilterParam canvasFilterParam : transformList) {
                    InteractStickerStruct interactStickerStructLIZ = C1462390o9t.LIZ(41, canvasFilterParam.getDegree() * 1.0f, canvasFilterParam.getScaleFactor(), (PointF) pairLIZIZ.getFirst(), (PointF) pairLIZIZ.getSecond(), videoPublishEditModel.getVideoLength());
                    interactStickerStructLIZ.setCommentPostStickerStruct(commentPostStickerStruct);
                    arrayList2.add(interactStickerStructLIZ);
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                }
            }
            C0MSQ c0msq2 = C1453390nvN.LJIIZILJ;
            RectF rectF2 = c567500MNo.LIZIZ;
            c0msq2.getClass();
            Pair pairLIZIZ2 = C0MSQ.LIZIZ(vESize, rectF2);
            InteractStickerStruct interactStickerStructLIZ2 = C1462390o9t.LIZ(40, 0.0f, 1.0f, (PointF) pairLIZIZ2.getFirst(), (PointF) pairLIZIZ2.getSecond(), videoPublishEditModel.getVideoLength());
            interactStickerStructLIZ2.setCommentPostStickerStruct(commentPostStickerStruct);
            arrayList.add(interactStickerStructLIZ2);
        }
        videoPublishEditModel.setMainBusinessData(C1429860nJQ.LJIIIZ(videoPublishEditModel.getMainBusinessContext(), arrayList, EnumC1428480nHC.TRACK_PAGE_EDIT));
    }

    public static StickerItemModel LIZJ(C567520MNq c567520MNq, VESize vESize, float[] fArr, float f) {
        StickerItemModel stickerItemModel = new StickerItemModel();
        stickerItemModel.type = LSPassThroughRecordSizeConfig.DEFAULT;
        stickerItemModel.layerWeight = 1000000;
        stickerItemModel.startTime = 0;
        stickerItemModel.endTime = -2;
        stickerItemModel.path = c567520MNq.LIZ;
        stickerItemModel.normalizedWidth = (c567520MNq.LIZIZ * 1.0f) / vESize.width;
        stickerItemModel.normalizedHeight = (c567520MNq.LIZJ * 1.0f) / vESize.height;
        stickerItemModel.currentOffsetX = fArr[0];
        stickerItemModel.currentOffsetY = fArr[1];
        stickerItemModel.scale = f;
        return stickerItemModel;
    }
}
