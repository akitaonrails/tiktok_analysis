package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SDS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDS extends C09AY implements Function2<VideoCommentAssem, Integer, Unit> {
    public C0SDS() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoCommentAssem videoCommentAssem, Integer num) {
        C2180521AVm.LIZLLL(videoCommentAssem.Ip(), num.intValue(), C1AV3.LIZ("1", "Feed", null, "comment_assem"));
        return Unit.LIZ;
    }
}
