package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09MT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09MT extends C09AY implements Function0<Integer> {
    public final /* synthetic */ VideoMusicTitleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09MT(VideoMusicTitleAssem videoMusicTitleAssem) {
        super(0);
        this.LL = videoMusicTitleAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C07PC.LIZ(((VideoItemParams) C631370Opb.LIZ(this.LL)).mEventType) ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    }
}
