package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638030P0v extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoMusicTitleAssem LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C638030P0v(VideoMusicTitleAssem videoMusicTitleAssem, int i) {
        super(0);
        this.LL = videoMusicTitleAssem;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        View viewLJJIJL = this.LL.LJJIJL();
        if (viewLJJIJL != null) {
            C786410Ut5.LJLLLLLL(this.LLILLJJLI, viewLJJIJL);
        }
        C786410Ut5.LJLLLLLL(this.LLILLJJLI, this.LL.getContentView());
        return Unit.LIZ;
    }
}
