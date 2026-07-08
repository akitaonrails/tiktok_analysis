package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559590Lx7 extends C09AY implements Function1<VideoPublishEditModel, Boolean> {
    public C559590Lx7() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VideoPublishEditModel videoPublishEditModel) {
        return Boolean.valueOf(videoPublishEditModel.getAILivePhotoModel().LJII());
    }
}
