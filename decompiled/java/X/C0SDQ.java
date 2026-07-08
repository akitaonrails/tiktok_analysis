package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDQ extends C09AY implements Function2<VideoCommentAssem, C291001Au<? extends Boolean>, Unit> {
    public C0SDQ() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoCommentAssem videoCommentAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoCommentAssem videoCommentAssem2 = videoCommentAssem;
        if (!C300900Bqq.LIZ() || c291001Au != null) {
            videoCommentAssem2.getClass();
            C717550SCr.LIZ = Boolean.TRUE;
            videoCommentAssem2.Ip().callOnClick();
        }
        return Unit.LIZ;
    }
}
