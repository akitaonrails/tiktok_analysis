package X;

import com.ss.android.ugc.aweme.partnership.model.GameMixVideosViewModel;

/* JADX INFO: renamed from: X.0zBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.partnership.model.GameMixVideosViewModel", f = "GameMixVideosViewModel.kt", l = {150}, m = "fetchData")
public final class C1886310zBd extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ GameMixVideosViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886310zBd(GameMixVideosViewModel gameMixVideosViewModel, InterfaceC1364105Vn<? super C1886310zBd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = gameMixVideosViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameMixVideosViewModel@7c8d.fetchData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLL.CQ2(false, this);
        C1C7U.LIZIZ("GameMixVideosViewModel@7c8d.fetchData$1");
        return objCQ2;
    }
}
