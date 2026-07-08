package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MNN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MNN extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C0MNN() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        StitchParams stitchParams;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (videoPublishEditModel2.isStitchMode() && (stitchParams = videoPublishEditModel2.getStitchParams()) != null && stitchParams.getOriginVideoAIGCLabelType() == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
