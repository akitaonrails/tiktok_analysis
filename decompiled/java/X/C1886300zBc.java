package X;

import com.ss.android.ugc.aweme.partnership.model.GameMixHomeViewModel;

/* JADX INFO: renamed from: X.0zBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.partnership.model.GameMixHomeViewModel", f = "GameMixHomeViewModel.kt", l = {111}, m = "fetchData")
public final class C1886300zBc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GameMixHomeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886300zBc(GameMixHomeViewModel gameMixHomeViewModel, InterfaceC1364105Vn<? super C1886300zBc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = gameMixHomeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameMixHomeViewModel@713d.fetchData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.CQ2(this);
        C1C7U.LIZIZ("GameMixHomeViewModel@713d.fetchData$1");
        return objCQ2;
    }
}
