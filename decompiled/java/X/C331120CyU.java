package X;

import com.ss.android.ugc.aweme.live.mix.game.model.GameCommonMixViewModel;

/* JADX INFO: renamed from: X.0CyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.mix.game.model.GameCommonMixViewModel", f = "GameCommonMixViewModel.kt", l = {143}, m = "fetchData")
public final class C331120CyU extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ GameCommonMixViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331120CyU(GameCommonMixViewModel gameCommonMixViewModel, InterfaceC1364105Vn<? super C331120CyU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = gameCommonMixViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameCommonMixViewModel@7229.fetchData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(false, this);
        C1C7U.LIZIZ("GameCommonMixViewModel@7229.fetchData$1");
        return objBQ2;
    }
}
