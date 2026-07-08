package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732490SoJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoShareAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C732490SoJ(VideoShareAssem videoShareAssem) {
        super(0);
        this.LL = videoShareAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VideoShareAssem videoShareAssem = this.LL;
        C732460SoG c732460SoG = videoShareAssem.LLLIIIL;
        if (c732460SoG != null) {
            videoShareAssem.Gp().LJJI();
            ViewOnTouchListenerC1364750lcP.LIZ(c732460SoG);
        }
        return Unit.LIZ;
    }
}
