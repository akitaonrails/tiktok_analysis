package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardComment;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramPersistenceModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.LinkedHashMap;
import java.util.Map;
import lth.o;

/* JADX INFO: renamed from: X.0MTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MTQ {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        Map<String, String> map;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        ForwardComment forwardComment;
        CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
        if (canvasVideoData != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && (forwardComment = forwardCanvasExtra.forwardComment) != null) {
            linkedHashMap.put("comment_post_info", GsonProtectorUtils.toJson(o.LIZIZ, forwardComment));
        }
        TangramPersistenceModel tangramPersistenceModel = videoPublishEditModel.creativeModel.tangramPersistenceModel;
        if (tangramPersistenceModel != null && (map = tangramPersistenceModel.extraCreateAwemeFormMap) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
