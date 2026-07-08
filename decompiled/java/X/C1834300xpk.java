package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS428S0200000_27;

/* JADX INFO: renamed from: X.0xpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1834300xpk extends C2217421BqW implements Function1<Integer, Unit> {
    public C1834300xpk(Object obj) {
        super(1, obj, LiveHighLightPageFragment.class, "onClickDelete", "onClickDelete(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) this.receiver;
        C1834580xqC c1834580xqCLIZ = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
        if (liveHighLightPageFragment.yS()) {
            liveHighLightPageFragment.VS(3, new AwS428S0200000_27(liveHighLightPageFragment, c1834580xqCLIZ, 84));
        } else {
            liveHighLightPageFragment.mS(c1834580xqCLIZ);
        }
        return Unit.LIZ;
    }
}
