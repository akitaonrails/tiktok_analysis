package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS122S1100000_8;

/* JADX INFO: renamed from: X.0MWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C569810MWl extends C2217421BqW implements Function0<Unit> {
    public C569810MWl(Object obj) {
        super(0, obj, AIPortraitTabFragment.class, "onCarouselCustomButtonClicked", "onCarouselCustomButtonClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AIPortraitTabFragment aIPortraitTabFragment = (AIPortraitTabFragment) this.receiver;
        AIPortraitTabViewModel aIPortraitTabViewModelPR = aIPortraitTabFragment.PR();
        aIPortraitTabViewModelPR.getClass();
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        AIGCEntranceInfo aIGCEntranceInfoYQ2 = aIPortraitTabViewModelPR.yQ2();
        String str = aIPortraitTabViewModelPR.LLIZLLLIL;
        EnumC550780Liu enumC550780Liu = aIPortraitTabViewModelPR.LLJ;
        c1687150u0P.getClass();
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C2275181E3o c2275181E3o = C2275181E3o.LJII;
        AwS122S1100000_8 awS122S1100000_8 = new AwS122S1100000_8(str, enumC550780Liu, 10);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c2275181E3o, aIGCEntranceInfoYQ2, awS122S1100000_8);
        aIPortraitTabFragment.SR(null, true);
        return Unit.LIZ;
    }
}
