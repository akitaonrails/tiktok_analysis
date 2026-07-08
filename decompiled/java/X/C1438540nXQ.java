package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nXQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1438540nXQ extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C1438540nXQ() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (videoPublishEditModel2.isDuet() && videoPublishEditModel2.creativeModel.duetModel.duetVideoAIGCLabelType == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
