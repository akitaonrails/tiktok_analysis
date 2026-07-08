package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0P0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637970P0p extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ VideoMusicTitleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637970P0p(VideoMusicTitleAssem videoMusicTitleAssem) {
        super(1);
        this.LL = videoMusicTitleAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            if (this.LL.LJJIJL() instanceof C708910RrN) {
                ((C708910RrN) this.LL.LJJIJL()).setGroupClickable(bool2.booleanValue());
            }
        }
        return Unit.LIZ;
    }
}
