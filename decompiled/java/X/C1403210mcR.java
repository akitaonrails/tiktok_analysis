package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403210mcR extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C1403210mcR() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        return Boolean.valueOf(videoPublishEditModel.isStitchMode());
    }
}
