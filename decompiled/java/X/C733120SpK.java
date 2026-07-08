package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733120SpK extends C09AY implements Function1<C733080SpG, C733080SpG> {
    public final /* synthetic */ VideoCommentVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733120SpK(VideoCommentVM videoCommentVM) {
        super(1);
        this.LL = videoCommentVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C733080SpG invoke(C733080SpG c733080SpG) {
        this.LL.getClass();
        return C733080SpG.LIZ(c733080SpG, VideoCommentVM.xQ2(), 0, null, 0, 0, false, 126);
    }
}
