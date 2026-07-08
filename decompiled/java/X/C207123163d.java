package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.163d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207123163d extends C09AY implements Function1<C164Q<C0S5P, AbstractC207157164l>, Unit> {
    public final /* synthetic */ C207118162y LL;
    public final /* synthetic */ C164P<C0S5P, AbstractC207157164l> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207123163d(C207118162y c207118162y, C164P<C0S5P, AbstractC207157164l> c164p) {
        super(1);
        this.LL = c207118162y;
        this.LLILLJJLI = c164p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C164Q<C0S5P, AbstractC207157164l> c164q) {
        Aweme aweme;
        C207118162y c207118162y = this.LL;
        if (c207118162y.LJII) {
            C161N c161n = C161N.LIZIZ;
            VideoItemParams videoItemParams = c207118162y.LJI;
            if (videoItemParams != null) {
                aweme = videoItemParams.getAweme();
            } else {
                aweme = null;
            }
            if (c161n.LJJIJIL(aweme)) {
                this.LLILLJJLI.onEvent(C207164164s.LIZIZ);
            }
        }
        return Unit.LIZ;
    }
}
