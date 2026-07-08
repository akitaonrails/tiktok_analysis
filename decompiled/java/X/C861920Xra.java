package X;

import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861920Xra extends C09AY implements Function1<VideoPublishState, VideoPublishState> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861920Xra(boolean z, boolean z2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final VideoPublishState invoke(VideoPublishState videoPublishState) {
        VideoPublishState videoPublishState2 = videoPublishState;
        return videoPublishState2.copy(videoPublishState2.backEvent, new C0LCS<>(new C861910XrZ(this.LL, this.LLILLJJLI)));
    }
}
