package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel;

/* JADX INFO: renamed from: X.0Tkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerViewModel", f = "MatchHammerViewModel.kt", l = {1100}, m = "removeCurrentDizzinessSticker")
public final class C755830Tkr extends AbstractC23140094w {
    public Object LL;
    public IEffectService LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MatchHammerViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C755830Tkr(MatchHammerViewModel matchHammerViewModel, InterfaceC1364105Vn<? super C755830Tkr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = matchHammerViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchHammerViewModel@6ded.removeCurrentDizzinessSticker$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILZ.DQ2(this);
        C1C7U.LIZIZ("MatchHammerViewModel@6ded.removeCurrentDizzinessSticker$1");
        return objDQ2;
    }
}
