package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725790SdV extends C09AY implements Function0<Integer> {
    public final /* synthetic */ VideoCommentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725790SdV(VideoCommentAssem videoCommentAssem) {
        super(0);
        this.LL = videoCommentAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C12ES.LJIIJJI(this.LL.getContext()));
    }
}
