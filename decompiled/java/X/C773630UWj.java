package X;

import com.bytedance.android.livesdk.game.gamelist.GameTopicListViewModel;

/* JADX INFO: renamed from: X.0UWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.gamelist.GameTopicListViewModel", f = "GameTopicListViewModel.kt", l = {133}, m = "searchFromServer")
public final class C773630UWj extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GameTopicListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C773630UWj(GameTopicListViewModel gameTopicListViewModel, InterfaceC1364105Vn<? super C773630UWj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = gameTopicListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameTopicListViewModel@4b5b.searchFromServer$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLJJLI.zQ2(this);
        C1C7U.LIZIZ("GameTopicListViewModel@4b5b.searchFromServer$1");
        return objZQ2;
    }
}
