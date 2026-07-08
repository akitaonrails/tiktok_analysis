package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0xpm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1834320xpm extends C2217421BqW implements Function1<Integer, Unit> {
    public C1834320xpm(Object obj) {
        super(1, obj, LiveHighLightPageFragment.class, "onClickDownload", "onClickDownload(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) this.receiver;
        if (liveHighLightPageFragment.yS()) {
            liveHighLightPageFragment.VS(2, new AwS571S0100000_27(liveHighLightPageFragment, 1229));
        } else {
            liveHighLightPageFragment.nS();
        }
        return Unit.LIZ;
    }
}
