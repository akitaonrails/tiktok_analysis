package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.163b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207121163b extends C09AY implements Function1<C164Q<C0S5P, AbstractC207157164l>, Unit> {
    public final /* synthetic */ C207118162y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207121163b(C207118162y c207118162y) {
        super(1);
        this.LL = c207118162y;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C164Q<C0S5P, AbstractC207157164l> c164q) {
        Aweme aweme;
        C207118162y c207118162y = this.LL;
        VideoItemParams videoItemParams = c207118162y.LJI;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && c207118162y.LJIJJ().LIZJ(aweme)) {
            c207118162y.onEvent(C207163164r.LIZIZ);
        }
        return Unit.LIZ;
    }
}
