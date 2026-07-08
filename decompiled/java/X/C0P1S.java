package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0P1S, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P1S extends C09AY implements Function1<C0P1T, C0P1T> {
    public final /* synthetic */ VideoMusicBaseVM LL;
    public final /* synthetic */ VideoItemParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P1S(VideoMusicBaseVM videoMusicBaseVM, VideoItemParams videoItemParams) {
        super(1);
        this.LL = videoMusicBaseVM;
        this.LLILLJJLI = videoItemParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0P1T invoke(C0P1T c0p1t) {
        return this.LL.itemSync2StateAccept(c0p1t, this.LLILLJJLI);
    }
}
