package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MMQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MMQ extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C0MMQ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        CanvasVideoData canvasVideoData2 = videoPublishEditModel2.getCanvasVideoData();
        boolean z = true;
        if (canvasVideoData2 == null || !C1444940nhk.LJFF(canvasVideoData2) || (canvasVideoData = videoPublishEditModel2.getCanvasVideoData()) == null || canvasVideoData.originVideoAIGCLabelType != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
