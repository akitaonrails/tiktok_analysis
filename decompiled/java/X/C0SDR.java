package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0SDR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDR extends C09AY implements InterfaceC1631620sYq<VideoCommentAssem, String, Integer, Unit> {
    public C0SDR() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(VideoCommentAssem videoCommentAssem, String str, Integer num) {
        videoCommentAssem.Vp(num.intValue(), str);
        return Unit.LIZ;
    }
}
