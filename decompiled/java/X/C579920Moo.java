package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Moo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579920Moo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, Pair pair) {
        C0CHQ.LIZ().getPublishService().LJIIJJI();
        if (C856610Xj1.LIZ(videoPublishEditModel)) {
            videoPublishEditModel.creativeModel.postPageModel.captionModel.markupText = (String) pair.getFirst();
            videoPublishEditModel.creativeModel.postPageModel.captionModel.markupExtra = (List) pair.getSecond();
            return;
        }
        videoPublishEditModel.creativeModel.postPageModel.markupCaption = (String) pair.getFirst();
        videoPublishEditModel.creativeModel.postPageModel.markupExtra = (List) pair.getSecond();
    }
}
