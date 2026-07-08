package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C344170DeR extends C2217421BqW implements Function1<Integer, Unit> {
    public C344170DeR(Object obj) {
        super(1, obj, LiveHighLightPageFragment.class, "onClickDisabledShare", "onClickDisabledShare(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) this.receiver;
        C1834580xqC c1834580xqCLIZ = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
        if (c1834580xqCLIZ != null && c1834580xqCLIZ.LL == EnumC1782300wTs.HIGHLIGHT.getValue()) {
            C766270U4b.LIZLLL(2131855652);
        }
        liveHighLightPageFragment.VR(iIntValue);
        return Unit.LIZ;
    }
}
