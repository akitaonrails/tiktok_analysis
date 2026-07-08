package X;

import android.graphics.PointF;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444950nhl {
    public static final InteractStickerStruct LIZ(CanvasFilterParam canvasFilterParam, CanvasVideoData canvasVideoData, Pair<? extends PointF, ? extends PointF> pair, int i) {
        PointF pointF;
        PointF pointF2;
        MentionStruct mentionStruct;
        ForwardCanvasExtra forwardCanvasExtra;
        if (canvasFilterParam.getScaleFactor() >= 0.99f) {
            pointF = new PointF(pair.getFirst().x, pair.getFirst().y);
            PointF second = pair.getSecond();
            pointF2 = new PointF(second.x * 0.68f, second.y * 0.68f);
        } else {
            float f = pair.getSecond().y;
            float f2 = 0.06f * f;
            pointF = new PointF(pair.getFirst().x, pair.getFirst().y + ((f + f2) * 0.5f));
            pointF2 = new PointF(pair.getSecond().x, f2);
        }
        InteractStickerStruct interactStickerStructLIZ = C1462390o9t.LIZ(8, canvasFilterParam.getDegree() * 1.0f, canvasFilterParam.getScaleFactor(), pointF, pointF2, i);
        CanvasExtra canvasExtra = canvasVideoData.extra;
        if (canvasExtra != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null) {
            mentionStruct = forwardCanvasExtra.videoShareBackwardsMention;
        } else {
            mentionStruct = null;
        }
        interactStickerStructLIZ.setMentionInfo(mentionStruct);
        return interactStickerStructLIZ;
    }

    public static final InteractStickerStruct LIZIZ(CanvasFilterParam canvasFilterParam, CanvasVideoData canvasVideoData, Pair<? extends PointF, ? extends PointF> pair, int i) {
        boolean z;
        PointF pointF;
        VideoShareInfoStruct videoShareInfoStruct;
        ForwardCanvasExtra forwardCanvasExtra;
        float degree = canvasFilterParam.getDegree() * 1.0f;
        if (canvasFilterParam.getScaleFactor() >= 0.99f) {
            z = true;
        } else {
            z = false;
        }
        PointF first = pair.getFirst();
        PointF second = pair.getSecond();
        if (z) {
            pointF = new PointF(second.x * 0.68f, second.y * 0.68f);
        } else {
            pointF = second;
        }
        InteractStickerStruct interactStickerStructLIZ = C1462390o9t.LIZ(19, degree, canvasFilterParam.getScaleFactor(), first, pointF, i);
        CanvasExtra canvasExtra = canvasVideoData.extra;
        if (canvasExtra != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null) {
            videoShareInfoStruct = forwardCanvasExtra.videoShareInfoStruct;
        } else {
            videoShareInfoStruct = null;
        }
        interactStickerStructLIZ.setVideoShareInfoStruct(videoShareInfoStruct);
        return interactStickerStructLIZ;
    }
}
